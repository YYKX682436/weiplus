package ch2;

/* loaded from: classes10.dex */
public final class j2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122918d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole f122919e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ om2.g f122920f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122921g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f122922h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f122923i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j2(ch2.o2 o2Var, com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole, om2.g gVar, r45.yx1 yx1Var, r45.yx1 yx1Var2, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122918d = o2Var;
        this.f122919e = tXChorusRole;
        this.f122920f = gVar;
        this.f122921g = yx1Var;
        this.f122922h = yx1Var2;
        this.f122923i = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.j2(this.f122918d, this.f122919e, this.f122920f, this.f122921g, this.f122922h, this.f122923i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.j2 j2Var = (ch2.j2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
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
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ch2.o2 o2Var = this.f122918d;
        tn0.w0 Q62 = o2Var.Q6();
        if (Q62 != null && (eVar3 = Q62.f502297m) != null) {
            eVar3.b(vn0.b.f519707a.a().f536941f, true);
        }
        tn0.w0 Q63 = o2Var.Q6();
        int c17 = (Q63 == null || (eVar2 = Q63.f502297m) == null) ? -1 : eVar2.c();
        if (c17 != -1) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) o2Var.m7().f427831q).k(java.lang.Integer.valueOf(c17));
            if (!o2Var.m7().f427829o) {
                p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var = o2Var.m7().f427828n;
                o2Var.m7().getClass();
                ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var).k(java.lang.Boolean.valueOf(c17 == 2));
            }
        }
        if (o2Var.n7().Q6() == 1 && (Q6 = o2Var.Q6()) != null && (eVar = Q6.f502297m) != null) {
            eVar.h(1);
        }
        java.lang.Object systemService = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.media.AudioManager");
        boolean isBluetoothA2dpOn = ((android.media.AudioManager) systemService).isBluetoothA2dpOn();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "onStartSing audioRouteType: " + c17 + " isBluetoothA2dpOn: " + isBluetoothA2dpOn);
        if (c17 == 3 && isBluetoothA2dpOn) {
            pm0.v.X(ch2.l1.f122932d);
        }
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 j2Var2 = o2Var.m7().f427826i;
        if (j2Var2 != null) {
            ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) j2Var2).k(0);
        }
        om2.g q76 = o2Var.q7();
        om2.i iVar = q76.f427840n;
        java.lang.String str2 = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(iVar != null ? iVar.d() : null, ((mm2.c1) q76.m147920xbba4bfc0(mm2.c1.class)).m8())) {
            o2Var.B7();
        }
        boolean S6 = o2Var.n7().S6();
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole = com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole.TXChorusRoleLeadSinger;
        com.p314xaae8f345.p3109x36756d.AbstractC26790x777b55bc.TXChorusRole tXChorusRole2 = this.f122919e;
        java.lang.Object[] objArr = tXChorusRole2 == tXChorusRole;
        r45.yx1 yx1Var = this.f122921g;
        int i17 = o2Var.q7().f427847u;
        r45.ia4 ia4Var = new r45.ia4();
        r45.yx1 yx1Var2 = this.f122921g;
        ia4Var.f458402d = yx1Var2.f472991d;
        ia4Var.f458403e = yx1Var2.f472992e;
        ia4Var.f458404f = yx1Var2.f473002r;
        ia4Var.f458407i = 1;
        r45.yx1 yx1Var3 = this.f122922h;
        if (yx1Var3 == null || (by1Var = yx1Var3.f472999o) == null || (ay1Var4 = by1Var.f452676d) == null || (str = ay1Var4.f451884e) == null) {
            str = "";
        }
        ia4Var.f458405g = str;
        om2.g gVar = this.f122920f;
        if (S6 && objArr != false) {
            ia4Var.f458418w = 1;
            ia4Var.f458419x = ((java.lang.Boolean) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) gVar.m147920xbba4bfc0(om2.e.class)).f427823f).mo144003x754a37bb()).booleanValue() ? 1 : 0;
            ia4Var.f458420y = ((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) gVar.m147920xbba4bfc0(om2.e.class)).f427825h).mo144003x754a37bb()).intValue();
            ia4Var.f458421z = (float) (((java.lang.Number) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((om2.e) gVar.m147920xbba4bfc0(om2.e.class)).f427826i).mo144003x754a37bb()).doubleValue() / 12.0d);
        }
        r45.by1 by1Var2 = yx1Var3.f472999o;
        ia4Var.B = (by1Var2 == null || (ay1Var3 = by1Var2.f452676d) == null) ? false : ay1Var3.f451893q;
        r45.ha4 ha4Var = new r45.ha4();
        r45.ga4 ga4Var = new r45.ga4();
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        gVar.f427840n = new om2.i(yx1Var, i17, ia4Var, ha4Var, ga4Var, uuid, this.f122919e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = o2Var.f122966z;
        b4Var.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "stopTRTCSEITimer");
        b4Var.c(20L, 20L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveKTVSingController", "startTRTCSEITimer");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(o2Var, null, null, new ch2.i2(o2Var, yx1Var3, tXChorusRole2, null), 3, null);
        java.lang.String mic_sdk_user_id = yx1Var2.f473002r;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mic_sdk_user_id, "mic_sdk_user_id");
        r45.xn1 p76 = o2Var.p7(mic_sdk_user_id);
        java.lang.String m86 = o2Var.h7().m8();
        java.lang.String str3 = m86 == null ? "" : m86;
        java.lang.String str4 = yx1Var2.f472992e;
        java.lang.String str5 = str4 == null ? "" : str4;
        java.lang.String str6 = yx1Var2.f472991d;
        java.lang.String str7 = str6 == null ? "" : str6;
        r45.by1 by1Var3 = yx1Var3.f472999o;
        if (by1Var3 != null && (ay1Var2 = by1Var3.f452676d) != null) {
            str2 = ay1Var2.f451884e;
        }
        java.lang.String str8 = str2 == null ? "" : str2;
        int P6 = o2Var.n7().P6();
        r45.by1 by1Var4 = yx1Var2.f472999o;
        o2Var.q7().P6(new om2.x(new om2.o(str3, p76, str5, str7, str8, P6, (by1Var4 == null || (ay1Var = by1Var4.f452676d) == null || !ay1Var.f451893q) ? false : true)), false);
        return jz5.f0.f384359a;
    }
}
