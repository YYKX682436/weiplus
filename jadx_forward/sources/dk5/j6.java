package dk5;

/* loaded from: classes8.dex */
public final class j6 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995 f316224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f316225e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j6(com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11297x655ab995 c11297x655ab995, yz5.l lVar) {
        super(2);
        this.f316224d = c11297x655ab995;
        this.f316225e = lVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String str = (java.lang.String) obj2;
        if (intValue == 2) {
            this.f316224d.f33233xd426afc1 = str;
        }
        this.f316225e.mo146xb9724478(java.lang.Integer.valueOf(intValue));
        return jz5.f0.f384359a;
    }
}
