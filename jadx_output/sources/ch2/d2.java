package ch2;

/* loaded from: classes10.dex */
public final class d2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41310d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d2(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f41310d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        wl2.b bVar = (wl2.b) this.f41310d.f310123d;
        if (bVar == null || (str = bVar.f447046b) == null) {
            str = "";
        }
        it.p(str);
        gh2.a[] aVarArr = gh2.a.f271854d;
        it.q("loadSoFail");
        return jz5.f0.f302826a;
    }
}
