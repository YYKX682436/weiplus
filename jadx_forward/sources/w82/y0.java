package w82;

/* loaded from: classes11.dex */
public final class y0 implements db5.t6 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 f525480d;

    public y0(com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504) {
        this.f525480d = c13624x28778504;
    }

    @Override // db5.t6
    public void a(java.lang.String str) {
    }

    @Override // db5.t6
    public void c() {
    }

    @Override // db5.t6
    public void d(java.lang.String str) {
    }

    @Override // db5.t6
    public void f(java.lang.String str) {
    }

    @Override // db5.t6
    public void g(java.lang.String str) {
        w82.o0 o0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.p1416xd1075a44.C13624x28778504 c13624x28778504 = this.f525480d;
        c13624x28778504.f183097y0 = c13624x28778504.f183096x0;
        c13624x28778504.f183096x0 = str;
        c13624x28778504.f183093l1 = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopTagPanel", "[onTagEditTextChange] lastText = " + c13624x28778504.f183097y0 + ", currText = " + c13624x28778504.f183096x0 + ", curText = " + str);
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c13624x28778504.f183097y0, str) || (o0Var = c13624x28778504.S) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTopFilter", "[onContentChange] content = " + str);
        com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.z7.a(((com.p314xaae8f345.mm.p1006xc5476f33.fav.ui.u7) o0Var).f183005a);
    }

    @Override // db5.t6
    public void h(java.lang.String str) {
    }

    @Override // db5.t6
    public void j(boolean z17, int i17) {
    }
}
