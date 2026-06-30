package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ConvergenceUtils */
/* loaded from: classes14.dex */
public class C0696xe583b5e0 {

    /* renamed from: AE_CONVERGED_STATE_SET */
    private static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState> f1630x81da4fbf;

    /* renamed from: AE_TORCH_AS_FLASH_CONVERGED_STATE_SET */
    private static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState> f1631x51fd331c;

    /* renamed from: AF_CONVERGED_STATE_SET */
    private static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState> f1632x8e734540 = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.PASSIVE_FOCUSED, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.PASSIVE_NOT_FOCUSED, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.LOCKED_FOCUSED, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfState.LOCKED_NOT_FOCUSED));

    /* renamed from: AWB_CONVERGED_STATE_SET */
    private static final java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState> f1633xc2256267 = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.CONVERGED, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbState.UNKNOWN));
    private static final java.lang.String TAG = "ConvergenceUtils";

    static {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState aeState = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.CONVERGED;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState aeState2 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.FLASH_REQUIRED;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState aeState3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState.UNKNOWN;
        java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeState> unmodifiableSet = java.util.Collections.unmodifiableSet(java.util.EnumSet.of(aeState, aeState2, aeState3));
        f1630x81da4fbf = unmodifiableSet;
        java.util.EnumSet copyOf = java.util.EnumSet.copyOf((java.util.Collection) unmodifiableSet);
        copyOf.remove(aeState2);
        copyOf.remove(aeState3);
        f1631x51fd331c = java.util.Collections.unmodifiableSet(copyOf);
    }

    private C0696xe583b5e0() {
    }

    /* renamed from: is3AConverged */
    public static boolean m5395x5b59c28d(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0663xe081a7be interfaceC0663xe081a7be, boolean z17) {
        boolean z18 = interfaceC0663xe081a7be.mo2929x105f425e() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.OFF || interfaceC0663xe081a7be.mo2929x105f425e() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AfMode.UNKNOWN || f1632x8e734540.contains(interfaceC0663xe081a7be.mo2930xfbdfd336());
        boolean z19 = interfaceC0663xe081a7be.mo2927x10512add() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AeMode.OFF;
        boolean z27 = !z17 ? !(z19 || f1630x81da4fbf.contains(interfaceC0663xe081a7be.mo2928xfa2afa97())) : !(z19 || f1631x51fd331c.contains(interfaceC0663xe081a7be.mo2928xfa2afa97()));
        boolean z28 = (interfaceC0663xe081a7be.mo2931x19a40e79() == p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0662xbfd96ab0.AwbMode.OFF) || f1633xc2256267.contains(interfaceC0663xe081a7be.mo2932x1b348a7b());
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0544x87fce1b0.d(TAG, "checkCaptureResult, AE=" + interfaceC0663xe081a7be.mo2928xfa2afa97() + " AF =" + interfaceC0663xe081a7be.mo2930xfbdfd336() + " AWB=" + interfaceC0663xe081a7be.mo2932x1b348a7b());
        return z18 && z27 && z28;
    }
}
