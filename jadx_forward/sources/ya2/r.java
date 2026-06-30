package ya2;

/* loaded from: classes.dex */
public final class r implements zy2.j9 {

    /* renamed from: a, reason: collision with root package name */
    public static final ya2.r f542058a = new ya2.r();

    /* JADX WARN: Multi-variable type inference failed */
    public void c(android.content.Context context, int i17, long j17, java.lang.String finderUsername, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        hb2.j0 j0Var = hb2.j0.f361593e;
        j0Var.getClass();
        p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
        if (yVar == null) {
            return;
        }
        hb2.i0 i0Var = new hb2.i0(callback, i17, context);
        if (i17 != 1) {
            j0Var.n(yVar, i17, j17, finderUsername, i0Var);
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, true);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570326ag3, (android.view.ViewGroup) null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f568867ob5)).setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mqt));
        k0Var.s(inflate, false);
        k0Var.f293405n = new hb2.g0(context);
        k0Var.f293414s = new hb2.h0(yVar, i17, j17, finderUsername, i0Var);
        k0Var.v();
    }

    public void d(int i17, java.util.LinkedList objIds, java.util.LinkedList collectionIds, zy2.gc gcVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(objIds, "objIds");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectionIds, "collectionIds");
        hb2.r rVar = hb2.r.f361618e;
        rVar.getClass();
        r45.li2 li2Var = new r45.li2();
        li2Var.set(0, java.lang.Integer.valueOf(i17));
        li2Var.set(1, objIds);
        li2Var.set(2, collectionIds);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.r.f361619f, "modifyPlayHistorySet op_type:" + li2Var.m75939xb282bd08(0));
        hb2.w0.m(rVar, li2Var, gcVar, false, false, null, null, 60, null);
    }

    public void e(int i17, int i18, long j17) {
        hb2.v vVar = hb2.v.f361635e;
        vVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("modifyTeenModeSetting: flag=");
        r26.a.a(2);
        java.lang.String l17 = java.lang.Long.toString(j17, 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(l17, "toString(...)");
        sb6.append(l17);
        sb6.append(", birthYear=");
        sb6.append(i17);
        sb6.append(", birthMonth=");
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.v.f361636f, sb6.toString());
        r45.qn2 qn2Var = new r45.qn2();
        qn2Var.set(0, java.lang.Integer.valueOf(i17));
        qn2Var.set(1, java.lang.Integer.valueOf(i18));
        qn2Var.set(2, java.lang.Long.valueOf(j17));
        hb2.w0.m(vVar, qn2Var, null, false, false, null, null, 60, null);
    }
}
