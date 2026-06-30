package i53;

/* loaded from: classes8.dex */
public class c4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f370069d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut3.c f370070e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ i53.d4 f370071f;

    public c4(i53.d4 d4Var, android.os.Bundle bundle, ut3.c cVar) {
        this.f370071f = d4Var;
        this.f370069d = bundle;
        this.f370070e = cVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: user selected: %d", java.lang.Integer.valueOf(menuItem.getItemId()));
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2 c15698x77f8a9c2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.api.C15698x77f8a9c2) this.f370071f.f370094d.f221622m.get(menuItem.getItemId());
        if (c15698x77f8a9c2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Haowan.GameVideoEditorProxyUI", "hy: non option!!");
            return;
        }
        this.f370069d.putInt("key_selected_item", c15698x77f8a9c2.f220227d);
        this.f370070e.a();
    }
}
