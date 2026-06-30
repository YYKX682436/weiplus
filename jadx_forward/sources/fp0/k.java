package fp0;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fp0.o f346794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fp0.p f346795e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(fp0.o oVar, fp0.p pVar) {
        super(0);
        this.f346794d = oVar;
        this.f346795e = pVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        boolean z17;
        fp0.o oVar = this.f346794d;
        java.util.LinkedList linkedList = oVar.f346805d;
        boolean z18 = linkedList instanceof java.util.Collection;
        fp0.p pVar = this.f346795e;
        if (!z18 || !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((fp0.p) it.next(), pVar)) {
                    z17 = false;
                    break;
                }
            }
        }
        z17 = true;
        if (z17) {
            oVar.f346805d.add(pVar);
        }
        return jz5.f0.f384359a;
    }
}
