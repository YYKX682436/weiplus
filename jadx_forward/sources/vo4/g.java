package vo4;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vo4.i f520160d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(vo4.i iVar) {
        super(1);
        this.f520160d = iVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.nio.IntBuffer it = (java.nio.IntBuffer) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        yz5.l lVar = this.f520160d.f520172j;
        if (lVar != null) {
            lVar.mo146xb9724478(it);
        }
        return jz5.f0.f384359a;
    }
}
