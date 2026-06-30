package gi2;

/* loaded from: classes10.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public gi2.f f353800a;

    /* renamed from: b, reason: collision with root package name */
    public int f353801b;

    public android.view.View a(int i17) {
        gi2.e eVar = (gi2.e) this;
        xh2.a g17 = eVar.g(i17);
        int h17 = eVar.h(g17);
        java.lang.String str = g17.b() + '@' + eVar.h(g17) + '@' + g17.f536054b.f536086e;
        java.lang.String i18 = eVar.i();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemView pos: ");
        sb6.append(i17);
        sb6.append(" key: ");
        sb6.append(str);
        sb6.append(" micType: ");
        sb6.append(h17);
        sb6.append(" viewCache: ");
        java.util.HashMap hashMap = eVar.f353805f;
        sb6.append(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i18, sb6.toString());
        android.view.View view = (android.view.View) hashMap.get(str);
        if (view == null) {
            view = eVar.f(g17, h17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hashMap.put(str, view);
        return view;
    }

    public abstract gi2.g b();

    public final void c() {
        gi2.g b17;
        gi2.f fVar = this.f353800a;
        if (fVar != null) {
            if (fVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("layout");
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527 c14233xcca2a527 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.mic.p1507xaf968b71.C14233xcca2a527) fVar;
            gi2.d dVar = c14233xcca2a527.f193233w;
            if (dVar == null || (b17 = dVar.b()) == null) {
                return;
            }
            b17.a(c14233xcca2a527);
            c14233xcca2a527.setTag(((gi2.c) b17).f353799a);
        }
    }

    public abstract void d(int i17, android.view.View view);
}
