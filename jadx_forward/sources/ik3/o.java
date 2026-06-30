package ik3;

/* loaded from: classes8.dex */
public final class o implements com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ik3.c f373439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ik3.q f373440b;

    public o(ik3.c cVar, ik3.q qVar) {
        this.f373439a = cVar;
        this.f373440b = qVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.aff.p3162x360652.a
    /* renamed from: complete */
    public final void mo116804xdc453139(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        lk3.b U6;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskAffFsc", "deleteByIdAndTypeAsync result: " + z17);
        if (!z17 || (c16601x7ed0e40c = this.f373439a.f373422b) == null || (U6 = this.f373440b.U6()) == null) {
            return;
        }
        o75.b bVar = o75.b.f425117e;
        java.lang.String field_id = c16601x7ed0e40c.f66791xc8a07680;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_id, "field_id");
        o75.c cVar = new o75.c(bVar, field_id, "MicroMsg.MultiTask.MultiTaskLiveStorage");
        cVar.f425123d = c16601x7ed0e40c;
        U6.P6().mo127123xc2079749(cVar);
    }
}
