package b30;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final b30.t f99115a = new b30.t();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b30.s f99116b;

    public final b30.s a() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewTouchBinderHelper", "ViewTouchBinderHelper must be called in main process");
            return null;
        }
        if (f99116b == null) {
            f99116b = new b30.s(null);
        }
        b30.s sVar = f99116b;
        boolean z17 = false;
        if (sVar != null && sVar.f99114c) {
            z17 = true;
        }
        if (z17) {
            return f99116b;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewTouchBinderHelper", "ViewTouchBinderHelper not initialized");
        return null;
    }
}
