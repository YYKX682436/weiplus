package yu;

/* loaded from: classes3.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f547297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.aw2 f547298e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f547299f;

    public j(r45.aw2 aw2Var, r45.aw2 aw2Var2, yz5.l lVar) {
        this.f547297d = aw2Var;
        this.f547298e = aw2Var2;
        this.f547299f = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.aw2 aw2Var = this.f547298e;
        yz5.l lVar = this.f547299f;
        r45.aw2 aw2Var2 = this.f547297d;
        if (aw2Var2 != null) {
            aw2Var2.set(7, aw2Var.m75945x2fec8307(7));
            lVar.mo146xb9724478(aw2Var2);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordOtherItemHelper", "onItemClick, new shareObject is null");
            lVar.mo146xb9724478(aw2Var);
        }
    }
}
