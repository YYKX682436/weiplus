package nu4;

/* loaded from: classes7.dex */
public final class m implements lu4.w {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f421790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f421791e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f421792f;

    public m(java.lang.String str, java.lang.String str2, nu4.b0 b0Var) {
        this.f421791e = str2;
        this.f421792f = b0Var;
        this.f421790d = str;
    }

    @Override // lu4.w
    /* renamed from: getId */
    public java.lang.String mo54383x5db1b11() {
        return this.f421790d;
    }

    @Override // lu4.w
    public void m(int i17) {
        java.lang.String str = this.f421791e;
        nu4.b0 b0Var = this.f421792f;
        try {
            nu4.k kVar = nu4.b0.f421774J;
            ((com.p314xaae8f345.mm.sdk.p2603x2137b148.o4) nu4.b0.L.i()).A(str + "-MinBizPkgVersion", i17);
            java.lang.String str2 = b0Var.C;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(b0Var.C, e17, "setMinBizPkgVersion:" + str + ", " + i17, new java.lang.Object[0]);
        }
    }

    @Override // lu4.c
    public void t(java.lang.String eventType, java.lang.String event, android.webkit.ValueCallback valueCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventType, "eventType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        this.f421792f.t(eventType, event, valueCallback);
    }
}
