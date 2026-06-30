package l45;

/* loaded from: classes10.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f397986d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l45.l f397987e;

    public k(l45.l lVar, android.graphics.Bitmap bitmap) {
        this.f397987e = lVar;
        this.f397986d = bitmap;
    }

    @Override // java.lang.Runnable
    public void run() {
        l45.l lVar = this.f397987e;
        java.util.Iterator it = lVar.f397992h.f397996d.iterator();
        while (it.hasNext()) {
            ((dl.b) it.next()).E(true);
        }
        lVar.f397988d.a(this.f397986d, lVar.f397989e);
        lVar.f397992h.f397993a.m177310x5143ab24().invalidate();
    }
}
