package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.SoftwareVideoEncoderFactory */
/* loaded from: classes16.dex */
public class C29859x174f0062 implements org.p3371xd0ce3e8d.InterfaceC29895x64274189 {
    /* renamed from: supportedCodecs */
    public static org.p3371xd0ce3e8d.C29886x94209fc9[] m156373xf43ef96b() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.m156504x7fcb405d(), new java.util.HashMap()));
        if (org.p3371xd0ce3e8d.C29804x75ae70b6.m155667x1e9a4a0d()) {
            arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.m156504x7fcb405d(), new java.util.HashMap()));
        }
        if (org.p3371xd0ce3e8d.C29800xa7f47ffa.m155659x1e9a4a0d()) {
            arrayList.add(new org.p3371xd0ce3e8d.C29886x94209fc9(org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.m156504x7fcb405d(), new java.util.HashMap()));
        }
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) arrayList.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[arrayList.size()]);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: createEncoder */
    public org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a880(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        java.lang.String m156495xfb82e301 = c29886x94209fc9.m156495xfb82e301();
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP8.m156504x7fcb405d())) {
            return new org.p3371xd0ce3e8d.C29802xdcd43d7();
        }
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.VP9.m156504x7fcb405d()) && org.p3371xd0ce3e8d.C29804x75ae70b6.m155667x1e9a4a0d()) {
            return new org.p3371xd0ce3e8d.C29804x75ae70b6();
        }
        if (m156495xfb82e301.equalsIgnoreCase(org.p3371xd0ce3e8d.EnumC29887xf25c2329.AV1.m156504x7fcb405d()) && org.p3371xd0ce3e8d.C29800xa7f47ffa.m155659x1e9a4a0d()) {
            return new org.p3371xd0ce3e8d.C29800xa7f47ffa();
        }
        return null;
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155393xd8a0cb35() {
        return m156373xf43ef96b();
    }
}
