package bg2;

/* loaded from: classes10.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.k f101658d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(bg2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101658d = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.h(this.f101658d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bg2.h hVar = (bg2.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bg2.k kVar = this.f101658d;
        int i17 = kVar.f101762p;
        kVar.getClass();
        if (i17 == 0) {
            xi2.g e76 = kVar.e7();
            if (e76 != null) {
                e76.mo140757x901b6914(8);
            }
            ri2.a aVar2 = kVar.f101757h;
            if (aVar2 != null) {
                ri2.j jVar = (ri2.j) aVar2;
                jVar.e();
                android.view.View view = jVar.f477607q;
                if (view != null) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(0);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view2 = jVar.f477609s;
                if (view2 != null) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                    arrayList2.add(0);
                    java.util.Collections.reverse(arrayList2);
                    yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                    yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                android.view.View view3 = jVar.f477610t;
                if (view3 != null) {
                    java.util.ArrayList arrayList3 = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
                    arrayList3.add(8);
                    java.util.Collections.reverse(arrayList3);
                    yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                    yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/mic/pk/bar/LiveFeedCommonBattleUICallback", "onStartBattleAnimateEnd", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                jVar.f(jVar.b(), jVar.a(), true);
            }
        }
        return jz5.f0.f384359a;
    }
}
