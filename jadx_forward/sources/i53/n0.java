package i53;

/* loaded from: classes8.dex */
public class n0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 {

    /* renamed from: b2, reason: collision with root package name */
    public final int f370201b2;

    /* renamed from: c2, reason: collision with root package name */
    public final int f370202c2;

    /* renamed from: d2, reason: collision with root package name */
    public android.view.View f370203d2;

    /* renamed from: e2, reason: collision with root package name */
    public i53.k0 f370204e2;

    /* renamed from: f2, reason: collision with root package name */
    public boolean f370205f2;

    /* renamed from: g2, reason: collision with root package name */
    public boolean f370206g2;

    /* renamed from: h2, reason: collision with root package name */
    public final java.util.Set f370207h2;

    public n0(android.content.Context context, int i17, int i18) {
        super(context, null);
        this.f370207h2 = new java.util.HashSet();
        this.f370201b2 = i17;
        this.f370202c2 = i18;
        this.f370204e2 = new i53.k0(this, getContext());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16035xb901b58b c16035xb901b58b = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1759xd1075a44.C16035xb901b58b(getContext(), 2, 1, false);
        c16035xb901b58b.B = new i53.h0(this);
        mo7967x900dcbe1(c16035xb901b58b);
        N(new i53.l0());
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bfv, (android.view.ViewGroup) this, false);
        this.f370203d2 = inflate;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(inflate, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        inflate.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(inflate, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "addLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i53.k0 k0Var = this.f370204e2;
        k0Var.f370159h.add(this.f370203d2);
        mo7960x6cab2c8d(this.f370204e2);
    }

    public void g1(java.util.LinkedList linkedList, boolean z17, boolean z18) {
        this.f370205f2 = z17;
        this.f370206g2 = z18;
        android.view.View view = this.f370203d2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "hideLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        i53.k0 k0Var = this.f370204e2;
        java.util.LinkedList linkedList2 = k0Var.f370160i;
        linkedList2.clear();
        linkedList2.addAll(linkedList);
        k0Var.m8146xced61ae5();
    }

    public boolean h1(int i17) {
        int y17 = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) getLayoutManager()).y();
        if (i17 != 0 || !this.f370205f2 || y17 < this.f370204e2.mo1894x7e414b06() - 2) {
            return false;
        }
        android.view.View view = this.f370203d2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/media/GameHaowanRecycleView", "showLoadMoreView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        return true;
    }

    /* renamed from: setOnItemClickListener */
    public void m134760xa1aeda28(vl1.p pVar) {
        this.f370204e2.f370161m = pVar;
    }
}
