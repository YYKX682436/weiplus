package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db;

/* loaded from: classes4.dex */
public class x extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e f273505e;

    public x(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.ActivityC19725xad6fc40e activityC19725xad6fc40e) {
        this.f273505e = activityC19725xad6fc40e;
    }

    @Override // in5.r
    public int e() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.acu;
    }

    @Override // in5.r
    public void h(in5.s0 s0Var, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x xVar = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.x) cVar;
        android.view.View view = s0Var.f3639x46306858;
        int i19 = xVar.f272566i ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/pluginsdk/ui/tools/AppChooserUI$AppDefaultInfoItemConvert", "onBindViewHolder", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;Lcom/tencent/mm/pluginsdk/ui/otherway/DisplayResolveInfo;IIZLjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19724x5cc69f41 c19724x5cc69f41 = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.C19724x5cc69f41) s0Var.p(com.p314xaae8f345.mm.R.id.e1w);
        c19724x5cc69f41.f272859d = true;
        c19724x5cc69f41.a();
        c19724x5cc69f41.m75747xefe232c4().setText(xVar.f272562e);
        if (c19724x5cc69f41.m75745x9f7aa054() != null) {
            c19724x5cc69f41.m75745x9f7aa054().setImageDrawable(xVar.f272563f);
        }
        c19724x5cc69f41.m75748xdd7d58e5(this.f273505e.f272876q.a(xVar));
        s0Var.f3639x46306858.setOnClickListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.w(this, xVar));
    }
}
