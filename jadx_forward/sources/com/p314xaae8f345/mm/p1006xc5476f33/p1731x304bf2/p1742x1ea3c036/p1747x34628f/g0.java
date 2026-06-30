package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class g0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221423d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221424e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f221425f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221426g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f221427h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f221428i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221429m;

    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, java.lang.String str, java.lang.String str2, int i17, int i18, int i19, int i27) {
        this.f221429m = x0Var;
        this.f221423d = str;
        this.f221424e = str2;
        this.f221425f = i17;
        this.f221426g = i18;
        this.f221427h = i19;
        this.f221428i = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221429m;
        x0Var.M.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w0(x0Var));
        x0Var.w();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(x0Var.f488190n);
        java.lang.String str = this.f221423d;
        bundle.putString("rawUrl", str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b bVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b(x0Var.f488145f, null, bundle);
        ((java.util.HashMap) x0Var.R1).put(this.f221424e, bVar);
        android.widget.FrameLayout frameLayout = x0Var.A;
        android.view.View view = bVar.f488187h;
        frameLayout.addView(view, new android.widget.FrameLayout.LayoutParams(this.f221425f, this.f221426g));
        view.setX(this.f221427h + x0Var.A.getX());
        view.setY(this.f221428i + x0Var.A.getY());
        bVar.f263719t.setVisibility(8);
        bVar.M.mo50293x3498a0(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.w0(bVar));
        bVar.b(str, bundle);
    }
}
