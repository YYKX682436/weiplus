package a32;

/* loaded from: classes10.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd f82563d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd) {
        super(1);
        this.f82563d = c13395xf82efecd;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        yz5.a loadMoreCallback;
        int intValue = ((java.lang.Number) obj).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.p1378x7aef8c40.ui.p1380x20efc746.C13395xf82efecd c13395xf82efecd = this.f82563d;
        if (intValue >= c13395xf82efecd.f180218y.mo1894x7e414b06() - c13395xf82efecd.A && (loadMoreCallback = c13395xf82efecd.getLoadMoreCallback()) != null) {
            loadMoreCallback.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
