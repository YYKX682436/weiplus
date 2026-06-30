package pw0;

/* loaded from: classes5.dex */
public final class s extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final yo0.i f440198h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f440198h = fVar.a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfm, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new pw0.r(this, inflate);
    }

    public final void z(int i17, zu0.i loadedState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedState, "loadedState");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f357503d;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            arrayList.set(i17, sw0.d.a((sw0.d) obj, null, loadedState, false, null, 13, null));
            m8147xed6e4d18(i17);
        }
    }
}
