package y73;

/* loaded from: classes8.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f541273d;

    public o0(y73.p0 p0Var, java.lang.String[] strArr) {
        this.f541273d = strArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        java.lang.String str = lp0.b.D() + "/Download/2017-07-28_19-43-39.apk";
        java.lang.String str2 = lp0.b.D() + "/Download/39-50-diff.apk";
        java.lang.String str3 = lp0.b.D() + "/Download/new_50.apk";
        java.lang.String[] strArr = this.f541273d;
        if (strArr.length >= 3 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[2])) {
            str = strArr[2];
        }
        if (strArr.length >= 4 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[3])) {
            str2 = strArr[3];
        }
        if (strArr.length >= 5 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[4])) {
            str3 = strArr[4];
        }
        java.lang.String str4 = (strArr.length < 6 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(strArr[5])) ? "ab099f75f740be5d88e178d662a36779" : strArr[5];
        if (com.p314xaae8f345.mm.vfs.w6.j(str3)) {
            i17 = 0;
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            i17 = w73.e.a(str, str2, str3, str4);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk use :%d retCode：%d", java.lang.Long.valueOf((java.lang.System.currentTimeMillis() - currentTimeMillis) / 1000), java.lang.Integer.valueOf(i17));
        }
        if (i17 == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "show dialog for install");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "New Apk md5:%s", com.p314xaae8f345.mm.vfs.w6.p(str3));
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            java.util.Map map = c83.e.f121211a;
            android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
            intent.addFlags(268435456);
            intent.setDataAndType(android.net.Uri.fromFile(new java.io.File(str3)), "application/vnd.android.package-archive");
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/hp/util/UpdateUtil", "install", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/hp/util/UpdateUtil", "install", "(Landroid/content/Context;Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "md5 is equal.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk failed.");
        }
        c83.e.u();
    }
}
