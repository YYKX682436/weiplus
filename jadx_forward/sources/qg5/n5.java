package qg5;

/* loaded from: classes8.dex */
public final class n5 extends jm0.g {

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f444630f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f444631g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f444632h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f444633i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f444634m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f444635n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(jm0.o service) {
        super(service);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f444630f = jz5.h.b(qg5.z4.f444813d);
        this.f444631g = jz5.h.b(qg5.x4.f444788d);
        this.f444632h = jz5.h.b(qg5.m5.f444617d);
        this.f444633i = jz5.h.b(qg5.l5.f444598d);
        this.f444634m = jz5.h.b(qg5.y4.f444802d);
        this.f444635n = jz5.h.b(qg5.c5.f444475d);
    }

    public static final ct.q2 T6(qg5.n5 n5Var) {
        return (ct.q2) ((jz5.n) n5Var.f444630f).mo141623x754a37bb();
    }

    public static final ct.k3 U6(qg5.n5 n5Var) {
        return (ct.k3) ((jz5.n) n5Var.f444632h).mo141623x754a37bb();
    }

    public static final void V6(qg5.n5 n5Var, android.content.Context context, java.lang.String str, java.lang.String str2) {
        p3325xe03a0797.p3326xc267989b.y0 b17;
        gm0.b bVar;
        n5Var.getClass();
        gm0.m b18 = gm0.j1.b();
        if (b18 == null || (bVar = b18.f354778h) == null || (b17 = bVar.f354678e) == null) {
            b17 = p3325xe03a0797.p3326xc267989b.z0.b();
        }
        java.lang.String uuid = java.util.UUID.randomUUID().toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(uuid, "toString(...)");
        java.lang.String c17 = com.p314xaae8f345.mm.app.p626xc52405f1.C5090xb499f982.f135244e.c(uuid);
        if (c17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.YuanBaoSummarizeFSC", "getFilePathChatRecords failed");
            return;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        p3325xe03a0797.p3326xc267989b.l.d(b17, ((t26.a) g3Var).f496880h, null, new qg5.f5(context, uuid, null), 2, null);
        p3325xe03a0797.p3326xc267989b.l.d(b17, g3Var, null, new qg5.k5(n5Var, context, str2, c17, str, uuid, null), 2, null);
    }

    public final void W6(android.content.Context context, yz5.a aVar) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = (com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) ((jz5.n) this.f444635n).mo141623x754a37bb();
        if (!(o4Var != null ? o4Var.getBoolean("yuanbao_summarize_agreed", false) : false)) {
            new qg5.v5(context, new qg5.a5(aVar, this), new qg5.b5(this)).f444762d.C();
        } else if (aVar != null) {
            aVar.mo152xb9724478();
        }
    }
}
