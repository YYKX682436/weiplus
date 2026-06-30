package qw2;

/* loaded from: classes10.dex */
public final class j extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qw2.k f448663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 f448664e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(qw2.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.p1657x8f55093d.C15211x75b8b4d3 c15211x75b8b4d3) {
        super(1);
        this.f448663d = kVar;
        this.f448664e = c15211x75b8b4d3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a loadMoreCallback;
        if (((java.lang.Number) obj).intValue() >= this.f448663d.f448667c.mo1894x7e414b06() - 4 && (loadMoreCallback = this.f448664e.getLoadMoreCallback()) != null) {
            loadMoreCallback.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
