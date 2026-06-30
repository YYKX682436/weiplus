package f42;

/* loaded from: classes12.dex */
public final class i {
    public i(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final boolean a(f42.i iVar, android.content.Context context) {
        iVar.getClass();
        return android.os.Build.VERSION.SDK_INT < 29 || context.checkCallingOrSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0;
    }

    public static final boolean b(f42.i iVar, android.content.Context context) {
        iVar.getClass();
        return context.checkCallingOrSelfPermission("android.permission.READ_PHONE_STATE") == 0;
    }
}
