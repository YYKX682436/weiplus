package com.tencent.mm.feature.chatbot.brand.ui;

@db5.a(32)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/ChatBotBrandActivity;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class ChatBotBrandActivity extends com.tencent.mm.ui.MMComposeActivity {
    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("room_info");
        android.util.AttributeSet attributeSet = null;
        java.lang.Object[] objArr = 0;
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
        com.tencent.wechat.aff.chatbot.w a18 = com.tencent.wechat.aff.chatbot.w.a(getIntent().getIntExtra("open_screen", 0));
        kotlin.jvm.internal.o.d(a18);
        kotlin.jvm.internal.o.d(a17);
        jy.m mVar = new jy.m(parseFrom, a18, a17, parseFrom2);
        xx.y yVar = new xx.y();
        yVar.k(this, mVar.f302470a, mVar.f302473d, xx.g.f457790e);
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, attributeSet, 2, objArr == true ? 1 : 0);
        mMComposeView.setContent(u0.j.c(1624036668, true, new yx.l(mVar, yVar)));
        return mMComposeView;
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        setActionbarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.f478491c));
        hideActionbarLine();
        hideActionBarOperationArea();
        androidx.appcompat.app.b supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.o();
        }
        new n3.m3(getWindow(), getWindow().getDecorView()).c(!com.tencent.mm.ui.bk.C());
    }
}
