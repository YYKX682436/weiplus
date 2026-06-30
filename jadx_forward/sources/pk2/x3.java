package pk2;

/* loaded from: classes3.dex */
public final class x3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pk2.b4 f437886d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pk2.o9 f437887e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437888f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f437889g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(pk2.b4 b4Var, pk2.o9 o9Var, android.view.View view, boolean z17) {
        super(0);
        this.f437886d = b4Var;
        this.f437887e = o9Var;
        this.f437888f = view;
        this.f437889g = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        ya2.b2 b17;
        boolean n17 = this.f437886d.n();
        pk2.o9 o9Var = this.f437887e;
        if (n17) {
            z17 = ((mm2.c1) o9Var.c(mm2.c1.class)).C;
        } else {
            zl2.r4 r4Var = zl2.r4.f555483a;
            pk2.j9 j9Var = o9Var.f437617g;
            z17 = pm0.v.z((int) ((j9Var == null || (b17 = j9Var.b()) == null) ? 0L : b17.f69326x798040b1), 8388608);
        }
        android.view.View findViewById = this.f437888f.findViewById(com.p314xaae8f345.mm.R.id.u98);
        if (findViewById != null) {
            int i17 = (this.f437889g && z17) ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$2", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
