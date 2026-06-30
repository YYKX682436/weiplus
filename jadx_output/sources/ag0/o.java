package ag0;

@j95.b
/* loaded from: classes10.dex */
public class o extends i95.w implements bg0.w {
    public java.lang.String Ai() {
        return com.tencent.mm.plugin.vlog.model.e0.f175586b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.io.Closeable] */
    public void wi(rm5.v vVar, int i17, int i18, java.lang.Integer num) {
        rm5.v vVar2;
        android.graphics.Bitmap bitmap;
        android.graphics.Bitmap bitmap2;
        ?? r17 = i18;
        com.tencent.mars.xlog.Log.i("HDRUtilService", "try enable hdr lut, colorStandard = " + i17 + ", colorTransfer = " + r17);
        if (r17 == 6) {
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(new com.tencent.mm.plugin.vlog.model.f1());
        } else {
            com.tencent.tav.extractor.ExtractorDelegateFactory.setExtractorDelegateCreator(new com.tencent.mm.plugin.vlog.model.g1());
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (context != null) {
            android.graphics.Bitmap bitmap3 = null;
            ?? r57 = 0;
            bitmap3 = null;
            java.io.Closeable closeable = null;
            try {
                try {
                    try {
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.w("HDRUtilService", "open lut fail", e);
                        com.tencent.mm.sdk.platformtools.t8.v1(r17);
                        vVar2 = vVar;
                        bitmap = bitmap3;
                        vVar2.f397586n = bitmap;
                    }
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    closeable = r17;
                    com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                    throw th;
                }
            } catch (java.lang.Exception e18) {
                e = e18;
                r17 = 0;
                com.tencent.mars.xlog.Log.w("HDRUtilService", "open lut fail", e);
                com.tencent.mm.sdk.platformtools.t8.v1(r17);
                vVar2 = vVar;
                bitmap = bitmap3;
                vVar2.f397586n = bitmap;
            } catch (java.lang.Throwable th7) {
                th = th7;
                com.tencent.mm.sdk.platformtools.t8.v1(closeable);
                throw th;
            }
            if (i17 == 6 && r17 == 6) {
                java.io.InputStream open = context.getAssets().open("HDR_lut/HDR10.png");
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(open);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                bitmap2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                yj0.a.e(obj, bitmap2, "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                r17 = open;
            } else if (i17 == 6 && r17 == 7) {
                java.io.InputStream open2 = context.getAssets().open("HDR_lut/HLG.png");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(open2);
                java.lang.Object obj2 = new java.lang.Object();
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(obj2, arrayList2.toArray(), "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                bitmap2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList2.get(0));
                yj0.a.e(obj2, bitmap2, "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                r17 = open2;
            } else {
                boolean z17 = true;
                if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_sns_finder_post_p3_to_bt709_lut, 1) != 1) {
                    z17 = false;
                }
                if (!z17 || num == null || (num.intValue() != 11 && num.intValue() != 12)) {
                    bitmap2 = null;
                    com.tencent.mm.sdk.platformtools.t8.v1(r57);
                    vVar2 = vVar;
                    bitmap = bitmap2;
                    vVar2.f397586n = bitmap;
                }
                java.io.InputStream open3 = context.getAssets().open("HDR_lut/P3toBT709.png");
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(open3);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(obj3, arrayList3.toArray(), "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                bitmap2 = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList3.get(0));
                yj0.a.e(obj3, bitmap2, "com/tencent/mm/feature/vlog/HDRUtilService", "checkHdrLut", "(Lcom/tencent/mm/videocomposition/VideoComposition;IILjava/lang/Integer;)V", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                r17 = open3;
            }
            bitmap3 = r17;
            r57 = bitmap3;
            com.tencent.mm.sdk.platformtools.t8.v1(r57);
            vVar2 = vVar;
            bitmap = bitmap2;
            vVar2.f397586n = bitmap;
        }
    }
}
