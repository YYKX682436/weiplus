package pk2;

/* loaded from: classes3.dex */
public final class n3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f437562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f437563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f437564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ pk2.q3 f437565h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437566i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.t62 f437567m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(r45.t62 t62Var, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, int i17, pk2.q3 q3Var, android.view.View view, r45.t62 t62Var2) {
        super(0);
        this.f437561d = t62Var;
        this.f437562e = arrayList;
        this.f437563f = arrayList2;
        this.f437564g = i17;
        this.f437565h = q3Var;
        this.f437566i = view;
        this.f437567m = t62Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.t62 t62Var = this.f437561d;
        t62Var.m75941xfb821914(4).clear();
        java.util.LinkedList m75941xfb821914 = t62Var.m75941xfb821914(4);
        java.util.ArrayList arrayList = this.f437562e;
        m75941xfb821914.addAll(arrayList);
        t62Var.m75941xfb821914(2).clear();
        t62Var.m75941xfb821914(2).addAll(this.f437563f);
        t62Var.set(1, java.lang.Boolean.TRUE);
        int i17 = this.f437564g;
        t62Var.set(5, java.lang.Integer.valueOf(i17 > 0 ? i17 : arrayList.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AnchorRecommendOption", "onDispatch: refreshCityRangeUI, cityNameList=" + kz5.n0.g0(this.f437562e, "、", null, null, 0, null, null, 62, null) + ", cityCount=" + i17);
        android.view.View rootView = this.f437566i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(rootView, "$rootView");
        pk2.q3 q3Var = this.f437565h;
        q3Var.w(rootView, t62Var);
        q3Var.x(rootView, this.f437567m, t62Var);
        return jz5.f0.f384359a;
    }
}
