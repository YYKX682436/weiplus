package m31;

/* loaded from: classes9.dex */
public final class f0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m31.g0 f404673d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 f404674e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f404675f;

    public f0(m31.g0 g0Var, com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3, int i17) {
        this.f404673d = g0Var;
        this.f404674e = c11159x8f55e6d3;
        this.f404675f = i17;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f404673d.f404678n.a(this.f404674e, this.f404675f);
        yj0.a.h(this, "com/tencent/mm/msgsubscription/ui/SubscribeMsgListAdapter$filling$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
