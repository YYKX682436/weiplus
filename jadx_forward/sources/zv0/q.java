package zv0;

/* loaded from: classes5.dex */
public final class q extends gv0.b {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dlx, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        return new zv0.p(this, inflate);
    }

    public final void z(int i17, zu0.i loadedState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedState, "loadedState");
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f357503d;
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            arrayList.set(i17, zv0.r.a((zv0.r) obj, null, loadedState, false, 5, null));
            m8147xed6e4d18(i17);
        }
    }
}
