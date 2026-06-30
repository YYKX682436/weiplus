package l20;

/* loaded from: classes9.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396709d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f396710e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b f396711f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f396712g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ bw5.kf f396713h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String str, int i17, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b c10547x7c1a666b, yz5.l lVar, bw5.kf kfVar) {
        super(0);
        this.f396709d = str;
        this.f396710e = i17;
        this.f396711f = c10547x7c1a666b;
        this.f396712g = lVar;
        this.f396713h = kfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Map k17 = kz5.c1.k(new jz5.l("click_type", "img"), new jz5.l("img_url", this.f396709d), new jz5.l("img_pos", java.lang.String.valueOf(this.f396710e + 1)));
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10547x7c1a666b.L;
        this.f396711f.d("feeds_spu_card", "element_click", k17);
        bw5.x7 b17 = this.f396713h.b();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getEcsJumpInfo(...)");
        this.f396712g.mo146xb9724478(b17);
        return jz5.f0.f384359a;
    }
}
