package bg2;

/* loaded from: classes2.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.q6 f102112d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c f102113e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f102114f;

    public v5(bg2.q6 q6Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1493x38b81db3.p1496x373aa5.C14214xfa60143c c14214xfa60143c, android.content.Context context) {
        this.f102112d = q6Var;
        this.f102113e = c14214xfa60143c;
        this.f102114f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.LinkedList m75941xfb821914;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveNotInterestedController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.t1 t1Var = ml2.t1.K2;
        bg2.q6 q6Var = this.f102112d;
        zy2.zb.T8((zy2.zb) c17, t1Var, kz5.c1.l(new jz5.l("liveId", bg2.q6.Z6(q6Var)), new jz5.l("feedId", bg2.q6.Y6(q6Var)), new jz5.l("panel_sence", "1")), null, null, null, null, false, 124, null);
        bg2.a5 a5Var = (bg2.a5) q6Var.N6(bg2.a5.class);
        if ((a5Var == null || a5Var.a7(this.f102113e)) ? false : true) {
            if (q6Var.f101948g == null) {
                android.content.Context context = this.f102114f;
                dg2.m mVar = new dg2.m(context);
                q6Var.f101948g = mVar;
                java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.llt);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                mVar.f313842d = string;
                java.lang.String string2 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lmb);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                mVar.f313841c = string2;
                r45.vw0 vw0Var = q6Var.f101947f;
                java.util.LinkedList m75941xfb8219142 = vw0Var != null ? vw0Var.m75941xfb821914(2) : null;
                java.util.LinkedList linkedList = mVar.f313840b;
                linkedList.clear();
                if (m75941xfb8219142 != null) {
                    linkedList.addAll(m75941xfb8219142);
                }
                mVar.f313844f = new bg2.n6(q6Var, context);
                mVar.f313843e = new bg2.o6(q6Var);
                mVar.f313845g = bg2.p6.f101920d;
                mVar.c();
            } else {
                r45.vw0 vw0Var2 = q6Var.f101947f;
                if (vw0Var2 != null && (m75941xfb821914 = vw0Var2.m75941xfb821914(2)) != null) {
                    dg2.m mVar2 = q6Var.f101948g;
                    if (mVar2 != null) {
                        mVar2.b(m75941xfb821914);
                    }
                    dg2.m mVar3 = q6Var.f101948g;
                    if (mVar3 != null) {
                        mVar3.c();
                    }
                }
            }
            bg2.a5 a5Var2 = (bg2.a5) q6Var.N6(bg2.a5.class);
            if (a5Var2 != null) {
                a5Var2.d7();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(q6Var.f101946e, "toast already runing dismiss anim, can not open bottom sheet");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/convert/convertcontroller/LiveNotInterestedController$genToastView$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
