package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class l4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI f110256d;

    public l4(com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI finderGalleryUI) {
        this.f110256d = finderGalleryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderGalleryUI context = this.f110256d;
        android.content.Intent intent = new android.content.Intent(context.getIntent());
        ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).getClass();
        kotlin.jvm.internal.o.g(context, "context");
        intent.putExtra("SOURCE_REQUEST_CODE", com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL);
        intent.setClass(context, com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI.class);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(com.tencent.thumbplayer.tmediacodec.codec.CodecError.START_ILLEGAL));
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(context, arrayList.toArray(), "com/tencent/mm/plugin/finder/assist/ActivityRouter", "enterFinderGallerySearchUI", "(Landroid/content/Context;Landroid/content/Intent;I)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
        com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct finderPickerDataReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderPickerDataReportStruct();
        finderPickerDataReportStruct.q(com.tencent.mm.plugin.finder.gallery.b0.f111351b);
        finderPickerDataReportStruct.f57492e = com.tencent.mm.plugin.finder.gallery.b0.f111352c;
        finderPickerDataReportStruct.f57493f = 2L;
        finderPickerDataReportStruct.p("search_icon");
        finderPickerDataReportStruct.f57495h = com.tencent.mm.plugin.finder.gallery.b0.f111353d;
        finderPickerDataReportStruct.s("");
        finderPickerDataReportStruct.r(java.lang.String.valueOf(c01.id.c()));
        finderPickerDataReportStruct.k();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("report");
        sb6.append(22878);
        sb6.append(' ');
        java.lang.String n17 = finderPickerDataReportStruct.n();
        kotlin.jvm.internal.o.f(n17, "toShowString(...)");
        sb6.append(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false));
        com.tencent.mars.xlog.Log.i("FinderGalleryReportLogic", sb6.toString());
        return true;
    }
}
