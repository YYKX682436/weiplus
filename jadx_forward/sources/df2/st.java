package df2;

/* loaded from: classes3.dex */
public final class st implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.wt f312905d;

    public st(df2.wt wtVar) {
        this.f312905d = wtVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        r45.e32 e32Var = (r45.e32) obj;
        jz5.f0 f0Var = null;
        if (e32Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            df2.wt wtVar = this.f312905d;
            java.lang.String str4 = ((mm2.c1) wtVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
            r45.h32 h32Var = (r45.h32) e32Var.m75936x14adae67(1);
            if (h32Var == null || (str = h32Var.m75945x2fec8307(4)) == null) {
                str = "";
            }
            r45.h32 e17 = i1Var.e(str4, str);
            if (e17 == null) {
                e17 = (r45.h32) e32Var.m75936x14adae67(1);
            }
            if (e17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("LiveReserveNoticeGuideController", "observe: error, noticeInfo is null");
                return;
            }
            if (e17.m75939xb282bd08(1) == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveReserveNoticeGuideController", "observe: notice has been reserved");
                return;
            }
            if (wtVar.f313247t) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", "observe: bubble has shown once, noticeId=" + e17.m75945x2fec8307(4));
                return;
            }
            java.lang.String str5 = ((mm2.c1) wtVar.m56788xbba4bfc0(mm2.c1.class)).f410385o;
            r45.h32 h32Var2 = (r45.h32) e32Var.m75936x14adae67(1);
            if (h32Var2 == null || (str2 = h32Var2.m75945x2fec8307(4)) == null) {
                str2 = "";
            }
            r45.h32 e18 = i1Var.e(str5, str2);
            if (e18 != null) {
                e18.set(1, java.lang.Integer.valueOf(e17.m75939xb282bd08(1)));
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBubble: noticeId=");
            r45.h32 h32Var3 = (r45.h32) e32Var.m75936x14adae67(1);
            sb6.append(h32Var3 != null ? h32Var3.m75945x2fec8307(4) : null);
            sb6.append(", notice_starttime_type=");
            r45.h32 h32Var4 = (r45.h32) e32Var.m75936x14adae67(1);
            sb6.append(h32Var4 != null ? java.lang.Integer.valueOf(h32Var4.m75939xb282bd08(20)) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", sb6.toString());
            if (zl2.r4.F1(wtVar.getStore().getLiveRoomData())) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", "showBubble: skip in co-live");
            } else {
                r45.h32 h32Var5 = (r45.h32) e32Var.m75936x14adae67(1);
                if (h32Var5 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LiveReserveNoticeGuideController", "showBubble: notice info is null");
                } else {
                    wtVar.k7(wtVar);
                    java.lang.String m75945x2fec8307 = h32Var5.m75945x2fec8307(4);
                    wtVar.o7(1, m75945x2fec8307 != null ? m75945x2fec8307 : "");
                    wtVar.p7(false);
                    zl2.q4 q4Var = zl2.q4.f555466a;
                    long m75939xb282bd08 = h32Var5.m75939xb282bd08(0) * 1000;
                    int i17 = new java.util.GregorianCalendar().get(6);
                    java.util.Calendar calendar = java.util.Calendar.getInstance();
                    calendar.setTime(new java.util.Date(m75939xb282bd08));
                    int i18 = calendar.get(6);
                    java.lang.CharSequence p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.w2.p(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, m75939xb282bd08);
                    int i19 = i17 - i18;
                    if (i19 == -2) {
                        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573673fd1) + ((java.lang.Object) p17);
                    } else if (i19 == -1) {
                        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fda) + ((java.lang.Object) p17);
                    } else if (i19 != 0) {
                        str3 = android.text.format.DateFormat.format(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.g(com.p314xaae8f345.mm.R.C30867xcad56011.f573668fc2), m75939xb282bd08).toString();
                    } else {
                        str3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.fd_) + ((java.lang.Object) p17);
                    }
                    android.view.View view = wtVar.f311503m;
                    android.widget.TextView textView = view != null ? (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ruf) : null;
                    if (textView != null) {
                        textView.setText(h32Var5.m75939xb282bd08(20) == 1 ? wtVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mo9) : wtVar.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mo7, str3));
                    }
                    wtVar.h7(new df2.tt(wtVar, h32Var5));
                    wtVar.g7(new df2.ut(wtVar, h32Var5, e32Var));
                    java.lang.Integer valueOf = java.lang.Integer.valueOf(e32Var.m75939xb282bd08(2));
                    if (!(valueOf.intValue() > 0)) {
                        valueOf = null;
                    }
                    long intValue = valueOf != null ? valueOf.intValue() : 30000;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var = wtVar.f313245r;
                    if (r2Var != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
                    }
                    wtVar.f313245r = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(wtVar, null, null, new df2.vt(intValue, wtVar, null), 3, null);
                }
            }
            wtVar.f313247t = true;
            f0Var = jz5.f0.f384359a;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveReserveNoticeGuideController", "observe: post null");
        }
    }
}
