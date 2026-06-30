package jn2;

/* loaded from: classes5.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.j f382153d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f382154e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f382155f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f382156g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.zw1 f382157h;

    public h(jn2.j jVar, int i17, java.util.LinkedList linkedList, int i18, r45.zw1 zw1Var) {
        this.f382153d = jVar;
        this.f382154e = i17;
        this.f382155f = linkedList;
        this.f382156g = i18;
        this.f382157h = zw1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jn2.j jVar = this.f382153d;
        int i17 = this.f382154e;
        jVar.h0(i17, this.f382155f, this.f382156g, this.f382157h);
        if (i17 != 0) {
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff = jVar.f382165J;
            if (c2718xca2902ff == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("tabLayout");
                throw null;
            }
            oa.i k17 = c2718xca2902ff.k(i17);
            if (k17 != null) {
                k17.b();
            }
        }
    }
}
