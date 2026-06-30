package dg5;

/* loaded from: classes11.dex */
public class g implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public db5.t4 f313895d;

    /* renamed from: e, reason: collision with root package name */
    public rl5.r f313896e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f313897f = false;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f313898g;

    /* renamed from: h, reason: collision with root package name */
    public s01.b f313899h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f313900i;

    /* renamed from: m, reason: collision with root package name */
    public long f313901m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ dg5.i f313902n;

    public g(dg5.i iVar, dg5.a aVar) {
        this.f313902n = iVar;
    }

    public static void a(dg5.g gVar, boolean z17, int i17) {
        gVar.getClass();
        s01.h z07 = r01.q3.Ui().z0(gVar.f313901m);
        if (s01.r.o(z07.f69169xf75e5c37)) {
            if (z17) {
                z07.f69167x6e664fd4 |= i17;
            } else {
                z07.f69167x6e664fd4 &= ~i17;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatConversationPresenter", "dealSetMute:bitFlag %s", java.lang.Integer.valueOf(z07.f69167x6e664fd4));
            r01.q3.Ui().P0(z07);
        } else {
            s01.a0 y07 = r01.q3.Vi().y0(z07.f69169xf75e5c37);
            if (y07 == null) {
                return;
            }
            if (z17) {
                y07.f65835x6e664fd4 |= i17;
            } else {
                y07.f65835x6e664fd4 &= ~i17;
            }
            r01.q3.Vi().J0(y07);
            z07.f69167x6e664fd4 = y07.f65835x6e664fd4;
            r01.q3.Ui().P0(z07);
        }
        r45.pj pjVar = new r45.pj();
        pjVar.f464618d = z07.f69169xf75e5c37;
        pjVar.f464623i = z07.f69167x6e664fd4;
        r01.q3.Ni().n(z07.f69170x75756b18, pjVar, new dg5.b(gVar));
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        if (this.f313899h.f69079xa35b5abb <= 0) {
            contextMenu.add(adapterContextMenuInfo.position, 1, 1, com.p314xaae8f345.mm.R.C30867xcad56011.gqe);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.gqc);
        }
        if (r01.q3.aj().f1(this.f313899h)) {
            contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.p314xaae8f345.mm.R.C30867xcad56011.gqf);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 3, 2, com.p314xaae8f345.mm.R.C30867xcad56011.gqd);
        }
        contextMenu.add(adapterContextMenuInfo.position, 0, 3, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
    }
}
