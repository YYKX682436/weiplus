package p012xc85e97e9.p023xae79c325.p034x2eaf9f;

/* renamed from: androidx.camera.core.Camera */
/* loaded from: classes14.dex */
public interface InterfaceC0465x77deaf45 {
    /* renamed from: getCameraControl */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0467x1baf8658 mo4252xa97012c2();

    /* renamed from: getCameraInfo */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 mo4253x764d3969();

    /* renamed from: getExtendedConfig */
    p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0665xb691d6e7 mo3093x13f11ad1();

    /* renamed from: isUseCasesCombinationSupported */
    default boolean mo4254xb7fe8105(boolean z17, p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137... abstractC0580x5a5e3137Arr) {
        return true;
    }

    /* renamed from: isUseCasesCombinationSupportedByFramework */
    default boolean m4256x19bbb922(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137... abstractC0580x5a5e3137Arr) {
        return mo4254xb7fe8105(false, abstractC0580x5a5e3137Arr);
    }

    /* renamed from: isUseCasesCombinationSupported */
    default boolean m4255xb7fe8105(p012xc85e97e9.p023xae79c325.p034x2eaf9f.AbstractC0580x5a5e3137... abstractC0580x5a5e3137Arr) {
        return mo4254xb7fe8105(true, abstractC0580x5a5e3137Arr);
    }
}
