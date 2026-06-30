package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f221431d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f221432e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f221433f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f221434g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f221435h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221436i;

    public h0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f221436i = x0Var;
        this.f221431d = str;
        this.f221432e = i17;
        this.f221433f = i18;
        this.f221434g = i19;
        this.f221435h = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221436i;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b bVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.b) ((java.util.HashMap) x0Var.R1).get(this.f221431d);
        if (bVar == null) {
            return;
        }
        android.view.View view = bVar.f488187h;
        android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.width = this.f221432e;
        layoutParams.height = this.f221433f;
        view.setLayoutParams(layoutParams);
        view.setX(this.f221434g + x0Var.A.getX());
        view.setY(this.f221435h + x0Var.A.getY());
    }
}
