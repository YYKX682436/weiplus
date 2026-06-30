package com.tencent.mm.chatting;

@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/tencent/mm/chatting/BasePrivateMsgConvListFragment;", "Ll75/f0;", "CONVERSATION", "Lcom/tencent/mm/ui/component/UIComponentFragment;", "<init>", "()V", "wn/a", "wn/b", "common-lib_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class BasePrivateMsgConvListFragment<CONVERSATION extends l75.f0> extends com.tencent.mm.ui.component.UIComponentFragment {

    /* renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ int f64730v = 0;

    /* renamed from: n, reason: collision with root package name */
    public wn.b f64731n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f64732o = jz5.h.b(new wn.g(this));

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f64733p = jz5.h.b(new wn.f(this));

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f64734q = jz5.h.b(new wn.e(this));

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f64735r = jz5.h.b(new wn.h(this));

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f64736s = jz5.h.b(new wn.d(this));

    /* renamed from: t, reason: collision with root package name */
    public long f64737t;

    /* renamed from: u, reason: collision with root package name */
    public wn.u f64738u;

    public abstract android.view.View A0();

    public int B0() {
        return 0;
    }

    public abstract android.view.View C0();

    public wn.u F0() {
        androidx.fragment.app.FragmentActivity activity = getActivity();
        kotlin.jvm.internal.o.d(activity);
        pf5.z zVar = pf5.z.f353948a;
        if (!(activity instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) activity).a(wn.u.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        return (wn.u) a17;
    }

    public abstract androidx.recyclerview.widget.RecyclerView G0();

    public abstract com.tencent.mm.view.RefreshLoadMoreLayout H0();

    public void J0(long j17) {
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public java.util.Set l0() {
        return kz5.r0.f314002d;
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void o0() {
        yj0.a.a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V", this);
        super.o0();
        yj0.a.h(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleFocused", "()V");
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onActivityCreated(android.os.Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        z0().c().remove(w0());
        java.util.Iterator it = u0().iterator();
        while (it.hasNext()) {
            ((l75.s0) it.next()).remove(w0());
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        s0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment, androidx.fragment.app.Fragment
    public void onViewCreated(android.view.View view, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(view, "view");
        super.onViewCreated(view, bundle);
        this.f64737t = android.os.SystemClock.uptimeMillis();
        wn.u F0 = F0();
        kotlin.jvm.internal.o.g(F0, "<set-?>");
        this.f64738u = F0;
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) this.f64732o).getValue();
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(w0());
        wn.b y07 = y0();
        kotlin.jvm.internal.o.g(y07, "<set-?>");
        this.f64731n = y07;
        z0().c().add(w0());
        java.util.Iterator it = u0().iterator();
        while (it.hasNext()) {
            ((l75.s0) it.next()).add(w0());
        }
        x0().setActionCallback(new wn.i(this));
        jz5.g gVar = this.f64733p;
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        java.util.List b17 = z0().b();
        w0().y(true, b17);
        r0();
        if (B0() > b17.size()) {
            x0().setEnableLoadMore(false);
        }
        J0(android.os.SystemClock.uptimeMillis() - this.f64737t);
        android.view.View view3 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        s0();
    }

    @Override // com.tencent.mm.ui.component.UIComponentFragment
    public void p0() {
        yj0.a.a("com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V", this);
        super.p0();
        yj0.a.h(this, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "com/tencent/mm/ui/component/UIComponentFragment", "onUserVisibleUnFocused", "()V");
    }

    public void r0() {
    }

    public final void s0() {
        int itemCount = w0().getItemCount();
        jz5.g gVar = this.f64734q;
        if (itemCount == 0) {
            android.view.View view = (android.view.View) ((jz5.n) gVar).getValue();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            x0().setVisibility(8);
            return;
        }
        android.view.View view2 = (android.view.View) ((jz5.n) gVar).getValue();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/chatting/BasePrivateMsgConvListFragment", "checkEmpty", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        x0().setVisibility(0);
    }

    public abstract wn.a t0();

    public abstract java.util.List u0();

    public final wn.a w0() {
        return (wn.a) ((jz5.n) this.f64736s).getValue();
    }

    public final com.tencent.mm.view.RefreshLoadMoreLayout x0() {
        return (com.tencent.mm.view.RefreshLoadMoreLayout) ((jz5.n) this.f64735r).getValue();
    }

    public abstract wn.b y0();

    public final wn.b z0() {
        wn.b bVar = this.f64731n;
        if (bVar != null) {
            return bVar;
        }
        kotlin.jvm.internal.o.o("dataSource");
        throw null;
    }
}
