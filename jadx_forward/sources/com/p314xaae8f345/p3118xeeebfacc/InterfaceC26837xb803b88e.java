package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/LibraryLoader;", "", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Ljz5/f0;", "loadLibrary", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.LibraryLoader */
/* loaded from: classes13.dex */
public interface InterfaceC26837xb803b88e {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.Companion INSTANCE = com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.Companion.f57665x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001b\u0010\u000b\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR*\u0010\r\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/tencent/unit_rc/LibraryLoader$Companion;", "", "", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d, "Ljz5/f0;", "load", "Lcom/tencent/unit_rc/DefaultLibraryLoader;", "defaultLoader$delegate", "Ljz5/g;", "getDefaultLoader", "()Lcom/tencent/unit_rc/DefaultLibraryLoader;", "defaultLoader", "Lcom/tencent/unit_rc/LibraryLoader;", com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.C25497x5d2ac867.f46636x3b6977b0, "Lcom/tencent/unit_rc/LibraryLoader;", "getLoader", "()Lcom/tencent/unit_rc/LibraryLoader;", "setLoader", "(Lcom/tencent/unit_rc/LibraryLoader;)V", "getLoader$annotations", "()V", "<init>", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.tencent.unit_rc.LibraryLoader$Companion, reason: from kotlin metadata */
    /* loaded from: classes13.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.Companion f57665x83b00915 = new com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e.Companion();

        /* renamed from: defaultLoader$delegate, reason: from kotlin metadata */
        private static final jz5.g defaultLoader = jz5.h.b(com.p314xaae8f345.p3118xeeebfacc.C26838xb50a76f4.f57668x4fbc8495);
        private static com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e loader;

        private Companion() {
        }

        /* renamed from: getDefaultLoader */
        private final com.p314xaae8f345.p3118xeeebfacc.C26834x9e71080d m106015xeb2a39fe() {
            return (com.p314xaae8f345.p3118xeeebfacc.C26834x9e71080d) defaultLoader.mo141623x754a37bb();
        }

        /* renamed from: getLoader$annotations */
        public static /* synthetic */ void m106016xbb0bca09() {
        }

        /* renamed from: getLoader */
        public final com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e m106017x23ac5309() {
            return loader;
        }

        /* renamed from: load */
        public final void m106018x32c4e6(java.lang.String name) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
            com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e interfaceC26837xb803b88e = loader;
            if (interfaceC26837xb803b88e == null) {
                interfaceC26837xb803b88e = m106015xeb2a39fe();
            }
            interfaceC26837xb803b88e.mo106003xeb57c8f5(name);
        }

        /* renamed from: setLoader */
        public final void m106019x16e18715(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e interfaceC26837xb803b88e) {
            loader = interfaceC26837xb803b88e;
        }
    }

    /* renamed from: getLoader */
    static com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e m106011x23ac5309() {
        return INSTANCE.m106017x23ac5309();
    }

    /* renamed from: load */
    static void m106012x32c4e6(java.lang.String str) {
        INSTANCE.m106018x32c4e6(str);
    }

    /* renamed from: setLoader */
    static void m106013x16e18715(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26837xb803b88e interfaceC26837xb803b88e) {
        INSTANCE.m106019x16e18715(interfaceC26837xb803b88e);
    }

    /* renamed from: loadLibrary */
    void mo106003xeb57c8f5(java.lang.String str);
}
