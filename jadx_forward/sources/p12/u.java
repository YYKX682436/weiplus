package p12;

/* loaded from: classes10.dex */
public final class u extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p12.w f432585d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(p12.w wVar) {
        super(2);
        this.f432585d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        p12.w wVar = this.f432585d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13261x57992c3a c13261x57992c3a = wVar.f432588h;
        if (c13261x57992c3a != null) {
            c13261x57992c3a.post(new p12.t(wVar, longValue, bitmap));
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("trimView");
        throw null;
    }
}
