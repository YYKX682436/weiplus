package p3325xe03a0797.p3326xc267989b.p3327xcca8366f;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lkotlinx/coroutines/android/AndroidDispatcherFactory;", "Lkotlinx/coroutines/internal/z;", "", "allFactories", "Lkotlinx/coroutines/g3;", "createDispatcher", "", "hintOnError", "", "getLoadPriority", "()I", "loadPriority", "<init>", "()V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* renamed from: kotlinx.coroutines.android.AndroidDispatcherFactory */
/* loaded from: classes14.dex */
public final class C29047x4b7aadd4 implements p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z {
    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z
    /* renamed from: createDispatcher */
    public p3325xe03a0797.p3326xc267989b.g3 mo143964x24898cc3(java.util.List<? extends p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z> allFactories) {
        android.os.Looper mainLooper = android.os.Looper.getMainLooper();
        if (mainLooper != null) {
            return new t26.a(t26.e.a(mainLooper, true), null, 2, null);
        }
        throw new java.lang.IllegalStateException("The main looper is not available");
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z
    /* renamed from: getLoadPriority */
    public int mo143965x67ffef20() {
        return 1073741823;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.z
    /* renamed from: hintOnError */
    public java.lang.String mo143966x893b4ae2() {
        return "For tests Dispatchers.setMain from kotlinx-coroutines-test module can be used";
    }
}
