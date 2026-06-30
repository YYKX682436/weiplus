package vm1;

/* loaded from: classes11.dex */
public final class o implements zy2.a6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bw5.e70 f519571a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f519572b;

    public o(bw5.e70 e70Var, yz5.l lVar) {
        this.f519571a = e70Var;
        this.f519572b = lVar;
    }

    @Override // zy2.a6
    public final void a(java.lang.Object obj, int i17, int i18) {
        yz5.l lVar = this.f519572b;
        if (obj != null && (obj instanceof com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestMediaInfo success, tid:");
            java.lang.String m11811xb5887159 = this.f519571a.m11811xb5887159();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m11811xb5887159);
            sb6.append((java.lang.Object) jz5.x.a(r26.q0.c(m11811xb5887159)));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterBizAudioFinderSourcePlugin", sb6.toString());
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(((com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725) obj).mo14344x5f01b1f6())));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FlutterBizAudioFinderSourcePlugin", "requestMediaInfo fail, errType: " + i17 + ", errCode: " + i18);
        p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        lVar.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.Exception("errType: " + i17 + ", errCode: " + i18)))));
    }
}
