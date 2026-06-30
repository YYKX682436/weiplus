package g15;

/* loaded from: classes9.dex */
public class b extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f349120d;

    public b() {
        com.p314xaae8f345.mm.p2495xc50a8b8b.k c17 = com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, "voiceInput");
        c17.f273700h = true;
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.v(-1, "lastEditingMsg"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.r(-1, "lastEditingQuote", g15.d.class), c17, com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "recentAtRecord", g15.c.class, "oneAtRecord"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "convRedHintList", g15.a.class, "")});
        this.f349120d = mo75927x8ded05a8;
        super.m126741x8589bfe1("DraftInfo");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", null, java.lang.Boolean.FALSE, new java.util.LinkedList(), new java.util.LinkedList()});
    }

    public java.util.LinkedList j() {
        return super.m75940x3e48ce4d(this.f349120d + 4);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f349120d + 0);
    }

    public g15.d l() {
        return (g15.d) super.m75936x14adae67(this.f349120d + 1);
    }

    public java.util.LinkedList n() {
        return super.m75940x3e48ce4d(this.f349120d + 3);
    }

    public boolean o() {
        return super.m75933x41a8a7f2(this.f349120d + 2);
    }

    public void p(java.lang.String str) {
        super.set(this.f349120d + 0, str);
    }

    public void q(g15.d dVar) {
        super.set(this.f349120d + 1, dVar);
    }

    public void r(java.util.LinkedList linkedList) {
        super.set(this.f349120d + 3, linkedList);
    }

    public void s(boolean z17) {
        super.set(this.f349120d + 2, java.lang.Boolean.valueOf(z17));
    }

    /* renamed from: toString */
    public java.lang.String m130642x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("DraftInfo(lastEditingMsg='");
        int i17 = this.f349120d;
        sb6.append(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.G1(super.m75945x2fec8307(i17 + 0)));
        sb6.append("', quoteDraft={");
        g15.d dVar = (g15.d) super.m75936x14adae67(i17 + 1);
        sb6.append(dVar != null ? dVar.j() : 0L);
        sb6.append("}, voiceInput=");
        sb6.append(super.m75933x41a8a7f2(i17 + 2));
        sb6.append(')');
        return sb6.toString();
    }
}
