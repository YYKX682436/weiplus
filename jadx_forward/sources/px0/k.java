package px0;

/* loaded from: classes4.dex */
public final class k extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.d01 f440317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc f440318e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r45.d01 d01Var, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440317d = d01Var;
        this.f440318e = c10988x551cb0cc;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px0.k(this.f440317d, this.f440318e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        px0.k kVar = (px0.k) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        kVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleOnAIGCTaskCreate ");
        r45.d01 d01Var = this.f440317d;
        sb6.append(d01Var.m75945x2fec8307(1));
        sb6.append(" showLongWaitButton:");
        sb6.append(d01Var.m75939xb282bd08(5));
        sb6.append(" waitTime:");
        sb6.append(d01Var.m75939xb282bd08(6));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaterialImportPreviewFragment", sb6.toString());
        boolean z17 = d01Var.m75939xb282bd08(5) > 0;
        java.lang.String m75945x2fec8307 = d01Var.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.p908x9da2e250.C10988x551cb0cc c10988x551cb0cc = this.f440318e;
        c10988x551cb0cc.f151188s = m75945x2fec8307;
        android.view.View view = (android.view.View) c10988x551cb0cc.f151180h.mo141623x754a37bb();
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$handleOnAIGCTaskCreate$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/shoot_composing/fragment/MaterialImportPreviewFragment$handleOnAIGCTaskCreate$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        if (z17) {
            p3325xe03a0797.p3326xc267989b.l.d(c10988x551cb0cc.f151176d, null, null, new px0.j(c10988x551cb0cc, d01Var, null), 3, null);
        }
        return jz5.f0.f384359a;
    }
}
