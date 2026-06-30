package ed4;

/* loaded from: classes4.dex */
public class a0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 f332816d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var) {
        this.f332816d = z0Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2199x317b13.z0 z0Var = this.f332816d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick");
        try {
            if (z0Var.f250784h.f249569b.k() == 0) {
                z0Var.f250784h.f249572e.f251330J.onClick(view);
            } else if (z0Var.f250784h.f249569b.k() == 1) {
                z0Var.f250784h.f249572e.f251330J.onClick(view);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
            z0Var.f250966r = true;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$102", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem");
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.VideoTimeLineItem", "ProxySightClickListener onClick, exp=" + e17.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onClick", "com.tencent.mm.plugin.sns.ui.item.VideoTimeLineItem$7");
    }
}
