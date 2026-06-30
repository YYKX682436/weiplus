package f93;

/* loaded from: classes11.dex */
public class o1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 f341941d;

    public o1(com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12) {
        this.f341941d = activityC16168xac76ee12;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = this.f341941d;
        com.p314xaae8f345.mm.p2621x8fb0427b.d4 d4Var = activityC16168xac76ee12.f224756g;
        if (d4Var.f66584x284d1882) {
            activityC16168xac76ee12.W6(d4Var);
        } else {
            activityC16168xac76ee12.C = db5.e1.Q(activityC16168xac76ee12, activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC16168xac76ee12.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g8w), true, true, new f93.c1(activityC16168xac76ee12));
            c01.d9.e().g(new e93.c(d4Var.f66585x70ce48ca + ""));
        }
        if (activityC16168xac76ee12.F) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 2, 2);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(16097, 1, 2, 3);
        }
        java.lang.String str = activityC16168xac76ee12.f224760n;
        if (str != null) {
            int length = str.length();
            boolean z17 = false;
            int i18 = 0;
            while (true) {
                if (i18 >= length) {
                    z17 = true;
                    break;
                }
                int codePointAt = str.codePointAt(i18);
                if (!java.lang.Character.isWhitespace(codePointAt)) {
                    break;
                } else {
                    i18 += java.lang.Character.charCount(codePointAt);
                }
            }
            if (z17) {
                return;
            }
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put("view_id", "label_detele_confirm_btn");
            hashMap.put("label_business_type", java.lang.Integer.valueOf(activityC16168xac76ee12.f224761o));
            hashMap.put("label_select_sessionid", activityC16168xac76ee12.f224760n);
            hashMap.put("delete_cnt", 1);
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Cj("view_clk", activityC16168xac76ee12.m79335xcc101dd9(), hashMap, 33926);
        }
    }
}
