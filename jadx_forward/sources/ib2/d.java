package ib2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ib2.w f371634d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(ib2.w wVar) {
        super(1);
        this.f371634d = wVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        ib2.w wVar = this.f371634d;
        java.lang.String str = wVar.f371705w;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("authorUsername");
            throw null;
        }
        intent.putExtra("finder_username", str);
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).mk(wVar.m80379x76847179(), intent);
        return jz5.f0.f384359a;
    }
}
