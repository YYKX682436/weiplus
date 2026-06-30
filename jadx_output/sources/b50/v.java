package b50;

/* loaded from: classes9.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f17991d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f17992e;

    public v(yz5.l lVar, java.util.List list) {
        this.f17991d = lVar;
        this.f17992e = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        java.util.List list = this.f17992e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(yw.h1.f466332a.h((java.lang.String) it.next()));
        }
        this.f17991d.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl(arrayList)));
    }
}
