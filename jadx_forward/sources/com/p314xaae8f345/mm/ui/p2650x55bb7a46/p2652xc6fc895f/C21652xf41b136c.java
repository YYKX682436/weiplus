package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\nB\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u000b"}, d2 = {"Lcom/tencent/mm/ui/chatting/atsomeone/AtSomeoneSearchDataSource;", "Lym3/b;", "Lcom/tencent/mm/ui/chatting/atsomeone/b;", "", "Landroidx/lifecycle/x;", "Ljz5/f0;", "destroy", "chatroom", "<init>", "(Ljava/lang/String;)V", "com/tencent/mm/ui/chatting/atsomeone/c", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.atsomeone.AtSomeoneSearchDataSource */
/* loaded from: classes.dex */
public final class C21652xf41b136c extends ym3.b implements p012xc85e97e9.p093xedfae76a.x {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f279997d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f279998e;

    /* renamed from: f, reason: collision with root package name */
    public p13.c f279999f;

    public C21652xf41b136c(java.lang.String chatroom) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(chatroom, "chatroom");
        this.f279997d = chatroom;
        this.f279998e = jz5.h.b(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.d.f280011d);
    }

    @Override // ym3.b
    public p3325xe03a0797.p3326xc267989b.p3328x30012e.j d(v65.i scope, xm3.v0 dataRequest) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scope, "scope");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataRequest, "dataRequest");
        u26.k0 k0Var = new u26.k0();
        p13.u uVar = new p13.u();
        uVar.f432675d = this.f279997d;
        uVar.f432674c = (java.lang.String) dataRequest.f536923e;
        uVar.f432673b = 12;
        uVar.f432685n = (com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) this.f279998e).mo141623x754a37bb();
        uVar.f432684m = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2652xc6fc895f.c(this, dataRequest, k0Var);
        uVar.f432681j.add(c01.z1.r());
        if (this.f279999f != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f279999f);
        }
        this.f279999f = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).sj(2, uVar);
        return new p3325xe03a0797.p3326xc267989b.p3328x30012e.r(k0Var);
    }

    @p012xc85e97e9.p093xedfae76a.l0(m7813x6ac9171 = p012xc85e97e9.p093xedfae76a.m.ON_DESTROY)
    /* renamed from: destroy */
    public final void m79422x5cd39ffa() {
        if (this.f279999f != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f279999f);
        }
        this.f279999f = null;
    }

    @Override // ym3.b
    public void e() {
        if (this.f279999f != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) ((o13.z) i95.n0.c(o13.z.class))).Ni(this.f279999f);
        }
    }
}
