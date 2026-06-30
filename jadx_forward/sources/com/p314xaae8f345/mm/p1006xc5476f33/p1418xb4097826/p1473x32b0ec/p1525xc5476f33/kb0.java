package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class kb0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 f194745d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kb0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var) {
        super(0);
        this.f194745d = ob0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d multiRecyclerView;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ob0 ob0Var = this.f194745d;
        ob0Var.f195267r.setAlpha(1.0f);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz zzVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz) ob0Var.X0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.zz.class);
        if (zzVar != null) {
            multiRecyclerView = zzVar.w1().f478004b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(multiRecyclerView, "multiRecyclerView");
        } else {
            multiRecyclerView = null;
        }
        if (multiRecyclerView != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Float.valueOf(1.0f));
            java.util.Collections.reverse(arrayList);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1521x271b95f9.C14259xb044a81d c14259xb044a81d = multiRecyclerView;
            yj0.a.d(c14259xb044a81d, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
            multiRecyclerView.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
            yj0.a.f(c14259xb044a81d, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveTXLivePlayerPlugin$startPlay$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        }
        return jz5.f0.f384359a;
    }
}
