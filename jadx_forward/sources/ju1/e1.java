package ju1;

/* loaded from: classes9.dex */
public final class e1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 f383242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ju1.a f383243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f383244f;

    public e1(com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76, ju1.a aVar, int i17) {
        this.f383242d = activityC13077xb3b83e76;
        this.f383243e = aVar;
        this.f383244f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1309x2e7b10.ui.v4.ActivityC13077xb3b83e76 activityC13077xb3b83e76 = this.f383242d;
            int i18 = activityC13077xb3b83e76.f176960p;
            int i19 = 2;
            if (i18 != 2 && i18 == 3) {
                i19 = 1;
            }
            ju1.a aVar = this.f383243e;
            r45.tt ttVar = aVar.f383223c;
            java.lang.String str = ttVar != null ? ttVar.f468298d : null;
            if (str == null) {
                str = "";
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("delete card, cardIndex: ");
            int i27 = this.f383244f;
            sb6.append(i27);
            sb6.append(", cardID: ");
            sb6.append(str);
            sb6.append(", pageScene: ");
            sb6.append(i19);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HistoryCardListUI", sb6.toString());
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(21329, java.lang.Integer.valueOf(i19), 1, str, java.lang.Integer.valueOf(i27));
            ju1.k kVar = activityC13077xb3b83e76.f176958n;
            if (kVar != null) {
                kVar.P6(aVar);
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
                throw null;
            }
        }
    }
}
