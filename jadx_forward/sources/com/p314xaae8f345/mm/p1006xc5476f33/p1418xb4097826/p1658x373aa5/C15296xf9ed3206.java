package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/finder/view/FinderHomeTabFeedBackBubbleView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.view.FinderHomeTabFeedBackBubbleView */
/* loaded from: classes2.dex */
public final class C15296xf9ed3206 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Runnable f212667d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f212668e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15296xf9ed3206(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212668e = "";
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqh, (android.view.ViewGroup) this, true);
    }

    public final void a(java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderHomeTabFeedBackBubbleView", source.concat(" hide!"));
        removeCallbacks(this.f212667d);
        setVisibility(8);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a("onDetachedFromWindow");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15296xf9ed3206(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212668e = "";
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqh, (android.view.ViewGroup) this, true);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C15296xf9ed3206(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f212668e = "";
        com.p314xaae8f345.mm.ui.id.b(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dqh, (android.view.ViewGroup) this, true);
    }
}
