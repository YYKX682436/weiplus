package dl4;

/* loaded from: classes3.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f316903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f316904f;

    public b1(java.lang.String str, boolean z17, long j17, java.lang.Object[] objArr) {
        this.f316902d = str;
        this.f316903e = z17;
        this.f316904f = objArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.d1.f316917b.remove(this.f316902d);
        if (arrayList != null) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((p11.d) it.next()).a(this.f316903e, this.f316904f);
            }
        }
    }
}
