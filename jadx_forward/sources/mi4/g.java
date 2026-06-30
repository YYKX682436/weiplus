package mi4;

/* loaded from: classes9.dex */
public final class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f408317d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj4.w f408318e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f408319f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hi4.e f408320g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ mi4.h f408321h;

    public g(boolean z17, mj4.w wVar, android.content.Context context, hi4.e eVar, mi4.h hVar) {
        this.f408317d = z17;
        this.f408318e = wVar;
        this.f408319f = context;
        this.f408320g = eVar;
        this.f408321h = hVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f408317d;
        mj4.w wVar = this.f408318e;
        mi4.h hVar = this.f408321h;
        android.content.Context context = this.f408319f;
        if (z17) {
            ((ki4.x) i95.n0.c(ki4.x.class)).Di(wVar.f76642xbed8694c, wVar.f76648xdde069b, context);
        } else {
            hi4.k kVar = hi4.m.f363088f;
            fi4.c cVar = null;
            hi4.e eVar = this.f408320g;
            java.lang.String str = eVar != null ? eVar.f76597x1c3513c9 : null;
            if (str == null) {
                str = "";
            }
            kVar.d(str, 105);
            if (eVar != null) {
                ki4.x xVar = (ki4.x) i95.n0.c(ki4.x.class);
                p012xc85e97e9.p093xedfae76a.y yVar = context instanceof p012xc85e97e9.p093xedfae76a.y ? (p012xc85e97e9.p093xedfae76a.y) context : null;
                mi4.f fVar = new mi4.f(hVar, wVar, context);
                xVar.getClass();
                if (eVar != null) {
                    pj4.n0 n0Var = new pj4.n0();
                    n0Var.f436727e = eVar.f76600x4b6e82d5;
                    n0Var.f436728f = eVar.f76598x35627aba;
                    n0Var.f436730h = eVar.f76599x1f396f83;
                    n0Var.f436731i = eVar.f76594x2b07e86f;
                    n0Var.f436729g = eVar.f76590x1d4a4a55;
                    n0Var.f436726d = 1;
                    cVar = new fi4.c(eVar);
                    com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getNetSceneQueue(...)");
                    ii4.a.a(d17, cVar, yVar, new ki4.w(cVar, fVar));
                }
                android.content.Context context2 = this.f408319f;
                hVar.L = db5.e1.Q(context2, context2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jw7), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jw7), false, true, new mi4.d(cVar));
            }
        }
        hVar.B();
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/conversation/ui/TextStatusProfileBottomDialog$1$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
