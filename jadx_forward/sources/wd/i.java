package wd;

/* loaded from: classes7.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wd.k f526219d;

    public i(wd.k kVar) {
        this.f526219d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        wd.k kVar = this.f526219d;
        kVar.a();
        wd.j jVar = new wd.j(kVar);
        ah.i.f86248a = jVar;
        g8.g.f350942a = new ah.h(jVar);
    }
}
