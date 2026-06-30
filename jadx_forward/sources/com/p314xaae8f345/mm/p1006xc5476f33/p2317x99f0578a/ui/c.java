package com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui;

/* loaded from: classes5.dex */
public final class c extends c.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e f256947a;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar) {
        this.f256947a = eVar;
    }

    @Override // c.c
    public void a(android.view.View bottomSheet, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        this.f256947a.f256959p = 0.7f >= f17;
    }

    @Override // c.c
    public void b(android.view.View bottomSheet, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bottomSheet, "bottomSheet");
        if (2 == i17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2317x99f0578a.ui.e eVar = this.f256947a;
            if (eVar.f256959p) {
                eVar.dismiss();
                return;
            }
            p001xcca8366f.p003x91727fcf.p004xb069c1be.p005xd1075a44.C0029xbc4672a6 c0029xbc4672a6 = eVar.f256958o;
            if (c0029xbc4672a6 == null) {
                return;
            }
            c0029xbc4672a6.C(3);
        }
    }
}
