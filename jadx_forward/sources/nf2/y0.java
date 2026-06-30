package nf2;

/* loaded from: classes2.dex */
public final class y0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f418358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f418359e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f418360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.a f418361g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, android.view.View view, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f418359e = c22789xd23e9a9b;
        this.f418360f = view;
        this.f418361g = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nf2.y0(this.f418359e, this.f418360f, this.f418361g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nf2.y0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object a17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f418358d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        boolean z17 = true;
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f418359e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ym5.l2 l2Var = ym5.l2.f544957a;
            ym5.j2[] j2VarArr = ym5.j2.f544925d;
            c22789xd23e9a9b.o(false);
            vl2.s sVar = vl2.s.f519401a;
            vl2.h hVar = vl2.h.B;
            this.f418358d = 1;
            a17 = sVar.a(hVar, this);
            if (a17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                android.view.View view = this.f418360f;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
                c22789xd23e9a9b.setVisibility(0);
                c22789xd23e9a9b.m82584xebcf33cb(2);
                c22789xd23e9a9b.m82583xcde73672(-1);
                c22789xd23e9a9b.d();
                c22789xd23e9a9b.g();
                this.f418361g.mo152xb9724478();
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            a17 = obj;
        }
        java.lang.String str = (java.lang.String) a17;
        if (str != null && str.length() != 0) {
            z17 = false;
        }
        if (z17) {
            return f0Var;
        }
        vl2.s sVar2 = vl2.s.f519401a;
        vl2.h hVar2 = vl2.h.B;
        this.f418358d = 2;
        if (sVar2.d(hVar2, c22789xd23e9a9b, this) == aVar) {
            return aVar;
        }
        android.view.View view2 = this.f418360f;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(0);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/controller/lyrics/FinderLiveLyricsView$showGestureEducation$2", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c22789xd23e9a9b.setVisibility(0);
        c22789xd23e9a9b.m82584xebcf33cb(2);
        c22789xd23e9a9b.m82583xcde73672(-1);
        c22789xd23e9a9b.d();
        c22789xd23e9a9b.g();
        this.f418361g.mo152xb9724478();
        return f0Var;
    }
}
