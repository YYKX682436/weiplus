package dg5;

/* loaded from: classes9.dex */
public class t implements android.view.View.OnCreateContextMenuListener {

    /* renamed from: d, reason: collision with root package name */
    public rl5.r f313930d;

    /* renamed from: e, reason: collision with root package name */
    public db5.t4 f313931e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f313932f = "";

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dg5.u f313933g;

    public t(dg5.u uVar) {
        this.f313933g = uVar;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu contextMenu, android.view.View view, android.view.ContextMenu.ContextMenuInfo contextMenuInfo) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.f313932f, true);
        if (n17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("EnterpriseConversationPresenter", "onCreateContextMenu, contact is null, talker = " + this.f313932f);
            return;
        }
        java.lang.String g27 = n17.g2();
        boolean endsWith = g27.toLowerCase().endsWith("@chatroom");
        dg5.u uVar = this.f313933g;
        if (endsWith && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(n17.P0())) {
            g27 = uVar.f313934d.getString(com.p314xaae8f345.mm.R.C30867xcad56011.b5v);
        }
        android.widget.AdapterView.AdapterContextMenuInfo adapterContextMenuInfo = (android.widget.AdapterView.AdapterContextMenuInfo) contextMenuInfo;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.ActivityC22359x66709fa8 activityC22359x66709fa8 = uVar.f313934d;
        ((ke0.e) xVar).getClass();
        contextMenu.setHeaderTitle(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.i(activityC22359x66709fa8, g27));
        if (n17.w2()) {
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.gqf);
        } else {
            contextMenu.add(adapterContextMenuInfo.position, 3, 0, com.p314xaae8f345.mm.R.C30867xcad56011.c1m);
        }
        contextMenu.add(adapterContextMenuInfo.position, 2, 1, com.p314xaae8f345.mm.R.C30867xcad56011.c1f);
        contextMenu.add(adapterContextMenuInfo.position, 1, 2, com.p314xaae8f345.mm.R.C30867xcad56011.gqi);
    }
}
