package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab;

/* loaded from: classes10.dex */
public final class u implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 f236133a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f236134b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236135c;

    public u(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var, boolean z17, java.lang.String str) {
        this.f236133a = b0Var;
        this.f236134b = z17;
        this.f236135c = str;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.tab.b0 b0Var = this.f236133a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = b0Var.f235779o;
        if (u3Var != null && u3Var.isShowing()) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var2 = b0Var.f235779o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(u3Var2);
            u3Var2.dismiss();
        }
        if (b0Var.f235765a.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "activity.isFinishing");
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "reserve: cgi result: type = %s, code = %s", java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b));
        int i17 = fVar.f152148a;
        android.content.Context context = b0Var.f235777m;
        boolean z17 = this.f236134b;
        if (i17 != 0 || fVar.f152149b != 0) {
            java.lang.String string = z17 ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e1o) : context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e07);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            android.widget.Toast m123883x26a183b = db5.t7.m123883x26a183b(context, string, 0);
            m123883x26a183b.setGravity(17, 0, 0);
            m123883x26a183b.show();
            return java.lang.Boolean.TRUE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ContactBizHeaderLiveNoticeLogic", "cgi ok,  " + z17);
        java.lang.String finderUserName = this.f236135c;
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUserName, "$finderUserName");
            r45.mk mkVar = b0Var.f235778n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mkVar);
            java.lang.String notice_id = mkVar.f462132g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(notice_id, "notice_id");
            r45.h32 e17 = i1Var.e(finderUserName, notice_id);
            if (e17 != null) {
                e17.set(1, 0);
            }
            android.widget.Toast m123883x26a183b2 = db5.t7.m123883x26a183b(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.e0j), 0);
            m123883x26a183b2.setGravity(17, 0, 0);
            m123883x26a183b2.show();
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1 i1Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.i1.f189463a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(finderUserName, "$finderUserName");
            r45.mk mkVar2 = b0Var.f235778n;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mkVar2);
            java.lang.String notice_id2 = mkVar2.f462132g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(notice_id2, "notice_id");
            r45.h32 e18 = i1Var2.e(finderUserName, notice_id2);
            if (e18 != null) {
                e18.set(1, 1);
            }
            db5.t7.i(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn8), com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
        b0Var.e(z17);
        return java.lang.Boolean.TRUE;
    }
}
