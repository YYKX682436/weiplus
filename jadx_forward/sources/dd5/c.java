package dd5;

/* loaded from: classes10.dex */
public final class c extends uc5.n {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.ThreadLocal f310629p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ad5.l0[] availableOperations) {
        super(availableOperations);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(availableOperations, "availableOperations");
        this.f310629p = new java.lang.ThreadLocal();
    }

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        y();
        android.view.View inflate = android.view.LayoutInflater.from(recyclerView.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.aia, (android.view.ViewGroup) recyclerView, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.mie);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f568828o70);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        zy2.b5 b5Var = new zy2.b5(inflate, (android.widget.CheckBox) findViewById, (android.widget.ImageView) findViewById2);
        android.view.View view = b5Var.f558884a;
        view.setTag(com.p314xaae8f345.mm.R.id.uhk, b5Var);
        return view;
    }

    @Override // uc5.n, in5.r
    public void g(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        super.g(recyclerView, adapter);
        java.lang.Object tag = recyclerView.getTag(com.p314xaae8f345.mm.R.id.uhs);
        dd5.b bVar = new dd5.b(tag instanceof uc5.f ? (uc5.f) tag : null);
        y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh ehVar = to2.a.f502473b;
        if (ehVar != null) {
            ehVar.j(recyclerView);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk zkVar = to2.a.f502474c;
        if (zkVar != null) {
            zkVar.j(recyclerView);
        }
        to2.a.f502473b = null;
        to2.a.f502474c = null;
        tu2.b bVar2 = new tu2.b();
        bVar2.f503664a = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh ehVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.eh(-1, bVar2, null, bVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk zkVar2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zk(-1, bVar2, null, bVar);
        ehVar2.g(recyclerView, adapter);
        zkVar2.g(recyclerView, adapter);
        to2.a.f502473b = ehVar2;
        to2.a.f502474c = zkVar2;
    }

    @Override // uc5.n, in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        dd5.a1 item = (dd5.a1) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.ThreadLocal threadLocal = this.f310629p;
        threadLocal.set(holder);
        try {
            super.h(holder, item, i17, i18, z17, list);
        } finally {
            threadLocal.remove();
        }
    }

    @Override // uc5.n, in5.r
    public void j(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        y();
        to2.a.f502472a.a(recyclerView);
        super.j(recyclerView);
    }

    @Override // uc5.n
    public java.lang.Object p(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        java.lang.Object tag = holder.f3639x46306858.getTag(com.p314xaae8f345.mm.R.id.uhk);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(tag, "null cannot be cast to non-null type com.tencent.mm.plugin.findersdk.api.FinderMsgHistoryGalleryMediaItemViews");
        return new dd5.a((zy2.b5) tag);
    }

    @Override // uc5.n
    public android.widget.CheckBox q(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        return binding.f310614a.f558885b;
    }

    @Override // uc5.n
    public android.view.View r(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        return binding.f310614a.f558884a;
    }

    @Override // uc5.n
    public void s(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        zy2.a5 a5Var;
        java.lang.Object obj2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck ckVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ck ckVar2;
        dd5.a binding = (dd5.a) obj;
        dd5.b1 b1Var = (dd5.b1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        in5.s0 s0Var = (in5.s0) this.f310629p.get();
        if (s0Var == null || b1Var == null || (a5Var = b1Var.f310624a) == null || (obj2 = a5Var.f558880a) == null) {
            return;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(s0Var.m8183xf806b362());
        if (!(valueOf.intValue() != -1)) {
            valueOf = null;
        }
        int intValue = valueOf != null ? valueOf.intValue() : 0;
        y();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = obj2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj2 : null;
        if (abstractC14490x69736cb5 == null || (ckVar = to2.a.f502473b) == null || (ckVar2 = to2.a.f502474c) == null) {
            return;
        }
        int h17 = abstractC14490x69736cb5.h();
        ((h17 == 4 || h17 == 3002 || h17 == 8 || h17 == 9) ? ckVar2 : ckVar).h(s0Var, abstractC14490x69736cb5, intValue, abstractC14490x69736cb5.h(), false, null);
    }

    @Override // uc5.n
    /* renamed from: t */
    public void h(in5.s0 holder, uc5.d dVar, int i17, int i18, boolean z17, java.util.List list) {
        dd5.a1 item = (dd5.a1) dVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        java.lang.ThreadLocal threadLocal = this.f310629p;
        threadLocal.set(holder);
        try {
            super.h(holder, item, i17, i18, z17, list);
        } finally {
            threadLocal.remove();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // uc5.n
    public void u(android.content.Context context, java.lang.Object obj, uc5.r0 r0Var) {
        xm3.t0 b17;
        dd5.b1 b1Var;
        zy2.a5 a5Var;
        dd5.a binding = (dd5.a) obj;
        dd5.b1 b1Var2 = (dd5.b1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        if (b1Var2 == null) {
            return;
        }
        uc5.r rVar = context instanceof uc5.r ? (uc5.r) context : null;
        if (rVar == null) {
            return;
        }
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null || (b17 = xm3.u0.b(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar).m7())) == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (uc5.l0 l0Var : b17.m82898xfb7e5820()) {
            if (l0Var instanceof uc5.h0) {
                uc5.d dVar = ((uc5.h0) l0Var).f508027d;
                if ((dVar instanceof dd5.a1) && (b1Var = (dd5.b1) ((dd5.a1) dVar).f508010e) != null && (a5Var = b1Var.f310624a) != null) {
                    arrayList.add(java.lang.Long.valueOf(a5Var.f558881b));
                }
            }
        }
        boolean isEmpty = arrayList.isEmpty();
        zy2.a5 a5Var2 = b1Var2.f310624a;
        if (isEmpty) {
            arrayList.add(java.lang.Long.valueOf(a5Var2.f558881b));
        }
        long j17 = a5Var2.f558881b;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(arrayList.indexOf(java.lang.Long.valueOf(j17)));
        java.lang.Integer num = valueOf.intValue() >= 0 ? valueOf : null;
        int intValue = num != null ? num.intValue() : 0;
        y();
        android.view.View anchorView = binding.f310614a.f558884a;
        long[] T0 = kz5.n0.T0(arrayList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorView, "anchorView");
        android.content.Intent intent = new android.content.Intent(activity, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14114xff3e44c.class);
        intent.putExtra("KEY_FEED_ID_LIST", T0);
        intent.putExtra("KEY_CENTER_FEED_ID", j17);
        intent.putExtra("KEY_CENTER_FEED_POS", intValue);
        intent.putExtra("KEY_COMMENT_SCENE", nd1.d1.f72919x366c91de);
        intent.putExtra("KEY_HAS_MORE", false);
        wa2.x.e(intent, anchorView, 0L, false, false, null, 30, null);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        android.app.Activity activity2 = activity;
        yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/FinderCommonFeatureService", "msgHistoryGalleryOpenLocalTimelineFromGallery", "(Landroid/app/Activity;Landroid/view/View;J[JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/FinderCommonFeatureService", "msgHistoryGalleryOpenLocalTimelineFromGallery", "(Landroid/app/Activity;Landroid/view/View;J[JII)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // uc5.n
    public java.lang.Object w(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        java.lang.String U1 = f9Var.U1();
        if (U1 == null) {
            return null;
        }
        if (!(!r26.n0.N(U1))) {
            U1 = null;
        }
        if (U1 == null) {
            return null;
        }
        zy2.b6 y17 = y();
        long m124847x74d37ac6 = f9Var.m124847x74d37ac6();
        java.lang.String Q0 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q0, "getTalker(...)");
        zy2.a5 Ok = ((c61.l7) y17).Ok(U1, m124847x74d37ac6, Q0);
        if (Ok == null) {
            return null;
        }
        long m124847x74d37ac62 = f9Var.m124847x74d37ac6();
        java.lang.String Q02 = f9Var.Q0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Q02, "getTalker(...)");
        return new dd5.b1(Ok, m124847x74d37ac62, Q02);
    }

    @Override // uc5.n
    public void x(java.lang.Object obj) {
        dd5.a binding = (dd5.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        zy2.b5 b5Var = binding.f310614a;
        b5Var.f558886c.setImageDrawable(new android.graphics.drawable.ColorDrawable(b5Var.f558884a.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b, null)));
    }

    public final zy2.b6 y() {
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        return (zy2.b6) c17;
    }
}
