package hr3;

/* loaded from: classes8.dex */
public final class z3 implements o13.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f365761d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365762e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.o f365763f;

    public z3(pr3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, com.p314xaae8f345.mm.p670x38b72420.o oVar) {
        this.f365761d = cVar;
        this.f365762e = activityC16846x5788f028;
        this.f365763f = oVar;
    }

    @Override // o13.x
    public final void X2(p13.v vVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        int i17 = vVar.f432691c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365762e;
        pr3.c cVar = this.f365761d;
        if (i17 == 0) {
            java.lang.Object obj = ((p13.y) vVar.f432693e.get(0)).f432730o;
            java.lang.Integer num = obj instanceof java.lang.Integer ? (java.lang.Integer) obj : null;
            int intValue = num != null ? num.intValue() : 0;
            cVar.f439489g = activityC16846x5788f028.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572490bd1, java.lang.Integer.valueOf(intValue));
            hr3.y3 y3Var = new hr3.y3(intValue, activityC16846x5788f028, this.f365763f);
            cVar.getClass();
            cVar.f439499t = y3Var;
        } else {
            cVar.f439489g = activityC16846x5788f028.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572490bd1, 0);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "update common chatroom: " + cVar);
        xm3.t0 t0Var = activityC16846x5788f028.f235235n;
        if (t0Var == null || (c16718x7059cefe = t0Var.I) == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.r(c16718x7059cefe, null, 1, null);
    }
}
