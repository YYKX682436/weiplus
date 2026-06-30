package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes5.dex */
public final class eo implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho f280525d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn4.b f280526e;

    public eo(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar, nn4.b bVar) {
        this.f280525d = hoVar;
        this.f280526e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f280526e.f420230b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.ho hoVar = this.f280525d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn knVar = hoVar.f280721r;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn knVar2 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280909d;
        if (knVar == knVar2) {
            return;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f2 = hoVar.f280716m;
        if (c21668xed8974f2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        c21668xed8974f2.m79445xc54f6a7a(false);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f22 = hoVar.f280716m;
        if (c21668xed8974f22 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        c21668xed8974f22.expectWidth = ((android.view.View) ((jz5.n) hoVar.C).mo141623x754a37bb()).getWidth();
        c21668xed8974f22.requestLayout();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, hoVar.f280724u)) {
            if (!(str.length() == 0)) {
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f23 = hoVar.f280716m;
                if (c21668xed8974f23 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
                    throw null;
                }
                c21668xed8974f23.m79447xac166b75(str);
                hoVar.u0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kn.f280911f);
                return;
            }
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.C21668xed8974f2 c21668xed8974f24 = hoVar.f280716m;
        if (c21668xed8974f24 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("resultTv");
            throw null;
        }
        c21668xed8974f24.setText("");
        hoVar.u0(knVar2);
    }
}
