package dl4;

/* loaded from: classes3.dex */
public final class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f316948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316949f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ff0.x f316950g;

    public i1(java.lang.String str, android.graphics.Bitmap bitmap, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var, ff0.x xVar) {
        this.f316947d = str;
        this.f316948e = bitmap;
        this.f316949f = w1Var;
        this.f316950g = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.HashMap hashMap = dl4.m1.f316969a;
        java.util.HashMap hashMap2 = dl4.m1.f316969a;
        java.lang.String str = this.f316947d;
        java.lang.Object obj = hashMap2.get(str);
        ff0.x xVar = this.f316950g;
        if (obj != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) obj;
            if (!arrayList.isEmpty()) {
                if (xVar != null) {
                    arrayList.add(xVar);
                    return;
                }
                return;
            }
        }
        if (obj == null) {
            obj = new java.util.ArrayList();
        }
        if (xVar != null) {
            ((java.util.ArrayList) obj).add(xVar);
        }
        hashMap2.put(str, obj);
        rk4.g4 g4Var = rk4.g4.f478207a;
        dl4.k1 k1Var = new dl4.k1(str, this.f316949f);
        android.graphics.Bitmap bitmap = this.f316948e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "bitmap");
        jz5.l c17 = g4Var.c(bitmap);
        if (c17 == null) {
            k1Var.mo146xb9724478(null);
            return;
        }
        ((jm4.w5) rk4.g4.f478208b).a((byte[]) c17.f384366d, (bw5.tq0) c17.f384367e, new rk4.d4(k1Var));
    }
}
