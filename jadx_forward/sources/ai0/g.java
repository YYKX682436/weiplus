package ai0;

/* loaded from: classes14.dex */
public final class g extends ai0.m {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f86592c;

    /* renamed from: d, reason: collision with root package name */
    public final int f86593d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f86594e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f86595f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, java.util.List agreements, java.lang.String chatbotUsername, int i17, java.lang.String enterSessionId) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(agreements, "agreements");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatbotUsername, "chatbotUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterSessionId, "enterSessionId");
        this.f86592c = chatbotUsername;
        this.f86593d = i17;
        this.f86594e = enterSessionId;
        int d17 = kz5.b1.d(kz5.d0.q(agreements, 10));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(d17 < 16 ? 16 : d17);
        for (java.lang.Object obj : agreements) {
            linkedHashMap.put(java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040) obj).f149392d), obj);
        }
        this.f86595f = linkedHashMap;
    }
}
