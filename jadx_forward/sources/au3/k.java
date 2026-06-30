package au3;

/* loaded from: classes10.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ au3.l f95643d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(au3.l lVar) {
        super(2);
        this.f95643d = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int i17;
        float floatValue = ((java.lang.Number) obj).floatValue();
        float floatValue2 = ((java.lang.Number) obj2).floatValue();
        au3.l lVar = this.f95643d;
        ct0.b bVar = lVar.f95652o;
        if (bVar != null) {
            float f17 = bVar.f303741e - bVar.f303740d;
            float f18 = (floatValue2 - floatValue) * f17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = lVar.f95653p;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c16993xacc19624);
            int i18 = c16993xacc19624.f237218w + 250;
            ct0.b bVar2 = lVar.f95652o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(bVar2);
            int i19 = bVar2.f303741e;
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
