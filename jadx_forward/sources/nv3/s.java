package nv3;

/* loaded from: classes5.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f422231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nv3.t f422232e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ rv3.h f422233f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lv3.a f422234g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(boolean z17, nv3.t tVar, rv3.h hVar, lv3.a aVar) {
        super(0);
        this.f422231d = z17;
        this.f422232e = tVar;
        this.f422233f = hVar;
        this.f422234g = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.res.Resources resources;
        java.lang.String string;
        android.content.res.Resources resources2;
        java.lang.String string2;
        boolean z17 = this.f422231d;
        rv3.h hVar = this.f422233f;
        nv3.t tVar = this.f422232e;
        if (z17) {
            tVar.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = hVar.f481928d;
            lv3.a aVar = this.f422234g;
            c16997xb0aa383a.f237253q = (int) aVar.f403043c;
            c16997xb0aa383a.f237248i = aVar.f403042b;
            c16997xb0aa383a.f237249m = true;
            tVar.g(hVar, rv3.z.f481954e);
            cv3.d dVar = tVar.f422241f;
            if (dVar != null) {
                dVar.mo122716x5a5ddf8();
            }
            android.content.Context context = tVar.f422236a;
            if (context != null && (resources2 = context.getResources()) != null && (string2 = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.oai)) != null) {
                int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context);
                e4Var.f293309c = string2;
                e4Var.b(com.p314xaae8f345.mm.R.raw.f78821xb211a201);
                e4Var.c();
            }
        } else {
            tVar.g(hVar, rv3.z.f481953d);
            android.content.Context context2 = tVar.f422236a;
            if (context2 != null && (resources = context2.getResources()) != null && (string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lfd)) != null) {
                int i18 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var2 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(context2);
                e4Var2.f293309c = string;
                e4Var2.c();
            }
        }
        return jz5.f0.f384359a;
    }
}
