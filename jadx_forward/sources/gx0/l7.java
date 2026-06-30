package gx0;

/* loaded from: classes5.dex */
public final class l7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358203e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l7(gx0.w8 w8Var, java.lang.String str) {
        super(1);
        this.f358202d = w8Var;
        this.f358203e = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepareExport: cancelExporting message ");
        sb6.append(th6 != null ? th6.getMessage() : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", sb6.toString());
        gx0.w8.k7(this.f358202d, this.f358203e);
        return jz5.f0.f384359a;
    }
}
