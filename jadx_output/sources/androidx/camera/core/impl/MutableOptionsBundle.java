package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public final class MutableOptionsBundle extends androidx.camera.core.impl.OptionsBundle implements androidx.camera.core.impl.MutableConfig {
    private static final androidx.camera.core.impl.Config.OptionPriority DEFAULT_PRIORITY = androidx.camera.core.impl.Config.OptionPriority.OPTIONAL;

    private MutableOptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> treeMap) {
        super(treeMap);
    }

    public static androidx.camera.core.impl.MutableOptionsBundle create() {
        return new androidx.camera.core.impl.MutableOptionsBundle(new java.util.TreeMap(androidx.camera.core.impl.OptionsBundle.ID_COMPARE));
    }

    public static androidx.camera.core.impl.MutableOptionsBundle from(androidx.camera.core.impl.Config config) {
        java.util.TreeMap treeMap = new java.util.TreeMap(androidx.camera.core.impl.OptionsBundle.ID_COMPARE);
        for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
            java.util.Set<androidx.camera.core.impl.Config.OptionPriority> priorities = config.getPriorities(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (androidx.camera.core.impl.Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new androidx.camera.core.impl.MutableOptionsBundle(treeMap);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet) {
        insertOption(option, DEFAULT_PRIORITY, valuet);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> ValueT removeOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        return (ValueT) this.mOptions.remove(option);
    }

    @Override // androidx.camera.core.impl.MutableConfig
    public <ValueT> void insertOption(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority, ValueT valuet) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            this.mOptions.put(option, arrayMap);
            arrayMap.put(optionPriority, valuet);
            return;
        }
        androidx.camera.core.impl.Config.OptionPriority optionPriority2 = (androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet());
        if (!java.util.Objects.equals(map.get(optionPriority2), valuet) && androidx.camera.core.impl.Config.hasConflict(optionPriority2, optionPriority)) {
            throw new java.lang.IllegalArgumentException("Option values conflicts: " + option.getId() + ", existing value (" + optionPriority2 + ")=" + map.get(optionPriority2) + ", conflicting (" + optionPriority + ")=" + valuet);
        }
        map.put(optionPriority, valuet);
    }
}
