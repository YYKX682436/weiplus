package com.p314xaae8f345.p2845xc516c4b6.sns;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformMediaType;", "", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "VIDEO", "PHOTO", "LIVE_PHOTO", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.sns.PlatformMediaType */
/* loaded from: classes11.dex */
public final class EnumC24816x69a0a9eb {

    /* renamed from: $ENTRIES */
    private static final /* synthetic */ rz5.a f44420x67985fcc;

    /* renamed from: $VALUES */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[] f44421x6d8e646;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb.Companion INSTANCE;
    private final int raw;

    /* renamed from: VIDEO */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb f44425x4de1c5b = new com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb("VIDEO", 0, 0);

    /* renamed from: PHOTO */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb f44424x4894612 = new com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb("PHOTO", 1, 1);

    /* renamed from: LIVE_PHOTO */
    public static final com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb f44423x9ba9f0ff = new com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb("LIVE_PHOTO", 2, 2);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/sns/PlatformMediaType$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/sns/PlatformMediaType;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.sns.PlatformMediaType$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: ofRaw */
        public final com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb m91948x64bced1(int raw) {
            for (com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb enumC24816x69a0a9eb : com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb.m91946xcee59d22()) {
                if (enumC24816x69a0a9eb.getRaw() == raw) {
                    return enumC24816x69a0a9eb;
                }
            }
            return null;
        }
    }

    /* renamed from: $values */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[] m91942x3f45f246() {
        return new com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[]{f44425x4de1c5b, f44424x4894612, f44423x9ba9f0ff};
    }

    static {
        com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[] m91942x3f45f246 = m91942x3f45f246();
        f44421x6d8e646 = m91942x3f45f246;
        f44420x67985fcc = rz5.b.a(m91942x3f45f246);
        INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb.Companion(null);
    }

    private EnumC24816x69a0a9eb(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    /* renamed from: getEntries */
    public static rz5.a m91944xdeefc05a() {
        return f44420x67985fcc;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb m91945xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb) java.lang.Enum.valueOf(com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[] m91946xcee59d22() {
        return (com.p314xaae8f345.p2845xc516c4b6.sns.EnumC24816x69a0a9eb[]) f44421x6d8e646.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
