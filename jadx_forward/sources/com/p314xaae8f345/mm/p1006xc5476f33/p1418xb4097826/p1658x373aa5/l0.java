package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class l0 implements zy2.gc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 f214068d;

    public l0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 o0Var) {
        this.f214068d = o0Var;
    }

    @Override // zy2.gc
    public void r5(java.lang.Object obj, r45.ix0 ret) {
        r45.kh2 req = (r45.kh2) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ret, "ret");
        int m75939xb282bd08 = ret.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.o0 o0Var = this.f214068d;
        if (m75939xb282bd08 == 0) {
            o0Var.f214288f.f492236d.u0().m76106x1d32ee50(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentMenuItemSelectListener", "comment black list succ");
            int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
            android.content.Context context = o0Var.f214286d;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
            e4Var.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
            e4Var.f293309c = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1s);
            e4Var.c();
            return;
        }
        o0Var.f214288f.f492236d.u0().m76106x1d32ee50(1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CommentMenuItemSelectListener", "comment black list failed:" + ret.m75939xb282bd08(1));
        int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        android.content.Context context2 = o0Var.f214286d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
        e4Var2.b(com.p314xaae8f345.mm.R.raw.f79676xdf4900bc);
        e4Var2.f293309c = context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f1t);
        e4Var2.c();
    }
}
