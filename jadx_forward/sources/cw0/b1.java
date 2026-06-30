package cw0;

/* loaded from: classes5.dex */
public final class b1 extends gv0.b {

    /* renamed from: h, reason: collision with root package name */
    public final yo0.i f304148h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(yz5.p onItemClickListener) {
        super(null, onItemClickListener, 0L, 5, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onItemClickListener, "onItemClickListener");
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f304148h = fVar.a();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        dw0.c cVar = (dw0.c) kz5.n0.a0(this.f357503d, i17);
        if (cVar != null) {
            com.p314xaae8f345.p457x3304c6.p476x11d36527.C4104x6d422cb2 c4104x6d422cb2 = dw0.c.f325616e;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(cVar.f325619a, dw0.c.f325618g)) {
                cw0.z0 z0Var = cw0.a1.f304139e;
                return 1;
            }
        }
        cw0.z0 z0Var2 = cw0.a1.f304139e;
        return 0;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        cw0.a1.f304139e.getClass();
        java.util.Iterator it = ((kz5.h) cw0.a1.f304142h).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((cw0.a1) obj).f304143d == i17) {
                break;
            }
        }
        cw0.a1 a1Var = (cw0.a1) obj;
        if (a1Var == null) {
            a1Var = cw0.a1.f304140f;
        }
        int ordinal = a1Var.ordinal();
        if (ordinal == 0) {
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.djr, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
            return new cw0.y0(this, inflate);
        }
        if (ordinal != 1) {
            throw new jz5.j();
        }
        android.content.Context context = parent.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return new cw0.x0(this, new com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10969x3d09e81(context, null, 0, 6, null));
    }

    public final void z(int i17, zu0.i loadedState) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadedState, "loadedState");
        java.util.ArrayList arrayList = this.f357503d;
        boolean z17 = false;
        if (i17 >= 0 && i17 < arrayList.size()) {
            z17 = true;
        }
        if (z17) {
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            arrayList.set(i17, dw0.c.a((dw0.c) obj, null, null, loadedState, false, 11, null));
            m8147xed6e4d18(i17);
        }
    }
}
