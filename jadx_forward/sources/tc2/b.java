package tc2;

/* loaded from: classes2.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final in5.r f498670a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f498671b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f498672c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f498673d;

    public b(in5.r convert, java.util.List controllerTypeList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convert, "convert");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(controllerTypeList, "controllerTypeList");
        this.f498670a = convert;
        this.f498671b = controllerTypeList;
        this.f498672c = "Finder.ConvertControllerHandler";
        this.f498673d = new java.util.HashMap();
    }

    public final java.lang.Object a(in5.s0 holder, java.lang.Class ctrl) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ctrl, "ctrl");
        tc2.g c17 = c(holder);
        if (c17 != null) {
            return c17.b(ctrl);
        }
        return null;
    }

    public final void b(in5.s0 s0Var) {
        tc2.g c17 = c(s0Var);
        if (c17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f498672c, "destroyStore " + c17.hashCode());
            java.util.HashSet hashSet = c17.f498677d;
            java.util.Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((tc2.c) it.next()).X6();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("clear ");
            tc2.f fVar = c17.f498678e;
            sb6.append(fVar.size());
            sb6.append(", ");
            sb6.append(hashSet.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderFeedControllerStore", sb6.toString());
            try {
                hashSet.clear();
                fVar.clear();
            } catch (java.lang.Exception e17) {
                hc2.c.a(e17, "FinderFeedControllerStore clear");
            }
            c17.f498682i = null;
            c17.f498681h = null;
            c17.f498683m = null;
            this.f498673d.remove(s0Var);
        }
    }

    public final tc2.g c(in5.s0 s0Var) {
        return (tc2.g) this.f498673d.get(s0Var);
    }

    public final void d(in5.s0 holder, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 item, int i17, int i18, boolean z17, java.util.List list) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (z17) {
            tc2.g c17 = c(holder);
            if (c17 != null) {
                c17.f498681h = item;
                java.util.Iterator it = c17.f498677d.iterator();
                while (it.hasNext()) {
                    ((tc2.c) it.next()).R6(list);
                }
                return;
            }
            return;
        }
        tc2.g c18 = c(holder);
        java.lang.String str = this.f498672c;
        if (c18 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "createStore oldStore:" + c18.hashCode());
            b(holder);
        }
        tc2.g gVar = new tc2.g();
        gVar.f498683m = this.f498670a;
        gVar.f498682i = holder;
        gVar.f498681h = item;
        this.f498673d.put(holder, gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "createStore store:" + gVar.hashCode() + ", holder:" + holder.hashCode() + ", item:" + pm0.v.u(item.mo2128x1ed62e84()));
        java.util.Iterator it6 = this.f498671b.iterator();
        while (true) {
            boolean hasNext = it6.hasNext();
            hashSet = gVar.f498677d;
            if (!hasNext) {
                break;
            }
            java.lang.Class cls = (java.lang.Class) it6.next();
            hashSet.add((tc2.c) new p012xc85e97e9.p093xedfae76a.j1(gVar.getViewModel(), new tc2.d(gVar)).b(gVar.c(cls), cls));
        }
        java.util.Iterator it7 = hashSet.iterator();
        while (it7.hasNext()) {
            ((tc2.c) it7.next()).P6();
        }
    }

    public final void e(in5.s0 holder, android.view.View view, android.content.Intent intent) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f498677d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).S6(view, intent);
        }
    }

    public final void f(in5.s0 holder, int i17, int i18, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        tc2.g c17 = c(holder);
        if (c17 != null) {
            p3325xe03a0797.p3326xc267989b.y0 y0Var = c17.f498680g;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.z0.c(y0Var, null);
            }
            c17.f498680g = null;
            java.util.Iterator it = c17.f498677d.iterator();
            while (it.hasNext()) {
                ((tc2.c) it.next()).U6();
            }
        }
    }

    public final void g(in5.s0 holder, ec2.f ev6) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f498677d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).V6(ev6);
        }
    }

    public final void h(in5.s0 holder, ec2.f ev6) {
        java.util.HashSet hashSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        tc2.g c17 = c(holder);
        if (c17 == null || (hashSet = c17.f498677d) == null) {
            return;
        }
        java.util.Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ((tc2.c) it.next()).W6(ev6);
        }
    }
}
