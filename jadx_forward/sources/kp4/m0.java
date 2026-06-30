package kp4;

/* loaded from: classes10.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 f392658d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f392659e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kp4.c1 f392660f;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727, int i17, kp4.c1 c1Var) {
        this.f392658d = c18809x90659727;
        this.f392659e = i17;
        this.f392660f = c1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18809x90659727 c18809x90659727 = this.f392658d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2333x693b1d6.C18811xb3ae1456 c18811xb3ae1456 = c18809x90659727.f257556d;
        if (c18811xb3ae1456 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        c18811xb3ae1456.f257577b2 = this.f392659e;
        c18809x90659727.f257558f.x(this.f392660f.f392612i);
    }
}
