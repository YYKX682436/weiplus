package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2286x2e06d1.p2287x373aa5;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/plugin/ting/base/view/TingBaseHalfDialog;", "Lhg5/d;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attributeSet", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.base.view.TingBaseHalfDialog */
/* loaded from: classes8.dex */
public abstract class AbstractDialogC18712xbaa9ebba extends hg5.d {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f256198r = 0;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC18712xbaa9ebba(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    @Override // hg5.d
    public void G() {
        android.view.Window window = getWindow();
        if (window != null) {
            window.setLayout(-1, -1);
        }
        android.view.Window window2 = getWindow();
        if (window2 != null) {
            window2.addFlags(67108864);
        }
        android.view.Window window3 = getWindow();
        if (window3 != null) {
            window3.setDimAmount(0.5f);
        }
        android.view.Window window4 = getWindow();
        if (window4 != null) {
            window4.setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        }
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ddl, (android.view.ViewGroup) null, false);
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f362934g = inflate;
        android.view.View findViewById = inflate != null ? inflate.findViewById(com.p314xaae8f345.mm.R.id.f565753df2) : null;
        this.f362935h = findViewById;
        if (findViewById != null) {
            findViewById.setOnTouchListener(new uk4.f(this));
        }
        android.view.View view = this.f362934g;
        this.f362937m = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.ci6) : null;
        this.f362936i = F();
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -2);
        android.view.View view2 = this.f362937m;
        android.view.ViewGroup viewGroup = view2 instanceof android.view.ViewGroup ? (android.view.ViewGroup) view2 : null;
        if (viewGroup != null) {
            viewGroup.addView(this.f362936i, layoutParams);
        }
        android.view.View view3 = this.f362936i;
        if (view3 != null) {
            view3.setMinimumHeight(K());
        }
        android.view.View view4 = this.f362937m;
        if (view4 != null) {
            view4.setMinimumHeight(K());
        }
        setCancelable(true);
        this.f362939o = new uk4.g(this);
    }

    public abstract int K();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractDialogC18712xbaa9ebba(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }
}
