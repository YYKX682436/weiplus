package im2;

/* loaded from: classes3.dex */
public final class d1 implements nl5.a0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ im2.z3 f373820a;

    public d1(im2.z3 z3Var) {
        this.f373820a = z3Var;
    }

    @Override // nl5.a0
    public void a(android.view.View v17, nl5.z item, java.lang.String curSelect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curSelect, "curSelect");
        if (item.f419931b == 6) {
            this.f373820a.d7().append("\n");
        }
    }

    @Override // nl5.a0
    public void b(java.util.List items, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(items, "items");
        if (i17 == 8 || i17 == 1) {
            return;
        }
        java.lang.String string = this.f373820a.m80379x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575222la5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        items.add(new nl5.z(string, 6));
    }
}
