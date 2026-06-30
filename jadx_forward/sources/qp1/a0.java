package qp1;

/* loaded from: classes8.dex */
public abstract class a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f447215a;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        f447215a = hashMap;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79131xb73067f6);
        hashMap.put("doc", valueOf);
        hashMap.put("docx", valueOf);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79129x503b4408);
        hashMap.put("ppt", valueOf2);
        hashMap.put("pptx", valueOf2);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79123x2de2cf4b);
        hashMap.put("xls", valueOf3);
        hashMap.put("xlsx", valueOf3);
        hashMap.put("pdf", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79128x503b4286));
        hashMap.put("numbers", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79125x17f135de));
        hashMap.put("pages", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79127x2e736c58));
        hashMap.put("key", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79124x503b2ff3));
        hashMap.put("txt", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79130x503b5404));
        hashMap.put(com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79122xeb427dd5));
        hashMap.put("ofd", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79126x503b3f01));
    }

    public static boolean a(android.view.View view, int i17, int i18) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i19 = iArr[0];
        int i27 = iArr[1];
        return new android.graphics.Rect(i19, i27, view.getWidth() + i19, view.getHeight() + i27).contains(i17, i18);
    }

    public static java.lang.Integer b(java.lang.String str) {
        return (java.lang.Integer) ((java.util.HashMap) f447215a).get(str);
    }
}
