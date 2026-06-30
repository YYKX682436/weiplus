package zv;

/* loaded from: classes9.dex */
public final class y2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f557670d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f557671e;

    public y2(yz5.l lVar, java.util.List list) {
        this.f557670d = lVar;
        this.f557671e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        java.util.List list = this.f557671e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(zv.q.f557612a.d((java.lang.String) it.next()));
        }
        this.f557670d.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(arrayList)));
    }
}
