package if1;

/* loaded from: classes7.dex */
public abstract class j {
    public static void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.t tVar, int i17, gl1.a aVar, org.json.JSONObject jSONObject, if1.i iVar) {
        int i18;
        int i19;
        if (aVar == null || jSONObject == null) {
            return;
        }
        try {
            java.lang.String a17 = sd1.d.a(tVar, aVar, jSONObject);
            java.lang.String optString = jSONObject.optString("iconPath");
            if (android.text.TextUtils.isEmpty(optString)) {
                return;
            }
            if (!optString.startsWith("data:image/") || !optString.contains("base64")) {
                java.lang.String T0 = ((o91.e) tVar.q(o91.e.class)).T0(tVar, optString);
                o91.d dVar = (o91.d) tVar.q(o91.d.class);
                java.util.Map singletonMap = a17 != null ? java.util.Collections.singletonMap("Referer", a17) : null;
                java.lang.ref.WeakReference weakReference = new java.lang.ref.WeakReference(tVar);
                java.lang.ref.WeakReference weakReference2 = new java.lang.ref.WeakReference(aVar);
                java.lang.Object obj = (gl1.a) weakReference2.get();
                if (obj == null || !(obj instanceof android.view.View)) {
                    i18 = 0;
                    i19 = 0;
                } else {
                    android.view.View view = (android.view.View) obj;
                    int width = view.getWidth();
                    i19 = view.getHeight();
                    i18 = width;
                }
                ((qd.b) dVar).c(T0, singletonMap, new if1.g(T0, iVar, weakReference, weakReference2, i18, i19, jSONObject));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ViewAttributeHelper", "it is data:image/ format file, iconPath:%s", optString);
            byte[] decode = android.util.Base64.decode(optString.substring(optString.indexOf("base64,") + 7).trim(), 0);
            if (decode != null && decode.length != 0) {
                if (iVar != null) {
                    android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    try {
                        java.io.ByteArrayInputStream byteArrayInputStream = new java.io.ByteArrayInputStream(decode);
                        try {
                            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y1.a().Va(byteArrayInputStream, null, options);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.f) iVar).u(options);
                            byteArrayInputStream.close();
                        } finally {
                        }
                    } catch (java.lang.Exception e17) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.ViewAttributeHelper", "attachImageViewAttribute appId:%s, viewId:%d, decode gif bounds, get exception:%s", tVar.mo48798x74292566(), java.lang.Integer.valueOf(i17), e17);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.f) iVar).u(null);
                    }
                }
                aVar.mo51886x17258818(decode);
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Luggage.ViewAttributeHelper", "bytes is empty");
            if (iVar != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1083x760fdadc.f) iVar).u(null);
            }
        } catch (java.lang.NullPointerException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Luggage.ViewAttributeHelper", e18, "attachImageViewAttribute", new java.lang.Object[0]);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:20:0x0056
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1166)
        	at jadx.core.dex.visitors.regions.RegionMaker.processTryCatchBlocks(RegionMaker.java:1022)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:55)
        */
    public static void b(if1.h r9, org.json.JSONObject r10) {
        /*
            Method dump skipped, instructions count: 456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: if1.j.b(if1.h, org.json.JSONObject):void");
    }
}
