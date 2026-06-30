package com.p314xaae8f345.p3118xeeebfacc;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0007"}, d2 = {"Lcom/tencent/unit_rc/Executor;", "", "Ljava/lang/Runnable;", "runnable", "Ljz5/f0;", "execute", "Companion", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
/* renamed from: com.tencent.unit_rc.Executor */
/* loaded from: classes13.dex */
public interface InterfaceC26835x7da05cf3 {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.Companion INSTANCE = com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.Companion.f57660x83b00915;

    @p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0003\u001a\u00020\u0002H\u0007R.\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/tencent/unit_rc/Executor$Companion;", "", "Lcom/tencent/unit_rc/Executor;", "get", "value", "executor", "Lcom/tencent/unit_rc/Executor;", "getExecutor", "()Lcom/tencent/unit_rc/Executor;", "setExecutor", "(Lcom/tencent/unit_rc/Executor;)V", "Lcom/tencent/unit_rc/DefaultExecutor;", "defaultExecutor$delegate", "Ljz5/g;", "getDefaultExecutor", "()Lcom/tencent/unit_rc/DefaultExecutor;", "defaultExecutor", "<init>", "()V", "unit_rc_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: com.tencent.unit_rc.Executor$Companion, reason: from kotlin metadata */
    /* loaded from: classes13.dex */
    public static final class Companion {

        /* renamed from: $$INSTANCE */
        static final /* synthetic */ com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.Companion f57660x83b00915 = new com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3.Companion();

        /* renamed from: defaultExecutor$delegate, reason: from kotlin metadata */
        private static final jz5.g defaultExecutor = jz5.h.b(com.p314xaae8f345.p3118xeeebfacc.C26836xa95d61d9.f57663x4fbc8495);
        private static com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 executor;

        private Companion() {
        }

        /* renamed from: getDefaultExecutor */
        private final com.p314xaae8f345.p3118xeeebfacc.C26833xb5711a14 m106006xd54033fe() {
            return (com.p314xaae8f345.p3118xeeebfacc.C26833xb5711a14) defaultExecutor.mo141623x754a37bb();
        }

        public final com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 get() {
            com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 interfaceC26835x7da05cf3 = executor;
            return interfaceC26835x7da05cf3 == null ? m106006xd54033fe() : interfaceC26835x7da05cf3;
        }

        /* renamed from: getExecutor */
        public final com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 m106007xf5a03649() {
            return executor;
        }

        /* renamed from: setExecutor */
        public final void m106008xf0589755(com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 interfaceC26835x7da05cf3) {
            com.p314xaae8f345.p3118xeeebfacc.C26844x5a7dc02f.m106048x3164ae("Executor, set " + interfaceC26835x7da05cf3);
            executor = interfaceC26835x7da05cf3;
        }
    }

    static com.p314xaae8f345.p3118xeeebfacc.InterfaceC26835x7da05cf3 get() {
        return INSTANCE.get();
    }

    /* renamed from: execute */
    void mo106002xb158f775(java.lang.Runnable runnable);
}
