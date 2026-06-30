package oj;

/* loaded from: classes7.dex */
public abstract class z {
    public static final java.lang.String a(android.app.ActivityManager.RecentTaskInfo contentToString) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentToString, "$this$contentToString");
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            java.lang.String obj = contentToString.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "this.toString()");
            return obj;
        }
        try {
            return "RecentTaskInfo{id=" + contentToString.id + " persistentId=" + contentToString.persistentId + " baseIntent=" + contentToString.baseIntent + " baseActivity=" + contentToString.baseActivity + " topActivity=" + contentToString.topActivity + " origActivity=" + contentToString.origActivity + " numActivities=" + contentToString.numActivities + "}";
        } catch (java.lang.Throwable unused) {
            java.lang.String obj2 = contentToString.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "this.toString()");
            return obj2;
        }
    }
}
