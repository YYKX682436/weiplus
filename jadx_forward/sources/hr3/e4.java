package hr3;

/* loaded from: classes8.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pr3.c f365041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 f365042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p670x38b72420.o f365043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(pr3.c cVar, com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028, com.p314xaae8f345.mm.p670x38b72420.o oVar) {
        super(1);
        this.f365041d = cVar;
        this.f365042e = activityC16846x5788f028;
        this.f365043f = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe c16718x7059cefe;
        java.util.ArrayList galleryImagePathList = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(galleryImagePathList, "galleryImagePathList");
        pr3.c cVar = this.f365041d;
        cVar.getClass();
        cVar.f439497r = galleryImagePathList;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16846x5788f028 activityC16846x5788f028 = this.f365042e;
        cVar.f439498s = new hr3.d4(activityC16846x5788f028, this.f365043f);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ContactMoreInfoUI", "submit desc image update:\n" + cVar);
        xm3.t0 t0Var = activityC16846x5788f028.f235235n;
        if (t0Var != null && (c16718x7059cefe = t0Var.I) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe.A(c16718x7059cefe, cVar, false, 2, null);
        }
        return jz5.f0.f384359a;
    }
}
