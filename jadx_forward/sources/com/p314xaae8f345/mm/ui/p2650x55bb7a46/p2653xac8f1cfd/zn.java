package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class zn extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f281927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f281928e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f281929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zn(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar, android.widget.TextView textView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352) {
        super(2);
        this.f281927d = hoVar;
        this.f281928e = textView;
        this.f281929f = c22699x3dcdb352;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        java.lang.String str;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn oldStatus = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn) obj;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn newStatus = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldStatus, "oldStatus");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newStatus, "newStatus");
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f281927d;
        android.view.ViewGroup viewGroup = hoVar.f280714h;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("useBtn");
            throw null;
        }
        if (newStatus == com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280909d) {
            i17 = 8;
        } else {
            if (viewGroup.getVisibility() != 0) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ln lnVar = hoVar.A;
                lnVar.getClass();
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar2 = lnVar.f280984a;
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(hoVar2.r0()).putInt(lnVar.a("useTrans"), com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(hoVar2.r0()).getInt(lnVar.a("useTrans"), 0) + 1);
                java.lang.String x17 = hoVar.f280113d.x();
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28 c6980x787b3d28 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6980x787b3d28();
                if (pn4.f1.f438638a.length() == 0) {
                    str = java.util.UUID.randomUUID().toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "toString(...)");
                    pn4.f1.f438638a = str;
                } else {
                    str = pn4.f1.f438638a;
                }
                c6980x787b3d28.r(str);
                c6980x787b3d28.f142884f = 1;
                c6980x787b3d28.p("6");
                c6980x787b3d28.q(x17);
                c6980x787b3d28.k();
            }
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn knVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280910e;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f281929f;
            android.widget.TextView textView = this.f281928e;
            if (newStatus == knVar) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
                if (c21668xed8974f2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
                    throw null;
                }
                if (c21668xed8974f2.getF280092n().length() == 0) {
                    android.view.ViewGroup viewGroup2 = hoVar.f280714h;
                    if (viewGroup2 == null) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("useBtn");
                        throw null;
                    }
                    viewGroup2.setEnabled(false);
                    textView.setTextColor(hoVar.f280113d.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
                    c22699x3dcdb352.m82040x7541828(hoVar.f280113d.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
                    i17 = 0;
                }
            }
            android.view.ViewGroup viewGroup3 = hoVar.f280714h;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("useBtn");
                throw null;
            }
            viewGroup3.setEnabled(true);
            textView.setTextColor(hoVar.f280113d.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            c22699x3dcdb352.m82040x7541828(hoVar.f280113d.g().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m));
            i17 = 0;
        }
        viewGroup.setVisibility(i17);
        return jz5.f0.f384359a;
    }
}
