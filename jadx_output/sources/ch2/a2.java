package ch2;

/* loaded from: classes10.dex */
public final class a2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jz5.l f41286d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(jz5.l lVar) {
        super(1);
        this.f41286d = lVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        rm0.j jVar;
        java.lang.String num;
        rm0.j jVar2;
        rm0.j jVar3;
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        jz5.l lVar = this.f41286d;
        it.f57161k = (lVar == null || (jVar3 = (rm0.j) lVar.f302834e) == null) ? 0 : jVar3.f397425f;
        java.lang.String str2 = "";
        if (lVar == null || (jVar2 = (rm0.j) lVar.f302834e) == null || (str = jVar2.f397426g) == null) {
            str = "";
        }
        it.p(str);
        if (lVar != null && (jVar = (rm0.j) lVar.f302834e) != null && (num = java.lang.Integer.valueOf(jVar.f397424e).toString()) != null) {
            str2 = num;
        }
        it.q(str2);
        return jz5.f0.f302826a;
    }
}
