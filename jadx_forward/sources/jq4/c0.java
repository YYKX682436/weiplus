package jq4;

/* loaded from: classes5.dex */
public final class c0 {

    /* renamed from: c, reason: collision with root package name */
    public android.widget.TextView f382664c;

    /* renamed from: d, reason: collision with root package name */
    public int f382665d;

    /* renamed from: e, reason: collision with root package name */
    public int f382666e;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String[] f382662a = {""};

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String[] f382663b = {"...", "", ".", ".."};

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f382667f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new jq4.b0(this), true);

    public final void a(android.widget.TextView tv6, java.lang.String baseStr, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tv6, "tv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseStr, "baseStr");
        b();
        this.f382666e = 0;
        this.f382664c = tv6;
        this.f382665d = i17;
        java.lang.String[] strArr = this.f382663b;
        java.util.ArrayList arrayList = new java.util.ArrayList(strArr.length);
        for (java.lang.String str : strArr) {
            arrayList.add(baseStr + str);
        }
        this.f382662a = (java.lang.String[]) arrayList.toArray(new java.lang.String[0]);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f382667f;
        if (b4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var);
            long j17 = this.f382665d;
            b4Var.c(j17, j17);
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.DynamicTextWrap", "start textview:" + tv6, new java.lang.Object[0]);
    }

    public final void b() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = this.f382667f;
        if (b4Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(b4Var);
            b4Var.d();
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("MicroMsg.DynamicTextWrap", "stop textview: " + this.f382664c, new java.lang.Object[0]);
        this.f382664c = null;
    }
}
