package cb;

/* loaded from: classes13.dex */
public final class z extends java.lang.ClassLoader {
    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String str, boolean z17) {
        if (!"com.google.android.gms.iid.MessengerCompat".equals(str)) {
            return super.loadClass(str, z17);
        }
        com.google.firebase.iid.FirebaseInstanceId.m();
        return com.google.firebase.iid.zzi.class;
    }
}
