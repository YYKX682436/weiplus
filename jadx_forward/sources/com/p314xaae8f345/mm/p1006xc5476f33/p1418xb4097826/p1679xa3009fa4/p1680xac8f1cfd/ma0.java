package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class ma0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f216688d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma0(android.content.Context context) {
        super(1);
        this.f216688d = context;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean z17;
        boolean z18;
        cw2.da it = (cw2.da) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.o0().r()).booleanValue()) {
            z17 = true;
        } else {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
            z17 = false;
        }
        if (z17 || z65.c.a()) {
            z18 = true;
        } else {
            kb2.b bVar = kb2.b.f387758a;
            z18 = false;
        }
        android.content.Context context = this.f216688d;
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.VideoRecycler", "resumeFocusVideo context=" + context + ",ShouldPlayResume=" + it.getIsShouldPlayResume() + ",floatBallFeedId=" + pm0.v.u(kd2.p1.N.a().F0()) + '!');
        }
        if (it.getIsShouldPlayResume()) {
            if (it.getI() == (context != null ? context.hashCode() : -1)) {
                it.mo56716x4121a19(true);
                it.mo56706x561757e0(false);
                it.mo58789x348b34();
            }
        }
        return java.lang.Boolean.FALSE;
    }
}
