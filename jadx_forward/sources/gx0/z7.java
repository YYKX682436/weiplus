package gx0;

/* loaded from: classes5.dex */
public final class z7 implements com.p314xaae8f345.p457x3304c6.p479x4179489f.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358804a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f358805b;

    public z7(gx0.w8 w8Var, java.lang.String str) {
        this.f358804a = w8Var;
        this.f358805b = str;
    }

    @Override // com.p314xaae8f345.p457x3304c6.p479x4179489f.j
    /* renamed from: onComplete */
    public final void mo34326x815f5438(com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b c4093x6b88526b) {
        com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC maasEC;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startExporting: cancelExporting errorCode ");
        sb6.append((c4093x6b88526b == null || (maasEC = c4093x6b88526b.f129708ec) == null) ? null : java.lang.Integer.valueOf(maasEC.m33752x130a215f()));
        sb6.append(" message ");
        sb6.append(c4093x6b88526b != null ? c4093x6b88526b.f16057x38eb0007 : null);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MovieComp.MainComposingUIC", sb6.toString());
        gx0.w8.k7(this.f358804a, this.f358805b);
    }
}
