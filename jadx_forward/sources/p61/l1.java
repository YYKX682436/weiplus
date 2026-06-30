package p61;

/* loaded from: classes5.dex */
public class l1 implements s61.k1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f433840a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 f433841b;

    public l1(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970, java.lang.String str) {
        this.f433841b = activityC11360x90d2d970;
        this.f433840a = str;
    }

    @Override // s61.k1
    public void a(int i17, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970 activityC11360x90d2d970 = this.f433841b;
        if (i17 != 2) {
            if (i17 == 1) {
                android.content.Intent intent = new android.content.Intent(activityC11360x90d2d970, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11363xeff3735d.class);
                intent.putExtra("bindmcontact_mobile", this.f433840a);
                intent.putExtra("bind_scene", activityC11360x90d2d970.f154510w);
                intent.putExtra("KEnterFromBanner", activityC11360x90d2d970.f154506s);
                com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11360x90d2d970, intent);
                return;
            }
            return;
        }
        if (activityC11360x90d2d970.f154510w != 1) {
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11360x90d2d970, new android.content.Intent(activityC11360x90d2d970, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11361xb56cc096.class).putExtra("bind_scene", activityC11360x90d2d970.f154510w));
            if (activityC11360x90d2d970.f154506s) {
                if (activityC11360x90d2d970.f154510w == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 3, 3);
                    return;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11002, 1, 2);
                    return;
                }
            }
            return;
        }
        if (!((c01.z1.o() & 16384) != 0)) {
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab c6199x6e6a85ab = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6199x6e6a85ab();
            am.zz zzVar = c6199x6e6a85ab.f136453g;
            zzVar.f90150a = true;
            zzVar.f90151b = true;
            c6199x6e6a85ab.e();
        }
        activityC11360x90d2d970.V6();
        android.content.Intent intent2 = new android.content.Intent();
        intent2.addFlags(67108864);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
        j45.l.j(activityC11360x90d2d970, "account", ".security.ui.MySafeDeviceListUI", intent2, null);
    }
}
