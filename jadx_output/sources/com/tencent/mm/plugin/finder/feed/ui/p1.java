package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes8.dex */
public final class p1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderErrorTipUI f110392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(com.tencent.mm.plugin.finder.feed.ui.FinderErrorTipUI finderErrorTipUI) {
        super(0);
        this.f110392d = finderErrorTipUI;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f110392d.findViewById(com.tencent.mm.R.id.cti);
        textView.setTextColor(-1);
        return textView;
    }
}
