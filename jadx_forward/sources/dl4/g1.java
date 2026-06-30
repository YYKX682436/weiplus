package dl4;

/* loaded from: classes3.dex */
public final class g1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316935d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ff0.z f316936e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 f316937f;

    public g1(java.lang.String str, ff0.z zVar, com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var) {
        this.f316935d = str;
        this.f316936e = zVar;
        this.f316937f = w1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.ArrayList arrayList = (java.util.ArrayList) dl4.m1.f316969a.remove(this.f316935d);
        if (arrayList != null) {
            arrayList.size();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                final dl4.f1 f1Var = new dl4.f1((ff0.x) it.next(), this.f316936e);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.w1 w1Var = this.f316937f;
                if (w1Var != null) {
                    ((com.p314xaae8f345.mm.sdk.p2603x2137b148.c4) w1Var).a(new java.lang.Runnable(f1Var) { // from class: dl4.l1

                        /* renamed from: d, reason: collision with root package name */
                        public final /* synthetic */ yz5.a f316965d;

                        {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(f1Var, "function");
                            this.f316965d = f1Var;
                        }

                        @Override // java.lang.Runnable
                        public final /* synthetic */ void run() {
                            this.f316965d.mo152xb9724478();
                        }
                    });
                } else {
                    pm0.v.X(f1Var);
                }
            }
        }
    }
}
