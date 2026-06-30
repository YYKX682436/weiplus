package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes11.dex */
public class x9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final android.net.Uri f292441d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.z9 f292442e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 f292443f;

    public x9(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22523xb066d18 activityC22523xb066d18, android.net.Uri uri, com.p314xaae8f345.mm.ui.p2740x696c9db.z9 z9Var) {
        this.f292443f = activityC22523xb066d18;
        this.f292441d = uri;
        this.f292442e = z9Var;
    }

    public final boolean a(android.net.Uri uri) {
        if (uri == null || !mm.k.f410053y1.h() || android.os.Build.VERSION.SDK_INT < 30 || com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getApplicationInfo().targetSdkVersion < 30) {
            return false;
        }
        if (uri.toString().startsWith(android.provider.MediaStore.Downloads.EXTERNAL_CONTENT_URI.toString())) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "uri is Downloads file, should copy it for FLAG_GRANT_READ_URI_PERMISSION issue: " + uri);
            return true;
        }
        if (!uri.toString().startsWith(android.provider.MediaStore.Files.getContentUri("external").toString())) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareImgUI", "uri is Files file, should copy it for FLAG_GRANT_READ_URI_PERMISSION issue: " + uri);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00c5, code lost:
    
        if (r12 == false) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01f4  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 506
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.x9.run():void");
    }
}
