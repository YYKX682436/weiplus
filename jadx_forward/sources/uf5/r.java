package uf5;

/* loaded from: classes8.dex */
public final class r extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uf5.x f508825d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(uf5.x xVar) {
        super(1);
        this.f508825d = xVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uf5.l state = (uf5.l) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        uf5.x xVar = this.f508825d;
        if (dVar != null && (dVar instanceof uf5.x0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = xVar.P6();
            if (P6 != null) {
                P6.m78500x43e00957(2, false);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P62 = xVar.P6();
            if (P62 != null) {
                P62.mo74407xb0dfae51(2, false);
            }
            android.view.View view = xVar.f508854d;
            if (view == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            uf5.x.V6(xVar, al5.q.f87525h);
            uf5.x.U6(xVar, state);
        }
        j75.d dVar2 = state.f379599d;
        if (dVar2 != null && (dVar2 instanceof uf5.y0)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P63 = xVar.P6();
            if (P63 != null) {
                P63.m78500x43e00957(2, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P64 = xVar.P6();
            if (P64 != null) {
                P64.mo74407xb0dfae51(2, true);
            }
            android.view.View view2 = xVar.f508854d;
            if (view2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView = xVar.f508856f;
            if (imageView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                throw null;
            }
            imageView.setVisibility(8);
            uf5.x.V6(xVar, al5.q.f87524g);
        }
        j75.d dVar3 = state.f379599d;
        java.util.List list = state.f508800f;
        if (dVar3 != null && (dVar3 instanceof uf5.c)) {
            uf5.u1 u1Var = xVar.f508858h;
            if (u1Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            u1Var.m8146xced61ae5();
            android.widget.ImageView imageView2 = xVar.f508856f;
            if (imageView2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                throw null;
            }
            imageView2.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
            uf5.x.U6(xVar, state);
        }
        j75.d dVar4 = state.f379599d;
        if (dVar4 != null && (dVar4 instanceof uf5.d)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P65 = xVar.P6();
            if (P65 != null) {
                P65.m78500x43e00957(2, true);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P66 = xVar.P6();
            if (P66 != null) {
                P66.mo74407xb0dfae51(2, true);
            }
            android.view.View view3 = xVar.f508854d;
            if (view3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchBottomBar");
                throw null;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/contact/privacy/BatchLabelUIC$registerObserve$1", "invoke", "(Lcom/tencent/mm/ui/contact/privacy/BatchLabelState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.widget.ImageView imageView3 = xVar.f508856f;
            if (imageView3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                throw null;
            }
            imageView3.setVisibility(8);
            uf5.x.V6(xVar, al5.q.f87524g);
        }
        j75.d dVar5 = state.f379599d;
        if (dVar5 != null && (dVar5 instanceof uf5.c2)) {
            uf5.u1 u1Var2 = xVar.f508858h;
            if (u1Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            u1Var2.m8146xced61ae5();
            uf5.x.U6(xVar, state);
            android.widget.ImageView imageView4 = xVar.f508856f;
            if (imageView4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                throw null;
            }
            imageView4.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
        }
        j75.d dVar6 = state.f379599d;
        if (dVar6 != null && (dVar6 instanceof uf5.a)) {
            uf5.u1 u1Var3 = xVar.f508858h;
            if (u1Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("avatarAdapter");
                throw null;
            }
            u1Var3.m8146xced61ae5();
            uf5.x.U6(xVar, state);
            android.widget.ImageView imageView5 = xVar.f508856f;
            if (imageView5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("batchExpandIcon");
                throw null;
            }
            imageView5.setVisibility(((java.util.ArrayList) list).isEmpty() ? 8 : 0);
        }
        return jz5.f0.f384359a;
    }
}
