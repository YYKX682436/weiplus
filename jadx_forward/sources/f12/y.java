package f12;

/* loaded from: classes4.dex */
public final class y implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 f340209a;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79) {
        this.f340209a = activityC13254xf536ee79;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.w1
    public final void a(boolean z17, java.lang.String str) {
        if (z17) {
            b12.k kVar = b12.k.f98593a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee79 = this.f340209a;
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79.f178970o;
            uq.n nVar = (uq.n) activityC13254xf536ee79.X6().f340160q.mo3195x754a37bb();
            kVar.d(23, nVar != null ? nVar.f511706u : 0L);
            com.p314xaae8f345.mm.p1006xc5476f33.p1364x5dd7b252.ui.ActivityC13254xf536ee79 activityC13254xf536ee792 = this.f340209a;
            db5.t7.h(activityC13254xf536ee792, activityC13254xf536ee792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bsw));
            this.f340209a.finish();
            g12.a aVar = g12.a.f349101a;
            java.lang.String str2 = (java.lang.String) ((jz5.n) this.f340209a.f178977m).mo141623x754a37bb();
            if (str2 == null) {
                return;
            }
            java.util.LinkedList linkedList = g12.a.f349102b;
            synchronized (linkedList) {
                linkedList.add(str2);
            }
            aVar.a();
        }
    }
}
