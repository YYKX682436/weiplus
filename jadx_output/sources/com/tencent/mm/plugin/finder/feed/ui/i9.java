package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes3.dex */
public final class i9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI f110145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI) {
        super(1);
        this.f110145d = finderLiveDelManagerUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.finder.feed.ui.FinderLiveDelManagerUI finderLiveDelManagerUI = this.f110145d;
        if (booleanValue) {
            android.widget.TextView textView = finderLiveDelManagerUI.f109363f;
            if (textView != null) {
                textView.setVisibility(0);
            }
        } else {
            android.widget.TextView textView2 = finderLiveDelManagerUI.f109363f;
            if (textView2 != null) {
                textView2.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
