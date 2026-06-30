package com.p314xaae8f345.p2845xc516c4b6.biz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/biz/BizShareInfoType;", "", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "TYPE_ARTICLE", "TYPE_IMAGE", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.biz.BizShareInfoType */
/* loaded from: classes9.dex */
public final class EnumC23233xdbc3d3d4 {

    /* renamed from: $ENTRIES */
    private static final /* synthetic */ rz5.a f40851x67985fcc;

    /* renamed from: $VALUES */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[] f40852x6d8e646;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.Companion INSTANCE;

    /* renamed from: TYPE_ARTICLE */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4 f40854x22e5acd1 = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4("TYPE_ARTICLE", 0, 0);

    /* renamed from: TYPE_IMAGE */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4 f40855x1294c7f6 = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4("TYPE_IMAGE", 1, 1);
    private final int raw;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizShareInfoType$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/biz/BizShareInfoType;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.biz.BizShareInfoType$Companion, reason: from kotlin metadata */
    /* loaded from: classes9.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: ofRaw */
        public final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4 m85548x64bced1(int raw) {
            for (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4 enumC23233xdbc3d3d4 : com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.m85546xcee59d22()) {
                if (enumC23233xdbc3d3d4.getRaw() == raw) {
                    return enumC23233xdbc3d3d4;
                }
            }
            return null;
        }
    }

    /* renamed from: $values */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[] m85542x3f45f246() {
        return new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[]{f40854x22e5acd1, f40855x1294c7f6};
    }

    static {
        com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[] m85542x3f45f246 = m85542x3f45f246();
        f40852x6d8e646 = m85542x3f45f246;
        f40851x67985fcc = rz5.b.a(m85542x3f45f246);
        INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.Companion(null);
    }

    private EnumC23233xdbc3d3d4(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    /* renamed from: getEntries */
    public static rz5.a m85544xdeefc05a() {
        return f40851x67985fcc;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4 m85545xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4) java.lang.Enum.valueOf(com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[] m85546xcee59d22() {
        return (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23233xdbc3d3d4[]) f40852x6d8e646.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
