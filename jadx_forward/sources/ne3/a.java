package ne3;

/* loaded from: classes7.dex */
public final class a implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1847xb90d6a7a.ui.ActivityC16458x99bf839d f418079d;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1847xb90d6a7a.ui.ActivityC16458x99bf839d activityC16458x99bf839d) {
        this.f418079d = activityC16458x99bf839d;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1847xb90d6a7a.ui.ActivityC16458x99bf839d activityC16458x99bf839d = this.f418079d;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.scl.p1847xb90d6a7a.ui.ActivityC16458x99bf839d.f229664f;
        activityC16458x99bf839d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclNativeDemoUI", "releaseDynamicCardEnv");
        android.view.ViewGroup viewGroup = activityC16458x99bf839d.f229666e;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        hq0.e0 e0Var = activityC16458x99bf839d.f229665d;
        if (e0Var != null) {
            me3.i iVar = (me3.i) i95.n0.c(me3.i.class);
            java.lang.String rootId = e0Var.f364517e;
            me3.j jVar = (me3.j) iVar;
            jVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootId, "rootId");
            le3.a aVar = jVar.f407467d;
            if (aVar != null) {
                aVar.F1(rootId);
            }
        }
        activityC16458x99bf839d.f229665d = null;
        me3.j jVar2 = (me3.j) ((me3.i) i95.n0.c(me3.i.class));
        synchronized (jVar2) {
            le3.a aVar2 = jVar2.f407467d;
            if (aVar2 != null) {
                aVar2.mo123041x5cd39ffa();
            }
            jVar2.f407467d = null;
        }
        this.f418079d.finish();
        return true;
    }
}
