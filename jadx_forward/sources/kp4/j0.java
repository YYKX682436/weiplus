package kp4;

/* loaded from: classes10.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 f392650d;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727) {
        this.f392650d = c18809x90659727;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = this.f392650d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae1456 = c18809x90659727.f257556d;
        if (c18811xb3ae1456 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        if (c18811xb3ae1456.getWidth() <= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14562 = c18809x90659727.f257556d;
            if (c18811xb3ae14562 != null) {
                c18811xb3ae14562.post(c18809x90659727.C);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
        }
        c18809x90659727.c(true);
        c18809x90659727.f257562m = c18809x90659727.f257573x / 2;
        kp4.c1 c1Var = c18809x90659727.A;
        c1Var.f392612i = -2;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14563 = c18809x90659727.f257556d;
        if (c18811xb3ae14563 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1Var.f392606c = c18811xb3ae14563.getWidth();
        kp4.c1 c1Var2 = c18809x90659727.B;
        c1Var2.f392612i = -3;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14564 = c18809x90659727.f257556d;
        if (c18811xb3ae14564 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c1Var2.f392606c = c18811xb3ae14564.getWidth();
        c18809x90659727.m72638x2ae9e9d3().add(0, c18809x90659727.A);
        c18809x90659727.m72638x2ae9e9d3().add(c18809x90659727.B);
        c18809x90659727.f257558f.x(-1);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14565 = c18809x90659727.f257556d;
        if (c18811xb3ae14565 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c18811xb3ae14565.f257577b2 = -1;
        c18809x90659727.f257558f.y(c18809x90659727.m72638x2ae9e9d3());
        c18809x90659727.f257558f.m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae14566 = c18809x90659727.f257556d;
        if (c18811xb3ae14566 != null) {
            c18811xb3ae14566.post(new kp4.i0(c18809x90659727));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
    }
}
