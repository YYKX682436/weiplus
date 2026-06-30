package bm2;

/* loaded from: classes10.dex */
public final class c7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bm2.t6 f103355d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bm2.k7 f103356e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f103357f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hn2.d f103358g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c7(bm2.t6 t6Var, bm2.k7 k7Var, r45.yx1 yx1Var, hn2.d dVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f103355d = t6Var;
        this.f103356e = k7Var;
        this.f103357f = yx1Var;
        this.f103358g = dVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm2.c7(this.f103355d, this.f103356e, this.f103357f, this.f103358g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bm2.c7 c7Var = (bm2.c7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c7Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bm2.t6 t6Var = this.f103355d;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = t6Var.f103861s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22627xa933f8e4, "<get-btnProgress>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(c22627xa933f8e4, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        boolean z17 = false;
        c22627xa933f8e4.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(c22627xa933f8e4, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveRequestSongPlayListAdapter$bindSongItem$6$1$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = t6Var.f103854i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c22661xa3a2b3c0, "<get-btnRequestSong>(...)");
        bm2.k7 k7Var = this.f103356e;
        k7Var.getClass();
        r45.yx1 yx1Var = this.f103357f;
        boolean z18 = yx1Var.f472997m == 3;
        hn2.d dVar = this.f103358g;
        k7Var.K(c22661xa3a2b3c0, z18 && !dVar.c());
        android.widget.TextView textView = t6Var.f103862t;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(textView, "<get-tvHasReqeusted>(...)");
        if ((yx1Var.f472997m == 3) && dVar.c()) {
            z17 = true;
        }
        k7Var.K(textView, z17);
        return jz5.f0.f384359a;
    }
}
