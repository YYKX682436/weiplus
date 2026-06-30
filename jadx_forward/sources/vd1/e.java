package vd1;

/* loaded from: classes7.dex */
public final class e implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.p f517102a;

    public e(yz5.p pVar) {
        this.f517102a = pVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        boolean z17 = obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p;
        yz5.p pVar = this.f517102a;
        if (z17) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, obj);
        } else if (obj instanceof java.lang.Throwable) {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.SEND, 0, ((java.lang.Throwable) obj).getMessage(), null));
        } else {
            pVar.mo149xb9724478(java.lang.Boolean.FALSE, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.p(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.o.SEND, 0, obj != null ? obj.toString() : null, null));
        }
    }
}
