package ij5;

/* loaded from: classes.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ij5.t f373302d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ij5.t tVar) {
        super(0);
        this.f373302d = tVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(com.p314xaae8f345.mm.ui.p2690x38b72420.i5.b());
        ij5.t tVar = this.f373302d;
        java.lang.String stringExtra = tVar.m158359x1e885992().getStringExtra("Select_block_List");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
            hashSet.addAll(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P1(stringExtra != null ? (java.lang.String[]) new r26.t(",").g(stringExtra, 0).toArray(new java.lang.String[0]) : null));
        }
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(((java.lang.Number) ((jz5.n) tVar.f373336h).mo141623x754a37bb()).intValue(), 2)) {
            java.util.HashSet i17 = c01.e2.i();
            i17.remove("filehelper");
            hashSet.addAll(i17);
        }
        return hashSet;
    }
}
