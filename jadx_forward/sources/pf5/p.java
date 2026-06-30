package pf5;

/* loaded from: classes5.dex */
public abstract class p extends pf5.b0 {
    /* renamed from: findViewById */
    public <T extends android.view.View> T mo144222x4ff8c0f0(int i17) {
        android.view.View mo47091x2c60d76 = mo47091x2c60d76();
        return mo47091x2c60d76 != null ? (T) mo47091x2c60d76.findViewById(i17) : (T) mo158353x86de4d96(i17);
    }

    /* renamed from: findViewByIdByActivity */
    public abstract android.view.View mo158353x86de4d96(int i17);

    /* renamed from: getFindViewIdRootView */
    public abstract android.view.View mo47091x2c60d76();
}
