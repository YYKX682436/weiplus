package we2;

/* loaded from: classes3.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public we2.a f526782b;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f526781a = java.util.Collections.synchronizedMap(new java.util.HashMap());

    /* renamed from: c, reason: collision with root package name */
    public int[] f526783c = new int[0];

    public final void a(android.content.Context context, bm2.h1 holder, dk2.zf msg, int i17, java.util.List payloads) {
        jz5.f0 f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        we2.o oVar = (we2.o) this.f526781a.get(java.lang.Integer.valueOf(msg.mo124533xfb85f7b0()));
        if (oVar != null) {
            holder.f103460e.m84183x1c5c5ff4(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561082ab0));
            boolean z17 = msg instanceof dk2.eg;
            if (!z17 || payloads.isEmpty()) {
                oVar.d(context, holder, msg, i17);
            } else {
                oVar.p(context, holder, msg, i17, payloads);
            }
            if (z17) {
                ((dk2.eg) msg).c(false);
            }
            f0Var = jz5.f0.f384359a;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveCommentItemConfig", "invalid type:" + msg.mo124533xfb85f7b0());
            android.view.View view = holder.f3639x46306858;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemConfig", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/msginterceptor/FinderLiveCommentItemConfig", "fillItem", "(Landroid/content/Context;Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;Lcom/tencent/mm/plugin/finder/live/model/IFinderLiveMsg;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }

    public final dk2.zf b(r45.ch1 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f526781a.get(java.lang.Integer.valueOf(msg.m75939xb282bd08(1)));
        if (oVar != null) {
            return oVar.e(msg);
        }
        return null;
    }

    public final dk2.zf c(r45.t12 msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f526781a.get(java.lang.Integer.valueOf(msg.m75939xb282bd08(3)));
        if (oVar != null) {
            return oVar.f(msg);
        }
        return null;
    }

    public final we2.a d() {
        we2.a aVar = this.f526782b;
        if (aVar != null) {
            return aVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("commentItemDependency");
        throw null;
    }

    public final yz5.l e(dk2.zf msg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        we2.o oVar = (we2.o) this.f526781a.get(java.lang.Integer.valueOf(msg.mo124533xfb85f7b0()));
        if (oVar != null) {
            return oVar.c(msg);
        }
        return null;
    }

    public final int[] f() {
        if (this.f526781a.isEmpty()) {
            return new int[0];
        }
        if (this.f526783c.length == this.f526781a.size()) {
            return this.f526783c;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Map map = this.f526781a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        synchronized (map) {
            java.util.Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(((java.util.Map.Entry) it.next()).getKey());
            }
        }
        int[] R0 = kz5.n0.R0(arrayList);
        this.f526783c = R0;
        return R0;
    }

    public final void g(we2.a dep) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dep, "dep");
        this.f526782b = dep;
        i(new fk2.y2(d()));
        i(new fk2.a(d()));
        i(new fk2.s(d()));
        i(new fk2.q(d()));
        i(new fk2.p(d()));
        i(new fk2.r(d()));
        i(new fk2.g0(d()));
        i(new fk2.n0(d()));
        i(new fk2.k1(d()));
        i(new fk2.s1(d()));
        i(new fk2.u1(d()));
        i(new fk2.a2(d()));
        i(new fk2.g2(d()));
        i(new fk2.l2(d()));
        i(new fk2.s2(d()));
        i(new fk2.o2(d(), false));
        i(new fk2.p2(d()));
        i(new fk2.h3(d()));
        i(new fk2.f2(d()));
        i(new fk2.k(d()));
        i(new fk2.r1(d()));
        i(new fk2.d1(d()));
        i(new fk2.h1(d()));
        i(new fk2.i0(d()));
        i(new fk2.i3(d()));
        i(new fk2.z0(d()));
        i(new fk2.y0(d()));
        i(new fk2.s0(d()));
        i(new fk2.i2(d()));
        i(new fk2.n(d()));
        i(new fk2.x2(d()));
        i(new fk2.v2(d()));
        i(new fk2.b(d()));
        i(new fk2.e1(d()));
        i(new fk2.q1(d()));
        i(new fk2.j0(d()));
        i(new fk2.h0(d()));
        i(new fk2.j1(d()));
        i(new fk2.p1(d()));
        i(new fk2.m0(d()));
    }

    public final void h() {
        java.util.Map map = this.f526781a;
        java.util.Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((we2.o) ((java.util.Map.Entry) it.next()).getValue()).o();
        }
        map.clear();
    }

    public final void i(we2.o oVar) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(oVar.n());
        java.util.Map map = this.f526781a;
        if (map.containsKey(valueOf)) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(map);
        map.put(java.lang.Integer.valueOf(oVar.n()), oVar);
    }
}
