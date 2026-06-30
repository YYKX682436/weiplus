package vx4;

/* loaded from: classes8.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vx4.c f522846d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vx4.c cVar) {
        super(0);
        this.f522846d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        byte[] bArr;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c) ((jz5.n) this.f522846d.f522849y).mo141623x754a37bb();
        if (c16601x7ed0e40c == null || (bArr = c16601x7ed0e40c.f66790x225a93cf) == null) {
            return null;
        }
        r45.ax5 ax5Var = new r45.ax5();
        try {
            ax5Var.mo11468x92b714fd(bArr);
            return ax5Var;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SearchMultiTaskHelperForUI", "taskData parse failed");
            return ax5Var;
        }
    }
}
