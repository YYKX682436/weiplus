package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes8.dex */
public abstract class i1 {
    public static void a(android.app.Activity activity, android.content.Intent intent, android.content.Intent intent2, java.lang.String str, int i17, com.p314xaae8f345.mm.ui.p2740x696c9db.h1 h1Var) {
        if (intent == null || intent.getData() == null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(intent == null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AsyncObtainImage", "param error, %b", objArr);
            return;
        }
        if (intent.getData().toString().startsWith("content://com.google.android.gallery3d")) {
            new com.p314xaae8f345.mm.ui.p2740x696c9db.f1(intent, activity, str, h1Var, intent2, i17).execute(0);
            return;
        }
        java.lang.String b17 = b(activity, intent, str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncObtainImage", "resolvePhotoFromIntent, filePath:%s", b17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(b17)) {
            return;
        }
        if (h1Var != null) {
            intent2.putExtra("CropImage_OutputPath", h1Var.a(b17));
        }
        intent2.putExtra("CropImage_ImgPath", b17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(intent2);
        java.util.Collections.reverse(arrayList);
        yj0.a.k(activity, arrayList.toArray(), "com/tencent/mm/ui/tools/AsyncObtainImage", "asyncResolvePhoto", "(Landroid/app/Activity;Landroid/content/Intent;Landroid/content/Intent;Ljava/lang/String;ILcom/tencent/mm/ui/tools/AsyncObtainImage$IOnGenOutputPath;)V", "android/app/Activity", "startActivityForResult", "(Landroid/content/Intent;I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0122, code lost:
    
        if ((r15.a() ? r15.f294799a.F(r15.f294800b) : false) == false) goto L51;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String b(android.content.Context r13, android.content.Intent r14, java.lang.String r15) {
        /*
            Method dump skipped, instructions count: 381
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2740x696c9db.i1.b(android.content.Context, android.content.Intent, java.lang.String):java.lang.String");
    }

    public static java.lang.String c(java.lang.String str, android.graphics.Bitmap bitmap) {
        try {
            java.lang.String str2 = str + (kk.k.g(android.text.format.DateFormat.format("yyyy-MM-dd-HH-mm-ss", java.lang.System.currentTimeMillis()).toString().getBytes()) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(str2);
            if (!r6Var.m()) {
                r6Var.k();
            }
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.o0(r6Var.o(), new com.p314xaae8f345.mm.ui.p2740x696c9db.g1(bitmap));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AsyncObtainImage", "photo image from data, path:".concat(str2));
            return str2;
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.AsyncObtainImage", e17, "saveBmp Error.", new java.lang.Object[0]);
            return null;
        }
    }
}
