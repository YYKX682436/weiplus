package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class eh extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f193945d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh f193946e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ jz5.o f193947f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar, jz5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f193946e = khVar;
        this.f193947f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh(this.f193946e, this.f193947f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.eh) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Boolean bool;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f193945d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh khVar = this.f193946e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            fl2.e eVar = khVar.f194779t;
            this.f193945d = 1;
            if (eVar.b(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.widget.TextView textView = khVar.f194780u;
        if (textView != null) {
            bool = java.lang.Boolean.valueOf(textView.getVisibility() == 0);
        } else {
            bool = null;
        }
        android.widget.TextView textView2 = khVar.f194780u;
        if (textView2 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(textView2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(textView2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.widget.TextView textView3 = khVar.f194778s;
        if (textView3 != null) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(textView3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(textView3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveCommonInfoPlugin$refreshViews$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bool, java.lang.Boolean.FALSE)) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((ml2.r0) c17).yk(1, (r13 & 2) != 0 ? null : null, (r13 & 4) != 0 ? null : null, (r13 & 8) != 0 ? null : null, (r13 & 16) != 0 ? null : null);
        }
        android.widget.TextView textView4 = khVar.f194780u;
        if (textView4 != null) {
            textView4.setText((java.lang.CharSequence) this.f193947f.f384376f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.kh.t1(khVar);
        return jz5.f0.f384359a;
    }
}
