package mi5;

/* loaded from: classes9.dex */
public final class y implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mi5.e0 f408472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.f9 f408474f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l15.c f408475g;

    public y(mi5.e0 e0Var, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var, l15.c cVar) {
        this.f408472d = e0Var;
        this.f408473e = context;
        this.f408474f = f9Var;
        this.f408475g = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView$onUpdateLegacyViewModel$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f408473e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        this.f408472d.getClass();
        ji5.b.f381494a.a(context, this.f408474f, this.f408475g);
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingLiteAppView$onUpdateLegacyViewModel$1$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
