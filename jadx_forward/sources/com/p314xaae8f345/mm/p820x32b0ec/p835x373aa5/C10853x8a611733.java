package com.p314xaae8f345.mm.p820x32b0ec.p835x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006¨\u0006\u0016"}, d2 = {"Lcom/tencent/mm/live/view/FinderLiveFeedThreePartsRecommendWordingView;", "Landroid/widget/FrameLayout;", "Landroid/widget/TextView;", "d", "Landroid/widget/TextView;", "getPrefix", "()Landroid/widget/TextView;", "prefix", "e", "getContent", "content", "f", "getSuffix", "suffix", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.live.view.FinderLiveFeedThreePartsRecommendWordingView */
/* loaded from: classes2.dex */
public final class C10853x8a611733 extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView prefix;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView content;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public final android.widget.TextView suffix;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C10853x8a611733(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public final android.widget.TextView getContent() {
        return this.content;
    }

    public final android.widget.TextView getPrefix() {
        return this.prefix;
    }

    public final android.widget.TextView getSuffix() {
        return this.suffix;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10853x8a611733(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.e_k, (android.view.ViewGroup) this, true);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.usk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.prefix = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.cgi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.content = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.f568703vb3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.suffix = (android.widget.TextView) findViewById3;
    }
}
