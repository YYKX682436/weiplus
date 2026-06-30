package u52;

/* loaded from: classes13.dex */
public final class a implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj != null) {
            if (((obj instanceof android.app.Activity) || (obj instanceof p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670) || (obj instanceof android.app.Fragment)) && objArr != null && objArr.length >= 2) {
                java.lang.Object obj2 = objArr[1];
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((java.lang.Integer) obj2).intValue();
                u52.b.f506328a = intValue;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.PermissionMonitor", "PermissionListener, args: %d", java.lang.Integer.valueOf(intValue));
                u52.b.f506330c = true;
            }
        }
    }
}
