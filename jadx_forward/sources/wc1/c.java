package wc1;

/* loaded from: classes7.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f525997d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f525998e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f525999f;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar, int i17, java.lang.String str) {
        this.f525997d = yVar;
        this.f525998e = i17;
        this.f525999f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wc1.p.x(this.f525997d, java.lang.String.valueOf(this.f525998e), ya.b.f77504xbb80cbe3, this.f525999f);
    }
}
