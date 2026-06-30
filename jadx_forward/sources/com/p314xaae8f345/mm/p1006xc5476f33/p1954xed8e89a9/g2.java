package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes11.dex */
public final class g2 implements com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.wl f235003a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f235004b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f235005c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f235006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f235007e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f235008f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 f235009g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f235010h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f235011i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ int f235012j;

    public g2(r45.wl wlVar, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, boolean z17, long j17, int i17, int i18, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 t1Var, android.app.Activity activity, java.lang.String str, int i19) {
        this.f235003a = wlVar;
        this.f235004b = f0Var;
        this.f235005c = z17;
        this.f235006d = j17;
        this.f235007e = i17;
        this.f235008f = i18;
        this.f235009g = t1Var;
        this.f235010h = activity;
        this.f235011i = str;
        this.f235012j = i19;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.v
    public final void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock errType " + i17 + ", errCode " + i18 + ", errMsg " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.t1 t1Var = this.f235009g;
        if (i17 != 0 || i18 != 0) {
            if (t1Var != null) {
                t1Var.a();
                return;
            }
            return;
        }
        r45.wl wlVar = this.f235003a;
        if (wlVar.f470782w == null) {
            wlVar.f470782w = new r45.td5();
        }
        r45.td5 td5Var = wlVar.f470782w;
        p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f235004b;
        td5Var.f467860d = f0Var.f391649d;
        qr3.c0.c(wlVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock: update Setting.BlockFinder=" + f0Var.f391649d + " and saved");
        if (this.f235005c) {
            d75.b.g(new com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.f2(this.f235010h, this.f235011i, this.f235012j));
        }
        r45.pi piVar = wlVar.f470766d;
        java.lang.String str2 = piVar != null ? piVar.f464598d : null;
        r45.an anVar = wlVar.f470778s;
        java.lang.String b17 = x51.j1.b(anVar != null ? anVar.f451659d : null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5198x982ec894 c5198x982ec894 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5198x982ec894();
        am.x0 x0Var = c5198x982ec894.f135540g;
        x0Var.getClass();
        x0Var.getClass();
        int i19 = f0Var.f391649d;
        x0Var.getClass();
        c5198x982ec894.e();
        if (f0Var.f391649d == 1) {
            r01.e Bi = r01.q3.Bi();
            if (Bi != null && str2 != null && b17 != null) {
                c01.x xVar = new c01.x();
                xVar.f68934x3a0bff44 = str2;
                xVar.f68935x553a5901 = b17;
                c01.x xVar2 = Bi.get(xVar, new java.lang.String[0]) ? xVar : null;
                if (xVar2 != null) {
                    Bi.mo9952xce0038c9(xVar2, new java.lang.String[0]);
                } else {
                    Bi.mo880xb970c2b9(xVar);
                }
            }
        } else {
            r01.e Bi2 = r01.q3.Bi();
            if (Bi2 != null) {
                Bi2.d(str2);
            }
        }
        int i27 = f0Var.f391649d == 1 ? 602 : 603;
        if (str2 == null) {
            str2 = "";
        }
        gr3.e.d(str2, i27, this.f235006d, null, this.f235007e, this.f235008f, 0, null, null, null, 0, 0, 4032, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "handleFinderBlock: sync blockStatus=" + f0Var.f391649d + " success");
        if (t1Var != null) {
            t1Var.mo67622xe05b4124(f0Var.f391649d);
        }
    }
}
