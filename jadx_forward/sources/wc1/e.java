package wc1;

/* loaded from: classes7.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f526003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f526004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f526005f;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str) {
        this.f526003d = yVar;
        this.f526004e = i17;
        this.f526005f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc1.p.x(this.f526003d, java.lang.String.valueOf(this.f526004e), "fail", this.f526005f);
    }
}
