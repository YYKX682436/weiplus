package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ReadableConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0745x2e0bb72 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 {
    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: containsOption */
    default boolean mo5374xdccd9774(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        return mo3494x1456a638().mo5374xdccd9774(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: findOptions */
    default void mo5375xe75af6a5(java.lang.String str, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionMatcher optionMatcher) {
        mo3494x1456a638().mo5375xe75af6a5(str, optionMatcher);
    }

    /* renamed from: getConfig */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo3494x1456a638();

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: getOptionPriority */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority mo5376x2503ee2f(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        return mo3494x1456a638().mo5376x2503ee2f(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: getPriorities */
    default java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority> mo5377x28912938(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?> option) {
        return mo3494x1456a638().mo5377x28912938(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: listOptions */
    default java.util.Set<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<?>> mo5378xc8202020() {
        return mo3494x1456a638().mo5378xc8202020();
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOption */
    default <ValueT> ValueT mo5379x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option) {
        return (ValueT) mo3494x1456a638().mo5379x77ba97d1(option);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOptionWithPriority */
    default <ValueT> ValueT mo5381xd2c22fb(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.OptionPriority optionPriority) {
        return (ValueT) mo3494x1456a638().mo5381xd2c22fb(option, optionPriority);
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62
    /* renamed from: retrieveOption */
    default <ValueT> ValueT mo5380x77ba97d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<ValueT> option, ValueT valuet) {
        return (ValueT) mo3494x1456a638().mo5380x77ba97d1(option, valuet);
    }
}
