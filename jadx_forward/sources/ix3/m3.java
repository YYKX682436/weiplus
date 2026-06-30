package ix3;

/* loaded from: classes.dex */
public final class m3 implements in5.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.o3 f377029d;

    public m3(ix3.o3 o3Var) {
        this.f377029d = o3Var;
    }

    @Override // in5.u
    public boolean a(android.view.View itemView, android.view.MotionEvent event, in5.c cVar, int i17) {
        ex3.e item = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (event.getAction() != 0) {
            return false;
        }
        int rawX = (int) event.getRawX();
        ix3.o3 o3Var = this.f377029d;
        o3Var.f377051f = rawX;
        o3Var.f377052g = (int) event.getRawY();
        return false;
    }

    @Override // in5.u
    public void g(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e dataItem = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataItem, "dataItem");
        ix3.o3 o3Var = this.f377029d;
        o3Var.f377053h = dataItem;
        r45.dp5 dp5Var = dataItem.f338742f;
        int m75939xb282bd08 = dp5Var.m75939xb282bd08(2);
        if (m75939xb282bd08 == 1) {
            o3Var.m158354x19263085().startActivityForResult(new android.content.Intent(o3Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerGroupUI.class).putExtra("key_config_item_list", dp5Var.mo14344x5f01b1f6()), 1);
            return;
        }
        if (m75939xb282bd08 != 2) {
            if (m75939xb282bd08 == 3) {
                o3Var.m158354x19263085().startActivityForResult(new android.content.Intent(o3Var.m158354x19263085(), (java.lang.Class<?>) com.tencent.mm.plugin.repairer.ui.RepairerItemSettingUI.class).putExtra("key_config_item", dp5Var.mo14344x5f01b1f6()), 2);
                return;
            }
            if (m75939xb282bd08 != 4) {
                return;
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a c5908xe7a9688a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a();
            am.uq uqVar = c5908xe7a9688a.f136212g;
            uqVar.f89658a = 2;
            uqVar.f89659b = dp5Var.m75945x2fec8307(0);
            uqVar.f89660c = dataItem.f338743g;
            c5908xe7a9688a.e();
            java.lang.Object newInstance = java.lang.Class.forName(dp5Var.m75945x2fec8307(10)).getConstructors()[0].newInstance(new java.lang.Object[0]);
            q55.a aVar = newInstance instanceof q55.a ? (q55.a) newInstance : null;
            if (aVar != null) {
                aVar.h(o3Var.m158354x19263085());
                return;
            }
            android.widget.Toast.makeText(o3Var.m158354x19263085(), "初始化失败：className: " + dp5Var.m75945x2fec8307(10), 0).show();
            return;
        }
        java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getValues(...)");
        java.lang.String str = (java.lang.String) kz5.n0.Z(m75941xfb821914);
        java.util.LinkedList m75941xfb8219142 = dp5Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getValues(...)");
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(kz5.n0.a0(m75941xfb8219142, 1), "true");
        if (str != null) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerHonorRiskDebugUIC")) {
                android.content.Intent intent = new android.content.Intent();
                pf5.j0.a(intent, ix3.q2.class);
                intent.setClassName(o3Var.m158354x19263085(), "com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI");
                o3Var.m158354x19263085().startActivityForResult(intent, 0);
                return;
            }
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "RepairerFloatBallDebugUIC")) {
                android.content.Intent intent2 = new android.content.Intent();
                pf5.j0.a(intent2, ix3.l2.class);
                intent2.setClassName(o3Var.m158354x19263085(), "com.tencent.mm.plugin.repairer.ui.RepairerNormalContainerUI");
                o3Var.m158354x19263085().startActivityForResult(intent2, 0);
                return;
            }
            android.content.Intent intent3 = new android.content.Intent();
            lk5.s.e(intent3, b17);
            android.content.Intent className = intent3.setClassName(o3Var.m158354x19263085(), str);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(className, "setClassName(...)");
            o3Var.m158354x19263085().startActivityForResult(className, 0);
        }
    }

    @Override // in5.u
    public boolean v(android.view.View itemView, in5.c cVar, int i17) {
        ex3.e data = (ex3.e) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        ix3.o3 o3Var = this.f377029d;
        rl5.r rVar = o3Var.f377050e;
        if (rVar != null) {
            rVar.g(itemView, i17, 0L, new ix3.k3(o3Var, data, i17), new ix3.l3(o3Var, data, i17), o3Var.f377051f, o3Var.f377052g);
        }
        super.v(itemView, data, i17);
        return false;
    }
}
