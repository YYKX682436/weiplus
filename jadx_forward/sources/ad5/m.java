package ad5;

/* loaded from: classes10.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f84812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f84813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f84816h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ad5.t0 f84817i;

    public m(yz5.q qVar, java.util.List list, android.content.Context context, java.lang.String str, boolean z17, ad5.t0 t0Var) {
        this.f84812d = qVar;
        this.f84813e = list;
        this.f84814f = context;
        this.f84815g = str;
        this.f84816h = z17;
        this.f84817i = t0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        yz5.q qVar = this.f84812d;
        ad5.q qVar2 = ad5.q.f84827a;
        java.util.List list = this.f84813e;
        if (itemId == 1) {
            qVar2.f(qVar, list);
            qVar2.g(this.f84814f, this.f84813e, this.f84815g, this.f84816h, this.f84817i);
            return;
        }
        if (itemId != 2) {
            return;
        }
        qVar2.f(qVar, list);
        ad5.o oVar = new ad5.o();
        java.lang.Object obj = this.f84817i.f84847a.get(ad5.s0.f84840a);
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.m0.f(obj, 1)) {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar != null) {
            lVar.mo146xb9724478(oVar);
        }
        if (com.p314xaae8f345.mm.ui.p2650x55bb7a46.h7.f283195a.a(this.f84814f, list, this.f84815g, oVar)) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MsgHistoryGalleryOperation", "startMergedForward: sendRecordMsg returned false");
        qVar2.e(new ad5.h(0, "sendRecordMsg not started", 1, null));
    }
}
