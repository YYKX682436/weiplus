package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SoftwareVideoDecoderFactory */
/* loaded from: classes16.dex */
public class C29858xd2d5fc3a implements org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61 {
    /* renamed from: supportedCodecs */
    public static org.p3371xd0ce3e8d.C29886x94209fc9[] m156372xf43ef96b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.m156504x7fcb405d(), new java.util.HashMap()));
        if (org.p3371xd0ce3e8d.C29803x316c97de.m155665x1e9a4a0d()) {
            arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.m156504x7fcb405d(), new java.util.HashMap()));
        }
        if (org.p3371xd0ce3e8d.C29799x63b2a722.m155656x1e9a4a0d()) {
            arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.m156504x7fcb405d(), new java.util.HashMap()));
        }
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) arrayList.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[arrayList.size()]);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: createDecoder */
    public org.p3371xd0ce3e8d.InterfaceC29889x5cf59369 mo155390xe1d6cfa8(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        java.lang.String m156495xfb82e301 = c29886x94209fc9.m156495xfb82e301();
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.m156504x7fcb405d())) {
            return new org.p3371xd0ce3e8d.C29801xc98b6aff();
        }
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.m156504x7fcb405d()) && org.p3371xd0ce3e8d.C29803x316c97de.m155665x1e9a4a0d()) {
            return new org.p3371xd0ce3e8d.C29803x316c97de();
        }
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.m156504x7fcb405d()) && org.p3371xd0ce3e8d.C29799x63b2a722.m155656x1e9a4a0d()) {
            return new org.p3371xd0ce3e8d.C29799x63b2a722();
        }
        return null;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29890x1fae3d61
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155391xd8a0cb35() {
        return m156372xf43ef96b();
    }
}
