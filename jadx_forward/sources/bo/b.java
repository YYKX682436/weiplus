package bo;

/* loaded from: classes12.dex */
public final class b extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public q31.n f104500e;

    @Override // in5.r
    public android.view.View c(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        if (this.f104500e == null) {
            ((zn5.l) ((zn5.k) i95.n0.c(zn5.k.class))).Zi();
            io.h hVar = new io.h();
            hVar.f374941b = null;
            this.f104500e = hVar;
        }
        q31.n nVar = this.f104500e;
        if (nVar == null) {
            return null;
        }
        android.content.Context context = recyclerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        return ((io.h) nVar).a(context);
    }

    @Override // in5.r
    public in5.s0 d(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, android.view.View convertView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(convertView, "convertView");
        return new bo.a(convertView, this.f104500e);
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        q31.n nVar;
        bo.c item = (bo.c) cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if ((holder instanceof bo.a) && (nVar = ((bo.a) holder).f104499o) != null) {
            nVar.b(null);
        }
    }

    @Override // in5.r
    public void i(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
    }
}
