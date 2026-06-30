package dw3;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325771d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f325772e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f325773f;

    public o(java.lang.String str, java.lang.String str2, long j17) {
        this.f325771d = str;
        this.f325772e = str2;
        this.f325773f = j17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Iterable<com.p314xaae8f345.mm.vfs.x1> s17;
        java.lang.StringBuilder sb6;
        java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(java.util.TimeZone.getTimeZone("GMT+00:00"));
        java.lang.String str = this.f325771d;
        if (android.text.TextUtils.isEmpty(str) || !com.p314xaae8f345.mm.vfs.w6.j(str) || (s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false)) == null) {
            return;
        }
        for (com.p314xaae8f345.mm.vfs.x1 x1Var : s17) {
            java.lang.String relPath = x1Var.f294764a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(relPath, "relPath");
            if (r26.n0.B(relPath, this.f325772e, false)) {
                long j17 = x1Var.f294768e;
                java.util.Date date = new java.util.Date(j17);
                java.lang.String format = simpleDateFormat.format(java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - j17));
                char D0 = r26.p0.D0(str);
                java.lang.String str2 = x1Var.f294764a;
                if (D0 == '/') {
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                } else {
                    sb6 = new java.lang.StringBuilder();
                    sb6.append(str);
                    sb6.append(java.io.File.separator);
                }
                sb6.append(str2);
                java.lang.String sb7 = sb6.toString();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "print file path:" + sb7 + " data:" + date + " time:" + j17 + " exist:" + format);
                if (java.lang.System.currentTimeMillis() - j17 >= this.f325773f) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaFileUtil", "delete file path:" + sb7);
                    dw3.c0.f325715a.j(sb7);
                }
            }
        }
    }
}
