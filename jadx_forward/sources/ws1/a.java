package ws1;

/* loaded from: classes7.dex */
public final class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs1.d f530506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xs1.b f530507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f530508f;

    public a(xs1.d dVar, xs1.b bVar, long j17) {
        this.f530506d = dVar;
        this.f530507e = bVar;
        this.f530508f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = ws1.d.f530519a;
        xs1.d dVar = this.f530506d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(dVar.f537829a);
        xs1.b bVar = this.f530507e;
        if (arrayList != null && !arrayList.isEmpty()) {
            java.lang.String str = dVar.f537829a;
            arrayList.add(bVar);
            return;
        }
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        arrayList.add(bVar);
        hashMap.put(dVar.f537829a, arrayList);
        ws1.d.b(this.f530508f, dVar, bVar, false);
    }
}
