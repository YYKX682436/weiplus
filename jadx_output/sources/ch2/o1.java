package ch2;

/* loaded from: classes10.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ om2.t f41418d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(om2.t tVar) {
        super(1);
        this.f41418d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct it = (com.tencent.mm.autogen.mmdata.rpt.FinderLiveKTVReportStruct) obj;
        kotlin.jvm.internal.o.g(it, "it");
        om2.d dVar = this.f41418d.f346381a;
        it.f57164n = dVar == om2.d.f346284e ? 1 : 0;
        it.f57165o = dVar != om2.d.f346286g ? 0 : 1;
        return jz5.f0.f302826a;
    }
}
