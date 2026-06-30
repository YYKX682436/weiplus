package is3;

/* loaded from: classes8.dex */
public class c extends is3.b {

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f376009c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f376010d;

    /* renamed from: e, reason: collision with root package name */
    public android.os.Bundle f376011e = null;

    /* renamed from: f, reason: collision with root package name */
    public final is3.a f376012f;

    /* renamed from: g, reason: collision with root package name */
    public int f376013g;

    public c(java.lang.String str, java.lang.String str2, is3.a aVar) {
        this.f376009c = str;
        this.f376010d = str2;
        this.f376012f = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public java.lang.Object a(java.lang.Object[] objArr) {
        android.os.Bundle[] bundleArr = (android.os.Bundle[]) objArr;
        if (bundleArr.length > 0) {
            this.f376011e = bundleArr[0];
        }
        return g();
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public void c(java.lang.Object obj) {
        android.os.Bundle bundle = (android.os.Bundle) obj;
        is3.a aVar = this.f376012f;
        if (aVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = ((os3.a) aVar).f429557a;
            if (bundle != null) {
                int i17 = bundle.getInt("result_http_code", -1);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AttachDownloadPage", "result http code %d", java.lang.Integer.valueOf(i17));
                if (i17 == 200) {
                    com.p314xaae8f345.mm.vfs.w6.P(activityC16930x4222da3c.f236354r, activityC16930x4222da3c.X6() + ".temp", activityC16930x4222da3c.X6());
                    activityC16930x4222da3c.A = 3;
                    dp.a.m125854x26a183b(activityC16930x4222da3c, activityC16930x4222da3c.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572604bs5) + " : " + activityC16930x4222da3c.Z6(false), 5000).show();
                    activityC16930x4222da3c.b7();
                    return;
                }
            }
            activityC16930x4222da3c.A = 4;
            int i18 = activityC16930x4222da3c.C;
            if (i18 < 5) {
                activityC16930x4222da3c.C = i18 + 1;
                activityC16930x4222da3c.W6();
            } else {
                dp.a.m125853x26a183b(activityC16930x4222da3c, com.p314xaae8f345.mm.R.C30867xcad56011.gpi, 0).show();
                activityC16930x4222da3c.b7();
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.j3
    public void e(java.lang.Object[] objArr) {
        java.lang.Integer[] numArr = (java.lang.Integer[]) objArr;
        is3.a aVar = this.f376012f;
        if (aVar != null) {
            numArr[0].intValue();
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c activityC16930x4222da3c = ((os3.a) aVar).f429557a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1971xc73f03d7.ui.ActivityC16930x4222da3c.U6(activityC16930x4222da3c);
            activityC16930x4222da3c.A = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v7, types: [java.io.InputStream] */
    public final android.os.Bundle g() {
        ?? r66;
        java.io.BufferedOutputStream bufferedOutputStream;
        com.p314xaae8f345.mm.p971x6de15a2e.h2 d17;
        int D1;
        ?? gZIPInputStream;
        android.os.Bundle bundle = new android.os.Bundle();
        com.p314xaae8f345.mm.p971x6de15a2e.h2 h2Var = null;
        try {
            try {
                d17 = com.p314xaae8f345.mm.p971x6de15a2e.n.d(this.f376009c, null);
                try {
                    d17.h("User-Agent", is3.d.f376014a);
                    d17.h("Accept-Charset", com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
                    d17.h("Accept-Encoding", "gzip, deflate");
                    android.os.Bundle bundle2 = this.f376011e;
                    if (bundle2 != null) {
                        java.lang.String string = bundle2.getString("param_cookie");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailHttpDownloadFileTask", "cookie %s", string);
                        d17.h("Cookie", string);
                    }
                    d17.a();
                    int f17 = d17.f();
                    bundle.putInt("result_http_code", f17);
                    if (f17 != 200) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailHttpDownloadFileTask", "https get response code = %d", java.lang.Integer.valueOf(f17));
                        if (f17 == 302) {
                            int i17 = this.f376013g;
                            if (i17 >= 2) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailHttpDownloadFileTask", "redirect exceed max count");
                                d17.mo48348x1f9d589c();
                                return bundle;
                            }
                            this.f376013g = i17 + 1;
                            java.lang.String i18 = d17.i(ya.b.f77489x9ff58fb5);
                            this.f376009c = i18;
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailHttpDownloadFileTask", "redirect to url: %s", i18);
                            android.os.Bundle g17 = g();
                            d17.mo48348x1f9d589c();
                            return g17;
                        }
                    }
                    D1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D1(d17.i("Content-Length"), 0);
                    gZIPInputStream = "gzip".equalsIgnoreCase(d17.f153550a.getContentEncoding()) ? new java.util.zip.GZIPInputStream(d17.mo48349xc7995ab4()) : "deflate".equalsIgnoreCase(d17.f153550a.getContentEncoding()) ? new java.util.zip.InflaterInputStream(d17.mo48349xc7995ab4(), new java.util.zip.Inflater(true), 512) : new java.io.BufferedInputStream(d17.mo48349xc7995ab4());
                    try {
                        bufferedOutputStream = new java.io.BufferedOutputStream(com.p314xaae8f345.mm.vfs.w6.K(this.f376010d, false));
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        bufferedOutputStream = null;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    bufferedOutputStream = null;
                }
            } catch (java.lang.Throwable th8) {
                th = th8;
                r66 = 0;
                bufferedOutputStream = null;
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MailHttpDownloadFileTask", "http download file, exception: %s", e17.getMessage());
            bundle.putInt("result_http_code", -1);
        }
        try {
            byte[] bArr = new byte[4096];
            int read = gZIPInputStream.read(bArr);
            int i19 = read + 0;
            while (read > 0) {
                bufferedOutputStream.write(bArr, 0, read);
                if (this.f376012f != null && D1 > 0) {
                    this.f270882b.mo50293x3498a0(new com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.i3(this, new java.lang.Integer[]{java.lang.Integer.valueOf((int) ((i19 * 100.0f) / D1))}));
                }
                read = gZIPInputStream.read(bArr);
                i19 += read;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MailHttpDownloadFileTask", "fileLength %d, totalRead %d", java.lang.Integer.valueOf(D1), java.lang.Integer.valueOf(i19));
            d17.mo48348x1f9d589c();
            gZIPInputStream.close();
            bufferedOutputStream.close();
            return bundle;
        } catch (java.lang.Throwable th9) {
            th = th9;
            h2Var = gZIPInputStream;
            r66 = h2Var;
            h2Var = d17;
            if (h2Var != null) {
                h2Var.mo48348x1f9d589c();
            }
            if (r66 != 0) {
                r66.close();
            }
            if (bufferedOutputStream != null) {
                bufferedOutputStream.close();
            }
            throw th;
        }
    }
}
