package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class qv extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185962d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew f185963e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f185964f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f185965g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar, in5.s0 s0Var, int i17) {
        super(1);
        this.f185962d = view;
        this.f185963e = ewVar;
        this.f185964f = s0Var;
        this.f185965g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys it = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ys) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.view.View view = this.f185962d;
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568115lr0);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.f568118lr3);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/convert/FinderStreamCardAlbumConvert$onCreateViewHolder$2$1", "invoke", "(Lcom/tencent/mm/plugin/finder/feed/FinderStreamCardFeed;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        if (!it.f192727f.isEmpty()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar = this.f185963e;
            in5.s0 s0Var = this.f185964f;
            ewVar.h(s0Var, it, s0Var.m8183xf806b362(), this.f185965g, true, null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ew ewVar2 = this.f185963e;
        ewVar2.f184841w.f184958c = java.lang.System.currentTimeMillis();
        ewVar2.f184832n = false;
        return jz5.f0.f384359a;
    }
}
