package wu;

/* loaded from: classes9.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu.w0 f531154d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(wu.w0 w0Var) {
        super(2);
        this.f531154d = w0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        android.view.View v17 = (android.view.View) obj;
        hu.b item = (hu.b) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        s15.s y17 = item.f366530e.y();
        if (y17 != null) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("key_member_inlet_source", 5);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            android.content.Context context = v17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String authorFinderUsername = y17.m163622x6c03c64c();
            int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(this.f531154d.f531143e.q()) ? 3 : 2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(authorFinderUsername, "authorFinderUsername");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ((c61.ub) i95.n0.c(c61.ub.class))).Nk(context, intent, authorFinderUsername, i17, 3);
        }
        return jz5.f0.f384359a;
    }
}
