package bk4;

/* loaded from: classes11.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f103061d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.h f103062e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n80.c f103063f;

    public p0(android.view.View view, mj4.h hVar, n80.c cVar) {
        this.f103061d = view;
        this.f103062e = hVar;
        this.f103063f = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper$setupGroupIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        bk4.q0 q0Var = bk4.q0.f103071a;
        android.view.View view2 = this.f103061d;
        android.content.Context context = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        q0Var.b(context, this.f103062e, this.f103063f);
        qj4.s sVar = qj4.s.f445491a;
        android.content.Context context2 = view2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        qj4.s.m(sVar, context2, 96L, null, this.f103062e, 0L, 0L, 0L, 0L, null, null, 0L, com.p314xaae8f345.p2926x359365.C25483x77a9a59f.f46383xd637ed7f, null);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/util/TextStatusGroupVisibilityHelper$setupGroupIcon$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
