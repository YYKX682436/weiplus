package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes8.dex */
public final class m5 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 f211039d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v51 f211040e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078, r45.v51 v51Var) {
        super(0);
        this.f211039d = activityC15029x292078;
        this.f211040e = v51Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList m75941xfb821914 = this.f211040e.m75941xfb821914(5);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078.D;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078 activityC15029x292078 = this.f211039d;
        activityC15029x292078.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fans contact ");
        sb6.append(m75941xfb821914 != null ? java.lang.Integer.valueOf(m75941xfb821914.size()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFansListUI", sb6.toString());
        if (m75941xfb821914 != null) {
            java.util.ArrayList arrayList = activityC15029x292078.f210102w;
            arrayList.addAll(m75941xfb821914);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.e eVar = activityC15029x292078.f210101v;
            eVar.c(arrayList);
            eVar.notifyDataSetChanged();
        }
        if (!activityC15029x292078.f210103x) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15029x292078.c7(activityC15029x292078);
        }
        return jz5.f0.f384359a;
    }
}
