package fp0;

/* loaded from: classes10.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f346799e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(fp0.o oVar, yz5.l lVar) {
        super(0);
        this.f346798d = oVar;
        this.f346799e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Object obj;
        fp0.o oVar = this.f346798d;
        java.util.Iterator it = oVar.f346806e.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((java.lang.Boolean) this.f346799e.mo146xb9724478(obj)).booleanValue()) {
                break;
            }
        }
        fp0.q qVar = (fp0.q) obj;
        if (qVar != null) {
            oVar.f346806e.remove(qVar);
        }
        return jz5.f0.f384359a;
    }
}
