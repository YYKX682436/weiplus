package dg3;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ dg3.k f313854d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(dg3.k kVar) {
        super(1);
        this.f313854d = kVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String username = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        dg3.o oVar = this.f313854d.f313867f;
        if (oVar != null) {
            oVar.b(dg3.q.f313874e, username);
        }
        return jz5.f0.f384359a;
    }
}
