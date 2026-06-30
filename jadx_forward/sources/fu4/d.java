package fu4;

/* loaded from: classes9.dex */
public class d implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fu4.f f348420a;

    public d(fu4.f fVar) {
        this.f348420a = fVar;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(cVar.f557138a);
        java.lang.String str = cVar.f557139b;
        fu4.f fVar = this.f348420a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "prepareAuthKey onResult errCode: %d, errMsg: %s, isCancelled: %b", valueOf, str, java.lang.Boolean.valueOf(fVar.f348426h));
        if (fVar.f348426h) {
            return;
        }
        if (cVar.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FingerprintLockOpenDelegate", "update wallet lock auth key success");
            fu4.g gVar = fVar.f348422d;
            if (gVar != null) {
                gVar.h(0, "prepare auth key ok");
            }
            re4.g0.g(0);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FingerprintLockOpenDelegate", "error when prepare auth key");
        java.lang.String str2 = cVar.f557139b;
        int i17 = cVar.f557138a;
        if (i17 == 1003) {
            str2 = re4.g0.f476069b;
        } else if (i17 == 1004) {
            str2 = re4.g0.f476070c;
        }
        m05.i.f404103a.a("5", "2", java.lang.String.valueOf(i17), str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p2387x932074a4.p2391x633fb29.m.b(2, cVar.f557138a, 1L);
        fu4.g gVar2 = fVar.f348422d;
        if (gVar2 != null) {
            gVar2.h(2, cVar.f557139b);
        }
        if (cVar.f557138a == 1004) {
            cu5.b.f(3);
            int intValue = ((java.lang.Integer) gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SOTER_UPLOAD_AK_FAILURE_INT_SYNC, 0)).intValue() + 1;
            re4.g0.g(intValue);
            if (intValue >= 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.FingerprintLockOpenDelegate", "remove ask");
                wt5.a.r();
            }
        }
    }
}
