package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\fB\u0019\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\r"}, d2 = {"Lcom/tencent/mm/ui/widget/pulldown/MMWeUIBounceView;", "Lcom/tencent/mm/ui/widget/pulldown/WeUIBounceViewV2;", "", "resid", "Ljz5/f0;", "setBackgroundResource", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "ul5/n", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.widget.pulldown.MMWeUIBounceView */
/* loaded from: classes15.dex */
public final class C22716xe73ca68f extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22718xa7b47fcb {
    public static final ul5.n P = new ul5.n(null);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22716xe73ca68f(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        ul5.y.f510199j = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2535xb5e903a3.C20257x5b375031()) == 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22718xa7b47fcb, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4, ul5.m
    public void b(android.view.View view, int i17) {
        super.b(view, i17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4, n3.g0
    public void j(android.view.View target, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        try {
            super.j(target, i17);
        } catch (java.lang.Throwable th6) {
            P.a(4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PullDownParentView", th6, "onStopNestedScroll err", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4
    public int k(android.view.View target, int i17, int i18, int[] consumed, int i19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(consumed, "consumed");
        try {
            return super.k(target, i17, i18, consumed, i19);
        } catch (java.lang.Throwable th6) {
            P.a(2);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PullDownParentView", th6, "onNestedPreScrollInner err", new java.lang.Object[0]);
            return 0;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4
    public void m(android.view.View target, int i17, int i18, int[] iArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(target, "target");
        try {
            super.m(target, i17, i18, iArr);
        } catch (java.lang.Throwable th6) {
            P.a(3);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PullDownParentView", th6, "onNestedScrollInternal err", new java.lang.Object[0]);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4, android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (java.lang.Throwable th6) {
            P.a(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PullDownParentView", th6, "onInterceptTouchEvent err", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2765x5e292867.C22717x128919c4, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        try {
            return super.onTouchEvent(event);
        } catch (java.lang.Throwable th6) {
            P.a(1);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("PullDownParentView", th6, "onTouchEvent err", new java.lang.Object[0]);
            return false;
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i17) {
        android.view.View mContentView = getMContentView();
        if (mContentView != null) {
            mContentView.setBackgroundResource(i17);
        }
    }

    @Override // android.view.View
    public void setPadding(int i17, int i18, int i19, int i27) {
        super.setPadding(i17, i18, i19, i27);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C22716xe73ca68f(android.content.Context context) {
        this(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
