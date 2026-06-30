package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B%\b\u0016\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u0017\u0010\u001bR(\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/whatnews/FinderWhatsNewView;", "Landroid/widget/FrameLayout;", "Lkotlin/Function0;", "Ljz5/f0;", "d", "Lyz5/a;", "getDetachFinish", "()Lyz5/a;", "setDetachFinish", "(Lyz5/a;)V", "detachFinish", "", "e", "Z", "getWithEnterAnim", "()Z", "setWithEnterAnim", "(Z)V", "withEnterAnim", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.whatnews.FinderWhatsNewView */
/* loaded from: classes3.dex */
public final class C15439x83466e9c extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public yz5.a detachFinish;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean withEnterAnim;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15439x83466e9c(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        setId(com.p314xaae8f345.mm.R.id.g57);
        int i17 = cy2.b.f306274a;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570633ba3, (android.view.ViewGroup) this, true);
        this.detachFinish = cy2.c.f306275d;
    }

    public final yz5.a getDetachFinish() {
        return this.detachFinish;
    }

    public final boolean getWithEnterAnim() {
        return this.withEnterAnim;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        android.widget.Button button = (android.widget.Button) findViewById(com.p314xaae8f345.mm.R.id.dgt);
        int i17 = cy2.b.f306274a;
        button.setText(getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9z));
        button.setOnClickListener(new cy2.e(this));
        post(new cy2.f(this));
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i17, int i18) {
        super.onMeasure(i17, i18);
        requestLayout();
    }

    /* renamed from: setDetachFinish */
    public final void m63027x5d1ae388(yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aVar, "<set-?>");
        this.detachFinish = aVar;
    }

    /* renamed from: setWithEnterAnim */
    public final void m63028x50b721a1(boolean z17) {
        this.withEnterAnim = z17;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15439x83466e9c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(context);
        setId(com.p314xaae8f345.mm.R.id.g57);
        int i18 = cy2.b.f306274a;
        android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570633ba3, (android.view.ViewGroup) this, true);
        this.detachFinish = cy2.c.f306275d;
    }
}
