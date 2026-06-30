package an;

/* loaded from: classes15.dex */
public class c implements com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenterBase {
    @Override // com.tencent.wechat.aff.cara.CaraNativeContactFeatureCenterBase
    public java.util.Optional getContactByUsername(java.lang.String str) {
        gm0.j1.i();
        com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        an.b bVar = new an.b();
        bVar.f8822a = str;
        bVar.f8824c = n17.q2();
        bVar.f8827f = c01.e2.P(n17);
        bVar.f8826e = c01.e2.P(n17);
        bVar.f8823b = !((n17.getType() & 2) != 0);
        bVar.f8825d = !((n17.G1 & 2) > 0);
        bVar.f8828g = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().K(n17.d1());
        bVar.f8829h = n17.P0();
        return java.util.Optional.of(new com.tencent.wechat.aff.cara.CaraNativeContact(bVar));
    }
}
