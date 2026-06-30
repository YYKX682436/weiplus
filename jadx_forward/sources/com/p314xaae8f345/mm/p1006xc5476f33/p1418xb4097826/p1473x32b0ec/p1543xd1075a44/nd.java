package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class nd implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 f200709d;

    public nd(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2) {
        this.f200709d = c14396x9309a8f2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.C14396x9309a8f2 c14396x9309a8f2 = this.f200709d;
        boolean z17 = c14396x9309a8f2.f199142i;
        fg2.q qVar = c14396x9309a8f2.f199141h;
        if (z17) {
            yz5.l lVar = c14396x9309a8f2.f199139f;
            if (lVar != null) {
                lVar.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id(true, r26.n0.u0(qVar.f343785f.getText().toString()).toString(), r26.n0.u0(qVar.f343783d.getText().toString()).toString()));
            }
        } else {
            yz5.l lVar2 = c14396x9309a8f2.f199139f;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.id(false, r26.n0.u0(qVar.f343783d.getText().toString()).toString(), ""));
            }
        }
        c14396x9309a8f2.a();
        java.lang.String obj = r26.n0.u0((c14396x9309a8f2.f199142i ? qVar.f343785f : qVar.f343783d).getText().toString()).toString();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (obj == null) {
            obj = "";
        }
        java.lang.String b17 = fp.s0.b(obj, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        if (c14396x9309a8f2.fromScene == 1) {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("content", b17);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            ml2.y4 y4Var = ml2.j0.f409116i;
            y4Var.O = jSONObject2;
            ((ml2.j0) i95.n0.c(ml2.j0.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b17);
            ml2.k5 k5Var = y4Var.T;
            k5Var.getClass();
            k5Var.f409189c = b17;
            i95.m c17 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            zy2.zb zbVar = (zy2.zb) c17;
            ml2.c1 c1Var = ml2.c1.f408858e;
            zy2.zb.j5(zbVar, 8L, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            zy2.zb zbVar2 = (zy2.zb) c18;
            ml2.z4 z4Var = ml2.z4.T;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            ml2.e1[] e1VarArr = ml2.e1.f408906d;
            ml2.f1[] f1VarArr = ml2.f1.f408955d;
            jSONObject3.put("type", 3);
            jSONObject3.put("live_version", c14396x9309a8f2.f199142i ? 1 : 0);
            java.lang.String str = c14396x9309a8f2.f199143m;
            if (!(str == null || str.length() == 0)) {
                jSONObject3.put("ai_msg_id", c14396x9309a8f2.f199143m);
            }
            if (c14396x9309a8f2.f199142i) {
                jSONObject3.put("title_before", c14396x9309a8f2.f199144n);
                jSONObject3.put("title_after", r26.n0.u0(qVar.f343785f.getText().toString()).toString());
                jSONObject3.put("describe_before", c14396x9309a8f2.f199145o);
                jSONObject3.put("describe_after", r26.n0.u0(qVar.f343783d.getText().toString()).toString());
            } else {
                jSONObject3.put("title_before", c14396x9309a8f2.f199145o);
                jSONObject3.put("title_after", r26.n0.u0(qVar.f343783d.getText().toString()).toString());
                jSONObject3.put("describe_before", "");
                jSONObject3.put("describe_after", "");
            }
            zy2.zb.y6(zbVar2, z4Var, jSONObject3.toString(), null, 4, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/widget/FinderLiveDescEditView$show$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
