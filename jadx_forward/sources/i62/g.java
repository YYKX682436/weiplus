package i62;

/* loaded from: classes13.dex */
public final class g implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public long f370476a = -1;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f370477b = "";

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String resName = this.f370477b;
        long nanoTime = this.f370476a != -1 ? java.lang.System.nanoTime() - this.f370476a : -1L;
        this.f370476a = -1L;
        this.f370477b = "";
        if (nanoTime != -1) {
            if (resName == null || r26.n0.N(resName)) {
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016();
            i62.o oVar = i62.o.f370496a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resName, "resName");
            i62.o.f370498c.add(new i62.j(resName, nanoTime, 4, -1));
        }
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
            java.util.Objects.toString(obj);
            i62.i.f370481a.a(objArr, "args");
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "open") || objArr == null) {
            return;
        }
        if (!(objArr.length == 0)) {
            java.lang.Object obj2 = objArr[0];
            java.lang.String str6 = obj2 instanceof java.lang.String ? (java.lang.String) obj2 : null;
            if (str6 == null) {
                return;
            }
            this.f370476a = java.lang.System.nanoTime();
            this.f370477b = str6;
        }
    }
}
