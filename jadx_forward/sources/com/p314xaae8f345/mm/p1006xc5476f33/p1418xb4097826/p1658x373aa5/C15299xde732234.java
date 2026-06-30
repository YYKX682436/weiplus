package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u0001:\u0002\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0004H\u0016R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0017\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u001e"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHorizontalViewPager;", "Landroidx/recyclerview/widget/RecyclerView;", "", "getCurrentSnappedPosition", "Landroidx/recyclerview/widget/f2;", "adapter", "Ljz5/f0;", "setAdapter", "Lcom/tencent/mm/plugin/finder/view/sb;", "b2", "Lcom/tencent/mm/plugin/finder/view/sb;", "getPageChangeListener", "()Lcom/tencent/mm/plugin/finder/view/sb;", "setPageChangeListener", "(Lcom/tencent/mm/plugin/finder/view/sb;)V", "pageChangeListener", "Lcom/tencent/mm/plugin/finder/view/rb;", "c2", "Lcom/tencent/mm/plugin/finder/view/rb;", "getFingerTouchCallback", "()Lcom/tencent/mm/plugin/finder/view/rb;", "setFingerTouchCallback", "(Lcom/tencent/mm/plugin/finder/view/rb;)V", "fingerTouchCallback", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHorizontalViewPager */
/* loaded from: classes2.dex */
public class C15299xde732234 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sb pageChangeListener;

    /* renamed from: c2, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rb fingerTouchCallback;

    /* renamed from: d2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 f212682d2;

    /* renamed from: e2, reason: collision with root package name */
    public int f212683e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f212684f2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15299xde732234(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212683e2 = -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getCurrentSnappedPosition */
    public final int m62100xe7010d8b() {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 r3Var;
        android.view.View f17;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager mo7951xfd37656d = mo7951xfd37656d();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = mo7951xfd37656d instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) mo7951xfd37656d : null;
        if (c1162x665295de == null || (r3Var = this.f212682d2) == null || (f17 = r3Var.f(c1162x665295de)) == null) {
            return -1;
        }
        return c1162x665295de.m8032xa86cd69f(f17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    public void a1(int i17) {
        h1(i17, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rb rbVar;
        boolean dispatchTouchEvent = super.dispatchTouchEvent(motionEvent);
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getActionMasked()) : null;
        if (valueOf != null && valueOf.intValue() == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rb rbVar2 = this.fingerTouchCallback;
            if (rbVar2 != null) {
                mx2.g gVar = (mx2.g) rbVar2;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb8016041 = gVar.f414020b;
                gVar.f414019a = c15401xb8016041.f213857v;
                c15401xb8016041.o();
            }
        } else {
            boolean z17 = true;
            if ((valueOf == null || valueOf.intValue() != 1) && (valueOf == null || valueOf.intValue() != 3)) {
                z17 = false;
            }
            if (z17 && (rbVar = this.fingerTouchCallback) != null) {
                mx2.g gVar2 = (mx2.g) rbVar;
                boolean z18 = gVar2.f414019a;
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1667x5faa95b.C15401xb8016041 c15401xb80160412 = gVar2.f414020b;
                if (z18) {
                    c15401xb80160412.m();
                } else {
                    c15401xb80160412.o();
                }
            }
        }
        return dispatchTouchEvent;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rb getFingerTouchCallback() {
        return this.fingerTouchCallback;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sb getPageChangeListener() {
        return this.pageChangeListener;
    }

    public final void h1(int i17, boolean z17) {
        boolean z18 = i17 != this.f212683e2;
        super.a1(i17);
        if (z18) {
            this.f212683e2 = i17;
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tb(this, i17, z17));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4
    /* renamed from: setAdapter */
    public void mo7960x6cab2c8d(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 f2Var) {
        if (this.f212682d2 == null) {
            this.f212682d2 = new p012xc85e97e9.p103xe821e364.p104xd1075a44.y1();
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.r3 r3Var = this.f212682d2;
        if (r3Var != null) {
            r3Var.b(this);
        }
        super.mo7960x6cab2c8d(f2Var);
        i(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.ub(this));
    }

    /* renamed from: setFingerTouchCallback */
    public final void m62103xfe848ff9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.rb rbVar) {
        this.fingerTouchCallback = rbVar;
    }

    /* renamed from: setPageChangeListener */
    public final void m62104x737778f5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.sb sbVar) {
        this.pageChangeListener = sbVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15299xde732234(android.content.Context context) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212683e2 = -1;
    }
}
