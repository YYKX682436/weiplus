package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class w6 extends bb5.k {

    /* renamed from: i, reason: collision with root package name */
    public static com.tencent.mm.plugin.account.ui.w6 f74285i;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f74286b = null;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f74287c = null;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f74288d = null;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f74289e = null;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f74290f = null;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f74291g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f74292h = 0;

    public static java.lang.String c() {
        com.tencent.mm.plugin.account.ui.w6 w6Var = f74285i;
        if (w6Var != null) {
            return w6Var.f74286b;
        }
        return null;
    }

    public static java.lang.String d() {
        com.tencent.mm.plugin.account.ui.w6 w6Var = f74285i;
        if (w6Var != null) {
            return w6Var.f74287c;
        }
        return null;
    }

    @Override // bb5.k
    public void a() {
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f74288d)) {
            gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(this.f74286b, this.f74287c, this.f19140a.getSecCodeType(), "", "", "", 0, "", false, false));
        } else {
            gm0.j1.d().g(new com.tencent.mm.modelsimple.v0(this.f74286b, this.f74288d, this.f19140a.getSecCodeType(), "", "", "", 0, "", false, true));
        }
    }

    @Override // bb5.k
    public void b() {
    }
}
