package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes16.dex */
public final class s80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {

    /* renamed from: b2, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f201273b2;

    /* renamed from: c2, reason: collision with root package name */
    public final java.util.List f201274c2;

    /* renamed from: d2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n80 f201275d2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s80(android.content.Context context) {
        super(context, false, null, -1.0f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f201274c2 = new java.util.ArrayList();
        this.f201275d2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n80(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e9n;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int D() {
        return 8;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int J() {
        return 0;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        df2.ox oxVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAssistantMoreActionPanel", "initContentView");
        android.content.Context context = this.f199716e;
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        Y(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b);
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.stq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        this.f201273b2 = c1163xf1deaba4;
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 5));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba42 = this.f201273b2;
        pk2.o9 o9Var = null;
        if (c1163xf1deaba42 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gridRv");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.n80 n80Var = this.f201275d2;
        c1163xf1deaba42.mo7960x6cab2c8d(n80Var);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba43 = this.f201273b2;
        if (c1163xf1deaba43 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gridRv");
            throw null;
        }
        c1163xf1deaba43.setOverScrollMode(2);
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba44 = this.f201273b2;
        if (c1163xf1deaba44 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("gridRv");
            throw null;
        }
        c1163xf1deaba44.N(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.o80(context));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = dk2.ef.f314913e;
        if (k0Var != null && (oxVar = (df2.ox) k0Var.mo57658x143f1b92(df2.ox.class)) != null) {
            o9Var = oxVar.f312549q;
        }
        java.util.List list = this.f201274c2;
        if (o9Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderLiveAssistantMoreActionPanel", "loadItems: helper is null, skip building items");
            ((java.util.ArrayList) list).clear();
            n80Var.m8146xced61ae5();
            return;
        }
        java.util.ArrayList arrayList = (java.util.ArrayList) list;
        arrayList.clear();
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l80(com.p314xaae8f345.mm.R.C30867xcad56011.dwo, com.p314xaae8f345.mm.R.raw.f80151x88e27e60, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.q80(this, o9Var)));
        arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.l80(com.p314xaae8f345.mm.R.C30867xcad56011.dxw, com.p314xaae8f345.mm.R.raw.f80194x8f1a8525, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.r80(this, o9Var)));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveAssistantMoreActionPanel", "loadItems: visible=" + arrayList.size());
        n80Var.m8146xced61ae5();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public boolean Q() {
        return true;
    }
}
