package cs2;

/* loaded from: classes2.dex */
public final class e extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f303599a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cs2.i f303600b;

    public e(r45.qt2 qt2Var, cs2.i iVar) {
        this.f303599a = qt2Var;
        this.f303600b = iVar;
    }

    @Override // in5.p
    public float a(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return 0.1f;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recordsSet, "recordsSet");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onExposeTimeRecorded: size = ");
        sb6.append(recordsSet.size());
        sb6.append(", commentScene=");
        r45.qt2 qt2Var = this.f303599a;
        sb6.append(qt2Var.m75939xb282bd08(5));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GridFeedPreloadCore", sb6.toString());
        java.util.Iterator it = recordsSet.iterator();
        while (it.hasNext()) {
            this.f303600b.c((in5.j) it.next(), qt2Var);
        }
    }

    @Override // in5.p
    public void d(in5.j item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        this.f303600b.d(item, this.f303599a);
    }
}
