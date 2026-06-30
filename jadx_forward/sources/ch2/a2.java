package ch2;

/* loaded from: classes10.dex */
public final class a2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f122819d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(jz5.l lVar) {
        super(1);
        this.f122819d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String str;
        rm0.j jVar;
        java.lang.String num;
        rm0.j jVar2;
        rm0.j jVar3;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44 it = (com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6517xa6e83e44) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        jz5.l lVar = this.f122819d;
        it.f138694k = (lVar == null || (jVar3 = (rm0.j) lVar.f384367e) == null) ? 0 : jVar3.f478958f;
        java.lang.String str2 = "";
        if (lVar == null || (jVar2 = (rm0.j) lVar.f384367e) == null || (str = jVar2.f478959g) == null) {
            str = "";
        }
        it.p(str);
        if (lVar != null && (jVar = (rm0.j) lVar.f384367e) != null && (num = java.lang.Integer.valueOf(jVar.f478957e).toString()) != null) {
            str2 = num;
        }
        it.q(str2);
        return jz5.f0.f384359a;
    }
}
