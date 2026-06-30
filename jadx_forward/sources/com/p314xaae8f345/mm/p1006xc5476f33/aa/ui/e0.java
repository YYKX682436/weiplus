package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public class e0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f154152a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a f154153b;

    public e0(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a, boolean z17) {
        this.f154153b = activityC11342x8f12a65a;
        this.f154152a = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        nm5.c cVar = (nm5.c) obj;
        java.util.List list = (java.util.List) cVar.a(0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "record list size: %s, h5Url: %s, lastFlag: %s", java.lang.Integer.valueOf(list.size()), cVar.a(1), cVar.a(2));
        boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0((java.lang.String) cVar.a(1));
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11342x8f12a65a activityC11342x8f12a65a = this.f154153b;
        if (!K0) {
            activityC11342x8f12a65a.f153984r = (java.lang.String) cVar.a(1);
        }
        if (this.f154152a) {
            ((java.util.ArrayList) activityC11342x8f12a65a.f153978i.f154394d).clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.w wVar = activityC11342x8f12a65a.f153978i;
        wVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListAdapter", "addNewRecord: %s", list);
        if (list.size() > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListAdapter", "addNewRecord size: %s", java.lang.Integer.valueOf(list.size()));
            ((java.util.ArrayList) wVar.f154394d).addAll(list);
            wVar.notifyDataSetChanged();
        }
        android.app.Dialog dialog = activityC11342x8f12a65a.f153979m;
        if (dialog != null) {
            dialog.dismiss();
            activityC11342x8f12a65a.f153979m = null;
        }
        if (activityC11342x8f12a65a.f153977h.getVisibility() != 0) {
            activityC11342x8f12a65a.f153977h.setVisibility(0);
        }
        activityC11342x8f12a65a.f153980n = false;
        if (!((java.lang.Boolean) cVar.a(2)).booleanValue()) {
            activityC11342x8f12a65a.f153981o = true;
        }
        if (activityC11342x8f12a65a.f153977h.getFooterViewsCount() > 0) {
            activityC11342x8f12a65a.f153977h.removeFooterView(activityC11342x8f12a65a.f153982p);
        }
        if (activityC11342x8f12a65a.f153981o) {
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(activityC11342x8f12a65a.f153984r)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AAQueryListUI", "empty h5 url!");
                activityC11342x8f12a65a.f153983q.setVisibility(8);
            } else {
                android.widget.TextView m48626xdabc309d = activityC11342x8f12a65a.f153983q.m48626xdabc309d();
                m48626xdabc309d.setClickable(true);
                m48626xdabc309d.setOnTouchListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.y0(activityC11342x8f12a65a));
                android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(activityC11342x8f12a65a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571266a6));
                spannableStringBuilder.setSpan(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.b(new com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.f0(activityC11342x8f12a65a)), 0, spannableStringBuilder.length(), 18);
                m48626xdabc309d.setText(spannableStringBuilder);
            }
            if (activityC11342x8f12a65a.f153983q.getVisibility() == 0) {
                activityC11342x8f12a65a.f153977h.addFooterView(activityC11342x8f12a65a.f153983q, null, false);
            }
        }
        return null;
    }
}
