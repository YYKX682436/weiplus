package z15;

/* loaded from: classes9.dex */
public class b extends l15.a {

    /* renamed from: d, reason: collision with root package name */
    public final int f550945d;

    public b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.k c17 = com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, "isPlayed");
        c17.f273700h = true;
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "endflag"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "cancelflag"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "forwardflag"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "voiceformat"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "voicelength"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "length"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.j(-1, "bufid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "aeskey"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "voiceurl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "voicemd5"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "clientmsgid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "fromusername"), c17});
        this.f550945d = mo75927x8ded05a8;
        super.m126741x8589bfe1("voicemsg");
        super.m126744x8061d213("msg");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{0, 0, 0, 0, 0, 0, 0, null, null, null, null, null, java.lang.Boolean.FALSE});
    }

    /* renamed from: getAeskey */
    public java.lang.String m178310x10626226() {
        return super.m75945x2fec8307(this.f550945d + 7);
    }

    /* renamed from: getFromUsername */
    public java.lang.String m178311xc0914d16() {
        return super.m75945x2fec8307(this.f550945d + 11);
    }

    /* renamed from: getLength */
    public int m178312x23255ddc() {
        return super.m75939xb282bd08(this.f550945d + 5);
    }

    public int j() {
        return super.m75939xb282bd08(this.f550945d + 6);
    }

    public int k() {
        return super.m75939xb282bd08(this.f550945d + 4);
    }

    public java.lang.String l() {
        return super.m75945x2fec8307(this.f550945d + 9);
    }

    public java.lang.String n() {
        return super.m75945x2fec8307(this.f550945d + 8);
    }

    public boolean o() {
        return super.m75933x41a8a7f2(this.f550945d + 12);
    }

    public void p(java.lang.String str) {
        super.set(this.f550945d + 7, str);
    }

    public void q(int i17) {
        super.set(this.f550945d + 2, java.lang.Integer.valueOf(i17));
    }

    public void r(java.lang.String str) {
        super.set(this.f550945d + 11, str);
    }

    public void s(int i17) {
        super.set(this.f550945d + 5, java.lang.Integer.valueOf(i17));
    }

    public void t(boolean z17) {
        super.set(this.f550945d + 12, java.lang.Boolean.valueOf(z17));
    }

    public void u(int i17) {
        super.set(this.f550945d + 4, java.lang.Integer.valueOf(i17));
    }

    public void w(java.lang.String str) {
        super.set(this.f550945d + 8, str);
    }
}
