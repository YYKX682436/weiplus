package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes5.dex */
public final class f6 extends n3.j2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage f72643c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f72644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f72645e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(com.tencent.mm.plugin.aa.ui.PaylistAARemarkInputHalfPage paylistAARemarkInputHalfPage, com.tencent.mm.ui.widget.dialog.z2 z2Var, android.view.View view) {
        super(0);
        this.f72643c = paylistAARemarkInputHalfPage;
        this.f72644d = z2Var;
        this.f72645e = view;
    }

    @Override // n3.j2
    public void b(n3.s2 animation) {
        kotlin.jvm.internal.o.g(animation, "animation");
        if ((animation.a() & 8) != 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f334362a;
            n3.g3 a17 = n3.b1.a(this.f72645e);
            com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[InsetsAnimation] IME animation END, current imeVisible=" + (a17 != null ? a17.f(8) : false));
            this.f72643c.getClass();
            android.view.View view = this.f72644d.f212058g;
            if (view == null) {
                return;
            }
            view.getHeight();
            view.getPaddingBottom();
        }
    }

    @Override // n3.j2
    public n3.g3 d(n3.g3 insets, java.util.List runningAnimations) {
        boolean z17;
        kotlin.jvm.internal.o.g(insets, "insets");
        kotlin.jvm.internal.o.g(runningAnimations, "runningAnimations");
        if (!runningAnimations.isEmpty()) {
            java.util.Iterator it = runningAnimations.iterator();
            while (it.hasNext()) {
                z17 = true;
                if ((((n3.s2) it.next()).a() & 8) != 0) {
                    break;
                }
            }
        }
        z17 = false;
        if (!z17) {
            return insets;
        }
        int i17 = insets.a(8).f247047d - insets.a(7).f247047d;
        if (i17 <= 0) {
            i17 = 0;
        }
        com.tencent.mm.ui.MMActivity mMActivity = this.f72643c.f72535d;
        boolean c17 = com.tencent.mm.ui.b4.c(mMActivity);
        android.view.View view = this.f72645e;
        if (c17) {
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            java.lang.Object layoutParams = view2 != null ? view2.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
                view2.setLayoutParams(marginLayoutParams);
            }
        } else if (!com.tencent.mm.ui.w9.c(mMActivity) && !com.tencent.mm.ui.bk.g0() && !com.tencent.mm.ui.bk.f0()) {
            view.setPadding(0, 0, 0, i17);
        }
        return insets;
    }

    @Override // n3.j2
    public n3.i2 e(n3.s2 animation, n3.i2 bounds) {
        kotlin.jvm.internal.o.g(animation, "animation");
        kotlin.jvm.internal.o.g(bounds, "bounds");
        if ((animation.a() & 8) != 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[InsetsAnimation] IME animation START");
        }
        return bounds;
    }
}
