package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class ej implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj f199794a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f199795b;

    public ej(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj gjVar, org.json.JSONObject jSONObject) {
        this.f199794a = gjVar;
        this.f199795b = jSONObject;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.util.LinkedList m75941xfb821914 = ((r45.m02) fVar.f152151d).m75941xfb821914(1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getRet_list(...)");
        r45.ix0 ix0Var = (r45.ix0) kz5.n0.Z(m75941xfb821914);
        java.lang.String m75945x2fec8307 = ix0Var != null ? ix0Var.m75945x2fec8307(2) : null;
        int i17 = fVar.f152148a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.gj gjVar = this.f199794a;
        if (i17 != 0 || fVar.f152149b != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivecommentListWidget", "errType = " + fVar.f152148a + ", errCode = " + fVar.f152149b + ", errMsg = " + fVar.f152150c);
            db5.t7.g(gjVar.f199981i.getContext(), gjVar.f199981i.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572970d33));
        } else if (m75945x2fec8307 != null) {
            gjVar.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.fj(m75945x2fec8307, gjVar));
            bm2.g3 g3Var = gjVar.f199987r;
            java.util.ArrayList arrayList = g3Var.f103441d;
            arrayList.clear();
            int i18 = g3Var.f103442e - 1;
            if (i18 >= 0) {
                int i19 = 0;
                while (true) {
                    arrayList.add("");
                    if (i19 == i18) {
                        break;
                    }
                    i19++;
                }
            }
            g3Var.m8146xced61ae5();
        } else {
            org.json.JSONObject jSONObject = this.f199795b;
            jSONObject.put("anchor_status", "2");
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f409924y0, jSONObject.toString(), null, 4, null);
            boolean z17 = gjVar.f199986q;
            android.view.View view = gjVar.f199981i;
            if (z17) {
                db5.t7.h(view.getContext(), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572969d32));
            } else {
                db5.t7.h(view.getContext(), view.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572968d31));
            }
            gjVar.b();
        }
        return jz5.f0.f384359a;
    }
}
