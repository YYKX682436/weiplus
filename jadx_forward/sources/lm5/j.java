package lm5;

/* loaded from: classes7.dex */
public class j extends lm5.d {

    /* renamed from: d, reason: collision with root package name */
    public final lm5.a f401150d;

    /* renamed from: e, reason: collision with root package name */
    public final android.os.Looper f401151e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401152f;

    public j(lm5.a aVar, java.lang.String str) {
        this.f401151e = aVar.mo146067x23b2dd47();
        this.f401150d = aVar;
        this.f401152f = str;
    }

    @Override // lm5.d
    public void a(java.lang.Runnable runnable) {
        this.f401150d.mo146068x3498a0(runnable);
    }

    @Override // lm5.d
    public void b(java.lang.Runnable runnable, long j17) {
        lm5.a aVar = this.f401150d;
        if (j17 >= 0) {
            aVar.mo146069x7c4d7ca2(runnable, j17);
        } else {
            aVar.mo146068x3498a0(runnable);
        }
    }

    @Override // lm5.d
    public void c() {
        this.f401150d.a();
    }

    @Override // lm5.d
    public java.lang.String d() {
        return this.f401152f;
    }

    /* renamed from: toString */
    public java.lang.String m146072x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("SingleScheduler{, mLooper=");
        android.os.Looper looper = this.f401151e;
        sb6.append(looper);
        sb6.append(", mType='");
        sb6.append(this.f401152f);
        sb6.append("', Thread =");
        sb6.append(looper.getThread());
        sb6.append(", Object=");
        sb6.append(super.toString());
        sb6.append('}');
        return sb6.toString();
    }

    public j(android.os.Looper looper, java.lang.String str) {
        this(new lm5.b(new android.os.Handler(looper)), str);
    }
}
