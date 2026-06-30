package i85;

/* loaded from: classes5.dex */
public final class i extends i85.c {
    @Override // i85.p
    public java.lang.String a() {
        return "telephony.registry";
    }

    @Override // i85.p
    public java.lang.String c() {
        return "com.android.internal.telephony.ITelephonyRegistry";
    }

    @Override // i85.c, i85.p
    public void d(java.lang.Object service) {
        java.lang.Class<?> cls;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        if (android.os.Build.VERSION.SDK_INT < 29) {
            java.lang.reflect.Field field = null;
            try {
                cls = java.lang.Class.forName("android.telephony.TelephonyManager");
            } catch (java.lang.ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    field = cls.getDeclaredField("sRegistry");
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPhoneRegisterProcessor", "NoSuchFieldException: " + th6.getMessage());
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPhoneRegisterProcessor", "TelephonyManager-sRegistry = " + field);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HookPhoneRegisterProcessor", "mPmFidld = " + field);
            if (field != null) {
                field.setAccessible(true);
                field.set(cls, service);
            }
        }
    }
}
