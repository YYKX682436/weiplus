package cl1;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f42893d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.r f42894e;

    public q(cl1.r rVar, java.util.List list) {
        this.f42894e = rVar;
        this.f42893d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl1.r rVar = this.f42894e;
        int size = rVar.f42895d.f91084h2.size() - 1;
        rVar.f42895d.f91084h2.remove(size);
        java.util.ArrayList arrayList = rVar.f42895d.f91084h2;
        java.util.List list = this.f42893d;
        arrayList.addAll(list);
        rVar.f42895d.f91096t2 = r2.f91084h2.size() - 1;
        rVar.f42895d.h1();
        int size2 = list.size();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandDesktopView", "next page get newSize:%d nowTotal:%d search:%b", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(rVar.f42895d.f91084h2.size()), java.lang.Boolean.valueOf(rVar.f42895d.f91087k2));
        if (size2 > 0) {
            rVar.f42895d.f91093q2.notifyItemRemoved(size);
            rVar.f42895d.f91093q2.notifyItemRangeInserted(size, size2 + 1);
        } else {
            rVar.f42895d.f91093q2.notifyItemChanged(size);
        }
        rVar.f42895d.f91088l2 = false;
    }
}
