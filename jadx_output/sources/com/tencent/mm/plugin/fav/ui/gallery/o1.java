package com.tencent.mm.plugin.fav.ui.gallery;

/* loaded from: classes12.dex */
public class o1 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f101035a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.b1 f101036b;

    /* renamed from: c, reason: collision with root package name */
    public final int f101037c;

    /* renamed from: d, reason: collision with root package name */
    public final long f101038d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f101039e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f101040f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.fav.ui.gallery.n1 f101041g;

    public o1(com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var) {
        java.lang.String a17;
        this.f101037c = 0;
        com.tencent.mm.plugin.fav.ui.gallery.n1 n1Var = new com.tencent.mm.plugin.fav.ui.gallery.n1(this);
        this.f101041g = n1Var;
        this.f101036b = b1Var;
        if (b1Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MediaHistoryGalleryAdapter", "[getImagePath] msg is null !");
            a17 = "";
        } else {
            a17 = b1Var.a();
        }
        this.f101035a = a17;
        this.f101038d = b1Var.f100897a.field_updateTime;
        if (b1Var.d() || b1Var.c()) {
            this.f101039e = true;
            n1Var.f101018a = com.tencent.mm.sdk.platformtools.t8.u(b1Var.f100898b.f375448y);
        }
        if (b1Var.b()) {
            this.f101040f = true;
        }
    }

    public boolean equals(java.lang.Object obj) {
        com.tencent.mm.plugin.fav.ui.gallery.b1 b1Var = this.f101036b;
        return (b1Var == null || !(obj instanceof com.tencent.mm.plugin.fav.ui.gallery.b1) || obj == null) ? super.equals(obj) : b1Var.f100898b.T.equals(((com.tencent.mm.plugin.fav.ui.gallery.b1) obj).f100898b.T);
    }

    public o1(long j17) {
        this.f101037c = 0;
        this.f101041g = new com.tencent.mm.plugin.fav.ui.gallery.n1(this);
        this.f101038d = j17;
        this.f101037c = Integer.MAX_VALUE;
    }
}
