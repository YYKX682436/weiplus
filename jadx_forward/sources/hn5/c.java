package hn5;

/* loaded from: classes3.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 f364146a;

    public abstract int a();

    public abstract java.lang.Object b(int i17);

    public abstract android.view.View c(int i17, java.lang.Object obj);

    public final com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 d() {
        com.p314xaae8f345.mm.p2776x373aa5.p2785x674500b.C22840x82866af5 c22840x82866af5 = this.f364146a;
        if (c22840x82866af5 != null) {
            return c22840x82866af5;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layout");
        throw null;
    }

    public abstract hn5.b e(int i17);

    public void f() {
        if (this.f364146a != null) {
            d().m82882xfd37656d().b();
        }
    }

    public void g(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
    }
}
