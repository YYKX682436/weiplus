package p12;

/* loaded from: classes10.dex */
public final class x extends p12.w {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1366xb20c216d.p1367x4fe3eeaf.C13258x5720669f previewLayout) {
        super(activity, previewLayout);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewLayout, "previewLayout");
    }

    @Override // p12.w
    public l12.a d() {
        this.f432559e = this.f432557c < 5000 ? new android.util.Range(500, java.lang.Integer.valueOf(this.f432557c)) : new android.util.Range(500, 5000);
        int i17 = this.f432557c;
        this.f432591k = i17 < 5000 ? new android.util.Range(0, java.lang.Integer.valueOf(this.f432557c)) : i17 < 8000 ? i17 - 5000 < 500 ? new android.util.Range(java.lang.Integer.valueOf(this.f432557c - 500), java.lang.Integer.valueOf(this.f432557c)) : new android.util.Range(5000, java.lang.Integer.valueOf(this.f432557c)) : new android.util.Range(5000, 8000);
        f(true);
        return l12.a.f396513e;
    }
}
