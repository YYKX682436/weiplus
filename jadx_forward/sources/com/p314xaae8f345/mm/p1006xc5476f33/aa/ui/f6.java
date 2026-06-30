package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes5.dex */
public final class f6 extends n3.j2 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 f154176c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f154177d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f154178e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.C11354x3aa9ae06 c11354x3aa9ae06, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var, android.view.View view) {
        super(0);
        this.f154176c = c11354x3aa9ae06;
        this.f154177d = z2Var;
        this.f154178e = view;
    }

    @Override // n3.j2
    public void b(n3.s2 animation) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        if ((animation.a() & 8) != 0) {
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            n3.g3 a17 = n3.b1.a(this.f154178e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[InsetsAnimation] IME animation END, current imeVisible=" + (a17 != null ? a17.f(8) : false));
            this.f154176c.getClass();
            android.view.View view = this.f154177d.f293591g;
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(insets, "insets");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(runningAnimations, "runningAnimations");
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
        int i17 = insets.a(8).f328580d - insets.a(7).f328580d;
        if (i17 <= 0) {
            i17 = 0;
        }
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f154176c.f154068d;
        boolean c17 = com.p314xaae8f345.mm.ui.b4.c(abstractActivityC21394xb3d2c0cf);
        android.view.View view = this.f154178e;
        if (c17) {
            java.lang.Object parent = view.getParent();
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            java.lang.Object layoutParams = view2 != null ? view2.getLayoutParams() : null;
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
            if (marginLayoutParams != null) {
                marginLayoutParams.bottomMargin = i17;
                view2.setLayoutParams(marginLayoutParams);
            }
        } else if (!com.p314xaae8f345.mm.ui.w9.c(abstractActivityC21394xb3d2c0cf) && !com.p314xaae8f345.mm.ui.bk.g0() && !com.p314xaae8f345.mm.ui.bk.f0()) {
            view.setPadding(0, 0, 0, i17);
        }
        return insets;
    }

    @Override // n3.j2
    public n3.i2 e(n3.s2 animation, n3.i2 bounds) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bounds, "bounds");
        if ((animation.a() & 8) != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PaylistAARemarkInputHalfPage", "[InsetsAnimation] IME animation START");
        }
        return bounds;
    }
}
