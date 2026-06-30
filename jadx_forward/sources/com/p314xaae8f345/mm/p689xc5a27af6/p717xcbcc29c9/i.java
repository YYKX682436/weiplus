package com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g f146989a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f146990b;

    public i(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g state, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        state = (i17 & 1) != 0 ? new com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g(null, null, 0L, 0L, 15, null) : state;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        this.f146989a = state;
        this.f146990b = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.h.f146973d);
    }

    public final dy1.r a() {
        return (dy1.r) ((jz5.n) this.f146990b).mo141623x754a37bb();
    }

    public final void b(int i17) {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.mm.p689xc5a27af6.p717xcbcc29c9.g gVar = this.f146989a;
        long j17 = currentTimeMillis - gVar.f146965c;
        gVar.getClass();
        ((cy1.a) a()).Ej("chat_hear_msg_end", kz5.c1.m(gVar.f146963a, kz5.c1.k(new jz5.l("hear_end_type", java.lang.Integer.valueOf(i17)), new jz5.l("hear_msg_duration_ms", java.lang.Integer.valueOf((int) j17)), new jz5.l("hear_msg_cnt", java.lang.Integer.valueOf(gVar.f146964b.size())), new jz5.l("selected_msg_list", kz5.n0.g0(gVar.f146964b, "#", null, null, 0, null, null, 62, null)))), 33488);
    }
}
