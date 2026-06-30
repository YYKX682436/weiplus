package v02;

/* loaded from: classes8.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v02.f0 f513818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f513819e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(v02.f0 f0Var, java.util.List list) {
        super(0);
        this.f513818d = f0Var;
        this.f513819e = list;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("same_file_link_chatname", kz5.n0.g0(this.f513819e, "#", null, null, 0, null, null, 62, null)), new jz5.l("exp_chat_cnt", java.lang.Integer.valueOf(this.f513819e.size())), new jz5.l("doc_half_screen_sessionid", java.util.UUID.randomUUID().toString()));
        v02.f0 f0Var = this.f513818d;
        f0Var.hj(k17);
        ((cy1.a) f0Var.rj()).Hj("doc_details_half_screen_exp", "view_exp", f0Var.f513781m, 36223);
        return jz5.f0.f384359a;
    }
}
