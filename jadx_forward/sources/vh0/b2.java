package vh0;

/* loaded from: classes8.dex */
public final class b2 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 f518369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ai0.h f518370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.f2 f518371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f518372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f518373h;

    public b2(com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040, ai0.h hVar, vh0.f2 f2Var, java.lang.String str, android.app.Activity activity) {
        this.f518369d = c10697x80773040;
        this.f518370e = hVar;
        this.f518371f = f2Var;
        this.f518372g = str;
        this.f518373h = activity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/YuanBaoAgreementService$attachAgreementEntriesToLayout$2$clickSpan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040 = this.f518369d;
        if (!c10697x80773040.f149397i) {
            this.f518370e.f86600h = false;
            view.invalidate();
            this.f518371f.Di(this.f518372g, c10697x80773040, true);
        }
        vh0.n1 n1Var = (vh0.n1) i95.n0.c(vh0.n1.class);
        ((vh0.f3) n1Var).Zi(this.f518373h, c10697x80773040.f149394f);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/YuanBaoAgreementService$attachAgreementEntriesToLayout$2$clickSpan$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
