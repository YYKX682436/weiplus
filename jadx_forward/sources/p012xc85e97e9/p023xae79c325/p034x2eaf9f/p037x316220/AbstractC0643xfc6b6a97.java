package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.AttachedSurfaceInfo */
/* loaded from: classes14.dex */
public abstract class AbstractC0643xfc6b6a97 {
    /* renamed from: create */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0643xfc6b6a97 m5092xaf65a0fc(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f abstractC0758x2d42962f, int i17, android.util.Size size, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e c0491x2bb48c5e, java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> list, p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62, android.util.Range<java.lang.Integer> range) {
        return new p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.C0644xe976cbba(abstractC0758x2d42962f, i17, size, c0491x2bb48c5e, list, interfaceC0692x78a46f62, range);
    }

    /* renamed from: getCaptureTypes */
    public abstract java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0769xb8476771.CaptureType> mo5093x8e12cf49();

    /* renamed from: getDynamicRange */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0491x2bb48c5e mo5094x82dbcab4();

    /* renamed from: getImageFormat */
    public abstract int mo5095x450a23fc();

    /* renamed from: getImplementationOptions */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 mo5096xca0018d6();

    /* renamed from: getSize */
    public abstract android.util.Size mo5097xfb854877();

    /* renamed from: getSurfaceConfig */
    public abstract p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0758x2d42962f mo5098xbb032299();

    /* renamed from: getTargetFrameRate */
    public abstract android.util.Range<java.lang.Integer> mo5099x871a9f26();

    /* renamed from: toStreamSpec */
    public p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b m5100x3b434836(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0692x78a46f62 interfaceC0692x78a46f62) {
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.Builder mo5199x9a12cb4a = p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.AbstractC0756x2f9ad77b.m5673xdc3ef9b(mo5097xfb854877()).mo5197xb924c5c0(mo5094x82dbcab4()).mo5199x9a12cb4a(interfaceC0692x78a46f62);
        if (mo5099x871a9f26() != null) {
            mo5199x9a12cb4a.mo5198xe875cd2a(mo5099x871a9f26());
        }
        return mo5199x9a12cb4a.mo5196x59bc66e();
    }
}
