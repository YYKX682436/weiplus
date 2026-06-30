package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes16.dex */
public final class ms {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f286135a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f286136b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f286137c;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f286138d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.LinearLayout f286139e;

    /* renamed from: f, reason: collision with root package name */
    public final b10.d f286140f;

    /* renamed from: g, reason: collision with root package name */
    public long f286141g;

    public ms(android.content.Context context, android.view.ViewGroup parent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f286135a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571188dz, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f286136b = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565681t65);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f286137c = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569324zj);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById2;
        this.f286138d = linearLayout;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f569323zi);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f286139e = (android.widget.LinearLayout) findViewById3;
        this.f286140f = new b10.d(linearLayout);
    }

    public final void a(bw5.x7 x7Var, java.lang.String str) {
        try {
            pq.a aVar = new pq.a(this.f286135a);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("encryptUserName", com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s.f147534a.a(str));
            aVar.b(jSONObject);
            ((r10.q) ((pq.q) i95.n0.c(pq.q.class))).wi(aVar, x7Var, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardWholeCtrl", e17, "ecsJump error", new java.lang.Object[0]);
        }
    }

    public final void b(java.lang.String str, java.lang.String str2) {
        try {
            bw5.x7 mo11468x92b714fd = new bw5.x7().mo11468x92b714fd(android.util.Base64.decode(str, 0));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.wechat.aff.proto.EcsJumpInfo");
            a(mo11468x92b714fd, str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.EcsKfProductCardWholeCtrl", e17, "ecsJumpFromBase64 error", new java.lang.Object[0]);
        }
    }

    public final void c(java.util.List list, java.util.List jumpInfos, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, java.lang.String str, long j17) {
        int i17;
        java.lang.String str2;
        b10.b bVar;
        java.lang.String str3;
        boolean isEmpty = list.isEmpty();
        java.lang.String str4 = "MicroMsg.EcsKfProductCardWholeCtrl";
        android.widget.LinearLayout linearLayout = this.f286138d;
        if (isEmpty) {
            linearLayout.setVisibility(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.EcsKfProductCardWholeCtrl", "renderProductItems: no product rendered, msgSvrId=" + j17);
            return;
        }
        linearLayout.setVisibility(0);
        c00.u3 u3Var = (c00.u3) i95.n0.c(c00.u3.class);
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ls lsVar = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ls(list, u3Var, f9Var, this, str);
        b10.d dVar = this.f286140f;
        dVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfos, "jumpInfos");
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(android.os.Looper.myLooper(), android.os.Looper.getMainLooper())) {
            throw new java.lang.IllegalStateException(("EcsKfProductCardListController.bind must be called on main thread, actual=" + java.lang.Thread.currentThread().getName()).toString());
        }
        if (!(list.size() == jumpInfos.size())) {
            throw new java.lang.IllegalArgumentException(("shareObjects/jumpInfos size mismatch: " + list.size() + " vs " + jumpInfos.size()).toString());
        }
        int size = list.size();
        android.widget.LinearLayout linearLayout2 = dVar.f98554a;
        int childCount = linearLayout2.getChildCount();
        if (childCount > 0 && !(linearLayout2.getChildAt(0) instanceof com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447)) {
            linearLayout2.removeAllViews();
            childCount = 0;
        }
        java.util.ArrayDeque arrayDeque = dVar.f98556c;
        if (size == 0) {
            dVar.c(0);
            linearLayout2.setVisibility(8);
            bVar = new b10.b(0, 0, 0, arrayDeque.size());
            str2 = "MicroMsg.EcsKfProductCardWholeCtrl";
        } else {
            linearLayout2.setVisibility(0);
            if (childCount > size) {
                dVar.c(size);
                childCount = size;
            }
            int i18 = 0;
            while (true) {
                i17 = dVar.f98555b;
                if (i18 >= childCount) {
                    break;
                }
                android.view.View childAt = linearLayout2.getChildAt(i18);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(childAt, "null cannot be cast to non-null type com.tencent.mm.feature.ecs.kfproductcard.view.EcsKfProductCardItemView");
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447 c10533xd4db2447 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447) childAt;
                android.view.ViewGroup.LayoutParams layoutParams = c10533xd4db2447.getLayoutParams();
                android.widget.LinearLayout.LayoutParams layoutParams2 = layoutParams instanceof android.widget.LinearLayout.LayoutParams ? (android.widget.LinearLayout.LayoutParams) layoutParams : null;
                if (layoutParams2 == null) {
                    str3 = str4;
                    layoutParams2 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                } else {
                    str3 = str4;
                }
                int i19 = i18 == 0 ? 0 : i17;
                if ((layoutParams2 == layoutParams && layoutParams2.topMargin == i19) ? false : true) {
                    layoutParams2.topMargin = i19;
                    c10533xd4db2447.setLayoutParams(layoutParams2);
                }
                dVar.a(c10533xd4db2447, (bw5.u8) list.get(i18), (bw5.x7) jumpInfos.get(i18), lsVar);
                i18++;
                str4 = str3;
            }
            str2 = str4;
            int i27 = childCount;
            int i28 = 0;
            int i29 = 0;
            while (i27 < size) {
                com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447 c10533xd4db24472 = (com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447) arrayDeque.poll();
                if (c10533xd4db24472 != null) {
                    i28++;
                } else {
                    android.content.Context context = linearLayout2.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    c10533xd4db24472 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p726x68a9d444.p727x373aa5.C10533xd4db2447(context, null, 0, 6, null);
                    i29++;
                }
                int i37 = size;
                android.widget.LinearLayout.LayoutParams layoutParams3 = new android.widget.LinearLayout.LayoutParams(-1, -2);
                layoutParams3.topMargin = i27 == 0 ? 0 : i17;
                linearLayout2.addView(c10533xd4db24472, layoutParams3);
                dVar.a(c10533xd4db24472, (bw5.u8) list.get(i27), (bw5.x7) jumpInfos.get(i27), lsVar);
                i27++;
                size = i37;
            }
            bVar = new b10.b(childCount, i28, i29, arrayDeque.size());
        }
        int childCount2 = linearLayout.getChildCount();
        for (int i38 = 0; i38 < childCount2; i38++) {
            android.view.View childAt2 = linearLayout.getChildAt(i38);
            if (childAt2 != null) {
                ((b00.a0) u3Var).a(childAt2, f9Var, "ecs_kf_card_template_product_item", i38);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "renderProductItems: msgSvrId=" + j17 + " count=" + list.size() + " reused=" + bVar.f98547a + " fromPool=" + bVar.f98548b + " new=" + bVar.f98549c + " poolSize=" + bVar.f98550d);
    }
}
