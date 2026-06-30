package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.QuirkSettings */
/* loaded from: classes13.dex */
public class C0741x281ed9e1 {

    /* renamed from: mEnabledWhenDeviceHasQuirk */
    private final boolean f1715x3fba68c8;

    /* renamed from: mForceDisabledQuirks */
    private final java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> f1716xac17982f;

    /* renamed from: mForceEnabledQuirks */
    private final java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> f1717xe4506938;

    /* renamed from: androidx.camera.core.impl.QuirkSettings$Builder */
    /* loaded from: classes13.dex */
    public static class Builder {

        /* renamed from: mEnabledWhenDeviceHasQuirk */
        private boolean f1718x3fba68c8 = true;

        /* renamed from: mForceDisabledQuirks */
        private java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> f1719xac17982f;

        /* renamed from: mForceEnabledQuirks */
        private java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> f1720xe4506938;

        /* renamed from: build */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5553x59bc66e() {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1(this.f1718x3fba68c8, this.f1720xe4506938, this.f1719xac17982f);
        }

        /* renamed from: forceDisableQuirks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder m5554x95330c52(java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set) {
            this.f1719xac17982f = new java.util.HashSet(set);
            return this;
        }

        /* renamed from: forceEnableQuirks */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder m5555x9f54a63(java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set) {
            this.f1720xe4506938 = new java.util.HashSet(set);
            return this;
        }

        /* renamed from: setEnabledWhenDeviceHasQuirk */
        public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder m5556x178d9a73(boolean z17) {
            this.f1718x3fba68c8 = z17;
            return this;
        }
    }

    /* renamed from: withAllQuirksDisabled */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5542x2e62f5ec() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder().m5556x178d9a73(false).m5553x59bc66e();
    }

    /* renamed from: withDefaultBehavior */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5543xfffdbe0d() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder().m5556x178d9a73(true).m5553x59bc66e();
    }

    /* renamed from: withQuirksForceDisabled */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5544xd79c796c(java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder().m5554x95330c52(set).m5553x59bc66e();
    }

    /* renamed from: withQuirksForceEnabled */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 m5545x225dae51(java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1.Builder().m5555x9f54a63(set).m5553x59bc66e();
    }

    /* renamed from: equals */
    public boolean m5546xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1 c0741x281ed9e1 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0741x281ed9e1) obj;
        return this.f1715x3fba68c8 == c0741x281ed9e1.f1715x3fba68c8 && java.util.Objects.equals(this.f1717xe4506938, c0741x281ed9e1.f1717xe4506938) && java.util.Objects.equals(this.f1716xac17982f, c0741x281ed9e1.f1716xac17982f);
    }

    /* renamed from: getForceDisabledQuirks */
    public java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> m5547x19ab66a6() {
        return java.util.Collections.unmodifiableSet(this.f1716xac17982f);
    }

    /* renamed from: getForceEnabledQuirks */
    public java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> m5548xf85d6fe1() {
        return java.util.Collections.unmodifiableSet(this.f1717xe4506938);
    }

    /* renamed from: hashCode */
    public int m5549x8cdac1b() {
        return java.util.Objects.hash(java.lang.Boolean.valueOf(this.f1715x3fba68c8), this.f1717xe4506938, this.f1716xac17982f);
    }

    /* renamed from: isEnabledWhenDeviceHasQuirk */
    public boolean m5550xcd123aab() {
        return this.f1715x3fba68c8;
    }

    /* renamed from: shouldEnableQuirk */
    public boolean m5551xbe372048(java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e> cls, boolean z17) {
        if (this.f1717xe4506938.contains(cls)) {
            return true;
        }
        if (this.f1716xac17982f.contains(cls)) {
            return false;
        }
        return this.f1715x3fba68c8 && z17;
    }

    /* renamed from: toString */
    public java.lang.String m5552x9616526c() {
        return "QuirkSettings{enabledWhenDeviceHasQuirk=" + this.f1715x3fba68c8 + ", forceEnabledQuirks=" + this.f1717xe4506938 + ", forceDisabledQuirks=" + this.f1716xac17982f + '}';
    }

    private C0741x281ed9e1(boolean z17, java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set, java.util.Set<java.lang.Class<? extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0740x4ac379e>> set2) {
        this.f1715x3fba68c8 = z17;
        this.f1717xe4506938 = set == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set);
        this.f1716xac17982f = set2 == null ? java.util.Collections.emptySet() : new java.util.HashSet<>(set2);
    }
}
