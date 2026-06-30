package an;

/* loaded from: classes15.dex */
public class c implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27173x1ab85de0 {
    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.InterfaceC27173x1ab85de0
    /* renamed from: getContactByUsername */
    public java.util.Optional mo2398x1c3091d7(java.lang.String str) {
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        an.b bVar = new an.b();
        bVar.f90355a = str;
        bVar.f90357c = n17.q2();
        bVar.f90360f = c01.e2.P(n17);
        bVar.f90359e = c01.e2.P(n17);
        bVar.f90356b = !((n17.m124896xfb85f7b0() & 2) != 0);
        bVar.f90358d = !((n17.G1 & 2) > 0);
        bVar.f90361g = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(n17.d1());
        bVar.f90362h = n17.P0();
        return java.util.Optional.of(new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27168x5cc685dc(bVar));
    }
}
