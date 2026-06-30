package df2;

/* loaded from: classes10.dex */
public final class ts implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ df2.lt f313003a;

    public ts(df2.lt ltVar) {
        this.f313003a = ltVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862;
        in5.c cVar = this.f313003a.f312243r;
        java.lang.Integer num = null;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null && (c19786x6a1e2862 = hVar.f315074d) != null) {
            num = java.lang.Integer.valueOf(c19786x6a1e2862.m76503x92bc3c07());
        }
        return kz5.b1.e(new jz5.l("banner_jump_type", num));
    }
}
