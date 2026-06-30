package com.p314xaae8f345.mm.p944x882e457a;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f152197a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f f152198b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f152199c;

    /* renamed from: d, reason: collision with root package name */
    public int f152200d;

    /* renamed from: m, reason: collision with root package name */
    public boolean f152209m;

    /* renamed from: e, reason: collision with root package name */
    public int f152201e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f152202f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f152203g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f152204h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f152205i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f152206j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f152207k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f152208l = 0;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f152210n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f152211o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy f152212p = com.p314xaae8f345.p542x3306d5.stn.C4592x9a94e8e0.Task.EBindCellularStrategy.kDefault;

    public com.p314xaae8f345.mm.p944x882e457a.o a() {
        int i17;
        int i18;
        int i19;
        if (this.f152197a == null || this.f152198b == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152199c) || (i17 = this.f152200d) <= 0 || (i18 = this.f152201e) == Integer.MIN_VALUE || (i19 = this.f152202f) == Integer.MIN_VALUE) {
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Boolean.valueOf(this.f152197a == null);
            objArr[1] = java.lang.Boolean.valueOf(this.f152198b == null);
            objArr[2] = java.lang.Boolean.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f152199c));
            objArr[3] = java.lang.Boolean.valueOf(this.f152200d <= 0);
            objArr[4] = java.lang.Boolean.valueOf(this.f152201e == Integer.MIN_VALUE);
            objArr[5] = java.lang.Boolean.valueOf(this.f152202f == Integer.MIN_VALUE);
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s %s %s %s %s %s", objArr));
        }
        com.p314xaae8f345.mm.p944x882e457a.o oVar = new com.p314xaae8f345.mm.p944x882e457a.o(this.f152197a, this.f152198b, this.f152199c, i17, i18, i19, this.f152203g, this.f152205i, this.f152204h, this.f152206j, this.f152207k, this.f152209m, null);
        int i27 = this.f152208l;
        if (i27 != 0) {
            oVar.f152252j = i27 | oVar.f152252j;
            oVar.f152253k = this.f152210n;
        }
        int i28 = this.f152211o;
        if (i28 != 0) {
            oVar.mo47987xb512c125(i28);
        }
        oVar.mo47983xe6f810dc(this.f152212p);
        return oVar;
    }
}
