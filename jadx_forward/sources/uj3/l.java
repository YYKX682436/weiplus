package uj3;

/* loaded from: classes14.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uj3.p f509848d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(uj3.p pVar) {
        super(1);
        this.f509848d = pVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        uj3.b1 m168131x7a59531e;
        int intValue = ((java.lang.Number) obj).intValue();
        uj3.p pVar = this.f509848d;
        if ((intValue >= 0 && intValue < pVar.K) && (m168131x7a59531e = pVar.m168131x7a59531e()) != null) {
            m168131x7a59531e.d(intValue);
        }
        return jz5.f0.f384359a;
    }
}
