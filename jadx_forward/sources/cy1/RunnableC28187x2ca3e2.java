package cy1;

/* renamed from: cy1.a$$c */
/* loaded from: classes9.dex */
public final /* synthetic */ class RunnableC28187x2ca3e2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cy1.a f306239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iy1.a f306240e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f306241f;

    public /* synthetic */ RunnableC28187x2ca3e2(cy1.a aVar, iy1.a aVar2, int i17) {
        this.f306239d = aVar;
        this.f306240e = aVar2;
        this.f306241f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cy1.a aVar = this.f306239d;
        aVar.getClass();
        int i17 = this.f306240e.f377280d;
        sy1.f fVar = aVar.f306223m;
        java.util.List e17 = fVar.e();
        java.util.Map map = fVar.f495392n;
        if (this.f306241f == 1) {
            java.util.ArrayList arrayList = (java.util.ArrayList) e17;
            if (arrayList.size() - 2 >= 0) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), (java.lang.String) arrayList.get(arrayList.size() - 2));
            }
        } else {
            java.util.ArrayList arrayList2 = (java.util.ArrayList) e17;
            if (arrayList2.size() - 1 >= 0) {
                ((java.util.HashMap) map).put(java.lang.Integer.valueOf(i17), (java.lang.String) arrayList2.get(arrayList2.size() - 1));
            }
        }
        java.util.Map map2 = fVar.f495391m;
        ((java.util.HashMap) map2).put(java.lang.Integer.valueOf(i17), i17 + "-" + java.lang.System.currentTimeMillis());
    }
}
