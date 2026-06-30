package x05;

/* loaded from: classes9.dex */
public class c extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f532722d;

    public c() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, dm.i4.f66875xa013b0d5), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "avatar"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "nickname"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "auth_job"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "auth_icon"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "auth_icon_url"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "ecSource"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "lastGMsgID")});
        this.f532722d = mo75927x8ded05a8;
        super.m126741x8589bfe1("findernamecard");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{null, null, null, null, 0, null, null, null});
    }

    @Override // e14.l
    /* renamed from: checkValueSkip */
    public boolean mo126753x40072e68(java.lang.String fieldSerializeName, java.lang.Object obj, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fieldSerializeName, "fieldSerializeName");
        boolean mo126753x40072e68 = super.mo126753x40072e68(fieldSerializeName, obj, z17);
        if (!mo126753x40072e68 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fieldSerializeName, "auth_icon") && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, -1) && z17) {
            return true;
        }
        return mo126753x40072e68;
    }

    /* renamed from: getAuthIconUrl */
    public java.lang.String m174808x11716638() {
        return super.m75945x2fec8307(this.f532722d + 5);
    }

    /* renamed from: getNickname */
    public java.lang.String m174809x8010e5e4() {
        return super.m75945x2fec8307(this.f532722d + 2);
    }

    /* renamed from: getUsername */
    public java.lang.String m174810x6c03c64c() {
        return super.m75945x2fec8307(this.f532722d + 0);
    }

    public int j() {
        return super.m75939xb282bd08(this.f532722d + 4);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f532722d + 3);
    }

    public java.lang.String l() {
        return super.m75945x2fec8307(this.f532722d + 1);
    }

    public java.lang.String n() {
        return super.m75945x2fec8307(this.f532722d + 6);
    }

    public java.lang.String o() {
        return super.m75945x2fec8307(this.f532722d + 7);
    }

    public void p(int i17) {
        super.set(this.f532722d + 4, java.lang.Integer.valueOf(i17));
    }

    public void q(java.lang.String str) {
        super.set(this.f532722d + 3, str);
    }

    public void r(java.lang.String str) {
        super.set(this.f532722d + 1, str);
    }

    public void s(java.lang.String str) {
        super.set(this.f532722d + 7, str);
    }

    public void t(java.lang.String str) {
        super.set(this.f532722d + 2, str);
    }

    public void u(java.lang.String str) {
        super.set(this.f532722d + 0, str);
    }
}
