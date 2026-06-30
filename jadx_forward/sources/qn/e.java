package qn;

/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public static final qn.e f446419a = new qn.e();

    public final void a(qn.c cVar, qn.d dVar, qn.a aVar, java.lang.String str, qn.b bVar) {
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("chat_top", kz5.c1.k(new jz5.l("top_obj", java.lang.Integer.valueOf(cVar.f446414d)), new jz5.l("top_result", java.lang.Integer.valueOf(dVar.f446418d)), new jz5.l("chat_username", str), new jz5.l("chat_type", java.lang.Integer.valueOf(aVar.f446405d)), new jz5.l("top_action_source", java.lang.Integer.valueOf(bVar.f446409d))), 34574);
    }

    public final void b(java.lang.String talker, qn.d topResult, qn.b topActionSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(talker, "talker");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topResult, "topResult");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(topActionSource, "topActionSource");
        java.lang.String r17 = c01.z1.r();
        if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R3(talker)) {
            a(qn.c.f446412g, topResult, qn.a.f446402e, talker, topActionSource);
            return;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r17, talker)) {
            a(qn.c.f446411f, topResult, qn.a.f446402e, talker, topActionSource);
        } else if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(talker)) {
            a(qn.c.f446410e, topResult, qn.a.f446403f, talker, topActionSource);
        } else {
            a(qn.c.f446410e, topResult, qn.a.f446402e, talker, topActionSource);
        }
    }
}
