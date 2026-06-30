package wu;

/* loaded from: classes9.dex */
public final class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ s15.d0 f531127d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wu.p f531128e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f531129f;

    public m(s15.d0 d0Var, wu.p pVar, android.content.Context context) {
        this.f531127d = d0Var;
        this.f531128e = pVar;
        this.f531129f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.Object obj;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f531129f;
        s15.d0 d0Var = this.f531127d;
        wu.l lVar = new wu.l(context, d0Var);
        if (d0Var.k() <= 0) {
            lVar.mo152xb9724478();
            yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wu.p pVar = this.f531128e;
        java.util.Iterator it = pVar.f531144f.f233598o.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (d0Var.k() == ((hu.b) obj).f366530e.A()) {
                    break;
                }
            }
        }
        hu.b bVar = (hu.b) obj;
        if (bVar == null) {
            lVar.mo152xb9724478();
            yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        wu.b2 b2Var = wu.b2.f531078a;
        wu.p a17 = b2Var.a(b2Var.b(bVar.f366530e), pVar.f531143e, pVar.f531144f);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        a17.o(view, bVar);
        ty.k0 k0Var = (ty.k0) i95.n0.c(ty.k0.class);
        ty.p0 p0Var = ty.p0.f504269e;
        int m163573xfb85f7b0 = d0Var.m163573xfb85f7b0();
        ((ti3.q) k0Var).getClass();
        ((ku5.t0) ku5.t0.f394148d).b(new ti3.p(p0Var, m163573xfb85f7b0), "MicroMsg.msgquote.MsgReportManager");
        yj0.a.h(this, "com/tencent/mm/feature/appmsg/ui/item/RecordDetailBaseItemConvert$onBindQuoteView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
