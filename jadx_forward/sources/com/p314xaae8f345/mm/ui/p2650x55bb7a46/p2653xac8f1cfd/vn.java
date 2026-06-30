package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class vn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar) {
        super(2);
        this.f281675d = hoVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn oldStatus = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn) obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn newStatus = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldStatus, "oldStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStatus, "newStatus");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn knVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280909d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281675d;
        if (newStatus == knVar) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21677x4f89192f c21677x4f89192f = hoVar.f280715i;
            if (c21677x4f89192f == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controllerView");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21677x4f89192f.f280105e, "showLanguage: ");
            c21677x4f89192f.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.hn(c21677x4f89192f));
        } else {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21677x4f89192f c21677x4f89192f2 = hoVar.f280715i;
            if (c21677x4f89192f2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("controllerView");
                throw null;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c21677x4f89192f2.f280105e, "hideLanguage: ");
            c21677x4f89192f2.post(new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.gn(c21677x4f89192f2));
        }
        return jz5.f0.f384359a;
    }
}
