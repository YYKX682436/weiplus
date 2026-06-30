package com.tencent.mm.modelbase;

/* loaded from: classes8.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f70664a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.protobuf.f f70665b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f70666c;

    /* renamed from: d, reason: collision with root package name */
    public int f70667d;

    /* renamed from: m, reason: collision with root package name */
    public boolean f70676m;

    /* renamed from: e, reason: collision with root package name */
    public int f70668e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f70669f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f70670g = true;

    /* renamed from: h, reason: collision with root package name */
    public int f70671h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f70672i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f70673j = false;

    /* renamed from: k, reason: collision with root package name */
    public int f70674k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f70675l = 0;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f70677n = null;

    /* renamed from: o, reason: collision with root package name */
    public int f70678o = 0;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy f70679p = com.tencent.mars.stn.StnManager.Task.EBindCellularStrategy.kDefault;

    public com.tencent.mm.modelbase.o a() {
        int i17;
        int i18;
        int i19;
        if (this.f70664a == null || this.f70665b == null || com.tencent.mm.sdk.platformtools.t8.K0(this.f70666c) || (i17 = this.f70667d) <= 0 || (i18 = this.f70668e) == Integer.MIN_VALUE || (i19 = this.f70669f) == Integer.MIN_VALUE) {
            java.lang.Object[] objArr = new java.lang.Object[6];
            objArr[0] = java.lang.Boolean.valueOf(this.f70664a == null);
            objArr[1] = java.lang.Boolean.valueOf(this.f70665b == null);
            objArr[2] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f70666c));
            objArr[3] = java.lang.Boolean.valueOf(this.f70667d <= 0);
            objArr[4] = java.lang.Boolean.valueOf(this.f70668e == Integer.MIN_VALUE);
            objArr[5] = java.lang.Boolean.valueOf(this.f70669f == Integer.MIN_VALUE);
            throw new java.lang.IllegalArgumentException(java.lang.String.format("%s %s %s %s %s %s", objArr));
        }
        com.tencent.mm.modelbase.o oVar = new com.tencent.mm.modelbase.o(this.f70664a, this.f70665b, this.f70666c, i17, i18, i19, this.f70670g, this.f70672i, this.f70671h, this.f70673j, this.f70674k, this.f70676m, null);
        int i27 = this.f70675l;
        if (i27 != 0) {
            oVar.f70719j = i27 | oVar.f70719j;
            oVar.f70720k = this.f70677n;
        }
        int i28 = this.f70678o;
        if (i28 != 0) {
            oVar.setNewDNSBusinessType(i28);
        }
        oVar.setBindCellularStrategy(this.f70679p);
        return oVar;
    }
}
