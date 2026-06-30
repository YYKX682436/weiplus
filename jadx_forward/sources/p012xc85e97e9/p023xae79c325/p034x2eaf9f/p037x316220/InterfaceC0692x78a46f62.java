package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.Config */
/* loaded from: classes14.dex */
public interface InterfaceC0692x78a46f62 {

    /* renamed from: androidx.camera.core.impl.Config$Option */
    /* loaded from: classes14.dex */
    public static abstract class Option<T> {
        /* renamed from: create */
        public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<T> m5382xaf65a0fc(java.lang.String str, java.lang.Class<?> cls) {
            return m5383xaf65a0fc(str, cls, null);
        }

        /* renamed from: getId */
        public abstract java.lang.String mo5110x5db1b11();

        /* renamed from: getToken */
        public abstract java.lang.Object mo5111x75346043();

        /* renamed from: getValueClass */
        public abstract java.lang.Class<T> mo5112x667d1e7d();

        /* renamed from: create */
        public static <T> p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<T> m5383xaf65a0fc(java.lang.String str, java.lang.Class<?> cls, java.lang.Object obj) {
            return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0646x490b0775(str, cls, obj);
        }
    }

    /* renamed from: androidx.camera.core.impl.Config$OptionMatcher */
    /* loaded from: classes14.dex */
    public interface OptionMatcher {
        /* renamed from: onOptionMatched */
        boolean mo4164x271bff50(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option);
    }

    /* renamed from: androidx.camera.core.impl.Config$OptionPriority */
    /* loaded from: classes14.dex */
    public enum OptionPriority {
        ALWAYS_OVERRIDE,
        HIGH_PRIORITY_REQUIRED,
        REQUIRED,
        OPTIONAL
    }

    /* renamed from: hasConflict */
    static boolean m5371x88c1e88c(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority2) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority3 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.REQUIRED;
        return optionPriority == optionPriority3 && optionPriority2 == optionPriority3;
    }

    /* renamed from: mergeConfigs */
    static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 m5372xcdb2a19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f622) {
        if (interfaceC0692x78a46f62 == null && interfaceC0692x78a46f622 == null) {
            return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5537x298eb42f();
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5525x3017aa = interfaceC0692x78a46f622 != null ? p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5525x3017aa(interfaceC0692x78a46f622) : p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a.m5524xaf65a0fc();
        if (interfaceC0692x78a46f62 != null) {
            java.util.Iterator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> it = interfaceC0692x78a46f62.mo5378xc8202020().iterator();
            while (it.hasNext()) {
                m5373x60c2caa4(m5525x3017aa, interfaceC0692x78a46f622, interfaceC0692x78a46f62, it.next());
            }
        }
        return p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.m5538x3017aa(m5525x3017aa);
    }

    /* renamed from: mergeOptionValue */
    static void m5373x60c2caa4(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a c0731x74f1ef5a, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f622, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        if (!java.util.Objects.equals(option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.f1694xa42c6f48)) {
            c0731x74f1ef5a.mo5520x25e7888e(option, interfaceC0692x78a46f622.mo5376x2503ee2f(option), interfaceC0692x78a46f622.mo5379x77ba97d1(option));
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb c0955xda4820cb = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) interfaceC0692x78a46f622.mo5380x77ba97d1(option, null);
        c0731x74f1ef5a.mo5520x25e7888e(option, interfaceC0692x78a46f622.mo5376x2503ee2f(option), p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0796x448d276d.m5932x857d1bc((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p053x68aa008b.C0955xda4820cb) interfaceC0692x78a46f62.mo5380x77ba97d1(option, null), c0955xda4820cb));
    }

    /* renamed from: containsOption */
    boolean mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option);

    /* renamed from: findOptions */
    void mo5375xe75af6a5(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher optionMatcher);

    /* renamed from: getOptionPriority */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority mo5376x2503ee2f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option);

    /* renamed from: getPriorities */
    java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority> mo5377x28912938(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option);

    /* renamed from: listOptions */
    java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> mo5378xc8202020();

    /* renamed from: retrieveOption */
    <ValueT> ValueT mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option);

    /* renamed from: retrieveOption */
    <ValueT> ValueT mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, ValueT valuet);

    /* renamed from: retrieveOptionWithPriority */
    <ValueT> ValueT mo5381xd2c22fb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority);
}
