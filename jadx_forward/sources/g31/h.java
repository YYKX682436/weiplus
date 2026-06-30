package g31;

/* loaded from: classes9.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349611d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f349612e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(java.lang.String str, e31.j jVar) {
        super(1);
        this.f349611d = str;
        this.f349612e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e31.i iVar = (e31.i) obj;
        if (iVar != null) {
            iVar.b(this.f349611d, this.f349612e);
        }
        return jz5.f0.f384359a;
    }
}
