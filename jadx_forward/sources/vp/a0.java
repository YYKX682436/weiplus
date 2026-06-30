package vp;

/* loaded from: classes16.dex */
public class a0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f520262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vp.c0 f520263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vp.d0 f520264f;

    public a0(vp.d0 d0Var, java.util.List list, vp.c0 c0Var) {
        this.f520264f = d0Var;
        this.f520262d = list;
        this.f520263e = c0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f520262d.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            vp.d0 d0Var = this.f520264f;
            if (!hasNext) {
                d0Var.f520300e.mo50293x3498a0(new vp.z(this, arrayList));
                return;
            } else {
                wp.a aVar = (wp.a) it.next();
                arrayList.add(android.util.Pair.create(aVar, aVar.n() ? null : d0Var.f520299d.c(aVar).b(aVar)));
            }
        }
    }
}
