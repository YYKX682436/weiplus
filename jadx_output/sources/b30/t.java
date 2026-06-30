package b30;

/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    public static final b30.t f17582a = new b30.t();

    /* renamed from: b, reason: collision with root package name */
    public static volatile b30.s f17583b;

    public final b30.s a() {
        if (!com.tencent.mm.sdk.platformtools.x2.n()) {
            com.tencent.mars.xlog.Log.e("ViewTouchBinderHelper", "ViewTouchBinderHelper must be called in main process");
            return null;
        }
        if (f17583b == null) {
            f17583b = new b30.s(null);
        }
        b30.s sVar = f17583b;
        boolean z17 = false;
        if (sVar != null && sVar.f17581c) {
            z17 = true;
        }
        if (z17) {
            return f17583b;
        }
        com.tencent.mars.xlog.Log.e("ViewTouchBinderHelper", "ViewTouchBinderHelper not initialized");
        return null;
    }
}
