package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class l1 implements java.lang.Comparable {

    /* renamed from: d, reason: collision with root package name */
    public final r45.ch1 f197122d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 f197123e;

    /* renamed from: f, reason: collision with root package name */
    public long f197124f;

    /* renamed from: g, reason: collision with root package name */
    public r45.cj1 f197125g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f197126h;

    /* renamed from: i, reason: collision with root package name */
    public int f197127i;

    /* renamed from: m, reason: collision with root package name */
    public int f197128m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f197129n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f197130o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f197131p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f197132q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f197133r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f197134s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f197135t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.xv1 f197136u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f197137v;

    /* renamed from: w, reason: collision with root package name */
    public final r45.nv1 f197138w;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.String f197139x;

    /* JADX WARN: Code restructure failed: missing block: B:128:0x0067, code lost:
    
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r2, c01.z1.k()) == false) goto L16;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0080 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x025a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public l1(r45.ch1 r14) {
        /*
            Method dump skipped, instructions count: 637
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1.<init>(r45.ch1):void");
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1 other = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 m1Var = this.f197123e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.m1 m1Var2 = other.f197123e;
        return m1Var != m1Var2 ? m1Var.compareTo(m1Var2) : p3321xbce91901.jvm.p3324x21ffc6bd.o.j(this.f197124f, other.f197124f);
    }

    /* renamed from: equals */
    public boolean m57186xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f197122d, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.l1) obj).f197122d);
    }

    /* renamed from: hashCode */
    public int m57187x8cdac1b() {
        return this.f197122d.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m57188x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append("giftId = " + this.f197133r);
        sb6.append(", ");
        sb6.append("giftType = " + this.f197123e);
        sb6.append(", ");
        sb6.append("queueMsgId = " + this.f197124f);
        sb6.append(", ");
        sb6.append("comboId = " + this.f197126h);
        sb6.append(", ");
        sb6.append("comboSumCount = " + this.f197127i);
        sb6.append(", ");
        sb6.append("rewardCount = " + this.f197128m);
        sb6.append(", ");
        sb6.append("targetUserName = " + this.f197134s);
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        return sb7;
    }
}
