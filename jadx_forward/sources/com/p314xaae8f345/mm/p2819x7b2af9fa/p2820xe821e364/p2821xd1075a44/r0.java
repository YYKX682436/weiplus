package com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44;

/* loaded from: classes15.dex */
public class r0 implements com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 f296156a;

    public r0(com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4) {
        this.f296156a = c22949xf1deaba4;
    }

    public int a() {
        return this.f296156a.getChildCount();
    }

    public void b(int i17) {
        com.p314xaae8f345.mm.p2819x7b2af9fa.p2820xe821e364.p2821xd1075a44.C22949xf1deaba4 c22949xf1deaba4 = this.f296156a;
        android.view.View childAt = c22949xf1deaba4.getChildAt(i17);
        if (childAt != null) {
            c22949xf1deaba4.q(childAt);
            childAt.clearAnimation();
        }
        c22949xf1deaba4.removeViewAt(i17);
    }
}
