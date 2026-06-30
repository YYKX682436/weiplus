package ch2;

/* loaded from: classes10.dex */
public final class c2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.yx1 f41302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c2(r45.yx1 yx1Var) {
        super(1);
        this.f41302d = yx1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("play_info isEmpty: ");
        r45.yx1 yx1Var = this.f41302d;
        sb6.append(yx1Var.f391466o == null);
        sb6.append(" resource_info isEmpty: ");
        r45.by1 by1Var = yx1Var.f391466o;
        sb6.append((by1Var != null ? by1Var.f371144e : null) == null);
        it.p(sb6.toString());
        gh2.a[] aVarArr = gh2.a.f271854d;
        it.q("ResourceEmpty");
        return jz5.f0.f302826a;
    }
}
