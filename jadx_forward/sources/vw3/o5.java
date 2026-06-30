package vw3;

/* loaded from: classes.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vw3.q5 f522586d;

    public o5(vw3.q5 q5Var) {
        this.f522586d = q5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.text.Editable text;
        java.lang.String obj;
        vw3.n nVar;
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vw3.q5 q5Var = this.f522586d;
        android.widget.EditText editText = q5Var.f522621m;
        if (editText != null && (text = editText.getText()) != null && (obj = text.toString()) != null && (nVar = q5Var.f522620i) != null) {
            ix3.g3 g3Var = (ix3.g3) nVar;
            r45.dp5 dp5Var = g3Var.f376958d;
            java.util.List list = g3Var.f376955a;
            if (list != null) {
                java.lang.String str2 = (java.lang.String) list.get(list.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f104252a;
                            java.lang.String m75945x2fec8307 = dp5Var.m75945x2fec8307(0);
                            o1Var.p(m75945x2fec8307 != null ? m75945x2fec8307 : "", obj);
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            bm5.o1 o1Var2 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83072 = dp5Var.m75945x2fec8307(0);
                            str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
                            java.lang.Integer h17 = r26.h0.h(obj);
                            o1Var2.p(str, java.lang.Integer.valueOf(h17 != null ? h17.intValue() : 0));
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            bm5.o1 o1Var3 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83073 = dp5Var.m75945x2fec8307(0);
                            str = m75945x2fec83073 != null ? m75945x2fec83073 : "";
                            java.lang.Long j17 = r26.h0.j(obj);
                            o1Var3.p(str, java.lang.Long.valueOf(j17 != null ? j17.longValue() : 0L));
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            bm5.o1 o1Var4 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83074 = dp5Var.m75945x2fec8307(0);
                            str = m75945x2fec83074 != null ? m75945x2fec83074 : "";
                            java.lang.Float f17 = r26.g0.f(obj);
                            o1Var4.p(str, java.lang.Float.valueOf(f17 != null ? f17.floatValue() : 0.0f));
                            break;
                        }
                        break;
                }
            }
            ex3.e eVar = g3Var.f376956b;
            ex3.e eVar2 = (ex3.e) eVar.y0();
            eVar2.f338743g = obj;
            ix3.j3 j3Var = g3Var.f376957c;
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = j3Var.f376999d;
            if (c16718x7059cefe != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, eVar2, false, 2, null);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a c5908xe7a9688a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a();
            am.uq uqVar = c5908xe7a9688a.f136212g;
            uqVar.f89658a = 1;
            uqVar.f89659b = dp5Var.m75945x2fec8307(0);
            uqVar.f89660c = obj;
            c5908xe7a9688a.e();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = j3Var.m158354x19263085();
            r45.dp5 item = eVar.f338742f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            if (item.m75939xb282bd08(4) == 1) {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(activity);
                u1Var.g("需要重启微信才可以使设置生效！");
                u1Var.a(true);
                u1Var.b(new ex3.a(activity));
                u1Var.q(false);
            }
        }
        q5Var.dismiss();
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/RepairerSetValueDialog$initContentView$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
