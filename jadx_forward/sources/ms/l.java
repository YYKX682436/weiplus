package ms;

/* loaded from: classes4.dex */
public final class l implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ms.n f412463d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f412464e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f412465f;

    public l(ms.n nVar, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f412463d = nVar;
        this.f412464e = str;
        this.f412465f = h0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = (java.lang.String) this.f412465f.f391656d;
        ms.n nVar = this.f412463d;
        ms.n.O6(nVar, this.f412464e, str, nVar.f412471f);
    }
}
