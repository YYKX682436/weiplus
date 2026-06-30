package lr4;

/* loaded from: classes11.dex */
public final class h implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lr4.e f402266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lr4.k f402267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f402268f;

    public h(lr4.e eVar, lr4.k kVar, android.view.View view) {
        this.f402266d = eVar;
        this.f402267e = kVar;
        this.f402268f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        lr4.e eVar = this.f402266d;
        kr4.g gVar = (kr4.g) eVar.f374658i;
        lr4.d dVar = this.f402267e.f402278h;
        if (dVar != null) {
            android.view.View itemView = this.f402268f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "$itemView");
            int m8183xf806b362 = eVar.m8183xf806b362();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(gVar);
            lr4.s sVar = (lr4.s) dVar;
            sVar.f402295d = gVar;
            rl5.r rVar = new rl5.r(itemView.getContext());
            rVar.L = sVar;
            rVar.g(itemView, m8183xf806b362, 0L, sVar, sVar, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/w1wpersonalmsg/ui/W1wPersonalMsgConvAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
