package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class pq {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq f217114a;

    /* renamed from: b, reason: collision with root package name */
    public long f217115b;

    /* renamed from: c, reason: collision with root package name */
    public int f217116c;

    /* renamed from: d, reason: collision with root package name */
    public int f217117d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f217118e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f217119f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f217120g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f217121h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f217122i;

    /* renamed from: j, reason: collision with root package name */
    public r45.zk2 f217123j;

    /* renamed from: k, reason: collision with root package name */
    public r45.zk2 f217124k;

    /* renamed from: l, reason: collision with root package name */
    public yz5.a f217125l;

    public pq(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.rq showState, long j17, int i17, int i18, java.util.List list, java.util.List list2, java.util.List list3, java.lang.String str, java.util.Map map, r45.zk2 zk2Var, r45.zk2 zk2Var2, yz5.a aVar, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j18 = (i19 & 2) != 0 ? 0L : j17;
        int i27 = (i19 & 4) != 0 ? 0 : i17;
        int i28 = (i19 & 8) == 0 ? i18 : 0;
        java.util.List shownQuestionIdList = (i19 & 16) != 0 ? new java.util.ArrayList() : list;
        java.util.List selectedAnswerIdList = (i19 & 32) != 0 ? new java.util.ArrayList() : list2;
        java.util.List npsSelectedAnswerIds = (i19 & 64) != 0 ? new java.util.ArrayList() : list3;
        java.lang.String npsInputAnswerTxt = (i19 & 128) != 0 ? "" : str;
        java.util.Map questionShowTimeMap = (i19 & 256) != 0 ? new java.util.LinkedHashMap() : map;
        r45.zk2 zk2Var3 = (i19 & 512) != 0 ? null : zk2Var;
        r45.zk2 zk2Var4 = (i19 & 1024) != 0 ? null : zk2Var2;
        yz5.a aVar2 = (i19 & 2048) == 0 ? aVar : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(showState, "showState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shownQuestionIdList, "shownQuestionIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectedAnswerIdList, "selectedAnswerIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(npsSelectedAnswerIds, "npsSelectedAnswerIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(npsInputAnswerTxt, "npsInputAnswerTxt");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(questionShowTimeMap, "questionShowTimeMap");
        this.f217114a = showState;
        this.f217115b = j18;
        this.f217116c = i27;
        this.f217117d = i28;
        this.f217118e = shownQuestionIdList;
        this.f217119f = selectedAnswerIdList;
        this.f217120g = npsSelectedAnswerIds;
        this.f217121h = npsInputAnswerTxt;
        this.f217122i = questionShowTimeMap;
        this.f217123j = zk2Var3;
        this.f217124k = zk2Var4;
        this.f217125l = aVar2;
    }

    /* renamed from: equals */
    public boolean m63220xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq pqVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.pq) obj;
        return this.f217114a == pqVar.f217114a && this.f217115b == pqVar.f217115b && this.f217116c == pqVar.f217116c && this.f217117d == pqVar.f217117d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217118e, pqVar.f217118e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217119f, pqVar.f217119f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217120g, pqVar.f217120g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217121h, pqVar.f217121h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217122i, pqVar.f217122i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217123j, pqVar.f217123j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217124k, pqVar.f217124k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f217125l, pqVar.f217125l);
    }

    /* renamed from: hashCode */
    public int m63221x8cdac1b() {
        int hashCode = ((((((((((((((((this.f217114a.hashCode() * 31) + java.lang.Long.hashCode(this.f217115b)) * 31) + java.lang.Integer.hashCode(this.f217116c)) * 31) + java.lang.Integer.hashCode(this.f217117d)) * 31) + this.f217118e.hashCode()) * 31) + this.f217119f.hashCode()) * 31) + this.f217120g.hashCode()) * 31) + this.f217121h.hashCode()) * 31) + this.f217122i.hashCode()) * 31;
        r45.zk2 zk2Var = this.f217123j;
        int hashCode2 = (hashCode + (zk2Var == null ? 0 : zk2Var.hashCode())) * 31;
        r45.zk2 zk2Var2 = this.f217124k;
        int hashCode3 = (hashCode2 + (zk2Var2 == null ? 0 : zk2Var2.hashCode())) * 31;
        yz5.a aVar = this.f217125l;
        return hashCode3 + (aVar != null ? aVar.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m63222x9616526c() {
        return "NpsShowInfo(showState=" + this.f217114a + ", startShowTime=" + this.f217115b + ", showCount=" + this.f217116c + ", index=" + this.f217117d + ", shownQuestionIdList=" + this.f217118e + ", selectedAnswerIdList=" + this.f217119f + ", npsSelectedAnswerIds=" + this.f217120g + ", npsInputAnswerTxt=" + this.f217121h + ", questionShowTimeMap=" + this.f217122i + ", showingQuestion=" + this.f217123j + ", prepareQuestion=" + this.f217124k + ", prepareOnPopupEnd=" + this.f217125l + ')';
    }
}
