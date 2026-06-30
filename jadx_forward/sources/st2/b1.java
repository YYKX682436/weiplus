package st2;

/* loaded from: classes3.dex */
public final class b1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f493759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ st2.h1 f493760e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f493761f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(xg2.h hVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57, st2.h1 h1Var, boolean z17) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493759d = hVar;
        this.f493760e = h1Var;
        this.f493761f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.b1(this.f493759d, interfaceC29045xdcb5ca57, this.f493760e, this.f493761f);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        st2.b1 b1Var = (st2.b1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        b1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        st2.h1 h1Var = this.f493760e;
        int w07 = h1Var.f493870h.w0();
        boolean z17 = this.f493761f;
        if (w07 == 0 || h1Var.v(z17)) {
            if (h1Var.v(z17)) {
                h1Var.L();
            }
            h1Var.o().setVisibility(0);
            h1Var.l().setVisibility(8);
            android.view.View t17 = h1Var.k().t();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(t17, arrayList.toArray(), "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            t17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(t17, "com/tencent/mm/plugin/finder/shopping/FinderLiveShoppingListInternal", "onGetShoppingListFail", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            h1Var.q().setVisibility(8);
            ut2.a4 a4Var = h1Var.f493878r;
            if (a4Var != null) {
                a4Var.b(false, h1Var.w(), false);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "onGetShoppingListFail");
            h1Var.k().e();
        }
        return jz5.f0.f384359a;
    }
}
