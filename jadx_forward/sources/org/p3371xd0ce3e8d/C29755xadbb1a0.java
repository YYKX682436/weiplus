package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.DefaultVideoDecoderFactory */
/* loaded from: classes16.dex */
public class C29755xadbb1a0 implements org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 {

    /* renamed from: hardwareVideoDecoderFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 f75289xdec47e79;

    /* renamed from: platformSoftwareVideoDecoderFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 f75290x8ddde3e7;

    /* renamed from: softwareVideoDecoderFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 f75291xfcf8145a;

    public C29755xadbb1a0(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context) {
        this.f75291xfcf8145a = new org.p3371xd0ce3e8d.C29858xd2d5fc3a();
        this.f75289xdec47e79 = new org.p3371xd0ce3e8d.C29786xb4a26659(context);
        this.f75290x8ddde3e7 = new org.p3371xd0ce3e8d.C29839xb2c5ebc7(context);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: createDecoder */
    public org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa8(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61;
        org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa8 = this.f75291xfcf8145a.mo155390xe1d6cfa8(c29886x94209fc9);
        org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa82 = this.f75289xdec47e79.mo155390xe1d6cfa8(c29886x94209fc9);
        if (mo155390xe1d6cfa8 == null && (interfaceC29890x1fae3d61 = this.f75290x8ddde3e7) != null) {
            mo155390xe1d6cfa8 = interfaceC29890x1fae3d61.mo155390xe1d6cfa8(c29886x94209fc9);
        }
        return (mo155390xe1d6cfa82 == null || mo155390xe1d6cfa8 == null) ? mo155390xe1d6cfa82 != null ? mo155390xe1d6cfa82 : mo155390xe1d6cfa8 : new org.p3371xd0ce3e8d.C29891xe4fe256b(mo155390xe1d6cfa8, mo155390xe1d6cfa82);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155391xd8a0cb35() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(java.util.Arrays.asList(this.f75291xfcf8145a.mo155391xd8a0cb35()));
        linkedHashSet.addAll(java.util.Arrays.asList(this.f75289xdec47e79.mo155391xd8a0cb35()));
        org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61 = this.f75290x8ddde3e7;
        if (interfaceC29890x1fae3d61 != null) {
            linkedHashSet.addAll(java.util.Arrays.asList(interfaceC29890x1fae3d61.mo155391xd8a0cb35()));
        }
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) linkedHashSet.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[linkedHashSet.size()]);
    }

    public C29755xadbb1a0(org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 interfaceC29890x1fae3d61) {
        this.f75291xfcf8145a = new org.p3371xd0ce3e8d.C29858xd2d5fc3a();
        this.f75289xdec47e79 = interfaceC29890x1fae3d61;
        this.f75290x8ddde3e7 = null;
    }
}
