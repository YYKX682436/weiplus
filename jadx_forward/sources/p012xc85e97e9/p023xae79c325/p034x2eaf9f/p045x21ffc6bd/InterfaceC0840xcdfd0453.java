package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd;

/* renamed from: androidx.camera.core.internal.TargetConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0840xcdfd0453<T> extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: OPTION_TARGET_NAME */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.String> f2095xc1a56baf = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.target.name", java.lang.String.class);

    /* renamed from: OPTION_TARGET_CLASS */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Class<?>> f2094x7271dcb4 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.target.class", java.lang.Class.class);

    /* renamed from: androidx.camera.core.internal.TargetConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<T, B> {
        /* renamed from: setTargetClass */
        B mo4354xf26d54a5(java.lang.Class<T> cls);

        /* renamed from: setTargetName */
        B mo4355x396335be(java.lang.String str);
    }

    /* renamed from: getTargetClass */
    default java.lang.Class<T> m6137x5c07e131(java.lang.Class<T> cls) {
        return (java.lang.Class) mo5380x77ba97d1(f2094x7271dcb4, cls);
    }

    /* renamed from: getTargetName */
    default java.lang.String m6139xb3ee7b2(java.lang.String str) {
        return (java.lang.String) mo5380x77ba97d1(f2095xc1a56baf, str);
    }

    /* renamed from: getTargetClass */
    default java.lang.Class<T> m6136x5c07e131() {
        return (java.lang.Class) mo5379x77ba97d1(f2094x7271dcb4);
    }

    /* renamed from: getTargetName */
    default java.lang.String m6138xb3ee7b2() {
        return (java.lang.String) mo5379x77ba97d1(f2095xc1a56baf);
    }
}
