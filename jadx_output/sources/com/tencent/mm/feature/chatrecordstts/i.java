package com.tencent.mm.feature.chatrecordstts;

/* loaded from: classes12.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.chatrecordstts.g f65456a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f65457b;

    public i(com.tencent.mm.feature.chatrecordstts.g state, int i17, kotlin.jvm.internal.i iVar) {
        state = (i17 & 1) != 0 ? new com.tencent.mm.feature.chatrecordstts.g(null, null, 0L, 0L, 15, null) : state;
        kotlin.jvm.internal.o.g(state, "state");
        this.f65456a = state;
        this.f65457b = jz5.h.b(com.tencent.mm.feature.chatrecordstts.h.f65440d);
    }

    public final dy1.r a() {
        return (dy1.r) ((jz5.n) this.f65457b).getValue();
    }

    public final void b(int i17) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        com.tencent.mm.feature.chatrecordstts.g gVar = this.f65456a;
        long j17 = currentTimeMillis - gVar.f65432c;
        gVar.getClass();
        ((cy1.a) a()).Ej("chat_hear_msg_end", kz5.c1.m(gVar.f65430a, kz5.c1.k(new jz5.l("hear_end_type", java.lang.Integer.valueOf(i17)), new jz5.l("hear_msg_duration_ms", java.lang.Integer.valueOf((int) j17)), new jz5.l("hear_msg_cnt", java.lang.Integer.valueOf(gVar.f65431b.size())), new jz5.l("selected_msg_list", kz5.n0.g0(gVar.f65431b, "#", null, null, 0, null, null, 62, null)))), 33488);
    }
}
