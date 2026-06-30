package hb2;

/* loaded from: classes2.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.wh2 f361554d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f361555e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(r45.wh2 wh2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079) {
        super(0);
        this.f361554d = wh2Var;
        this.f361555e = c14994x9b99c079;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m75939xb282bd08 = this.f361554d.m75939xb282bd08(2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = this.f361555e;
        if (m75939xb282bd08 == 1) {
            c14994x9b99c079.getFeedObject().m76903x60cfeedd(c14994x9b99c079.getFeedObject().m76810x98d986d1() | 2048);
        } else {
            c14994x9b99c079.getFeedObject().m76903x60cfeedd(c14994x9b99c079.getFeedObject().m76810x98d986d1() & (-2049));
        }
        return jz5.f0.f384359a;
    }
}
