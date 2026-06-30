package va2;

/* loaded from: classes.dex */
public final class e extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f515768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1662x2e7b10.C15389xa972d578 f515769e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1662x2e7b10.C15389xa972d578 c15389xa972d578) {
        super(1);
        this.f515768d = c19782x23db1cfa;
        this.f515769e = c15389xa972d578;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("finder_username", this.f515768d.m76197x6c03c64c());
        intent.putExtra("key_enter_profile_type", 38);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0 i0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
        android.content.Context context = this.f515769e.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        i0Var.mk(context, intent);
        return jz5.f0.f384359a;
    }
}
