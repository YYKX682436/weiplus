package r05;

/* loaded from: classes9.dex */
public class g extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f449894d;

    public g() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "itemshowtype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "coverpicimageurl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.g(-1, "coverpicwidth"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.g(-1, "coverpicheight"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "piccount"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "showsourceinfo"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "isfindercontact"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "duration"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "ispaysubscribe"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "nativepage")});
        this.f449894d = mo75927x8ded05a8;
        super.m126741x8589bfe1("AppMsgReaderShared");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        java.lang.Float valueOf = java.lang.Float.valueOf(0.0f);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{-1, "", valueOf, valueOf, 0, 0, "0", -1, 0, 0});
    }

    public void A(int i17) {
        super.set(this.f449894d + 4, java.lang.Integer.valueOf(i17));
    }

    @Override // e14.l
    /* renamed from: checkValueSkip */
    public boolean mo126753x40072e68(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fieldSerializeName, "fieldSerializeName");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fieldSerializeName, "itemshowtype") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fieldSerializeName, "showsourceinfo")) {
            return false;
        }
        return super.mo126753x40072e68(fieldSerializeName, obj, z17);
    }

    public float j() {
        return super.m75938x746dc8a6(this.f449894d + 3);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f449894d + 1);
    }

    public float l() {
        return super.m75938x746dc8a6(this.f449894d + 2);
    }

    public int n() {
        return super.m75939xb282bd08(this.f449894d + 7);
    }

    public int o() {
        return super.m75939xb282bd08(this.f449894d + 0);
    }

    public int p() {
        return super.m75939xb282bd08(this.f449894d + 9);
    }

    public int q() {
        return super.m75939xb282bd08(this.f449894d + 4);
    }

    public java.lang.String r() {
        return super.m75945x2fec8307(this.f449894d + 6);
    }

    public int s() {
        return super.m75939xb282bd08(this.f449894d + 8);
    }

    public void t(float f17) {
        super.set(this.f449894d + 3, java.lang.Float.valueOf(f17));
    }

    public void u(java.lang.String str) {
        super.set(this.f449894d + 1, str);
    }

    public void w(float f17) {
        super.set(this.f449894d + 2, java.lang.Float.valueOf(f17));
    }

    public void x(int i17) {
        super.set(this.f449894d + 7, java.lang.Integer.valueOf(i17));
    }

    public void y(java.lang.String str) {
        super.set(this.f449894d + 6, str);
    }

    public void z(int i17) {
        super.set(this.f449894d + 0, java.lang.Integer.valueOf(i17));
    }
}
