package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002B\u001b\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fB#\b\u0016\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u000e\u0010\u0012R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/view/MusicMvWxRecyclerView;", "Lcom/tencent/mm/view/recyclerview/WxRecyclerView;", "Lcom/tencent/mm/plugin/mv/ui/view/f4;", "j2", "Lcom/tencent/mm/plugin/mv/ui/view/f4;", "getChangeListener", "()Lcom/tencent/mm/plugin/mv/ui/view/f4;", "setChangeListener", "(Lcom/tencent/mm/plugin/mv/ui/view/f4;)V", "changeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.view.MusicMvWxRecyclerView */
/* loaded from: classes10.dex */
public class C16704xa1b54733 extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 {

    /* renamed from: j2, reason: collision with root package name and from kotlin metadata */
    public com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f4 changeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16704xa1b54733(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f4 getChangeListener() {
        return this.changeListener;
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, android.view.ViewGroup
    public void onViewAdded(android.view.View view) {
        super.onViewAdded(view);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f4 f4Var = this.changeListener;
        if (f4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l1) f4Var).f232799a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onViewAdded");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.O6(s1Var, view);
        }
    }

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25, android.view.ViewGroup
    public void onViewRemoved(android.view.View view) {
        super.onViewRemoved(view);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f4 f4Var = this.changeListener;
        if (f4Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1 s1Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.l1) f4Var).f232799a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(s1Var.f232946d, "onViewRemoved");
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.P6(s1Var, view);
        }
    }

    /* renamed from: setChangeListener */
    public final void m67374xf5c5c186(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.f4 f4Var) {
        this.changeListener = f4Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16704xa1b54733(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
