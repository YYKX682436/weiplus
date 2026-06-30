package ck4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final ck4.c f42548a = new ck4.c();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0066, code lost:
    
        if (r0 < 1.3166667f) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.os.Bundle a(android.content.Context r6, int r7, int r8) {
        /*
            r5 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.o.g(r6, r0)
            boolean r0 = r6 instanceof android.app.Activity
            if (r0 == 0) goto Lf
            android.app.Activity r6 = (android.app.Activity) r6
            android.content.Context r6 = r6.getBaseContext()
        Lf:
            android.content.res.Resources r0 = r6.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r0 = r0.widthPixels
            android.content.res.Resources r6 = r6.getResources()
            android.util.DisplayMetrics r6 = r6.getDisplayMetrics()
            int r6 = r6.heightPixels
            int r6 = java.lang.Math.min(r0, r6)
            float r0 = (float) r8
            r1 = 1065353216(0x3f800000, float:1.0)
            float r0 = r0 * r1
            float r2 = (float) r7
            float r0 = r0 / r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.CENTER_CROP
            int r3 = r3.ordinal()
            java.lang.String r4 = "scaleType"
            r2.putInt(r4, r3)
            int r7 = r7 - r8
            int r7 = java.lang.Math.abs(r7)
            r8 = 10
            java.lang.String r3 = "height"
            java.lang.String r4 = "width"
            if (r7 > r8) goto L54
            r2.putInt(r4, r6)
            r2.putInt(r3, r6)
            goto L71
        L54:
            r7 = 1058013184(0x3f100000, float:0.5625)
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 >= 0) goto L5c
        L5a:
            r0 = r7
            goto L68
        L5c:
            int r7 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r7 >= 0) goto L61
            goto L68
        L61:
            r7 = 1068009609(0x3fa88889, float:1.3166667)
            int r8 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r8 >= 0) goto L5a
        L68:
            r2.putInt(r4, r6)
            float r6 = (float) r6
            float r6 = r6 * r0
            int r6 = (int) r6
            r2.putInt(r3, r6)
        L71:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: ck4.c.a(android.content.Context, int, int):android.os.Bundle");
    }

    public final ck4.b b(java.lang.String mediaId, java.lang.String url, java.lang.String path, int i17, java.lang.String fileFormat, java.lang.String urlToken, java.lang.String str, java.lang.String str2, dn.n nVar, java.lang.String tag) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(url, "url");
        kotlin.jvm.internal.o.g(path, "path");
        kotlin.jvm.internal.o.g(fileFormat, "fileFormat");
        kotlin.jvm.internal.o.g(urlToken, "urlToken");
        kotlin.jvm.internal.o.g(tag, "tag");
        ck4.b bVar = new ck4.b();
        bVar.f241785d = "task_TPPlayUtil";
        bVar.field_mediaId = mediaId;
        bVar.M1 = url.concat(urlToken);
        bVar.A = 60;
        bVar.B = 60;
        bVar.H1 = 1;
        bVar.Z = 8;
        bVar.field_requestVideoFormat = i17;
        bVar.field_fullpath = path;
        bVar.f241809y0 = 4;
        bVar.f241806x0 = 4;
        bVar.Y1 = str;
        bVar.f241815c2 = nVar;
        bVar.Z1 = true;
        bVar.f241813a2 = true;
        bVar.X1 = str2;
        bVar.f42535e2 = fileFormat;
        bVar.f42536f2 = url;
        bVar.f42537g2 = urlToken;
        com.tencent.mars.xlog.Log.i(tag, "[createVideoPlayCDNTask] finder video, reqFormat=" + i17 + " fileFormat=" + fileFormat + ", decodeKey=" + str + ' ' + urlToken + " mediaId=" + mediaId + " url=" + bVar.M1 + ' ');
        return bVar;
    }
}
