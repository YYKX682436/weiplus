package pk2;

/* loaded from: classes3.dex */
public final class c5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f437139d;

    /* renamed from: e, reason: collision with root package name */
    public int f437140e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ boolean f437141f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pk2.h5 f437142g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437143h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f437144i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437145m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(pk2.h5 h5Var, android.view.View view, boolean z17, pk2.o9 o9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f437142g = h5Var;
        this.f437143h = view;
        this.f437144i = z17;
        this.f437145m = o9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        pk2.c5 c5Var = new pk2.c5(this.f437142g, this.f437143h, this.f437144i, this.f437145m, interfaceC29045xdcb5ca57);
        c5Var.f437141f = ((java.lang.Boolean) obj).booleanValue();
        return c5Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pk2.c5) mo148xaf65a0fc(java.lang.Boolean.valueOf(((java.lang.Boolean) obj).booleanValue()), (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f437140e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = this.f437141f;
            qk2.f.f(this.f437142g, false, 1, null);
            android.view.View view = this.f437143h;
            int i18 = (z17 && this.f437144i) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/moreaction/AssistantCommentOption$addItem$1$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            pk2.o9 o9Var = this.f437145m;
            this.f437139d = o9Var;
            this.f437141f = z17;
            this.f437140e = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            o9Var.i(8, !z17, true, new pk2.b5(z17, o9Var, new v65.n(rVar)));
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
