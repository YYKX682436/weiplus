package mi5;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.ev2 f408403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fc5.d f408404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ot0.q f408405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408406g;

    public l(r45.ev2 ev2Var, fc5.d dVar, ot0.q qVar, android.content.Context context) {
        this.f408403d = ev2Var;
        this.f408404e = dVar;
        this.f408405f = qVar;
        this.f408406g = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ChattingFinderCollectionView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.ev2 ev2Var = this.f408403d;
        if (ev2Var.m75942xfb822ef2(0) != 0) {
            fc5.d dVar = this.f408404e;
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(dVar.m75945x2fec8307(dVar.f125235d + 1)) ? 3 : 2;
            int i18 = this.f408405f.f430199i;
            android.content.Context context = this.f408406g;
            ya2.e1 e1Var = ya2.e1.f542005a;
            if (i18 == 119) {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                e1Var.u(context, ev2Var, i17);
            } else {
                ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
                e1Var.n(context, ev2Var, i17);
            }
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ChattingFinderCollectionView$onUpdateViewModel$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
