package s15;

/* loaded from: classes9.dex */
public class v extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f483714d;

    public v() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "topic"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "topicType"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "fromFeedId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "iconUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "desc"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "patMusicId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(-1, ya.b.f77489x9ff58fb5, s15.u.class), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(-1, "event", s15.t.class)});
        this.f483714d = mo75927x8ded05a8;
        super.m126741x8589bfe1("RecordFinderTopicShareItem");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", -1, null, "", "", "", null, null});
    }

    @Override // e14.l
    /* renamed from: checkValueSkip */
    public boolean mo126753x40072e68(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fieldSerializeName, "fieldSerializeName");
        boolean mo126753x40072e68 = super.mo126753x40072e68(fieldSerializeName, obj, z17);
        if (!mo126753x40072e68 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fieldSerializeName, "topicType") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, -1) && z17) {
            return true;
        }
        return mo126753x40072e68;
    }

    public java.lang.String j() {
        return super.m75945x2fec8307(this.f483714d + 4);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f483714d + 0);
    }

    public s15.t l() {
        return (s15.t) super.m75936x14adae67(this.f483714d + 7);
    }

    public int n() {
        return super.m75939xb282bd08(this.f483714d + 1);
    }

    public void o(java.lang.String str) {
        super.set(this.f483714d + 4, str);
    }

    public void p(java.lang.String str) {
        super.set(this.f483714d + 3, str);
    }

    public void q(java.lang.String str) {
        super.set(this.f483714d + 5, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f483714d + 0, str);
    }

    public void s(s15.t tVar) {
        super.set(this.f483714d + 7, tVar);
    }

    public void t(s15.u uVar) {
        super.set(this.f483714d + 6, uVar);
    }

    public void u(int i17) {
        super.set(this.f483714d + 1, java.lang.Integer.valueOf(i17));
    }
}
