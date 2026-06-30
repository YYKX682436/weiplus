package org.p3371xd0ce3e8d;

/* renamed from: org.webrtc.DefaultVideoEncoderFactory */
/* loaded from: classes16.dex */
public class C29756x4f54b5c8 implements org.p3371xd0ce3e8d.InterfaceC29895x64274189 {

    /* renamed from: hardwareVideoEncoderFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29895x64274189 f75292x233d82a1;

    /* renamed from: softwareVideoEncoderFactory */
    private final org.p3371xd0ce3e8d.InterfaceC29895x64274189 f75293x41711882 = new org.p3371xd0ce3e8d.C29859x174f0062();

    public C29756x4f54b5c8(org.p3371xd0ce3e8d.InterfaceC29759xf7e285db.Context context, boolean z17, boolean z18) {
        this.f75292x233d82a1 = new org.p3371xd0ce3e8d.C29789xf91b6a81(context, z17, z18);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: createEncoder */
    public org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a880(org.p3371xd0ce3e8d.C29886x94209fc9 c29886x94209fc9) {
        org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a880 = this.f75293x41711882.mo155392x2618a880(c29886x94209fc9);
        org.p3371xd0ce3e8d.InterfaceC29894xa1376c41 mo155392x2618a8802 = this.f75292x233d82a1.mo155392x2618a880(c29886x94209fc9);
        return (mo155392x2618a8802 == null || mo155392x2618a880 == null) ? mo155392x2618a8802 != null ? mo155392x2618a8802 : mo155392x2618a880 : new org.p3371xd0ce3e8d.C29896x2fa5a643(mo155392x2618a880, mo155392x2618a8802);
    }

    @Override // org.p3371xd0ce3e8d.InterfaceC29895x64274189
    /* renamed from: getSupportedCodecs */
    public org.p3371xd0ce3e8d.C29886x94209fc9[] mo155393xd8a0cb35() {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        linkedHashSet.addAll(java.util.Arrays.asList(this.f75293x41711882.mo155393xd8a0cb35()));
        linkedHashSet.addAll(java.util.Arrays.asList(this.f75292x233d82a1.mo155393xd8a0cb35()));
        return (org.p3371xd0ce3e8d.C29886x94209fc9[]) linkedHashSet.toArray(new org.p3371xd0ce3e8d.C29886x94209fc9[linkedHashSet.size()]);
    }

    public C29756x4f54b5c8(org.p3371xd0ce3e8d.InterfaceC29895x64274189 interfaceC29895x64274189) {
        this.f75292x233d82a1 = interfaceC29895x64274189;
    }
}
