package ai0;

/* loaded from: classes14.dex */
public final class g extends ai0.m {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f5059c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5060d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f5061e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f5062f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, java.util.List agreements, java.lang.String chatbotUsername, int i17, java.lang.String enterSessionId) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(agreements, "agreements");
        kotlin.jvm.internal.o.g(chatbotUsername, "chatbotUsername");
        kotlin.jvm.internal.o.g(enterSessionId, "enterSessionId");
        this.f5059c = chatbotUsername;
        this.f5060d = i17;
        this.f5061e = enterSessionId;
        int d17 = kz5.b1.d(kz5.d0.q(agreements, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : agreements) {
            linkedHashMap.put(java.lang.Integer.valueOf(((com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo) obj).f67859d), obj);
        }
        this.f5062f = linkedHashMap;
    }
}
