package th5;

/* loaded from: classes12.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.w f500989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.o f500990e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(th5.w wVar, th5.o oVar) {
        super(1);
        this.f500989d = wVar;
        this.f500990e = oVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        lg3.a aVar;
        float floatValue = ((java.lang.Number) obj).floatValue();
        th5.o oVar = this.f500990e;
        th5.w wVar = this.f500989d;
        if (floatValue >= 1.0f) {
            lg3.a aVar2 = wVar.f501005w;
            if (aVar2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar2).h(oVar, new vf3.f(vf3.e.f517914h, null, 0, 0.0f, 14, null));
            }
            wVar.g0();
        } else if (floatValue > 0.0f || oVar.f500954f != mf3.w.f407661d) {
            lg3.a aVar3 = wVar.f501005w;
            if (aVar3 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar3).h(oVar, new vf3.f(vf3.e.f517913g, null, 0, floatValue, 6, null));
            }
        } else {
            lg3.a aVar4 = wVar.f501005w;
            if (aVar4 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar4).h(oVar, new vf3.f(vf3.e.f517910d, null, 0, 0.0f, 14, null));
            }
            long j17 = oVar.f500876b;
            if (j17 > 0 && (aVar = wVar.f501005w) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1855x62f6fe4.p1858x373aa5.p1859x551ac888.C16500xaadd4bb9) aVar).g(new vf3.b(0L, j17, 0L, 0L, 0L, false, 61, null));
            }
            wVar.g0();
        }
        return jz5.f0.f384359a;
    }
}
