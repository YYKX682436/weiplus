package bg2;

/* loaded from: classes12.dex */
public final class h7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20144d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.protobuf.f f20145e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20146f;

    public h7(int i17, com.tencent.mm.protobuf.f fVar, bg2.j7 j7Var) {
        this.f20144d = i17;
        this.f20145e = fVar;
        this.f20146f = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update req for ");
        int i17 = this.f20144d;
        sb6.append(i17);
        sb6.append(' ');
        com.tencent.mm.protobuf.f fVar = this.f20145e;
        sb6.append(fVar);
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb6.toString());
        bg2.j7 j7Var = this.f20146f;
        java.util.Iterator it = j7Var.f20211a.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((bg2.r6) obj).f20469d == i17) {
                    break;
                }
            }
        }
        bg2.r6 r6Var = obj instanceof bg2.r6 ? (bg2.r6) obj : null;
        if (r6Var != null) {
            kotlin.jvm.internal.o.g(fVar, "<set-?>");
            r6Var.f20470e = fVar;
        }
        java.lang.Object obj2 = j7Var.f20212b.get(java.lang.Integer.valueOf(i17));
        bg2.r6 r6Var2 = obj2 instanceof bg2.r6 ? (bg2.r6) obj2 : null;
        if (r6Var2 == null) {
            return;
        }
        kotlin.jvm.internal.o.g(fVar, "<set-?>");
        r6Var2.f20470e = fVar;
    }
}
