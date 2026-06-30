package ed2;

/* loaded from: classes2.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ed2.i f332794d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ed2.i iVar) {
        super(0);
        this.f332794d = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ed2.i iVar = this.f332794d;
        java.util.Iterator it = iVar.f332801d.entrySet().iterator();
        while (it.hasNext()) {
            ((ed2.c) ((ed2.d) ((java.util.Map.Entry) it.next()).getValue())).f332791b.dismiss();
        }
        iVar.f332801d.clear();
        return jz5.f0.f384359a;
    }
}
