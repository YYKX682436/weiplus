package f42;

/* loaded from: classes12.dex */
public final class e implements yj0.c {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f341056a;

    @Override // yj0.c
    public java.lang.Object a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str4, "getString")) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(objArr);
        java.lang.Object obj2 = objArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj2, "android_id")) {
            if (this.f341056a == null) {
                this.f341056a = android.provider.Settings.Secure.getString(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "android_id");
            }
            return this.f341056a;
        }
        android.content.ContentResolver contentResolver = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver();
        java.lang.Object obj3 = objArr[1];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type kotlin.String");
        return android.provider.Settings.Secure.getString(contentResolver, (java.lang.String) obj3);
    }
}
