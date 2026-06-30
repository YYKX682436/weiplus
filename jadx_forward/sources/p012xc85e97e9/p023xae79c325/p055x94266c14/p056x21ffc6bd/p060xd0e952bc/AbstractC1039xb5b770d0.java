package p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc;

/* renamed from: androidx.camera.extensions.internal.sessionprocessor.SurfaceOutputConfig */
/* loaded from: classes14.dex */
public abstract class AbstractC1039xb5b770d0 implements p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0 {
    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0 m6883xaf65a0fc(int i17, int i18, java.lang.String str, java.util.List<p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.InterfaceC1020xba84a5d0> list, android.view.Surface surface) {
        return new p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.C1017xa2c2d1f3(i17, i18, str, list, surface);
    }

    /* renamed from: getSurface */
    public abstract android.view.Surface mo6800xcf572877();

    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p055x94266c14.p056x21ffc6bd.p060xd0e952bc.AbstractC1039xb5b770d0 m6884xaf65a0fc(int i17, android.view.Surface surface) {
        return m6883xaf65a0fc(i17, -1, null, java.util.Collections.emptyList(), surface);
    }
}
