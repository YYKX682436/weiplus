package ir1;

/* loaded from: classes11.dex */
public final class b0 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.u f375470d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ir1.e0 f375471e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f375472f;

    public b0(ir1.u uVar, ir1.e0 e0Var, android.view.View view) {
        this.f375470d = uVar;
        this.f375471e = e0Var;
        this.f375472f = view;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        ir1.u uVar = this.f375470d;
        hr1.e eVar = (hr1.e) uVar.f374658i;
        ir1.w wVar = this.f375471e.f375498o;
        if (wVar != null) {
            android.view.View itemView = this.f375472f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "$itemView");
            int m8183xf806b362 = uVar.m8183xf806b362();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(eVar);
            ir1.t tVar = (ir1.t) wVar;
            tVar.f375581e = eVar;
            rl5.r rVar = new rl5.r(itemView.getContext());
            rVar.L = tVar;
            rVar.g(itemView, m8183xf806b362, 0L, tVar, tVar, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295044d, com.p314xaae8f345.mm.p2776x373aa5.C22814x6ec16583.f295045e);
            rVar.m();
        }
        yj0.a.i(true, this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansConversationAdapter$onCreateViewHolder$1$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
