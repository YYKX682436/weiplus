package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220;

/* renamed from: androidx.camera.core.impl.LensFacingCameraFilter */
/* loaded from: classes14.dex */
public class C0721xf927fdb5 implements p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d {

    /* renamed from: mLensFacing */
    private final int f1701x4d541ec5;

    public C0721xf927fdb5(int i17) {
        this.f1701x4d541ec5 = i17;
    }

    @Override // p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0471xbb5b1f1d
    /* renamed from: filter */
    public java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> mo4272xb408cb78(java.util.List<p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93> list) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0472xfede5d93 interfaceC0472xfede5d93 : list) {
            m3.h.b(interfaceC0472xfede5d93 instanceof p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0675x66574570, "The camera info doesn't contain internal implementation.");
            if (interfaceC0472xfede5d93.mo3168x5f62de6e() == this.f1701x4d541ec5) {
                arrayList.add(interfaceC0472xfede5d93);
            }
        }
        return arrayList;
    }

    /* renamed from: getLensFacing */
    public int m5499x5f62de6e() {
        return this.f1701x4d541ec5;
    }
}
