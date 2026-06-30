package iq2;

/* loaded from: classes2.dex */
public final class m implements c50.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dq2.d f375287a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375288b;

    public m(dq2.d dVar, iq2.d0 d0Var) {
        this.f375287a = dVar;
        this.f375288b = d0Var;
    }

    @Override // c50.n0
    public void a(so2.j5 feed, org.json.JSONObject jsonObject, int i17) {
        r45.s92 s92Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsonObject, "jsonObject");
        cq2.r rVar = cq2.r.f302977a;
        android.content.Context context = this.f375287a.f355775a;
        iq2.d0 d0Var = this.f375288b;
        r45.dk2 dk2Var = d0Var.f375269t;
        rVar.a(context, i17, feed, jsonObject, (dk2Var == null || (s92Var = (r45.s92) dk2Var.m75936x14adae67(12)) == null) ? 0 : s92Var.m75939xb282bd08(0), (r21 & 32) != 0 ? 0 : d0Var.f375252c.f382629b, (r21 & 64) != 0 ? 0 : d0Var.f(), (r21 & 128) != 0);
    }
}
