package ix3;

/* loaded from: classes.dex */
public final class f3 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.dp5 f376942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f376943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex3.e f376944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ix3.j3 f376945g;

    public f3(r45.dp5 dp5Var, java.util.List list, ex3.e eVar, ix3.j3 j3Var) {
        this.f376942d = dp5Var;
        this.f376943e = list;
        this.f376944f = eVar;
        this.f376945g = j3Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.dp5 dp5Var = this.f376942d;
        java.util.LinkedList m75941xfb821914 = dp5Var.m75941xfb821914(3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getValues(...)");
        java.lang.String str = (java.lang.String) kz5.n0.a0(m75941xfb821914, menuItem.getItemId());
        if (str != null) {
            java.util.List list = this.f376943e;
            if (list != null) {
                java.lang.String str2 = (java.lang.String) list.get(list.size() - 1);
                switch (str2.hashCode()) {
                    case -1808118735:
                        if (str2.equals("String")) {
                            bm5.o1 o1Var = bm5.o1.f104252a;
                            java.lang.String m75945x2fec8307 = dp5Var.m75945x2fec8307(0);
                            o1Var.p(m75945x2fec8307 != null ? m75945x2fec8307 : "", str);
                            break;
                        }
                        break;
                    case 73679:
                        if (str2.equals("Int")) {
                            bm5.o1 o1Var2 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83072 = dp5Var.m75945x2fec8307(0);
                            o1Var2.p(m75945x2fec83072 != null ? m75945x2fec83072 : "", java.lang.Integer.valueOf(java.lang.Integer.parseInt(str)));
                            break;
                        }
                        break;
                    case 2374300:
                        if (str2.equals("Long")) {
                            bm5.o1 o1Var3 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83073 = dp5Var.m75945x2fec8307(0);
                            o1Var3.p(m75945x2fec83073 != null ? m75945x2fec83073 : "", java.lang.Long.valueOf(java.lang.Long.parseLong(str)));
                            break;
                        }
                        break;
                    case 67973692:
                        if (str2.equals("Float")) {
                            bm5.o1 o1Var4 = bm5.o1.f104252a;
                            java.lang.String m75945x2fec83074 = dp5Var.m75945x2fec8307(0);
                            o1Var4.p(m75945x2fec83074 != null ? m75945x2fec83074 : "", java.lang.Float.valueOf(java.lang.Float.parseFloat(str)));
                            break;
                        }
                        break;
                }
            }
            ex3.e eVar = this.f376944f;
            ex3.e eVar2 = (ex3.e) eVar.y0();
            eVar2.f338743g = str;
            ix3.j3 j3Var = this.f376945g;
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe = j3Var.f376999d;
            if (c16718x7059cefe != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, eVar2, false, 2, null);
            }
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a c5908xe7a9688a = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5908xe7a9688a();
            am.uq uqVar = c5908xe7a9688a.f136212g;
            uqVar.f89658a = 1;
            uqVar.f89659b = dp5Var.m75945x2fec8307(0);
            uqVar.f89660c = str;
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
    }
}
