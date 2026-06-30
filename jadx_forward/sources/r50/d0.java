package r50;

/* loaded from: classes5.dex */
public final class d0 implements com.p314xaae8f345.mm.p2470x93e71c27.ui.v2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r50.j0 f474106a;

    public d0(r50.j0 j0Var) {
        this.f474106a = j0Var;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void a() {
        this.f474106a.f474123i = false;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.j();
        }
        a31.m mVar2 = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar2 == null) {
            return;
        }
        mVar2.f82506g = 4;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void b() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void c(int i17) {
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.l(i17);
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void d() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void e(int i17) {
        z21.w wVar;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar == null || (wVar = mVar.f82518s) == null) {
            return;
        }
        wVar.e(i17);
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void f() {
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.ui.v2
    public void g(int i17) {
        r50.j0 j0Var = this.f474106a;
        j0Var.f474123i = true;
        a31.m mVar = ((x90.m) ((ct.f3) i95.n0.c(ct.f3.class))).f534152d;
        if (mVar != null) {
            mVar.i(i17);
        }
        if (com.p314xaae8f345.mm.p2470x93e71c27.ui.C19651x7fe9d32.f271353y.a() == 2) {
            android.view.View m17 = j0Var.W6().m();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m17, arrayList.toArray(), "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$5", "onStartRecord", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m17.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m17, "com/tencent/mm/feature/forward/uic/ForwardMsgPreviewKeyboardUIC$onCreate$1$1$5", "onStartRecord", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
    }
}
