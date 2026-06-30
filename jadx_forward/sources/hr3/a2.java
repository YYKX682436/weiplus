package hr3;

/* loaded from: classes8.dex */
public final class a2 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f364904d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f364905e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f364906f;

    public a2(pr3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        this.f364904d = cVar;
        this.f364905e = activityC16844x18232797;
        this.f364906f = z3Var;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        int i17 = vVar.f432691c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f364905e;
        pr3.c cVar = this.f364904d;
        if (i17 == 0) {
            java.lang.Object obj = ((p13.y) vVar.f432693e.get(0)).f432730o;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int intValue = num != null ? num.intValue() : 0;
            cVar.f439489g = activityC16844x18232797.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572490bd1, java.lang.Integer.valueOf(intValue));
            hr3.z1 z1Var = new hr3.z1(intValue, activityC16844x18232797, this.f364906f);
            cVar.getClass();
            cVar.f439499t = z1Var;
        } else {
            cVar.f439489g = activityC16844x18232797.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572490bd1, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "update common chatroom: " + cVar);
        xm3.t0 t0Var = activityC16844x18232797.f235216o;
        if (t0Var == null || (c16718x7059cefe = t0Var.I) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe, null, 1, null);
    }
}
