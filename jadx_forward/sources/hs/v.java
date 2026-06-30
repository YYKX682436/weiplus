package hs;

@j95.b
/* loaded from: classes4.dex */
public final class v extends i95.w implements qk.r7 {
    public aq.u0 Ai(long j17, java.lang.String videoSavePath, java.lang.String coverPath, long j18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(videoSavePath, "videoSavePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverPath, "coverPath");
        return qp.b.f447207a.b(j17, videoSavePath, coverPath, j18);
    }

    public java.util.HashMap Bi(java.util.List mediaIdList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaIdList, "mediaIdList");
        qp.b bVar = qp.b.f447207a;
        java.util.List<java.lang.Long> V0 = kz5.n0.V0(mediaIdList);
        f65.q qVar = f65.q.f341492a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isBatchLivePhoto before check cache size is ");
        java.util.ArrayList arrayList = (java.util.ArrayList) V0;
        sb6.append(arrayList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLivePhotoCore", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        if (!arrayList.isEmpty()) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            com.p305xc052bfb6.p306x2eaf9f.C2850x3e05e145 c2850x3e05e145 = qp.b.f447208b;
            if (c2850x3e05e145 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto >> livePhotoCore is null");
            } else {
                try {
                    java.util.HashMap<java.lang.Long, java.lang.Boolean> m21191x8188929c = c2850x3e05e145.m21191x8188929c(V0);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto costTime: " + (java.lang.System.currentTimeMillis() - currentTimeMillis));
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    jSONObject.put("count", arrayList.size());
                    long currentTimeMillis2 = java.lang.System.currentTimeMillis() - currentTimeMillis;
                    java.lang.String jSONObject2 = jSONObject.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
                    qVar.a("is_livePhoto", 0, currentTimeMillis2, jSONObject2);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m21191x8188929c);
                    for (java.util.Map.Entry<java.lang.Long, java.lang.Boolean> entry : m21191x8188929c.entrySet()) {
                        java.lang.Long key = entry.getKey();
                        java.lang.Boolean value = entry.getValue();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(key);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(value);
                        hashMap.put(key, value);
                    }
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MMLivePhotoCore", "isBatchLivePhoto api exception " + e17.getMessage());
                    f65.q.b(qVar, "is_livePhoto", -1, java.lang.System.currentTimeMillis() - currentTimeMillis, null, 8, null);
                }
            }
        }
        return hashMap;
    }

    public bs.b wi(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "check_file")) {
            return new cs.a();
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(key, "check_permission")) {
            return new cs.c();
        }
        return null;
    }
}
