package au3;

/* loaded from: classes10.dex */
public final class k extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f14110d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(au3.l lVar) {
        super(2);
        this.f14110d = lVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        au3.l lVar = this.f14110d;
        ct0.b bVar = lVar.f14119o;
        if (bVar != null) {
            float f17 = bVar.f222208e - bVar.f222207d;
            float f18 = (floatValue2 - floatValue) * f17;
            com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = lVar.f14120p;
            kotlin.jvm.internal.o.d(recordConfigProvider);
            int i18 = recordConfigProvider.f155685w + 250;
            ct0.b bVar2 = lVar.f14119o;
            kotlin.jvm.internal.o.d(bVar2);
            int i19 = bVar2.f222208e;
            if (i18 > i19) {
                i18 = i19;
            }
            float f19 = f18 - i18;
            if (f19 < 0.0f) {
                f19 = 0.0f;
            }
            int i27 = ((int) f19) / 2;
            i17 = (java.lang.Math.round(f17 * floatValue2) - i27) - (java.lang.Math.round(floatValue * f17) + i27);
        } else {
            i17 = 0;
        }
        return java.lang.Integer.valueOf(i17);
    }
}
