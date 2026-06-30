package ch2;

/* loaded from: classes10.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f41385d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole f41386e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ om2.g f41387f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41388g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41389h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f41390i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ch2.o2 o2Var, com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole, om2.g gVar, r45.yx1 yx1Var, r45.yx1 yx1Var2, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f41385d = o2Var;
        this.f41386e = tXChorusRole;
        this.f41387f = gVar;
        this.f41388g = yx1Var;
        this.f41389h = yx1Var2;
        this.f41390i = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new ch2.j2(this.f41385d, this.f41386e, this.f41387f, this.f41388g, this.f41389h, this.f41390i, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ch2.j2 j2Var = (ch2.j2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        j2Var.invokeSuspend(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.String str;
        r45.ay1 ay1Var;
        r45.ay1 ay1Var2;
        r45.ay1 ay1Var3;
        r45.by1 by1Var;
        r45.ay1 ay1Var4;
        tn0.w0 Q6;
        vn0.e eVar;
        vn0.e eVar2;
        vn0.e eVar3;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        ch2.o2 o2Var = this.f41385d;
        tn0.w0 Q62 = o2Var.Q6();
        if (Q62 != null && (eVar3 = Q62.f420764m) != null) {
            eVar3.b(vn0.b.f438174a.a().f455408f, true);
        }
        tn0.w0 Q63 = o2Var.Q6();
        int c17 = (Q63 == null || (eVar2 = Q63.f420764m) == null) ? -1 : eVar2.c();
        if (c17 != -1) {
            ((kotlinx.coroutines.flow.h3) o2Var.m7().f346298q).k(java.lang.Integer.valueOf(c17));
            if (!o2Var.m7().f346296o) {
                kotlinx.coroutines.flow.j2 j2Var = o2Var.m7().f346295n;
                o2Var.m7().getClass();
                ((kotlinx.coroutines.flow.h3) j2Var).k(java.lang.Boolean.valueOf(c17 == 2));
            }
        }
        if (o2Var.n7().Q6() == 1 && (Q6 = o2Var.Q6()) != null && (eVar = Q6.f420764m) != null) {
            eVar.h(1);
        }
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        boolean isBluetoothA2dpOn = ((android.media.AudioManager) systemService).isBluetoothA2dpOn();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "onStartSing audioRouteType: " + c17 + " isBluetoothA2dpOn: " + isBluetoothA2dpOn);
        if (c17 == 3 && isBluetoothA2dpOn) {
            pm0.v.X(ch2.l1.f41399d);
        }
        kotlinx.coroutines.flow.j2 j2Var2 = o2Var.m7().f346293i;
        if (j2Var2 != null) {
            ((kotlinx.coroutines.flow.h3) j2Var2).k(0);
        }
        om2.g q76 = o2Var.q7();
        om2.i iVar = q76.f346307n;
        java.lang.String str2 = null;
        if (kotlin.jvm.internal.o.b(iVar != null ? iVar.d() : null, ((mm2.c1) q76.business(mm2.c1.class)).m8())) {
            o2Var.B7();
        }
        boolean S6 = o2Var.n7().S6();
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole = com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole.TXChorusRoleLeadSinger;
        com.tencent.trtc.TXChorusMusicPlayer.TXChorusRole tXChorusRole2 = this.f41386e;
        java.lang.Object[] objArr = tXChorusRole2 == tXChorusRole;
        r45.yx1 yx1Var = this.f41388g;
        int i17 = o2Var.q7().f346314u;
        r45.ia4 ia4Var = new r45.ia4();
        r45.yx1 yx1Var2 = this.f41388g;
        ia4Var.f376869d = yx1Var2.f391458d;
        ia4Var.f376870e = yx1Var2.f391459e;
        ia4Var.f376871f = yx1Var2.f391469r;
        ia4Var.f376874i = 1;
        r45.yx1 yx1Var3 = this.f41389h;
        if (yx1Var3 == null || (by1Var = yx1Var3.f391466o) == null || (ay1Var4 = by1Var.f371143d) == null || (str = ay1Var4.f370351e) == null) {
            str = "";
        }
        ia4Var.f376872g = str;
        om2.g gVar = this.f41387f;
        if (S6 && objArr != false) {
            ia4Var.f376885w = 1;
            ia4Var.f376886x = ((java.lang.Boolean) ((kotlinx.coroutines.flow.h3) ((om2.e) gVar.business(om2.e.class)).f346290f).getValue()).booleanValue() ? 1 : 0;
            ia4Var.f376887y = ((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) gVar.business(om2.e.class)).f346292h).getValue()).intValue();
            ia4Var.f376888z = (float) (((java.lang.Number) ((kotlinx.coroutines.flow.h3) ((om2.e) gVar.business(om2.e.class)).f346293i).getValue()).doubleValue() / 12.0d);
        }
        r45.by1 by1Var2 = yx1Var3.f391466o;
        ia4Var.B = (by1Var2 == null || (ay1Var3 = by1Var2.f371143d) == null) ? false : ay1Var3.f370360q;
        r45.ha4 ha4Var = new r45.ha4();
        r45.ga4 ga4Var = new r45.ga4();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        kotlin.jvm.internal.o.f(uuid, "toString(...)");
        gVar.f346307n = new om2.i(yx1Var, i17, ia4Var, ha4Var, ga4Var, uuid, this.f41386e);
        com.tencent.mm.sdk.platformtools.b4 b4Var = o2Var.f41433z;
        b4Var.d();
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "stopTRTCSEITimer");
        b4Var.c(20L, 20L);
        com.tencent.mars.xlog.Log.i("FinderLiveKTVSingController", "startTRTCSEITimer");
        com.tencent.mm.plugin.finder.live.util.y.d(o2Var, null, null, new ch2.i2(o2Var, yx1Var3, tXChorusRole2, null), 3, null);
        java.lang.String mic_sdk_user_id = yx1Var2.f391469r;
        kotlin.jvm.internal.o.f(mic_sdk_user_id, "mic_sdk_user_id");
        r45.xn1 p76 = o2Var.p7(mic_sdk_user_id);
        java.lang.String m86 = o2Var.h7().m8();
        java.lang.String str3 = m86 == null ? "" : m86;
        java.lang.String str4 = yx1Var2.f391459e;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = yx1Var2.f391458d;
        java.lang.String str7 = str6 == null ? "" : str6;
        r45.by1 by1Var3 = yx1Var3.f391466o;
        if (by1Var3 != null && (ay1Var2 = by1Var3.f371143d) != null) {
            str2 = ay1Var2.f370351e;
        }
        java.lang.String str8 = str2 == null ? "" : str2;
        int P6 = o2Var.n7().P6();
        r45.by1 by1Var4 = yx1Var2.f391466o;
        o2Var.q7().P6(new om2.x(new om2.o(str3, p76, str5, str7, str8, P6, (by1Var4 == null || (ay1Var = by1Var4.f371143d) == null || !ay1Var.f370360q) ? false : true)), false);
        return jz5.f0.f302826a;
    }
}
