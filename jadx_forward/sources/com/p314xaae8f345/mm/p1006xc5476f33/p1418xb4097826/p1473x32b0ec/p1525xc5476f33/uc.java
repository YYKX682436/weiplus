package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class uc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f196082d;

    /* renamed from: e, reason: collision with root package name */
    public int f196083e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad f196084f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196084f = adVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uc(this.f196084f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.uc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar;
        r45.m70 a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f196083e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad adVar2 = this.f196084f;
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = ((mm2.g0) adVar2.P0(mm2.g0.class)).f410596g;
            if (gVar != null) {
                i95.m c17 = i95.n0.c(zy2.b6.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                android.content.Context context = adVar2.f446856d.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                this.f196082d = adVar2;
                this.f196083e = 1;
                obj = ((c61.l7) ((zy2.b6) c17)).kk(context, gVar, false, this);
                if (obj == aVar) {
                    return aVar;
                }
                adVar = adVar2;
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        adVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ad) this.f196082d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.zc5 zc5Var = (r45.zc5) obj;
        if (zc5Var != null && (a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i9.a(zc5Var)) != null) {
            android.widget.TextView textView = adVar.f193397t;
            if (textView != null) {
                textView.setTextSize(14.0f);
            }
            android.widget.TextView textView2 = adVar.f193397t;
            if (textView2 != null) {
                textView2.setAlpha(0.5f);
            }
            android.widget.TextView textView3 = adVar.f193396s;
            if (textView3 != null) {
                textView3.setVisibility(0);
            }
            android.widget.TextView textView4 = adVar.f193396s;
            if (textView4 != null) {
                textView4.setText(a17.m75945x2fec8307(1));
            }
            android.view.View view = adVar.f193395r;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$6", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveChargePayLazyPlugin$initView$6", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.widget.ImageView imageView = adVar.f193394q;
            if (imageView != null) {
                n11.a.b().g(a17.m75945x2fec8307(2), imageView);
            }
            android.widget.TextView textView5 = adVar.f193396s;
            if (textView5 != null) {
                int width = adVar.f446856d.getWidth();
                android.view.ViewGroup viewGroup = adVar.f193400w;
                textView5.setMaxWidth((width - (viewGroup != null ? viewGroup.getWidth() : 0)) - ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 72.0f));
            }
        }
        return jz5.f0.f384359a;
    }
}
