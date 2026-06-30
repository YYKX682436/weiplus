package b04;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b04.f f98410d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ll5.a f98411e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 f98412f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(b04.f fVar, ll5.a aVar, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2755x2eaded.C22675xc8629185 c22675xc8629185) {
        super(2);
        this.f98410d = fVar;
        this.f98411e = aVar;
        this.f98412f = c22675xc8629185;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.widget.FrameLayout expandContainer = (android.widget.FrameLayout) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(expandContainer, "expandContainer");
        expandContainer.toString();
        expandContainer.getChildCount();
        int childCount = expandContainer.getChildCount();
        b04.f fVar = this.f98410d;
        if (childCount == 0) {
            java.lang.Object obj3 = fVar.f98423e;
            java.lang.Object obj4 = obj3;
            if (obj3 == null) {
                wd0.v1 v1Var = (wd0.v1) i95.n0.c(wd0.v1.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = fVar.m158354x19263085();
                int T6 = fVar.T6();
                long longValue = ((java.lang.Number) ((jz5.n) fVar.f98422d).mo141623x754a37bb()).longValue();
                ((vd0.w2) v1Var).getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff c17366x88027ff = new com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff(context, longValue);
                c17366x88027ff.m68951x6c9fd8b0(T6);
                if (T6 == 7) {
                    c17366x88027ff.n();
                }
                c17366x88027ff.mo68952x26a0609e(new b04.c(fVar));
                fVar.f98423e = c17366x88027ff;
                obj4 = c17366x88027ff;
            }
            android.view.View view = (android.view.View) obj4;
            wd0.t1 t1Var = fVar.f98423e;
            if (t1Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff) t1Var).p(booleanValue);
            }
            wd0.t1 t1Var2 = fVar.f98423e;
            if (t1Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SelfQrCodeView", "updateQrCode");
                android.content.Context context2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff) t1Var2).getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                pf5.z zVar = pf5.z.f435481a;
                if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2055x765f0e50.i0.class)).Z6(false, 0);
            }
            expandContainer.addView(view);
            android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            view.setLayoutParams(layoutParams);
        }
        wd0.t1 t1Var3 = fVar.f98423e;
        if (t1Var3 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2054xc748c38e.C17366x88027ff) t1Var3).p(booleanValue);
        }
        if (booleanValue) {
            boolean z17 = !((c01.z1.j() & 2) != 0);
            ll5.a aVar = this.f98411e;
            if (aVar.f400805m != z17) {
                aVar.f400805m = z17;
                this.f98412f.m48330xfcfee142(aVar);
            }
        }
        return jz5.f0.f384359a;
    }
}
