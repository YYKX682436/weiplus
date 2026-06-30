package ad5;

/* loaded from: classes10.dex */
public final class m implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f3279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f3280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f3281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f3282g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f3283h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ad5.t0 f3284i;

    public m(yz5.q qVar, java.util.List list, android.content.Context context, java.lang.String str, boolean z17, ad5.t0 t0Var) {
        this.f3279d = qVar;
        this.f3280e = list;
        this.f3281f = context;
        this.f3282g = str;
        this.f3283h = z17;
        this.f3284i = t0Var;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        yz5.q qVar = this.f3279d;
        ad5.q qVar2 = ad5.q.f3294a;
        java.util.List list = this.f3280e;
        if (itemId == 1) {
            qVar2.f(qVar, list);
            qVar2.g(this.f3281f, this.f3280e, this.f3282g, this.f3283h, this.f3284i);
            return;
        }
        if (itemId != 2) {
            return;
        }
        qVar2.f(qVar, list);
        ad5.o oVar = new ad5.o();
        java.lang.Object obj = this.f3284i.f3314a.get(ad5.s0.f3307a);
        if (!kotlin.jvm.internal.m0.f(obj, 1)) {
            obj = null;
        }
        yz5.l lVar = (yz5.l) obj;
        if (lVar != null) {
            lVar.invoke(oVar);
        }
        if (com.tencent.mm.ui.chatting.h7.f201662a.a(this.f3281f, list, this.f3282g, oVar)) {
            return;
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.MsgHistoryGalleryOperation", "startMergedForward: sendRecordMsg returned false");
        qVar2.e(new ad5.h(0, "sendRecordMsg not started", 1, null));
    }
}
