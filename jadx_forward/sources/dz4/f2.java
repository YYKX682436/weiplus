package dz4;

/* loaded from: classes12.dex */
public final class f2 extends dz4.d2 {
    @Override // dz4.d2, dz4.z1
    public void a(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        o72.k4 oj6 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj();
        dz4.i iVar = context.f326789c;
        o72.r2 F = oj6.F(iVar.f326826d);
        r45.bq0 bq0Var = F != null ? F.f67640x5ab01132 : null;
        android.app.Activity activity = context.f326787a;
        if (bq0Var != null) {
            java.util.Iterator it = F.f67640x5ab01132.f452497f.iterator();
            while (it.hasNext()) {
                r45.gp0 gp0Var = (r45.gp0) it.next();
                if (gp0Var.I == 3 && (gp0Var.f456968s2 != 0 || gp0Var.V1 != 0)) {
                    h(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f572742om);
                    return;
                }
            }
        }
        long j17 = iVar.f326826d;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 32;
        z9Var.f90065e = j17;
        c5432x35bb364f.e();
        am.aa result = c5432x35bb364f.f135777h;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(result, "result");
        if (result.f87669c == null) {
            h(activity, com.p314xaae8f345.mm.R.C30867xcad56011.cck);
            return;
        }
        if (result.f87675i) {
            h(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f571242i);
            return;
        }
        if (result.f87667a != 0) {
            h(activity, com.p314xaae8f345.mm.R.C30867xcad56011.f571243j);
            return;
        }
        long h17 = ip.c.h();
        o72.r2 F2 = ((com.p314xaae8f345.mm.p1006xc5476f33.fav.o) ((o72.f5) i95.n0.c(o72.f5.class))).oj().F(iVar.f326826d);
        long j18 = F2 != null ? F2.f67637x73e2be56 : 0L;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeNoteFlutterForwardChatHelper", "checkIfOverTotalSizeLimit totalSize:" + j18);
        if (j18 > h17) {
            java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572765cf0, com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f0(h17));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            db5.e1.T(activity, string);
        } else {
            co.a a17 = com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.i3.f182693a.a(F);
            dc5.a aVar = a17 instanceof dc5.a ? (dc5.a) a17 : null;
            if (aVar != null) {
                i(context.f326787a, aVar, context.f326790d, iVar.f326823a, context.f326788b);
                o72.v2.d(iVar.f326826d, 1, 0);
            }
        }
    }

    @Override // dz4.z1
    public void b(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.app.Activity activity = context.f326787a;
        android.app.Dialog e17 = e(activity);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f c5432x35bb364f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5432x35bb364f();
        am.z9 z9Var = c5432x35bb364f.f135776g;
        z9Var.f90061a = 13;
        z9Var.f90068h = activity;
        z9Var.f90071k = context.f326790d;
        z9Var.f90072l = context.f326791e;
        z9Var.f90065e = context.f326789c.f326826d;
        z9Var.f90070j = new dz4.e2(e17, this, context);
        c5432x35bb364f.e();
    }

    @Override // dz4.z1
    public boolean c(dz4.g2 context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        return context.f326789c.f326823a == 2;
    }
}
