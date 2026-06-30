package it5;

/* loaded from: classes13.dex */
public final class d extends com.qq.taf.jce.AbstractC2861x7aec4921 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f376174d = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f376175e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f376176f = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f376177g = "";

    /* renamed from: h, reason: collision with root package name */
    public int f376178h = 0;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f376179i = "";

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f376180m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f376181n = 0;

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: newInit */
    public com.qq.taf.jce.AbstractC2861x7aec4921 mo21369x6df6b2d0() {
        return new it5.d();
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: readFrom */
    public void mo21234xcc442a60(com.qq.taf.jce.C2859xe10ac61e c2859xe10ac61e) {
        this.f376174d = c2859xe10ac61e.m21321xe22f9d47(0, false);
        this.f376175e = c2859xe10ac61e.m21321xe22f9d47(1, false);
        this.f376176f = c2859xe10ac61e.m21321xe22f9d47(2, false);
        this.f376177g = c2859xe10ac61e.m21321xe22f9d47(3, false);
        this.f376178h = c2859xe10ac61e.m21299x355996(this.f376178h, 4, false);
        this.f376179i = c2859xe10ac61e.m21321xe22f9d47(5, false);
        this.f376180m = c2859xe10ac61e.m21321xe22f9d47(6, false);
        this.f376181n = c2859xe10ac61e.m21299x355996(this.f376181n, 7, false);
    }

    @Override // com.qq.taf.jce.AbstractC2861x7aec4921
    /* renamed from: writeTo */
    public void mo21235x5f8be6ba(com.qq.taf.jce.C2860x6de9642d c2860x6de9642d) {
        java.lang.String str = this.f376174d;
        if (str != null) {
            c2860x6de9642d.m21349x6c257df(str, 0);
        }
        java.lang.String str2 = this.f376175e;
        if (str2 != null) {
            c2860x6de9642d.m21349x6c257df(str2, 1);
        }
        java.lang.String str3 = this.f376176f;
        if (str3 != null) {
            c2860x6de9642d.m21349x6c257df(str3, 2);
        }
        java.lang.String str4 = this.f376177g;
        if (str4 != null) {
            c2860x6de9642d.m21349x6c257df(str4, 3);
        }
        int i17 = this.f376178h;
        if (i17 != 0) {
            c2860x6de9642d.m21338x6c257df(i17, 4);
        }
        java.lang.String str5 = this.f376179i;
        if (str5 != null) {
            c2860x6de9642d.m21349x6c257df(str5, 5);
        }
        java.lang.String str6 = this.f376180m;
        if (str6 != null) {
            c2860x6de9642d.m21349x6c257df(str6, 6);
        }
        int i18 = this.f376181n;
        if (i18 != 0) {
            c2860x6de9642d.m21338x6c257df(i18, 7);
        }
    }
}
