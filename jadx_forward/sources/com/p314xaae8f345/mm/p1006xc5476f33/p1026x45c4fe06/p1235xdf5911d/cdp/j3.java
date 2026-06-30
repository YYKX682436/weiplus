package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u00052\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0004\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00000\u0000\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/os/Bundle;", "kotlin.jvm.PlatformType", com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26532xcd500876.f54772x9d04c306, "Lcom/tencent/mm/ipcinvoker/r;", "ipcCallback", "Ljz5/f0;", "invoke", "(Landroid/os/Bundle;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes8.dex */
final class j3<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.i {
    static {
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.j3();
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        byte[] byteArray;
        long j17;
        r45.w3 w3Var;
        r45.j4 j4Var;
        r45.w3 w3Var2;
        r45.j4 j4Var2;
        r45.w3 w3Var3;
        r45.j4 j4Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f c12816x4017790f = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.cdp.C12816x4017790f) ((android.os.Bundle) obj).getParcelable("shareAppMessageData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdpShareAppMessage", "shareAppMessage: shareAppMessageData:" + c12816x4017790f);
        if (c12816x4017790f == null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("errCode", -1);
            bundle.putString("errMsg", "invalid data");
            rVar.a(bundle);
            return;
        }
        ot0.q qVar = new ot0.q();
        java.lang.String str = c12816x4017790f.f173691d;
        qVar.f430187f = str;
        java.lang.String str2 = c12816x4017790f.f173693f;
        qVar.f430206j2 = str2;
        java.lang.String str3 = c12816x4017790f.f173694g;
        qVar.f430202i2 = str3;
        java.lang.String str4 = c12816x4017790f.f173695h;
        qVar.f430210k2 = str4;
        qVar.f430270z2 = c12816x4017790f.f173696i;
        qVar.B2 = c12816x4017790f.f173692e;
        qVar.L1 = "wxapp_" + str4 + str3;
        qVar.f430255w = str2;
        qVar.f430259x = str;
        qVar.f430199i = 33;
        android.graphics.Bitmap i07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.i0(c12816x4017790f.f173697m);
        if (i07 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdpShareAppMessage", "getBitmapData: thumbBmp is null");
            byteArray = new byte[0];
        } else {
            int width = i07.getWidth();
            int height = i07.getHeight();
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height));
            arrayList.add(java.lang.Integer.valueOf(width));
            java.lang.Object obj2 = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj2, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/wxassistant/cdp/CdpShareAppMessageExtKt", "getBitmapData", "(Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj2, createBitmap, "com/tencent/mm/plugin/appbrand/wxassistant/cdp/CdpShareAppMessageExtKt", "getBitmapData", "(Lcom/tencent/mm/plugin/appbrand/wxassistant/cdp/ShareAppMessageData;)[B", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(createBitmap, "createBitmap(...)");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            canvas.drawColor(-1);
            canvas.drawBitmap(i07, 0.0f, 0.0f, (android.graphics.Paint) null);
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            createBitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
            byteArray = byteArrayOutputStream.toByteArray();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(byteArray, "toByteArray(...)");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.C12575x278fd8e2 c12575x278fd8e2 = c12816x4017790f.f173699o;
        java.lang.String g17 = x51.j1.g((c12575x278fd8e2 == null || (w3Var3 = c12575x278fd8e2.f170142i) == null || (j4Var3 = w3Var3.f470359d) == null) ? null : j4Var3.f459091e);
        long j18 = (c12575x278fd8e2 == null || (w3Var2 = c12575x278fd8e2.f170142i) == null || (j4Var2 = w3Var2.f470359d) == null) ? -1L : j4Var2.f459101r;
        java.lang.Number valueOf = (c12575x278fd8e2 == null || (w3Var = c12575x278fd8e2.f170142i) == null || (j4Var = w3Var.f470359d) == null) ? -1L : java.lang.Integer.valueOf(j4Var.f459098o);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17) || j18 == -1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.CdpShareAppMessage", "shareAppMessage: fromUserName:" + g17 + " or newMsgId:" + j18 + " is null");
            android.os.Bundle bundle2 = new android.os.Bundle();
            bundle2.putInt("errCode", -1);
            bundle2.putString("errMsg", "data is invalid");
            rVar.a(bundle2);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 o27 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(g17, j18);
        boolean z17 = o27.m124847x74d37ac6() > 0;
        o27.o1(j18);
        o27.e1(c01.w9.m(g17, valueOf.longValue()));
        o27.m124850x7650bebc(49);
        o27.d1(ot0.q.u(qVar, null, null));
        o27.j1(0);
        o27.r1(3);
        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
        o27.i1(m11.b1.Di().L0(null, bm5.f0.f104097i, byteArray, null));
        o27.u1(g17);
        if (z17) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().nb(j18, o27);
            j17 = 1;
        } else {
            j17 = c01.w9.x(o27);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CdpShareAppMessage", "shareAppMessage result:" + j17);
        android.os.Bundle bundle3 = new android.os.Bundle();
        bundle3.putInt("errCode", 0);
        rVar.a(bundle3);
    }
}
