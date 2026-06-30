package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.OptionsBundle */
/* loaded from: classes14.dex */
public class C0735xc905e4a0 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 {

    /* renamed from: EMPTY_BUNDLE */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 f1711xd3dd7d4;

    /* renamed from: ID_COMPARE */
    protected static final java.util.Comparator<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> f1712xfb212da1;

    /* renamed from: mOptions */
    protected final java.util.TreeMap<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object>> f1713x539f3971;

    static {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0736x44c8e341 c0736x44c8e341 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0736x44c8e341();
        f1712xfb212da1 = c0736x44c8e341;
        f1711xd3dd7d4 = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0(new java.util.TreeMap(c0736x44c8e341));
    }

    public C0735xc905e4a0(java.util.TreeMap<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object>> treeMap) {
        this.f1713x539f3971 = treeMap;
    }

    /* renamed from: emptyBundle */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 m5537x298eb42f() {
        return f1711xd3dd7d4;
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 m5538x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        if (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.class.equals(interfaceC0692x78a46f62.getClass())) {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0) interfaceC0692x78a46f62;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(f1712xfb212da1);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : interfaceC0692x78a46f62.mo5378xc8202020()) {
            java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority> mo5377x28912938 = interfaceC0692x78a46f62.mo5377x28912938(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority : mo5377x28912938) {
                arrayMap.put(optionPriority, interfaceC0692x78a46f62.mo5381xd2c22fb(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$static$0 */
    public static /* synthetic */ int m5539xdec287b7(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option option2) {
        return option.mo5110x5db1b11().compareTo(option2.mo5110x5db1b11());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: containsOption */
    public boolean mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        return this.f1713x539f3971.containsKey(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: findOptions */
    public void mo5375xe75af6a5(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher optionMatcher) {
        for (java.util.Map.Entry<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object>> entry : this.f1713x539f3971.tailMap(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc(str, java.lang.Void.class)).entrySet()) {
            if (!entry.getKey().mo5110x5db1b11().startsWith(str) || !optionMatcher.mo4164x271bff50(entry.getKey())) {
                return;
            }
        }
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: getOptionPriority */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority mo5376x2503ee2f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object> map = this.f1713x539f3971.get(option);
        if (map != null) {
            return (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority) java.util.Collections.min(map.keySet());
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: getPriorities */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority> mo5377x28912938(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object> map = this.f1713x539f3971.get(option);
        return map == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(map.keySet());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: listOptions */
    public java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> mo5378xc8202020() {
        return java.util.Collections.unmodifiableSet(this.f1713x539f3971.keySet());
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOption */
    public <ValueT> ValueT mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object> map = this.f1713x539f3971.get(option);
        if (map != null) {
            return (ValueT) map.get((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority) java.util.Collections.min(map.keySet()));
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOptionWithPriority */
    public <ValueT> ValueT mo5381xd2c22fb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object> map = this.f1713x539f3971.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOption */
    public <ValueT> ValueT mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, ValueT valuet) {
        try {
            return (ValueT) mo5379x77ba97d1(option);
        } catch (java.lang.IllegalArgumentException unused) {
            return valuet;
        }
    }
}
