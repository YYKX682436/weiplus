package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class e0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f72619a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.AAQueryListUI f72620b;

    public e0(com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI, boolean z17) {
        this.f72620b = aAQueryListUI;
        this.f72619a = z17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        java.util.List list = (java.util.List) cVar.a(0);
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "record list size: %s, h5Url: %s, lastFlag: %s", java.lang.Integer.valueOf(list.size()), cVar.a(1), cVar.a(2));
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0((java.lang.String) cVar.a(1));
        com.tencent.mm.plugin.aa.ui.AAQueryListUI aAQueryListUI = this.f72620b;
        if (!K0) {
            aAQueryListUI.f72451r = (java.lang.String) cVar.a(1);
        }
        if (this.f72619a) {
            ((java.util.ArrayList) aAQueryListUI.f72445i.f72861d).clear();
        }
        com.tencent.mm.plugin.aa.ui.w wVar = aAQueryListUI.f72445i;
        wVar.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListAdapter", "addNewRecord: %s", list);
        if (list.size() > 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListAdapter", "addNewRecord size: %s", java.lang.Integer.valueOf(list.size()));
            ((java.util.ArrayList) wVar.f72861d).addAll(list);
            wVar.notifyDataSetChanged();
        }
        android.app.Dialog dialog = aAQueryListUI.f72446m;
        if (dialog != null) {
            dialog.dismiss();
            aAQueryListUI.f72446m = null;
        }
        if (aAQueryListUI.f72444h.getVisibility() != 0) {
            aAQueryListUI.f72444h.setVisibility(0);
        }
        aAQueryListUI.f72447n = false;
        if (!((java.lang.Boolean) cVar.a(2)).booleanValue()) {
            aAQueryListUI.f72448o = true;
        }
        if (aAQueryListUI.f72444h.getFooterViewsCount() > 0) {
            aAQueryListUI.f72444h.removeFooterView(aAQueryListUI.f72449p);
        }
        if (aAQueryListUI.f72448o) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(aAQueryListUI.f72451r)) {
                com.tencent.mars.xlog.Log.i("MicroMsg.AAQueryListUI", "empty h5 url!");
                aAQueryListUI.f72450q.setVisibility(8);
            } else {
                android.widget.TextView bottomLinkTv = aAQueryListUI.f72450q.getBottomLinkTv();
                bottomLinkTv.setClickable(true);
                bottomLinkTv.setOnTouchListener(new com.tencent.mm.pluginsdk.ui.span.y0(aAQueryListUI));
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(aAQueryListUI.getString(com.tencent.mm.R.string.f489733a6));
                spannableStringBuilder.setSpan(new com.tencent.mm.plugin.aa.ui.b(new com.tencent.mm.plugin.aa.ui.f0(aAQueryListUI)), 0, spannableStringBuilder.length(), 18);
                bottomLinkTv.setText(spannableStringBuilder);
            }
            if (aAQueryListUI.f72450q.getVisibility() == 0) {
                aAQueryListUI.f72444h.addFooterView(aAQueryListUI.f72450q, null, false);
            }
        }
        return null;
    }
}
