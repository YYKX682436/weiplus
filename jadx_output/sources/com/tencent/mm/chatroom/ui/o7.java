package com.tencent.mm.chatroom.ui;

/* loaded from: classes.dex */
public final class o7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f64409d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(android.view.View view) {
        super(0);
        this.f64409d = view;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.widget.TextView textView = (android.widget.TextView) this.f64409d.findViewById(com.tencent.mm.R.id.f482783nv);
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        return textView;
    }
}
