package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.ImageInputConfig */
/* loaded from: classes14.dex */
public interface InterfaceC0716x5f72b371 extends p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0745x2e0bb72 {

    /* renamed from: OPTION_INPUT_FORMAT */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<java.lang.Integer> f1687x12b109b6 = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageInput.inputFormat", java.lang.Integer.TYPE);

    /* renamed from: OPTION_INPUT_DYNAMIC_RANGE */
    public static final p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option<p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e> f1686x1d477a5e = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62.Option.m5382xaf65a0fc("camerax.core.imageInput.inputDynamicRange", p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.class);

    /* renamed from: androidx.camera.core.impl.ImageInputConfig$Builder */
    /* loaded from: classes14.dex */
    public interface Builder<B> {
        /* renamed from: setDynamicRange */
        B mo4455xb924c5c0(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e);
    }

    /* renamed from: getDynamicRange */
    default p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e m5475x82dbcab4() {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e) mo5380x77ba97d1(f1686x1d477a5e, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e.f954x1f661f17);
        c0491x2bb48c5e.getClass();
        return c0491x2bb48c5e;
    }

    /* renamed from: getInputFormat */
    default int mo5446xb124032b() {
        return ((java.lang.Integer) mo5379x77ba97d1(f1687x12b109b6)).intValue();
    }

    /* renamed from: hasDynamicRange */
    default boolean m5476x66bd07f8() {
        return mo5374xdccd9774(f1686x1d477a5e);
    }
}
