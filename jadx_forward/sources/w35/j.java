package w35;

/* loaded from: classes8.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ w35.l f524270d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f524271e;

    public j(w35.l lVar, java.util.ArrayList arrayList) {
        this.f524270d = lVar;
        this.f524271e = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w35.a aVar = this.f524270d.f524257b;
        if (aVar != null) {
            aVar.a(this.f524271e);
        }
    }
}
