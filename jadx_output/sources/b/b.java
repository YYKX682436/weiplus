package b;

/* loaded from: classes13.dex */
public abstract class b extends android.os.Binder implements b.c {
    public static b.c d(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsCallback");
        return (queryLocalInterface == null || !(queryLocalInterface instanceof b.c)) ? new b.a(iBinder) : (b.c) queryLocalInterface;
    }
}
