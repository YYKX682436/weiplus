package com.tencent.mm.plugin.appbrand.wxassistant.cdp;

@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, "Lcom/tencent/mm/ipcinvoker/r;", "ipcCallback", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class j3<InputType, ResultType> implements com.tencent.mm.ipcinvoker.i {
    static {
        new com.tencent.mm.plugin.appbrand.wxassistant.cdp.j3();
    }

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        byte[] byteArray;
        long j17;
        r45.w3 w3Var;
        r45.j4 j4Var;
        r45.w3 w3Var2;
        r45.j4 j4Var2;
        r45.w3 w3Var3;
        r45.j4 j4Var3;
        com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData shareAppMessageData = (com.tencent.mm.plugin.appbrand.wxassistant.cdp.ShareAppMessageData) ((android.os.Bundle) obj).getParcelable("shareAppMessageData");
        com.tencent.mars.xlog.Log.i("MicroMsg.CdpShareAppMessage", "shareAppMessage: shareAppMessageData:" + shareAppMessageData);
        if (shareAppMessageData == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("errCode", -1);
            bundle.putString("errMsg", "invalid data");
            rVar.a(bundle);
            return;
        }
        ot0.q qVar = new ot0.q();
        java.lang.String str = shareAppMessageData.f92158d;
        qVar.f348654f = str;
        java.lang.String str2 = shareAppMessageData.f92160f;
        qVar.f348673j2 = str2;
        java.lang.String str3 = shareAppMessageData.f92161g;
        qVar.f348669i2 = str3;
        java.lang.String str4 = shareAppMessageData.f92162h;
        qVar.f348677k2 = str4;
        qVar.f348737z2 = shareAppMessageData.f92163i;
        qVar.B2 = shareAppMessageData.f92159e;
        qVar.L1 = "wxapp_" + str4 + str3;
        qVar.f348722w = str2;
        qVar.f348726x = str;
        qVar.f348666i = 33;
        android.graphics.Bitmap i07 = com.tencent.mm.sdk.platformtools.x.i0(shareAppMessageData.f92164m);
        if (i07 == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdpShareAppMessage", "getBitmapData: thumbBmp is null");
            byteArray = new byte[0];
        } else {
            int width = i07.getWidth();
            int height = i07.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/cdp/CdpShareAppMessageExtKt", "getBitmapData", "(Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/appbrand/wxassistant/cdp/CdpShareAppMessageExtKt", "getBitmapData", "(Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            kotlin.jvm.internal.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(i07, 0.0f, 0.0f, (android.graphics.Paint) null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            kotlin.jvm.internal.o.f(byteArray, "toByteArray(...)");
        }
        com.tencent.mm.plugin.appbrand.service.CdpCommandParams cdpCommandParams = shareAppMessageData.f92166o;
        java.lang.String g17 = x51.j1.g((cdpCommandParams == null || (w3Var3 = cdpCommandParams.f88609i) == null || (j4Var3 = w3Var3.f388826d) == null) ? null : j4Var3.f377558e);
        long j18 = (cdpCommandParams == null || (w3Var2 = cdpCommandParams.f88609i) == null || (j4Var2 = w3Var2.f388826d) == null) ? -1L : j4Var2.f377568r;
        java.lang.Number valueOf = (cdpCommandParams == null || (w3Var = cdpCommandParams.f88609i) == null || (j4Var = w3Var.f388826d) == null) ? -1L : java.lang.Integer.valueOf(j4Var.f377565o);
        if (com.tencent.mm.sdk.platformtools.t8.K0(g17) || j18 == -1) {
            com.tencent.mars.xlog.Log.w("MicroMsg.CdpShareAppMessage", "shareAppMessage: fromUserName:" + g17 + " or newMsgId:" + j18 + " is null");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("errCode", -1);
            bundle2.putString("errMsg", "data is invalid");
            rVar.a(bundle2);
            return;
        }
        com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j18);
        boolean z17 = o27.getMsgId() > 0;
        o27.o1(j18);
        o27.e1(c01.w9.m(g17, valueOf.longValue()));
        o27.setType(49);
        o27.d1(ot0.q.u(qVar, null, null));
        o27.j1(0);
        o27.r1(3);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        o27.i1(m11.b1.Di().L0(null, bm5.f0.f22564i, byteArray, null));
        o27.u1(g17);
        if (z17) {
            ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j18, o27);
            j17 = 1;
        } else {
            j17 = c01.w9.x(o27);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.CdpShareAppMessage", "shareAppMessage result:" + j17);
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("errCode", 0);
        rVar.a(bundle3);
    }
}
