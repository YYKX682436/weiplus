package ui1;

/* loaded from: classes7.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f509558a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f509559b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f509560c;

    /* renamed from: d, reason: collision with root package name */
    public final int f509561d;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y env, java.lang.String api, java.lang.String str, java.lang.String str2, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(api, "api");
        this.f509558a = env;
        this.f509559b = api;
        this.f509560c = str2;
        this.f509561d = i17;
    }

    /* renamed from: toString */
    public java.lang.String m168077x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("JsAuthExecuteContext(appId='");
        sb6.append(this.f509558a.mo48798x74292566());
        sb6.append("', api='");
        sb6.append(this.f509559b);
        sb6.append("', privateArgs='");
        java.lang.String str = this.f509560c;
        if (str == null) {
            str = "";
        }
        sb6.append(str);
        sb6.append("', callbackId=");
        sb6.append(this.f509561d);
        sb6.append(')');
        return sb6.toString();
    }
}
