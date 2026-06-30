package l20;

/* loaded from: classes9.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396704d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b f396705e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f396706f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(java.lang.String str, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b, bw5.kf kfVar) {
        super(0);
        this.f396704d = str;
        this.f396705e = c10547x7c1a666b;
        this.f396706f = kfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("click_type", "img"), new jz5.l("img_url", this.f396704d), new jz5.l("img_pos", "0"));
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b.L;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b = this.f396705e;
        c10547x7c1a666b.d("feeds_spu_card", "element_click", k17);
        i95.m c17 = i95.n0.c(pq.q.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pq.q qVar = (pq.q) c17;
        android.content.Context context = c10547x7c1a666b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pq.a aVar = new pq.a(context);
        bw5.x7 b17 = this.f396706f.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getEcsJumpInfo(...)");
        pq.q.Lb(qVar, aVar, b17, null, 4, null);
        return jz5.f0.f384359a;
    }
}
