package ry2;

/* loaded from: classes10.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.r {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.fp5 f482936d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(r45.fp5 fp5Var) {
        super(4);
        this.f482936d = fp5Var;
    }

    @Override // yz5.r
    public java.lang.Object C(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, java.lang.Object obj4) {
        java.lang.String coverUrl = (java.lang.String) obj;
        java.lang.String fullCoverUrl = (java.lang.String) obj2;
        java.lang.String shareCoverUrl = (java.lang.String) obj3;
        int intValue = ((java.lang.Number) obj4).intValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fullCoverUrl, "fullCoverUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(shareCoverUrl, "shareCoverUrl");
        r45.fp5 fp5Var = this.f482936d;
        fp5Var.f456061d = coverUrl;
        fp5Var.f456062e = fullCoverUrl;
        fp5Var.f456069o = shareCoverUrl;
        fp5Var.f456063f = intValue;
        return jz5.f0.f384359a;
    }
}
