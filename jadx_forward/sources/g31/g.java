package g31;

/* loaded from: classes9.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349609d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e31.j f349610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(java.lang.String str, e31.j jVar) {
        super(1);
        this.f349609d = str;
        this.f349610e = jVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        e31.i iVar = (e31.i) obj;
        if (iVar != null) {
            iVar.b(this.f349609d, this.f349610e);
        }
        return jz5.f0.f384359a;
    }
}
