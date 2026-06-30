package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class l4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13960xc5151fc0 f191789d;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13960xc5151fc0 activityC13960xc5151fc0) {
        this.f191789d = activityC13960xc5151fc0;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13960xc5151fc0 context = this.f191789d;
        android.content.Intent intent = new android.content.Intent(context.getIntent());
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        intent.putExtra("SOURCE_REQUEST_CODE", com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059);
        intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54075xb707b059));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGallerySearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
        c6553x54ab9387.q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192884b);
        c6553x54ab9387.f139025e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192885c;
        c6553x54ab9387.f139026f = 2L;
        c6553x54ab9387.p("search_icon");
        c6553x54ab9387.f139028h = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192886d;
        c6553x54ab9387.s("");
        c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
        c6553x54ab9387.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report");
        sb6.append(22878);
        sb6.append(' ');
        java.lang.String n17 = c6553x54ab9387.n();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryReportLogic", sb6.toString());
        return true;
    }
}
