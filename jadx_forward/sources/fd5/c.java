package fd5;

/* loaded from: classes9.dex */
public final class c implements fd5.a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 f342873a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f342874b;

    /* renamed from: c, reason: collision with root package name */
    public int f342875c;

    /* renamed from: d, reason: collision with root package name */
    public int f342876d;

    public c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 lm6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lm6, "lm");
        this.f342873a = lm6;
        this.f342875c = -1;
    }

    @Override // fd5.a
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        if (!this.f342874b || h3Var == null || h3Var.f93598g) {
            return;
        }
        int i17 = this.f342875c;
        if (i17 != -1) {
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = this.f342873a;
            int i18 = this.f342876d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i18));
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(c21844xd4ff61b8, arrayList.toArray(), "com/tencent/mm/ui/chatting/layoutmanager/MediaGroupLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
            c21844xd4ff61b8.P(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue());
            yj0.a.f(c21844xd4ff61b8, "com/tencent/mm/ui/chatting/layoutmanager/MediaGroupLMComponent", "beforeOnLayoutChildren", "(Landroidx/recyclerview/widget/RecyclerView$Recycler;Landroidx/recyclerview/widget/RecyclerView$State;)V", "Undefined", "scrollToPositionWithOffset", "(II)V");
        }
        this.f342874b = false;
        this.f342875c = -1;
        this.f342876d = 0;
    }

    public final boolean c() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143.C21844xd4ff61b8 c21844xd4ff61b8 = this.f342873a;
        int t17 = c21844xd4ff61b8.t();
        if (t17 == -1) {
            this.f342874b = false;
            return false;
        }
        android.view.View mo7935xa188593e = c21844xd4ff61b8.mo7935xa188593e(t17);
        if (mo7935xa188593e == null) {
            this.f342874b = false;
            return false;
        }
        this.f342875c = t17;
        this.f342876d = mo7935xa188593e.getTop();
        this.f342874b = true;
        return true;
    }
}
