package te2;

/* loaded from: classes2.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ te2.a0 f500051e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.FrameLayout f500052f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f500053g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(te2.a0 a0Var, android.widget.FrameLayout frameLayout, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500051e = a0Var;
        this.f500052f = frameLayout;
        this.f500053g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new te2.x(this.f500051e, this.f500052f, this.f500053g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((te2.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500050d;
        te2.a0 a0Var = this.f500051e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveAllowanceGiftPagViewCallback", "#onPagAnimationStart scope launch");
            android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(this.f500052f, "translationX", (com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x / 2) - ym5.x.a(a0Var.f499377d.getContext(), 36.0f), 0.0f);
            ofFloat.setDuration(250L);
            ofFloat.start();
            android.view.View view = a0Var.f499377d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/component/FinderLiveAllowanceGiftPagViewCallback$onPagAnimationStart$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            this.f500050d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f500050d = 2;
        if (te2.a0.a(this.f500053g, a0Var, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
