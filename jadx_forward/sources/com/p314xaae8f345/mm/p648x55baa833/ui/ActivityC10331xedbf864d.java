package com.p314xaae8f345.mm.p648x55baa833.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomOpenErrorInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.chatroom.ui.ChatRoomOpenErrorInfoUI */
/* loaded from: classes.dex */
public final class ActivityC10331xedbf864d extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f145219d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f145220e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569946sm;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        mo64405x4dab7448(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        mo54450xbf7c1df6("");
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p648x55baa833.ui.e(this));
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.omk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f145219d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.omj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f145220e = (android.widget.TextView) findViewById2;
        findViewById(com.p314xaae8f345.mm.R.id.b0z).setOnClickListener(new com.p314xaae8f345.mm.p648x55baa833.ui.f(this));
        java.lang.String stringExtra = getIntent().getStringExtra("key_error_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_error_content");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        android.widget.TextView textView = this.f145219d;
        if (textView == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("titleTextView");
            throw null;
        }
        textView.setText(stringExtra);
        android.widget.TextView textView2 = this.f145220e;
        if (textView2 != null) {
            textView2.setText(str);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("contentTextView");
            throw null;
        }
    }
}
