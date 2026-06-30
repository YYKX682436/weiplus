package sp2;

/* loaded from: classes2.dex */
public final class v1 implements c50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gp2.l0 f492774a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492775b;

    public v1(gp2.l0 l0Var, sp2.o2 o2Var) {
        this.f492774a = l0Var;
        this.f492775b = o2Var;
    }

    @Override // c50.n0
    public void a(so2.j5 feed, org.json.JSONObject jsonObject, int i17) {
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f302977a;
        android.content.Context context = this.f492774a.f355775a;
        sp2.o2 o2Var = this.f492775b;
        int o17 = o2Var.o(i17, feed);
        r45.dk2 dk2Var = o2Var.A;
        rVar.a(context, o17, feed, jsonObject, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 32) != 0 ? 0 : 0, (r21 & 64) != 0 ? 0 : 0, (r21 & 128) != 0 ? true : o2Var.v());
        o2Var.i(jsonObject, feed);
    }
}
