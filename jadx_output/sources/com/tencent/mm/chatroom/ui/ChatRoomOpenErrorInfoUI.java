package com.tencent.mm.chatroom.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/chatroom/ui/ChatRoomOpenErrorInfoUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-chatroom_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public final class ChatRoomOpenErrorInfoUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f63686d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f63687e;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488413sm;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setMMTitle("");
        setBackBtn(new com.tencent.mm.chatroom.ui.e(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.omk);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f63686d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.omj);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f63687e = (android.widget.TextView) findViewById2;
        findViewById(com.tencent.mm.R.id.b0z).setOnClickListener(new com.tencent.mm.chatroom.ui.f(this));
        java.lang.String stringExtra = getIntent().getStringExtra("key_error_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("key_error_content");
        java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
        android.widget.TextView textView = this.f63686d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTextView");
            throw null;
        }
        textView.setText(stringExtra);
        android.widget.TextView textView2 = this.f63687e;
        if (textView2 != null) {
            textView2.setText(str);
        } else {
            kotlin.jvm.internal.o.o("contentTextView");
            throw null;
        }
    }
}
