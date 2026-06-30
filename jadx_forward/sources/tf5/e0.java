package tf5;

/* loaded from: classes11.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f500506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 f500507e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500507e = c22342xca74f598;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tf5.e0(this.f500507e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf5.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.View rootView;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500506d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f500506d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(100L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        int i18 = com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598.S;
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2691xbb979bf4.C22342xca74f598 c22342xca74f598 = this.f500507e;
        android.view.View mo26077x4ff8c0f0 = c22342xca74f598.mo26077x4ff8c0f0(com.p314xaae8f345.mm.R.id.imk);
        if (mo26077x4ff8c0f0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(mo26077x4ff8c0f0, arrayList.toArray(), "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mo26077x4ff8c0f0.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(mo26077x4ff8c0f0, "com/tencent/mm/ui/contact/address/MvvmAddressUIFragment", "markLoadingGone", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434 c22293x1808c434 = new com.p314xaae8f345.mm.ui.p2690x38b72420.C22293x1808c434(c22342xca74f598.mo7438x76847179());
        c22293x1808c434.setLayoutParams(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2));
        com.p314xaae8f345.mm.ui.a4 a4Var = com.p314xaae8f345.mm.ui.a4.f278650a;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo78409x676b27cd = c22342xca74f598.mo78409x676b27cd();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo78409x676b27cd, "thisActivity(...)");
        if (a4Var.h(mo78409x676b27cd)) {
            c22293x1808c434.setBackgroundColor(c22342xca74f598.m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
            android.view.View m7474xfb86a31b = c22342xca74f598.m7474xfb86a31b();
            com.p314xaae8f345.mm.ui.C21389xb8f36d3b c21389xb8f36d3b = (m7474xfb86a31b == null || (rootView = m7474xfb86a31b.getRootView()) == null) ? null : (com.p314xaae8f345.mm.ui.C21389xb8f36d3b) rootView.findViewById(com.p314xaae8f345.mm.R.id.huj);
            if (c21389xb8f36d3b != null) {
                c22293x1808c434.setPadding(0, 0, 0, c21389xb8f36d3b.getHeight());
            }
        }
        in5.n0.P(c22342xca74f598.y0(), c22293x1808c434, c22293x1808c434.hashCode(), false, 4, null);
        c22342xca74f598.f288145y = c22293x1808c434;
        return jz5.f0.f384359a;
    }
}
