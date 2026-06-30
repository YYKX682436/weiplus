package ti5;

/* loaded from: classes.dex */
public final class a implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ti5.b f501185d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f501186e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ri5.j f501187f;

    public a(ti5.b bVar, in5.s0 s0Var, ri5.j jVar) {
        this.f501185d = bVar;
        this.f501186e = s0Var;
        this.f501187f = jVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/mvvm/item/extension/addressbook/LabelListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        android.content.Context context = this.f501186e.f374654e;
        ri5.j jVar = this.f501187f;
        java.lang.String str = jVar.f477644f;
        java.lang.String obj = jVar.f477645g.toString();
        this.f501185d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LabelListItemExtension", "goToPreviewLabel() called with: context = " + context + ", labelId = " + str);
        java.util.List j17 = ((b93.b) c93.a.a()).j(str);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(j17)) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("titile", obj);
            pf5.j0.a(intent, cj5.b.class);
            pf5.j0.a(intent, yi5.c.class);
            pf5.j0.a(intent, cj5.w2.class);
            pf5.j0.a(intent, cj5.l2.class);
            intent.putExtra("KEY_NEED_SEAR_HEADER", false);
            intent.putExtra("custom_contact", com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.c1(j17, ","));
            bh5.c cVar = new bh5.c();
            cVar.f102455a.f102457a = context;
            cVar.d(intent);
            cVar.e(true);
            cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
            cVar.b(com.p314xaae8f345.mm.p2776x373aa5.C22780x9663434.class);
            cVar.g();
        }
        yj0.a.h(this, "com/tencent/mm/ui/mvvm/item/extension/addressbook/LabelListItemExtension$onBindViewHolder$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
