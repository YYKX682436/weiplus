package hr3;

/* loaded from: classes8.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f365103d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 f365104e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f365105f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(pr3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var) {
        super(1);
        this.f365103d = cVar;
        this.f365104e = activityC16844x18232797;
        this.f365105f = z3Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryImagePathList, "galleryImagePathList");
        pr3.c cVar = this.f365103d;
        cVar.getClass();
        cVar.f439497r = galleryImagePathList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16844x18232797 activityC16844x18232797 = this.f365104e;
        cVar.f439498s = new hr3.f2(activityC16844x18232797, this.f365105f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "submit desc image update:\n" + cVar);
        xm3.t0 t0Var = activityC16844x18232797.f235216o;
        if (t0Var != null && (c16718x7059cefe = t0Var.I) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, cVar, false, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
