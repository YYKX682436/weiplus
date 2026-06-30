package kr5;

/* loaded from: classes13.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kr5.c f393056d;

    public a(kr5.c cVar) {
        this.f393056d = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        kr5.c cVar = this.f393056d;
        cVar.getClass();
        android.content.SharedPreferences sharedPreferences = kr5.p.f393103a.getSharedPreferences("HTTPDNSFile", 0);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = sharedPreferences.getLong("httpdnsIps_timestamp", 0L);
        java.lang.String string = sharedPreferences.getString("httpdnsIps", "");
        java.lang.String string2 = sharedPreferences.getString("httpType", "");
        java.util.List arrayList = new java.util.ArrayList();
        if (!string.isEmpty()) {
            if (currentTimeMillis <= j17) {
                if ((string2.equals(cVar.f393060b.f393087i) ? java.lang.Boolean.TRUE : (string2.equals("Https") || cVar.f393060b.f393087i.equals("Https")) ? java.lang.Boolean.FALSE : java.lang.Boolean.TRUE).booleanValue()) {
                    arrayList = java.util.Arrays.asList(string.split(";"));
                }
            }
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.remove("httpdnsIps");
            edit.remove("httpType");
            edit.remove("httpdnsIps_timestamp");
            edit.apply();
        }
        if (arrayList.isEmpty()) {
            return;
        }
        cVar.e(arrayList);
    }
}
