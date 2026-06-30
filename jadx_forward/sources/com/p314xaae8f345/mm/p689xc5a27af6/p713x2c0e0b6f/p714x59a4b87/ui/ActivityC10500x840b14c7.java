package com.p314xaae8f345.mm.p689xc5a27af6.p713x2c0e0b6f.p714x59a4b87.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/feature/chatbot/brand/ui/ChatBotBrandActivity;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "feature-chatbot_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.feature.chatbot.brand.ui.ChatBotBrandActivity */
/* loaded from: classes14.dex */
public final class ActivityC10500x840b14c7 extends com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101 {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("room_info");
        android.util.AttributeSet attributeSet = null;
        java.lang.Object[] objArr = 0;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0 mo11468x92b714fd = byteArrayExtra != null ? new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0().mo11468x92b714fd(byteArrayExtra) : null;
        if (mo11468x92b714fd == null) {
            mo11468x92b714fd = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.d0();
        }
        byte[] byteArrayExtra2 = getIntent().getByteArrayExtra("reportAiChatExtInfo");
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1 mo11468x92b714fd2 = byteArrayExtra2 != null ? new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1().mo11468x92b714fd(byteArrayExtra2) : null;
        if (mo11468x92b714fd2 == null) {
            mo11468x92b714fd2 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w1();
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0 a17 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.n0.a(getIntent().getIntExtra("room_screen", 0));
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w a18 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w.a(getIntent().getIntExtra("open_screen", 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(a17);
        jy.m mVar = new jy.m(mo11468x92b714fd, a18, a17, mo11468x92b714fd2);
        xx.y yVar = new xx.y();
        yVar.k(this, mVar.f384003a, mVar.f384006d, xx.g.f539323e);
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(this, attributeSet, 2, objArr == true ? 1 : 0);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(1624036668, true, new yx.l(mVar, yVar)));
        return c11098x3efa6197;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo64405x4dab7448(0);
        getWindow().getDecorView().setSystemUiVisibility(1024);
        mo78578x8b18f126(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        mo78530x8b45058f();
        mo78529xe76c1b79();
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        new n3.m3(getWindow(), getWindow().getDecorView()).c(!com.p314xaae8f345.mm.ui.bk.C());
    }
}
