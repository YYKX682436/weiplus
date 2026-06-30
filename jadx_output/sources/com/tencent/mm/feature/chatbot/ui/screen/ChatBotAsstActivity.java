package com.tencent.mm.feature.chatbot.ui.screen;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/chatbot/ui/screen/ChatBotAsstActivity;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public class ChatBotAsstActivity extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, null, 2, null);
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("room_info");
        com.tencent.wechat.aff.chatbot.d0 parseFrom = byteArrayExtra != null ? new com.tencent.wechat.aff.chatbot.d0().parseFrom(byteArrayExtra) : null;
        if (parseFrom == null) {
            parseFrom = new com.tencent.wechat.aff.chatbot.d0();
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("reportAiChatExtInfo");
        com.tencent.wechat.aff.chatbot.w1 parseFrom2 = byteArrayExtra2 != null ? new com.tencent.wechat.aff.chatbot.w1().parseFrom(byteArrayExtra2) : null;
        if (parseFrom2 == null) {
            parseFrom2 = new com.tencent.wechat.aff.chatbot.w1();
        }
        com.tencent.wechat.aff.chatbot.n0 a17 = com.tencent.wechat.aff.chatbot.n0.a(getIntent().getIntExtra("room_screen", 0));
        getIntent().getIntExtra("room_screen", 0);
        com.tencent.wechat.aff.chatbot.w a18 = com.tencent.wechat.aff.chatbot.w.a(getIntent().getIntExtra("open_screen", 0));
        kotlin.jvm.internal.o.d(a18);
        kotlin.jvm.internal.o.d(a17);
        mMComposeView.setContent(u0.j.c(-2122588945, true, new iy.a(new jy.m(parseFrom, a18, a17, parseFrom2))));
        return mMComposeView;
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        vj5.o.e(getWindow());
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.a9e));
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
    }
}
