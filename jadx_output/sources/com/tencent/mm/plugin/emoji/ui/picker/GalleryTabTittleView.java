package com.tencent.mm.plugin.emoji.ui.picker;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/GalleryTabTittleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", "visibility", "setArrowVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class GalleryTabTittleView extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMTextView f98152d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.imageview.WeImageView f98153e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GalleryTabTittleView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.ui.widget.MMTextView mMTextView = new com.tencent.mm.ui.widget.MMTextView(context);
        this.f98152d = mMTextView;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = new com.tencent.mm.ui.widget.imageview.WeImageView(context);
        this.f98153e = weImageView;
        setOrientation(0);
        mMTextView.setText(com.tencent.mm.R.string.ldi);
        mMTextView.setTextColor(getResources().getColorStateList(com.tencent.mm.R.color.f478911ac2));
        mMTextView.setTextSize(0, getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479897ia));
        setGravity(16);
        addView(mMTextView);
        weImageView.s(com.tencent.mm.R.raw.emoji_album_arrow_down, com.tencent.mm.R.color.f478553an);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 8.0f), ym5.x.a(context, 5.0f));
        layoutParams.leftMargin = ym5.x.a(context, 4.0f);
        addView(weImageView, layoutParams);
    }

    public final void a() {
        this.f98153e.animate().rotation(0.0f).setDuration(300L).start();
    }

    public final void setArrowVisibility(int i17) {
        this.f98153e.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
