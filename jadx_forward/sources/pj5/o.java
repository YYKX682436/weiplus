package pj5;

/* loaded from: classes9.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f436931d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f436932e;

    public o(in5.s0 s0Var, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var) {
        this.f436931d = s0Var;
        this.f436932e = f9Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        pj5.k kVar = pj5.k.f436919a;
        android.content.Context context = this.f436931d.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        kVar.c(context, this.f436932e);
        yj0.a.h(this, "com/tencent/mm/ui/schedulemsg/ScheduleMsgItemConvert$onBindViewHolder$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
