package p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.p042x6a710b1;

/* renamed from: androidx.camera.core.impl.utils.SessionProcessorUtil */
/* loaded from: classes14.dex */
public final class C0797xfdd65cde {
    private C0797xfdd65cde() {
    }

    /* renamed from: getModifiedFocusMeteringAction */
    public static p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 m5933x46a35f88(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc, p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 c0502x5ba1de27) {
        boolean z17;
        if (interfaceC0752x161fb6bc == null) {
            return c0502x5ba1de27;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder builder = new p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27.Builder(c0502x5ba1de27);
        boolean z18 = true;
        if (c0502x5ba1de27.m4393xd6590eb7().isEmpty() || m5934x27c3d5d1(interfaceC0752x161fb6bc, 1, 2)) {
            z17 = false;
        } else {
            builder.m4400xc7b8ce87(1);
            z17 = true;
        }
        if (!c0502x5ba1de27.m4392xd6590eb6().isEmpty() && !m5934x27c3d5d1(interfaceC0752x161fb6bc, 3)) {
            builder.m4400xc7b8ce87(2);
            z17 = true;
        }
        if (c0502x5ba1de27.m4394xf4c8ca9a().isEmpty() || m5934x27c3d5d1(interfaceC0752x161fb6bc, 4)) {
            z18 = z17;
        } else {
            builder.m4400xc7b8ce87(4);
        }
        if (!z18) {
            return c0502x5ba1de27;
        }
        p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0502x5ba1de27 m4398x59bc66e = builder.m4398x59bc66e();
        if (m4398x59bc66e.m4393xd6590eb7().isEmpty() && m4398x59bc66e.m4392xd6590eb6().isEmpty() && m4398x59bc66e.m4394xf4c8ca9a().isEmpty()) {
            return null;
        }
        return builder.m4398x59bc66e();
    }

    /* renamed from: isOperationSupported */
    public static boolean m5934x27c3d5d1(p012xc85e97e9.p023xae79c325.p034x2eaf9f.p037x316220.InterfaceC0752x161fb6bc interfaceC0752x161fb6bc, int... iArr) {
        if (interfaceC0752x161fb6bc == null) {
            return true;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i17 : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i17));
        }
        return interfaceC0752x161fb6bc.mo5651x36ea2709().containsAll(arrayList);
    }
}
