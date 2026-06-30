package dr0;

/* loaded from: classes8.dex */
public final class k implements m3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ dr0.m f323984a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f323985b;

    public k(dr0.m mVar, long j17) {
        this.f323984a = mVar;
        this.f323985b = j17;
    }

    @Override // m3.a
    /* renamed from: accept */
    public void mo3938xab27b508(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(bm5.f1.a(), str);
        long j17 = this.f323985b;
        if (b17) {
            this.f323984a.Di(j17);
        } else {
            com.p314xaae8f345.mm.p794xb0fa9b5e.d0.d(str, new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10755xa1fef898(j17), dr0.e.class, null);
        }
    }
}
