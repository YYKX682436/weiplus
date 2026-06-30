package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3;

/* loaded from: classes7.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 f161045d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f161046e;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var, int i17) {
        this.f161045d = m0Var;
        this.f161046e = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f161046e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.m0 m0Var = this.f161045d;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            m0Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("0", m0Var.f161055d.mo50593x74292566());
            android.content.Context context = m0Var.f161052a;
            intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d4w));
            intent.putExtra("extra_call_by_appbrand", true);
            intent.putExtra("extra_is_edit_page", true);
            java.util.ArrayList arrayList = m0Var.f161056e;
            intent.putExtra("extra_edit_avatar_id", ((fl1.h1) arrayList.get(i18)).f345319h);
            intent.putExtra("extra_edit_frefill_avatar_name", ((fl1.h1) arrayList.get(i18)).f345313b);
            intent.putExtra("extra_edit_frefill_avatar_icon", ((fl1.h1) arrayList.get(i18)).f345318g);
            boolean z17 = context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf;
            int i19 = m0Var.f161058g;
            if (z17) {
                j45.l.w((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i19, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.h0(m0Var, i18));
                return;
            } else {
                nf.g.a(context).f(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.i0(m0Var, i18));
                j45.l.v(context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i19);
                return;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.l lVar = m0Var.f161059h;
        m0Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WxaUserInfoListOperationController", "[deleteUser] index=" + i18);
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40080x23b734ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            android.content.Context context2 = m0Var.f161052a;
            db5.t7.m123883x26a183b(context2, context2.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572033wu), 1).show();
            if (lVar != null) {
                lVar.mo50612xb05099c3();
            }
            if (lVar != null) {
                lVar.a(false);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList2 = m0Var.f161056e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        arrayList3.remove(i18);
        java.lang.Object obj = arrayList2.get(i18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        fl1.h1 h1Var = (fl1.h1) obj;
        if (h1Var.f345319h == m0Var.f161057f.get()) {
            ((fl1.h1) arrayList3.get(0)).f345317f = true;
        }
        h1Var.f345317f = false;
        m0Var.e(arrayList3);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.c0(lVar));
        com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10754x630c9a2(h1Var.f345319h), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.b0.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.p1065xb29de3e3.e0(m0Var, i18, arrayList3, lVar));
    }
}
