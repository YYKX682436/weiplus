package ch2;

/* loaded from: classes10.dex */
public final class f2 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f41351d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f2(kotlin.jvm.internal.h0 h0Var) {
        super(1);
        this.f41351d = h0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        gh2.a[] aVarArr = gh2.a.f271854d;
        it.q("TimeOut");
        java.lang.String jSONObject = ((org.json.JSONObject) this.f41351d.f310123d).toString();
        kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
        it.p(r26.i0.t(jSONObject, ",", ";", false));
        return jz5.f0.f302826a;
    }
}
