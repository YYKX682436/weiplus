package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class q6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f281287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f281288e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6(android.app.Activity activity, java.lang.String str) {
        super(0);
        this.f281287d = activity;
        this.f281288e = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.app.Activity activity = this.f281287d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
        u1Var.n("不再显示");
        android.widget.TextView textView = new android.widget.TextView(activity);
        textView.setText(this.f281288e);
        textView.setTextIsSelectable(true);
        textView.setGravity(8388611);
        u1Var.d(textView);
        u1Var.a(true);
        u1Var.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.p6.f281209a);
        u1Var.q(false);
        return jz5.f0.f384359a;
    }
}
