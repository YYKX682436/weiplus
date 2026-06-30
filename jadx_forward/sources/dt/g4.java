package dt;

/* loaded from: classes15.dex */
public class g4 extends com.p314xaae8f345.mm.sdk.p2600x5c6729a.n {
    public g4() {
        super(0);
    }

    @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.n
    /* renamed from: callback */
    public boolean mo778xf5bc2045(com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20979x809547d1 abstractC20979x809547d1) {
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.m k17;
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b c5670x1f7ac2b = (com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5670x1f7ac2b) abstractC20979x809547d1;
        com.p314xaae8f345.mm.app.w7 w7Var = com.p314xaae8f345.mm.app.w7.f135429f;
        am.ki kiVar = c5670x1f7ac2b.f135994g;
        android.content.Context context = kiVar.f88685d;
        if (context == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        android.content.Context context2 = context;
        boolean z17 = kiVar.f88689h;
        am.li liVar = c5670x1f7ac2b.f135995h;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WorkerProfile", "callbackOfLaunch3RdAppEvent disableOpenId is true!");
            java.lang.String str = kiVar.f88688g;
            if (str == null || str.isEmpty()) {
                if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) {
                    lt.i0 i0Var = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str2 = kiVar.f88683b;
                    ((kt.c) i0Var).getClass();
                    k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.i(str2, Integer.MAX_VALUE);
                } else {
                    lt.i0 i0Var2 = (lt.i0) i95.n0.c(lt.i0.class);
                    java.lang.String str3 = kiVar.f88683b;
                    ((kt.c) i0Var2).getClass();
                    k17 = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.k(str3, false);
                }
                if (k17 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "get appinfo is null, appid is : [%s]", kiVar.f88683b);
                }
                if (k17 != null && k17.f67391x10a0fed7 == 3) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "requestAppShow fail, app is in blacklist, packageName = " + k17.f67386xa1e9e82c);
                }
                if (k17 != null && k17.f67391x10a0fed7 != 3) {
                    kiVar.f88688g = k17.f67386xa1e9e82c;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WorkerProfile", "requestAppShow success, packageName = " + k17.f67386xa1e9e82c);
                }
            }
            lt.i0 i0Var3 = (lt.i0) i95.n0.c(lt.i0.class);
            java.lang.String str4 = kiVar.f88688g;
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = kiVar.f88682a;
            java.lang.String str5 = kiVar.f88683b;
            int i17 = kiVar.f88684c;
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a5 a5Var = kiVar.f88686e;
            android.os.Bundle bundle = kiVar.f88687f;
            ((kt.c) i0Var3).getClass();
            liVar.f88781a = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.w.w(context2, str4, c11286x34a5504, str5, "", i17, a5Var, bundle);
        } else {
            liVar.f88781a = ((kt.c) ((lt.i0) i95.n0.c(lt.i0.class))).fj(context2, kiVar.f88683b, kiVar.f88682a, kiVar.f88684c, kiVar.f88686e, kiVar.f88687f);
        }
        return false;
    }
}
