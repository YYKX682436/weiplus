package qo4;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final qo4.c f447194a = new qo4.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f447195b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("MicroMsg.VideoCompositionExportConfig");

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0187, code lost:
    
        if (r10.optInt("key", -1) >= r1) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final jz5.l a(r45.h70 r14) {
        /*
            Method dump skipped, instructions count: 505
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qo4.c.a(r45.h70):jz5.l");
    }

    public final org.json.JSONArray b() {
        java.lang.String u17 = f447195b.u("PARALLEL_COUNT_HISTORY_DATA_V2", "");
        if (android.text.TextUtils.isEmpty(u17)) {
            return new org.json.JSONArray();
        }
        try {
            return new org.json.JSONArray(u17);
        } catch (java.lang.Exception unused) {
            return new org.json.JSONArray();
        }
    }

    public final boolean c(r45.h70 compositionInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(compositionInfo, "compositionInfo");
        java.util.LinkedList linkedList = compositionInfo.f457430d;
        return (linkedList.size() == 1 && ((r45.ho6) linkedList.get(0)).f457869g - ((r45.ho6) linkedList.get(0)).f457868f >= 30000 && compositionInfo.f457437n.f456472e.size() == 0) ? false : true;
    }

    public final org.json.JSONObject d(org.json.JSONObject jSONObject, int i17) {
        org.json.JSONObject put = jSONObject.put("hit", i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(put, "put(...)");
        return put;
    }
}
