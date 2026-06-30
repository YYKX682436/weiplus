package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class y5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64683d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5(android.view.View view) {
        super(0);
        this.f64683d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.Button button = (android.widget.Button) this.f64683d.findViewById(com.tencent.mm.R.id.f482775nn);
        com.tencent.mm.ui.bk.s0(button.getPaint());
        return button;
    }
}
