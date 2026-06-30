package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.MutableOptionsBundle */
/* loaded from: classes14.dex */
public final class C0731x74f1ef5a extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8 {

    /* renamed from: DEFAULT_PRIORITY */
    private static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority f1710x4d5a0e02 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority.OPTIONAL;

    private C0731x74f1ef5a(java.util.TreeMap<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>, java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object>> treeMap) {
        super(treeMap);
    }

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5524xaf65a0fc() {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a(new java.util.TreeMap(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.f1712xfb212da1));
    }

    /* renamed from: from */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a m5525x3017aa(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        java.util.TreeMap treeMap = new java.util.TreeMap(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0735xc905e4a0.f1712xfb212da1);
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option : interfaceC0692x78a46f62.mo5378xc8202020()) {
            java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority> mo5377x28912938 = interfaceC0692x78a46f62.mo5377x28912938(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority : mo5377x28912938) {
                arrayMap.put(optionPriority, interfaceC0692x78a46f62.mo5381xd2c22fb(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0731x74f1ef5a(treeMap);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8
    /* renamed from: insertOption */
    public <ValueT> void mo5521x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, ValueT valuet) {
        mo5520x25e7888e(option, f1710x4d5a0e02, valuet);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8
    /* renamed from: removeOption */
    public <ValueT> ValueT mo5522xc616fa19(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option) {
        return (ValueT) this.f1713x539f3971.remove(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0730x35b9a1e8
    /* renamed from: insertOption */
    public <ValueT> void mo5520x25e7888e(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority, ValueT valuet) {
        java.util.Map<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority, java.lang.Object> map = this.f1713x539f3971.get(option);
        if (map == null) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            this.f1713x539f3971.put(option, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority2 = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority) java.util.Collections.min(map.keySet());
        if (!java.util.Objects.equals(map.get(optionPriority2), valuet) && p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.m5371x88c1e88c(optionPriority2, optionPriority)) {
            throw new java.lang.IllegalArgumentException("Option values conflicts: " + option.mo5110x5db1b11() + ", existing value (" + optionPriority2 + ")=" + map.get(optionPriority2) + ", conflicting (" + optionPriority + ")=" + valuet);
        }
        map.put(optionPriority, valuet);
    }
}
