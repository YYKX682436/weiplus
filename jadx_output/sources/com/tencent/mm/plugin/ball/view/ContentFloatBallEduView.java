package com.tencent.mm.plugin.ball.view;

@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018B#\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0019\u001a\u00020\t¢\u0006\u0004\b\u0017\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\tJ\u000e\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\tJ\u0012\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¨\u0006\u001b"}, d2 = {"Lcom/tencent/mm/plugin/ball/view/ContentFloatBallEduView;", "Landroid/widget/FrameLayout;", "Landroid/widget/PopupWindow$OnDismissListener;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Ljz5/f0;", "setDismissListener", "", com.tencent.thumbplayer.tmediacodec.util.MimeTypes.BASE_TYPE_TEXT, "setEduText", "", "marginOfRight", "setArrowIconPosition", "marginEnd", "setMarginEnd", "topOffsetY", "setTopOffsetY", "Landroid/view/ViewGroup$LayoutParams;", "params", "setLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "ball-impl-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes7.dex */
public final class ContentFloatBallEduView extends android.widget.FrameLayout {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f93398d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f93399e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f93400f;

    /* renamed from: g, reason: collision with root package name */
    public int f93401g;

    /* renamed from: h, reason: collision with root package name */
    public int f93402h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.PopupWindow.OnDismissListener f93403i;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallEduView(android.content.Context context) {
        this(context, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    public final void setArrowIconPosition(int i17) {
        android.view.ViewGroup.LayoutParams layoutParams;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f93398d;
        if (weImageView == null) {
            return;
        }
        if (weImageView == null || (layoutParams = weImageView.getLayoutParams()) == null) {
            layoutParams = null;
        } else if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            ((android.view.ViewGroup.MarginLayoutParams) layoutParams).setMarginEnd(i17 + com.tencent.mm.ui.zk.a(getContext(), 21));
        }
        weImageView.setLayoutParams(layoutParams);
    }

    public final void setDismissListener(android.widget.PopupWindow.OnDismissListener listener) {
        kotlin.jvm.internal.o.g(listener, "listener");
        this.f93403i = listener;
    }

    public final void setEduText(java.lang.String text) {
        kotlin.jvm.internal.o.g(text, "text");
        android.widget.TextView textView = this.f93399e;
        if (textView == null) {
            return;
        }
        textView.setText(text);
    }

    @Override // android.view.View
    public void setLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof android.view.ViewGroup.MarginLayoutParams) {
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMarginEnd(this.f93402h - com.tencent.mm.ui.zk.a(getContext(), 13));
            marginLayoutParams.topMargin = this.f93401g - com.tencent.mm.ui.zk.a(getContext(), 21);
        }
        super.setLayoutParams(layoutParams);
    }

    public final void setMarginEnd(int i17) {
        this.f93402h = i17;
    }

    public final void setTopOffsetY(int i17) {
        this.f93401g = i17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallEduView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        kotlin.jvm.internal.o.g(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContentFloatBallEduView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.id.b(context).inflate(com.tencent.mm.R.layout.f489198ei0, this);
        this.f93398d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.txa);
        this.f93399e = (android.widget.TextView) findViewById(com.tencent.mm.R.id.txe);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.txb);
        this.f93400f = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new rp1.b(this));
        }
    }
}
