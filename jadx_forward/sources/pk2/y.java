package pk2;

/* loaded from: classes3.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437912d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f437913e;

    /* renamed from: f, reason: collision with root package name */
    public int f437914f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ boolean f437915g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437916h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f437917i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk2.d0 f437918m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc f437919n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ boolean f437920o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437921p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(android.view.View view, boolean z17, pk2.d0 d0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15371xf336b8cc c15371xf336b8cc, boolean z18, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437916h = view;
        this.f437917i = z17;
        this.f437918m = d0Var;
        this.f437919n = c15371xf336b8cc;
        this.f437920o = z18;
        this.f437921p = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.y yVar = new pk2.y(this.f437916h, this.f437917i, this.f437918m, this.f437919n, this.f437920o, this.f437921p, interfaceC29045xdcb5ca57);
        yVar.f437915g = ((java.lang.Boolean) obj).booleanValue();
        return yVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.y) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        int i17;
        pz5.a aVar = pz5.a.f440719d;
        int i18 = this.f437914f;
        if (i18 != 0) {
            if (i18 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            return obj;
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f437915g;
        android.view.View view = this.f437916h;
        pk2.d0 d0Var = this.f437918m;
        if (z17 && this.f437917i) {
            d0Var.w(1, this.f437919n.f292896x ? 1 : 2, !this.f437920o ? 1 : 0);
            i17 = 0;
        } else {
            i17 = 8;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/AnchorCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        qk2.f.f(d0Var, false, 1, null);
        pk2.o9 o9Var = this.f437921p;
        this.f437912d = o9Var;
        this.f437913e = d0Var;
        this.f437915g = z17;
        this.f437914f = 1;
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar.k();
        o9Var.i(8, !z17, d0Var.n(), new pk2.x(z17, d0Var, o9Var, new v65.n(rVar)));
        java.lang.Object j17 = rVar.j();
        return j17 == aVar ? aVar : j17;
    }
}
