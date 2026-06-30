package ca4;

/* loaded from: classes4.dex */
public final class b1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39843d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(java.lang.String str) {
        super(2);
        this.f39843d = str;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        android.content.Context context = (android.content.Context) obj;
        java.lang.String username = (java.lang.String) obj2;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(username, "username");
        dx1.f fVar = dx1.g.f244489a;
        bx1.u uVar = bx1.u.f36310e;
        java.lang.String sessionId = this.f39843d;
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        kotlin.jvm.internal.o.g(1, "value");
        fVar.p("MomentsTogetherTailActionFeed", sessionId, "ClickCount", 1, uVar, "#");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", username);
        intent.putExtra("Contact_Scene", 0);
        intent.putExtra("CONTACT_INFO_UI_SOURCE", 61);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f24068d.l(intent, context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startProfile", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        jz5.f0 f0Var = jz5.f0.f302826a;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("invoke", "com.tencent.mm.plugin.sns.data.SnsUtilExt$Companion$getWithTaText$clickCb$1");
        return f0Var;
    }
}
