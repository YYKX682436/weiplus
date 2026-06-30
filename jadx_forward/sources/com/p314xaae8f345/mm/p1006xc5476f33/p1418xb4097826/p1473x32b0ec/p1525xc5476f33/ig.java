package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class ig implements p012xc85e97e9.p103xe821e364.p104xd1075a44.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg f194504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f194505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f194506c;

    public ig(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar, java.util.List list, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var) {
        this.f194504a = mgVar;
        this.f194505b = list;
        this.f194506c = f0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void a(int i17, int i18, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194504a;
        mgVar.D.f103713m.clear();
        mgVar.D.f103713m.addAll(this.f194505b);
        try {
            mgVar.D.m8152xc67946d3(i17, i18, 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeChanged, err = " + e17.getMessage());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void b(int i17, int i18) {
        this.f194506c.f391649d = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194504a;
        mgVar.D.f103713m.clear();
        mgVar.D.f103713m.addAll(this.f194505b);
        try {
            mgVar.D.m8153xd399a4d9(i17, i18);
            java.util.Objects.toString(mgVar);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeInserted, err = " + e17.getMessage());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void c(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg mgVar = this.f194504a;
        mgVar.D.f103713m.clear();
        mgVar.D.f103713m.addAll(this.f194505b);
        try {
            mgVar.D.m8154xdb81fc7f(i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemRangeRemoved, err = " + e17.getMessage());
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.r1
    public void d(int i17, int i18) {
        try {
            this.f194504a.D.m8150x87567217(i17, i18);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin", "[updateComments] notifyItemMoved, err = " + e17.getMessage());
        }
    }
}
