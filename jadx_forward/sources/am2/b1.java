package am2;

/* loaded from: classes3.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f90165a;

    /* renamed from: d, reason: collision with root package name */
    public long f90168d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f90169e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f90170f;

    /* renamed from: b, reason: collision with root package name */
    public am2.h3 f90166b = am2.h3.f90214d;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f90167c = "";

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f90171g = "";

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f90172h = "";

    public b1(int i17) {
        this.f90165a = i17;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 a() {
        java.lang.String str;
        r45.cj1 cj1Var = new r45.cj1();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 m1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197159n;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f90167c)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            am2.z0 z0Var = (am2.z0) am2.e1.f90192c.get(this.f90166b);
            sb6.append(z0Var != null ? z0Var.f90313b : null);
            sb6.append('_');
            sb6.append(java.util.UUID.randomUUID());
            str = sb6.toString();
        } else {
            str = this.f90167c;
        }
        r45.ch1 ch1Var = new r45.ch1();
        ch1Var.set(13, new r45.xn1());
        r45.xn1 xn1Var = (r45.xn1) ch1Var.m75936x14adae67(13);
        boolean z17 = false;
        if (xn1Var != null) {
            xn1Var.set(0, new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa());
        }
        r45.xn1 xn1Var2 = (r45.xn1) ch1Var.m75936x14adae67(13);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = xn1Var2 != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) xn1Var2.m75936x14adae67(0) : null;
        if (c19782x23db1cfa != null) {
            java.lang.String str2 = this.f90169e;
            if (str2 == null) {
                str2 = "测试" + c06.e.f119249d.c();
            }
            c19782x23db1cfa.m76227x7ac946f0(str2);
        }
        r45.xn1 xn1Var3 = (r45.xn1) ch1Var.m75936x14adae67(13);
        if (xn1Var3 != null) {
            gk2.e eVar = gk2.e.f354004n;
            xn1Var3.set(11, eVar != null ? ((mm2.c1) eVar.a(mm2.c1.class)).f410345h : null);
        }
        ch1Var.set(2, this.f90172h);
        java.util.HashMap hashMap = am2.e1.f90192c;
        am2.z0 z0Var2 = (am2.z0) hashMap.get(this.f90166b);
        cj1Var.set(0, z0Var2 != null ? z0Var2.f90312a : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 l1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1(ch1Var);
        l1Var.f197123e = m1Var;
        l1Var.f197125g = cj1Var;
        l1Var.f197126h = str;
        l1Var.f197127i = 0;
        l1Var.f197128m = this.f90165a;
        l1Var.f197129n = kz5.z.G(am2.e1.f90191b, this.f90166b) ? "PRECIOUS_GIFT_SCHEDULE_NORMAL" : "PRECIOUS_GIFT_SCHEDULE_NONE";
        l1Var.f197132q = this.f90170f;
        am2.z0 z0Var3 = (am2.z0) hashMap.get(this.f90166b);
        l1Var.f197133r = z0Var3 != null ? z0Var3.f90312a : null;
        java.lang.String str3 = this.f90171g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str3, "<set-?>");
        l1Var.f197134s = str3;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (l1Var.f197127i > 1 || l1Var.f197128m > 1)) {
            z17 = true;
        }
        if (this.f90170f) {
            m1Var = (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) ? z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197152d : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197153e : z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197154f : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197155g;
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_NORMAL") || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(l1Var.f197129n, "PRECIOUS_GIFT_SCHEDULE_AS_ATTACH_GIFT")) {
            m1Var = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197156h : com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197157i;
        } else if (z17) {
            m1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1.f197158m;
        }
        l1Var.f197123e = m1Var;
        return l1Var;
    }

    public final am2.b1 b(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f90172h = str;
        return this;
    }

    public final am2.b1 c(java.lang.String str) {
        if (str == null) {
            str = "";
        }
        this.f90171g = str;
        return this;
    }

    /* renamed from: toString */
    public java.lang.String m2328x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("giftName = ");
        dk2.u7 u7Var = dk2.u7.f315714a;
        java.util.Map map = dk2.u7.f315718e;
        am2.e1 e1Var = am2.e1.f90190a;
        java.util.HashMap hashMap = am2.e1.f90192c;
        am2.z0 z0Var = (am2.z0) hashMap.get(this.f90166b);
        ce2.i iVar = (ce2.i) map.get(z0Var != null ? z0Var.f90312a : null);
        sb7.append(iVar != null ? iVar.f67809x225f1eb0 : null);
        sb6.append(sb7.toString());
        sb6.append(", ");
        sb6.append("comboId = " + this.f90167c);
        sb6.append(", ");
        sb6.append("count = " + this.f90165a);
        sb6.append(", executeInMainThread = false, ");
        sb6.append("nickname = " + this.f90169e + " ,");
        sb6.append("isSelfSend = " + this.f90170f + " ,");
        java.lang.StringBuilder sb8 = new java.lang.StringBuilder("giftLocalName = ");
        am2.z0 z0Var2 = (am2.z0) hashMap.get(this.f90166b);
        sb8.append(z0Var2 != null ? z0Var2.f90313b : null);
        sb8.append(", ");
        sb6.append(sb8.toString());
        sb6.append("executeDelayMs = " + this.f90168d);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f90171g);
        sb6.append("\n");
        java.lang.String sb9 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb9, "toString(...)");
        return sb9;
    }
}
