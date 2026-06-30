package com.tencent.mm.feature.emoji;

/* loaded from: classes.dex */
public final class s3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f66465d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v75 f66466e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66467f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66468g;

    public s3(android.content.Context context, int i17, int i18, r45.v75 v75Var, java.lang.String str, java.lang.String str2) {
        this.f66465d = context;
        this.f66466e = v75Var;
        this.f66467f = str;
        this.f66468g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(this.f66465d, 1, false);
        k0Var.f211872n = new com.tencent.mm.feature.emoji.q3(1001, 1000);
        k0Var.f211881s = new com.tencent.mm.feature.emoji.r3(1001, this.f66466e, this.f66465d, 1000, this.f66467f, this.f66468g);
        k0Var.v();
    }
}
