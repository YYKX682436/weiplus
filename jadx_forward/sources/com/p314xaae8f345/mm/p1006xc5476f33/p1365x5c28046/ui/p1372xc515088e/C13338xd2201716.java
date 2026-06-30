package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.p1372xc515088e;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¨\u0006\u000f"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/picker/GalleryTabTittleView;", "Landroid/widget/LinearLayout;", "Landroid/view/View$OnClickListener;", "l", "Ljz5/f0;", "setOnClickListener", "", "visibility", "setArrowVisibility", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.picker.GalleryTabTittleView */
/* loaded from: classes10.dex */
public final class C13338xd2201716 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 f179685d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f179686e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13338xd2201716(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332 c22632xdab56332 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.C22632xdab56332(context);
        this.f179685d = c22632xdab56332;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        this.f179686e = c22699x3dcdb352;
        setOrientation(0);
        c22632xdab56332.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ldi);
        c22632xdab56332.setTextColor(getResources().getColorStateList(com.p314xaae8f345.mm.R.C30859x5a72f63.f560444ac2));
        c22632xdab56332.setTextSize(0, getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561430ia));
        setGravity(16);
        addView(c22632xdab56332);
        c22699x3dcdb352.s(com.p314xaae8f345.mm.R.raw.f79036x907d09c1, com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an);
        android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(ym5.x.a(context, 8.0f), ym5.x.a(context, 5.0f));
        layoutParams.leftMargin = ym5.x.a(context, 4.0f);
        addView(c22699x3dcdb352, layoutParams);
    }

    public final void a() {
        this.f179686e.animate().rotation(0.0f).setDuration(300L).start();
    }

    /* renamed from: setArrowVisibility */
    public final void m54824x69566739(int i17) {
        this.f179686e.setVisibility(i17);
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
    }
}
