package iv0;

/* loaded from: classes5.dex */
public final class b extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dv9, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new iv0.a(this, inflate);
    }
}
