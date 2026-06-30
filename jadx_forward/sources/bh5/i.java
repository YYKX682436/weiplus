package bh5;

/* loaded from: classes8.dex */
public final class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 f102471d;

    public i(com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 activityC22413xb8aa5962) {
        this.f102471d = activityC22413xb8aa5962;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17 = com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962.f290332g;
        com.p314xaae8f345.mm.ui.p2710x1c644e5f.ActivityC22413xb8aa5962 activityC22413xb8aa5962 = this.f102471d;
        activityC22413xb8aa5962.getClass();
        try {
            dh5.a halfScreenParam = (dh5.a) ((jz5.n) activityC22413xb8aa5962.f290334e).mo141623x754a37bb();
            bh5.j jVar = new bh5.j(activityC22413xb8aa5962);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(halfScreenParam, "halfScreenParam");
            java.lang.Class cls = halfScreenParam.f314152e;
            halfScreenParam.f314153f = jVar;
            com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7 c22415x6ef905d7 = (com.p314xaae8f345.mm.ui.p2710x1c644e5f.C22415x6ef905d7) cls.getDeclaredConstructor(android.content.Context.class, dh5.a.class).newInstance(activityC22413xb8aa5962, halfScreenParam);
            if (c22415x6ef905d7 != null) {
                try {
                    c22415x6ef905d7.mo7414x35dafd(activityC22413xb8aa5962.mo7595x9cdc264(), "halfScreenDialog");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HalfScreenActivityHelper", th6, "createHalfScreenDialogFragmentAndShow err", new java.lang.Object[0]);
                }
            }
            activityC22413xb8aa5962.f290333d = c22415x6ef905d7;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMHalfScreen.TransparentActivity", "showHalfScreen: %s", e17.toString());
        }
    }
}
