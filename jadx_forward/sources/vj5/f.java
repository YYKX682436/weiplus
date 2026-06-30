package vj5;

/* loaded from: classes7.dex */
public class f extends android.content.MutableContextWrapper {

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f519227c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f519228a;

    /* renamed from: b, reason: collision with root package name */
    public vj5.e f519229b;

    public f(android.content.MutableContextWrapper mutableContextWrapper) {
        super(mutableContextWrapper);
        this.f519228a = true;
    }

    @Override // android.content.MutableContextWrapper
    public void setBaseContext(android.content.Context context) {
        if (!this.f519228a) {
            super.setBaseContext(context);
            return;
        }
        if (context == getBaseContext()) {
            return;
        }
        ((android.content.MutableContextWrapper) getBaseContext()).setBaseContext(context);
        vj5.e eVar = this.f519229b;
        if (eVar != null) {
            vj5.c cVar = (vj5.c) eVar;
            cVar.getClass();
            android.os.Looper mainLooper = android.os.Looper.getMainLooper();
            android.os.Looper myLooper = android.os.Looper.myLooper();
            vj5.h hVar = cVar.f519224a;
            if (mainLooper == myLooper) {
                ((vj5.b) hVar.f519234d).run();
                return;
            }
            java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
            if (n3.x0.b(hVar)) {
                hVar.post(hVar.f519234d);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(hVar.f519234d);
            }
        }
    }
}
