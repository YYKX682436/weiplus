package com.p314xaae8f345.p2845xc516c4b6.biz;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/tencent/pigeon/biz/BizAccountSelectCallbackType;", "", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "(Ljava/lang/String;II)V", "getRaw", "()I", "CANCEL", "USER_SELECTED", "Companion", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.tencent.pigeon.biz.BizAccountSelectCallbackType */
/* loaded from: classes11.dex */
public final class EnumC23055x1e5f1f95 {

    /* renamed from: $ENTRIES */
    private static final /* synthetic */ rz5.a f40406x67985fcc;

    /* renamed from: $VALUES */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[] f40407x6d8e646;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95.Companion INSTANCE;
    private final int raw;

    /* renamed from: CANCEL */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95 f40408x760d227a = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95("CANCEL", 0, 0);

    /* renamed from: USER_SELECTED */
    public static final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95 f40410x8c55448f = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95("USER_SELECTED", 1, 1);

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/tencent/pigeon/biz/BizAccountSelectCallbackType$Companion;", "", "()V", "ofRaw", "Lcom/tencent/pigeon/biz/BizAccountSelectCallbackType;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3084xa1c33861.C26631x178a9850.f55633x65da3463, "", "mm_auto_gen_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.tencent.pigeon.biz.BizAccountSelectCallbackType$Companion, reason: from kotlin metadata */
    /* loaded from: classes11.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
            this();
        }

        /* renamed from: ofRaw */
        public final com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95 m84694x64bced1(int raw) {
            for (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95 enumC23055x1e5f1f95 : com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95.m84692xcee59d22()) {
                if (enumC23055x1e5f1f95.getRaw() == raw) {
                    return enumC23055x1e5f1f95;
                }
            }
            return null;
        }
    }

    /* renamed from: $values */
    private static final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[] m84688x3f45f246() {
        return new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[]{f40408x760d227a, f40410x8c55448f};
    }

    static {
        com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[] m84688x3f45f246 = m84688x3f45f246();
        f40407x6d8e646 = m84688x3f45f246;
        f40406x67985fcc = rz5.b.a(m84688x3f45f246);
        INSTANCE = new com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95.Companion(null);
    }

    private EnumC23055x1e5f1f95(java.lang.String str, int i17, int i18) {
        this.raw = i18;
    }

    /* renamed from: getEntries */
    public static rz5.a m84690xdeefc05a() {
        return f40406x67985fcc;
    }

    /* renamed from: valueOf */
    public static com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95 m84691xdce0328(java.lang.String str) {
        return (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95) java.lang.Enum.valueOf(com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95.class, str);
    }

    /* renamed from: values */
    public static com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[] m84692xcee59d22() {
        return (com.p314xaae8f345.p2845xc516c4b6.biz.EnumC23055x1e5f1f95[]) f40407x6d8e646.clone();
    }

    public final int getRaw() {
        return this.raw;
    }
}
