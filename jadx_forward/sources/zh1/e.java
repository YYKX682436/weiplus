package zh1;

/* loaded from: classes8.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zh1.n f554408d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(zh1.n nVar) {
        super(3);
        this.f554408d = nVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        java.lang.Object obj4;
        java.lang.String appId = (java.lang.String) obj;
        ((java.lang.Number) obj2).intValue();
        java.lang.String enterPath = (java.lang.String) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(enterPath, "enterPath");
        java.util.List appBrandOpenMaterialDetailModels = this.f554408d.f554447f.f167785g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(appBrandOpenMaterialDetailModels, "appBrandOpenMaterialDetailModels");
        java.util.Iterator it = appBrandOpenMaterialDetailModels.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj4 = null;
                break;
            }
            obj4 = it.next();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21 c12474x8b872a21 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21) obj4;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(appId, c12474x8b872a21.f167788d.f167795d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(enterPath, c12474x8b872a21.f167788d.f167797f)) {
                break;
            }
        }
        return (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1164xa249a171.p1165x633fb29.C12474x8b872a21) obj4;
    }
}
