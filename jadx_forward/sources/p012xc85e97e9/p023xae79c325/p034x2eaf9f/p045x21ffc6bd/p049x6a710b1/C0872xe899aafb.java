package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p045x21ffc6bd.p049x6a710b1;

/* renamed from: androidx.camera.core.internal.utils.UseCaseConfigUtil */
/* loaded from: classes14.dex */
public final class C0872xe899aafb {
    private C0872xe899aafb() {
    }

    /* renamed from: updateTargetRotationAndRelatedConfigs */
    public static void m6243x54571205(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0768x83509b59.Builder<?, ?, ?> builder, int i17) {
        android.util.Size m5493xdba2c93;
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e interfaceC0717xf80d107e = (p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e) builder.mo4446x111127c3();
        int m5495x8d4b9125 = interfaceC0717xf80d107e.m5495x8d4b9125(-1);
        if (m5495x8d4b9125 == -1 || m5495x8d4b9125 != i17) {
            ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder) builder).mo4470x5541f931(i17);
        }
        if (m5495x8d4b9125 == -1 || i17 == -1 || m5495x8d4b9125 == i17) {
            return;
        }
        if (java.lang.Math.abs(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(i17) - p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1.C0781x213ce7ed.m5808x82c0521(m5495x8d4b9125)) % 180 != 90 || (m5493xdba2c93 = interfaceC0717xf80d107e.m5493xdba2c93(null)) == null) {
            return;
        }
        ((p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0717xf80d107e.Builder) builder).mo4469xb1b6c19f(new android.util.Size(m5493xdba2c93.getHeight(), m5493xdba2c93.getWidth()));
    }
}
