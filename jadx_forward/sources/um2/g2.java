package um2;

/* loaded from: classes3.dex */
public final class g2 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f510339d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fm2.c f510340e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g2(android.view.ViewGroup viewGroup, fm2.c cVar) {
        super(0);
        this.f510339d = viewGroup;
        this.f510340e = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.ViewGroup viewGroup = this.f510339d;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ozm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f566373fo5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.le0(viewGroup, (android.widget.ImageView) findViewById, (android.view.ViewGroup) findViewById2, this.f510340e);
    }
}
