package com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2955x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/tencent/tav/core/parallel/util/ParallelSPStorage;", "", "Ljz5/f0;", "makeDebugError", "", "DEBUG_COUNT", "I", "DEBUG_ERROR_FREQUENCY", "<init>", "()V", "tav-foundation_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.tav.core.parallel.util.ParallelSPStorage */
/* loaded from: classes.dex */
public final class C25728x6cfec717 {
    private static int DEBUG_COUNT;

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2955x36f002.C25728x6cfec717 f47822x4fbc8495 = new com.p314xaae8f345.tav.p2947x2eaf9f.p2951x45d22e07.p2955x36f002.C25728x6cfec717();
    private static int DEBUG_ERROR_FREQUENCY = 4;

    private C25728x6cfec717() {
    }

    /* renamed from: makeDebugError */
    public final void m97151x88421803() {
        int i17 = DEBUG_COUNT + 1;
        DEBUG_COUNT = i17;
        if (i17 % DEBUG_ERROR_FREQUENCY == 0) {
            throw new java.lang.Exception("debug error");
        }
    }
}
