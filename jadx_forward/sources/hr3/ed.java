package hr3;

/* loaded from: classes10.dex */
public final class ed implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d f365055d;

    public ed(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d, int i17) {
        this.f365055d = activityC16867xd9c62d0d;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16867xd9c62d0d activityC16867xd9c62d0d = this.f365055d;
        java.util.List list = activityC16867xd9c62d0d.f235332s.f534544d;
        int i17 = 0;
        if (list != null && !list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((xb5.a) it.next()).f534541f && (i17 = i17 + 1) < 0) {
                    kz5.c0.o();
                    throw null;
                }
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecommendDeleteContactUI", "showDeleteTipsBottomSheet: count:%s", java.lang.Integer.valueOf(i17));
        g4Var.d(1, activityC16867xd9c62d0d.mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f561016a32), activityC16867xd9c62d0d.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mf9, java.lang.String.valueOf(i17)));
    }
}
