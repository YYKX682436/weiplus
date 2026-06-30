package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes.dex */
public final class zo implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a f192344d;

    public zo(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a activityC14120xff3e46a) {
        this.f192344d = activityC14120xff3e46a;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a.f191147t;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14120xff3e46a activityC14120xff3e46a = this.f192344d;
        java.lang.String stringExtra = activityC14120xff3e46a.getIntent().getStringExtra("KEY_FINDER_AUTHOR_BIND_ID");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m h17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.h(stringExtra);
        if (h17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGameBind", "no appinfo appid: ".concat(stringExtra));
        }
        java.lang.String str = h17.f67384x996f3ea;
        az2.c cVar = az2.f.f97658d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14120xff3e46a.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        az2.f a17 = az2.c.a(cVar, mo55332x76847179, null, 0L, null, 14, null);
        a17.a();
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        pm0.v.T(new bq.a0(str, 1, 1, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.wo(a17)).l(), new cq.x0(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.uo(stringExtra, str, a17, activityC14120xff3e46a), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.vo(stringExtra, str, a17, activityC14120xff3e46a)));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/OccupyFinderUI34$refreshInfoLayout$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
