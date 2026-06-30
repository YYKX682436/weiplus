package r72;

/* loaded from: classes16.dex */
public class y extends e14.k {

    /* renamed from: d, reason: collision with root package name */
    public final int f474694d;

    public y() {
        int mo75927x8ded05a8 = super.mo75927x8ded05a8(new com.p314xaae8f345.mm.p2495xc50a8b8b.k[]{com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "fallbackurl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "subtype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "bizId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "nickname"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "des"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "jumptype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "mediatype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.i(-1, "subtype"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "query"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "pagepath"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "appid"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "appId"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "thumburl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.u(-1, "thumbUrl"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, "isTransparent"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.c(-1, "forbidForward"), com.p314xaae8f345.mm.p2495xc50a8b8b.i.t(-1, "excerptlist", r72.j.class, "excerptitem")});
        this.f474694d = mo75927x8ded05a8;
        super.m126741x8589bfe1("liteappitem");
        super.m126744x8061d213("");
        super.m126742x3674fae4(true);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        super.m75950x7e1708ed(mo75927x8ded05a8, new java.lang.Object[]{"", -1, -1, "", "", "", -1, -1, -1, "", "", "", "", "", "", "", bool, bool, linkedList});
    }

    public void A(java.lang.String str) {
        super.set(this.f474694d + 4, str);
    }

    public void B(boolean z17) {
        super.set(this.f474694d + 17, java.lang.Boolean.valueOf(z17));
    }

    public void C(int i17) {
        super.set(this.f474694d + 6, java.lang.Integer.valueOf(i17));
    }

    public void E(int i17) {
        super.set(this.f474694d + 7, java.lang.Integer.valueOf(i17));
    }

    public void F(java.lang.String str) {
        super.set(this.f474694d + 3, str);
    }

    public void G(java.lang.String str) {
        super.set(this.f474694d + 10, str);
    }

    public void H(java.lang.String str) {
        super.set(this.f474694d + 9, str);
    }

    public void I(java.lang.String str) {
        super.set(this.f474694d + 14, str);
    }

    public void J(java.lang.String str) {
        super.set(this.f474694d + 5, str);
    }

    public void K(boolean z17) {
        super.set(this.f474694d + 16, java.lang.Boolean.valueOf(z17));
    }

    public void L(java.lang.String str) {
        super.set(this.f474694d + 0, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0027, code lost:
    
        if (r3.equals("appId") == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (r3.equals(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14351x4e45808f) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0015, code lost:
    
        if (r3.equals("thumbUrl") != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0034, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001e, code lost:
    
        if (r3.equals("bizId") == false) goto L18;
     */
    @Override // e14.l
    /* renamed from: checkValueSkip */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo126753x40072e68(java.lang.String r3, java.lang.Object r4, boolean r5) {
        /*
            r2 = this;
            java.lang.String r0 = "fieldSerializeName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            int r0 = r3.hashCode()
            r1 = 1
            switch(r0) {
                case 3433103: goto L2a;
                case 93028124: goto L21;
                case 93752718: goto L18;
                case 1566917561: goto Le;
                default: goto Ld;
            }
        Ld:
            goto L35
        Le:
            java.lang.String r0 = "thumbUrl"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L35
            goto L34
        L18:
            java.lang.String r0 = "bizId"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L21:
            java.lang.String r0 = "appId"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L2a:
            java.lang.String r0 = "page"
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L34
            goto L35
        L34:
            return r1
        L35:
            java.lang.String r0 = "subtype"
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r0)
            if (r0 == 0) goto L59
            if (r4 == 0) goto L58
            r3 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            boolean r5 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r5 != 0) goto L58
            r5 = -1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            boolean r4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r4, r5)
            if (r4 == 0) goto L57
            goto L58
        L57:
            r1 = r3
        L58:
            return r1
        L59:
            boolean r3 = super.mo126753x40072e68(r3, r4, r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: r72.y.mo126753x40072e68(java.lang.String, java.lang.Object, boolean):boolean");
    }

    /* renamed from: getAppId */
    public java.lang.String m162034x74292566() {
        return super.m75945x2fec8307(this.f474694d + 12);
    }

    /* renamed from: getMediaType */
    public int m162035x7f025288() {
        return super.m75939xb282bd08(this.f474694d + 7);
    }

    /* renamed from: getNickName */
    public java.lang.String m162036x80025a04() {
        return super.m75945x2fec8307(this.f474694d + 3);
    }

    /* renamed from: getThumbUrl */
    public java.lang.String m162037xd93f812f() {
        return super.m75945x2fec8307(this.f474694d + 14);
    }

    /* renamed from: getTitle */
    public java.lang.String m162038x7531c8a2() {
        return super.m75945x2fec8307(this.f474694d + 5);
    }

    /* renamed from: getUrl */
    public java.lang.String m162039xb5887639() {
        return super.m75945x2fec8307(this.f474694d + 0);
    }

    public int j() {
        return super.m75939xb282bd08(this.f474694d + 1);
    }

    public java.lang.String k() {
        return super.m75945x2fec8307(this.f474694d + 4);
    }

    public java.util.LinkedList l() {
        return super.m75940x3e48ce4d(this.f474694d + 18);
    }

    public java.lang.String n() {
        return super.m75945x2fec8307(this.f474694d + 13);
    }

    public int o() {
        return super.m75939xb282bd08(this.f474694d + 2);
    }

    public int p() {
        return super.m75939xb282bd08(this.f474694d + 8);
    }

    public java.lang.String q() {
        return super.m75945x2fec8307(this.f474694d + 11);
    }

    public java.lang.String r() {
        return super.m75945x2fec8307(this.f474694d + 15);
    }

    public boolean s() {
        return super.m75933x41a8a7f2(this.f474694d + 17);
    }

    public int t() {
        return super.m75939xb282bd08(this.f474694d + 6);
    }

    public java.lang.String u() {
        return super.m75945x2fec8307(this.f474694d + 10);
    }

    public java.lang.String w() {
        return super.m75945x2fec8307(this.f474694d + 9);
    }

    public boolean x() {
        return super.m75933x41a8a7f2(this.f474694d + 16);
    }

    public void y(java.lang.String str) {
        super.set(this.f474694d + 12, str);
    }

    public void z(int i17) {
        super.set(this.f474694d + 1, java.lang.Integer.valueOf(i17));
    }
}
