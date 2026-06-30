package cl1;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f124426d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl1.r f124427e;

    public q(cl1.r rVar, java.util.List list) {
        this.f124427e = rVar;
        this.f124426d = list;
    }

    @Override // java.lang.Runnable
    public void run() {
        cl1.r rVar = this.f124427e;
        int size = rVar.f124428d.f172617h2.size() - 1;
        rVar.f124428d.f172617h2.remove(size);
        java.util.ArrayList arrayList = rVar.f124428d.f172617h2;
        java.util.List list = this.f124426d;
        arrayList.addAll(list);
        rVar.f124428d.f172629t2 = r2.f172617h2.size() - 1;
        rVar.f124428d.h1();
        int size2 = list.size();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDesktopView", "next page get newSize:%d nowTotal:%d search:%b", java.lang.Integer.valueOf(size2), java.lang.Integer.valueOf(rVar.f124428d.f172617h2.size()), java.lang.Boolean.valueOf(rVar.f124428d.f172620k2));
        if (size2 > 0) {
            rVar.f124428d.f172626q2.m8155x27702c4(size);
            rVar.f124428d.f172626q2.m8153xd399a4d9(size, size2 + 1);
        } else {
            rVar.f124428d.f172626q2.m8147xed6e4d18(size);
        }
        rVar.f124428d.f172621l2 = false;
    }
}
