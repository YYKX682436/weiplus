package mt5;

/* loaded from: classes8.dex */
public class l implements lt5.a {
    @Override // lt5.a
    public lt5.f a(android.content.Context context) {
        try {
            android.content.ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(android.net.Uri.parse("content://cn.nubia.identity/identity"));
            if (acquireContentProviderClient == null) {
                return new lt5.f(null, -10);
            }
            android.os.Bundle call = acquireContentProviderClient.call(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.c6.f33970x24728b, null, null);
            acquireContentProviderClient.close();
            return call == null ? new lt5.f(null, -10) : call.getInt("code", -1) == 0 ? new lt5.f(call.getString(dm.i4.f66865x76d1ec5a), 0) : new lt5.f(null, -102);
        } catch (java.lang.Throwable unused) {
            return new lt5.f(null, -306);
        }
    }
}
