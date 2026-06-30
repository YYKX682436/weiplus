package pk2;

/* loaded from: classes.dex */
public final class w3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {
    public final /* synthetic */ pk2.o9 C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f437856d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f437857e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(pk2.o9 o9Var, boolean z17, android.view.View view) {
        super(0);
        this.C = o9Var;
        this.f437857e = z17;
        this.f437856d = view;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = (!zl2.r4.F1(this.C.f437607b) && this.f437857e) ? 0 : 8;
        android.view.View findViewById = this.f437856d.findViewById(com.p314xaae8f345.mm.R.id.f567040hx3);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/live/moreaction/AnchorRewardOption$addItem$1$2$1$2$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        return jz5.f0.f384359a;
    }
}
