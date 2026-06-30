package sc2;

/* loaded from: classes2.dex */
public final class v2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sc2.w2 f487833d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f487834e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f487835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(sc2.w2 w2Var, boolean z17, in5.s0 s0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f487833d = w2Var;
        this.f487834e = z17;
        this.f487835f = s0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sc2.v2(this.f487833d, this.f487834e, this.f487835f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sc2.v2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        sc2.w2 w2Var = this.f487833d;
        java.lang.String str = w2Var.f487862w;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("actual show account around view ");
        boolean z17 = this.f487834e;
        sb6.append(z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        android.view.View view = w2Var.f84676d;
        android.view.View findViewById = view != null ? view.findViewById(com.p314xaae8f345.mm.R.id.m3n) : null;
        if (findViewById != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/component/FeedJumperAccountAroundObserver$updateShowAccountAroundView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/feed/component/FeedJumperAccountAroundObserver$updateShowAccountAroundView$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17) {
            w2Var.D(8);
            return f0Var;
        }
        w2Var.D(0);
        int i18 = w2Var.f84683n;
        in5.s0 s0Var = this.f487835f;
        if (i18 == 39) {
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            so2.o2.f492050f.a().g(w2Var.f84678f, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n, so2.h2.f491921h);
        }
        if (w2Var.f487863x != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
            android.content.Context context2 = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            long j17 = w2Var.f84678f;
            java.lang.String str2 = w2Var.f84679g;
            w2Var.getClass();
            xc2.p0 p0Var = w2Var.f487863x;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(p0Var);
            o3Var.Ai(context2, j17, str2, "operational_jumpinfo", p0Var);
        }
        return f0Var;
    }
}
