package androidx.camera.core.impl;

/* loaded from: classes14.dex */
public class OptionsBundle implements androidx.camera.core.impl.Config {
    private static final androidx.camera.core.impl.OptionsBundle EMPTY_BUNDLE;
    protected static final java.util.Comparator<androidx.camera.core.impl.Config.Option<?>> ID_COMPARE;
    protected final java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> mOptions;

    static {
        androidx.camera.core.impl.OptionsBundle$$a optionsBundle$$a = new androidx.camera.core.impl.OptionsBundle$$a();
        ID_COMPARE = optionsBundle$$a;
        EMPTY_BUNDLE = new androidx.camera.core.impl.OptionsBundle(new java.util.TreeMap(optionsBundle$$a));
    }

    public OptionsBundle(java.util.TreeMap<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> treeMap) {
        this.mOptions = treeMap;
    }

    public static androidx.camera.core.impl.OptionsBundle emptyBundle() {
        return EMPTY_BUNDLE;
    }

    public static androidx.camera.core.impl.OptionsBundle from(androidx.camera.core.impl.Config config) {
        if (androidx.camera.core.impl.OptionsBundle.class.equals(config.getClass())) {
            return (androidx.camera.core.impl.OptionsBundle) config;
        }
        java.util.TreeMap treeMap = new java.util.TreeMap(ID_COMPARE);
        for (androidx.camera.core.impl.Config.Option<?> option : config.listOptions()) {
            java.util.Set<androidx.camera.core.impl.Config.OptionPriority> priorities = config.getPriorities(option);
            android.util.ArrayMap arrayMap = new android.util.ArrayMap();
            for (androidx.camera.core.impl.Config.OptionPriority optionPriority : priorities) {
                arrayMap.put(optionPriority, config.retrieveOptionWithPriority(option, optionPriority));
            }
            treeMap.put(option, arrayMap);
        }
        return new androidx.camera.core.impl.OptionsBundle(treeMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int lambda$static$0(androidx.camera.core.impl.Config.Option option, androidx.camera.core.impl.Config.Option option2) {
        return option.getId().compareTo(option2.getId());
    }

    @Override // androidx.camera.core.impl.Config
    public boolean containsOption(androidx.camera.core.impl.Config.Option<?> option) {
        return this.mOptions.containsKey(option);
    }

    @Override // androidx.camera.core.impl.Config
    public void findOptions(java.lang.String str, androidx.camera.core.impl.Config.OptionMatcher optionMatcher) {
        for (java.util.Map.Entry<androidx.camera.core.impl.Config.Option<?>, java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object>> entry : this.mOptions.tailMap(androidx.camera.core.impl.Config.Option.create(str, java.lang.Void.class)).entrySet()) {
            if (!entry.getKey().getId().startsWith(str) || !optionMatcher.onOptionMatched(entry.getKey())) {
                return;
            }
        }
    }

    @Override // androidx.camera.core.impl.Config
    public androidx.camera.core.impl.Config.OptionPriority getOptionPriority(androidx.camera.core.impl.Config.Option<?> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map != null) {
            return (androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet());
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.OptionPriority> getPriorities(androidx.camera.core.impl.Config.Option<?> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        return map == null ? java.util.Collections.emptySet() : java.util.Collections.unmodifiableSet(map.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public java.util.Set<androidx.camera.core.impl.Config.Option<?>> listOptions() {
        return java.util.Collections.unmodifiableSet(this.mOptions.keySet());
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map != null) {
            return (ValueT) map.get((androidx.camera.core.impl.Config.OptionPriority) java.util.Collections.min(map.keySet()));
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOptionWithPriority(androidx.camera.core.impl.Config.Option<ValueT> option, androidx.camera.core.impl.Config.OptionPriority optionPriority) {
        java.util.Map<androidx.camera.core.impl.Config.OptionPriority, java.lang.Object> map = this.mOptions.get(option);
        if (map == null) {
            throw new java.lang.IllegalArgumentException("Option does not exist: " + option);
        }
        if (map.containsKey(optionPriority)) {
            return (ValueT) map.get(optionPriority);
        }
        throw new java.lang.IllegalArgumentException("Option does not exist: " + option + " with priority=" + optionPriority);
    }

    @Override // androidx.camera.core.impl.Config
    public <ValueT> ValueT retrieveOption(androidx.camera.core.impl.Config.Option<ValueT> option, ValueT valuet) {
        try {
            return (ValueT) retrieveOption(option);
        } catch (java.lang.IllegalArgumentException unused) {
            return valuet;
        }
    }
}
