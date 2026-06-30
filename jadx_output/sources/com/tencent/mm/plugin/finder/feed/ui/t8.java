package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class t8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI f110558d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t8(com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI) {
        super(0);
        this.f110558d = finderLiveCreateVisitorModeUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        android.text.Editable text;
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveCreateVisitorModeUI finderLiveCreateVisitorModeUI = this.f110558d;
        com.tencent.mm.ui.widget.MMEditText mMEditText = finderLiveCreateVisitorModeUI.A;
        if (mMEditText == null || (text = mMEditText.getText()) == null || (str = text.toString()) == null) {
            str = "";
        }
        java.lang.String b17 = hc2.l.b(str);
        finderLiveCreateVisitorModeUI.L = b17;
        boolean z17 = !(b17.length() == 0);
        finderLiveCreateVisitorModeUI.e7(z17);
        if (z17) {
            android.widget.ImageView imageView = finderLiveCreateVisitorModeUI.B;
            if (imageView != null) {
                imageView.setVisibility(0);
            }
        } else {
            android.widget.ImageView imageView2 = finderLiveCreateVisitorModeUI.B;
            if (imageView2 != null) {
                imageView2.setVisibility(4);
            }
        }
        return jz5.f0.f302826a;
    }
}
