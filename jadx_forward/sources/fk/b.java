package fk;

/* loaded from: classes12.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344784d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344785e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ wj.q0 f344786f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f344787g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344788h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f344789i;

    public b(java.lang.String str, java.lang.String str2, wj.q0 q0Var, int i17, java.lang.String str3, java.lang.String str4) {
        this.f344784d = str;
        this.f344785e = str2;
        this.f344786f = q0Var;
        this.f344787g = i17;
        this.f344788h = str3;
        this.f344789i = str4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6715xc2cda4d9 c6715xc2cda4d9 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6715xc2cda4d9();
        c6715xc2cda4d9.f140549d = c6715xc2cda4d9.b("PosId", this.f344784d, true);
        java.lang.String str = this.f344785e;
        if (str == null) {
            str = "";
        }
        c6715xc2cda4d9.f140550e = c6715xc2cda4d9.b("Aid", str, true);
        c6715xc2cda4d9.f140551f = this.f344786f.f528030d;
        c6715xc2cda4d9.f140552g = this.f344787g;
        java.lang.String str2 = this.f344788h;
        c6715xc2cda4d9.f140553h = c6715xc2cda4d9.b("Extra", str2 != null ? r26.i0.u(str2, ',', ';', false, 4, null) : null, true);
        java.lang.String str3 = this.f344789i;
        c6715xc2cda4d9.f140554i = c6715xc2cda4d9.b("Extra2", str3 != null ? r26.i0.u(str3, ',', ';', false, 4, null) : null, true);
        c6715xc2cda4d9.k();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicAdCommonReporter", "35978, posId = " + c6715xc2cda4d9.f140549d + ", aid = " + c6715xc2cda4d9.f140550e + ", actionType = " + c6715xc2cda4d9.f140551f + ", value = " + c6715xc2cda4d9.f140552g + ", extra = " + c6715xc2cda4d9.f140553h + ", extra2 = " + c6715xc2cda4d9.f140554i);
    }
}
