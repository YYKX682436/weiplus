package w35;

/* loaded from: classes8.dex */
public final class e implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0 f524263a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f524264b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w35.g f524265c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w f524266d;

    public e(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.n0 n0Var, android.content.Context context, w35.g gVar, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar) {
        this.f524263a = n0Var;
        this.f524264b = context;
        this.f524265c = gVar;
        this.f524266d = wVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.k0 k0Var;
        if (z17) {
            this.f524263a.a(this.f524264b);
            w35.g gVar = this.f524265c;
            w35.a aVar = gVar.f524257b;
            if (aVar != null) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.v) aVar).j();
            }
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0 i0Var = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.i0.f272496a;
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2483xba3231df.w wVar = this.f524266d;
            i0Var.a(wVar.b(), gVar.f524258c);
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.p3 p3Var = gVar.f524256a.f270852l;
            if (p3Var == null || (k0Var = p3Var.f270939c) == null) {
                return;
            }
            ((kb0.f) k0Var).a(false, wVar);
        }
    }
}
