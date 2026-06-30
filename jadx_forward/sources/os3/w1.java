package os3;

/* loaded from: classes8.dex */
public class w1 extends ks3.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a f429774a;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a) {
        this.f429774a = activityC16934xe33e503a;
    }

    @Override // ks3.y
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailAddrListUI", "sync addr complete");
        com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16934xe33e503a activityC16934xe33e503a = this.f429774a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = activityC16934xe33e503a.f236403d;
        if (u3Var != null) {
            u3Var.dismiss();
        }
        java.util.List e17 = activityC16934xe33e503a.f236406g.e(null);
        activityC16934xe33e503a.f236408i = e17;
        if (e17.size() == 0) {
            activityC16934xe33e503a.f236404e.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ixb);
            activityC16934xe33e503a.f236404e.setVisibility(0);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(activityC16934xe33e503a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.hjk));
        sb6.append(((java.util.HashMap) activityC16934xe33e503a.f236407h.f429611e).size() > 0 ? "(" + ((java.util.HashMap) activityC16934xe33e503a.f236407h.f429611e).size() + ")" : "");
        activityC16934xe33e503a.mo54450xbf7c1df6(sb6.toString());
        java.lang.String[] stringArrayExtra = activityC16934xe33e503a.getIntent().getStringArrayExtra("INIT_SELECTED_ADDRS_INTENT_EXTRA");
        if (stringArrayExtra != null) {
            java.util.HashSet hashSet = new java.util.HashSet();
            for (java.lang.String str : stringArrayExtra) {
                java.lang.String[] split = str.split(" ");
                if (split.length == 2) {
                    hashSet.add(split[1]);
                }
            }
            for (ks3.u uVar : activityC16934xe33e503a.f236408i) {
                if (hashSet.contains(uVar.f393284f)) {
                    ((java.util.HashMap) activityC16934xe33e503a.f236407h.f429611e).put(uVar.f393284f, uVar);
                }
            }
        }
        activityC16934xe33e503a.f236407h.notifyDataSetChanged();
    }
}
