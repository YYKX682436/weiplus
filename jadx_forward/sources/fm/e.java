package fm;

/* loaded from: classes10.dex */
public final class e implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f345512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f345513e;

    public e(java.lang.String str, v65.n nVar) {
        this.f345512d = str;
        this.f345513e = nVar;
    }

    @Override // dn.k
    public void O(java.lang.String mediaId, java.io.ByteArrayOutputStream buff) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buff, "buff");
    }

    @Override // dn.k
    public int r4(java.lang.String mediaId, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#downloadUrlRes user-direct cdncallback, mediaId:");
        sb6.append(mediaId);
        sb6.append(", startRet:");
        sb6.append(i17);
        sb6.append(", ");
        sb6.append(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null);
        sb6.append(", progress: ");
        sb6.append(gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", sb6.toString());
        if (hVar == null) {
            return 0;
        }
        int i18 = hVar.f69553xb5f54fe9;
        v65.n nVar = this.f345513e;
        if (i18 == 0) {
            boolean j17 = com.p314xaae8f345.mm.vfs.w6.j(this.f345512d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "#downloadUrlRes user-direct success, fileExist:" + j17);
            if (j17) {
                nVar.a(new fm.b(true, 0, ""));
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BaseStringResFeatureService", "#downloadUrlRes user-direct failed, " + hVar.f69553xb5f54fe9);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("httpCode", hVar.f69533xab94fd8c);
            jSONObject.put("responseHeader", hVar.f69532xac74343b);
            jSONObject.put("serverIp", hVar.f69556x6ff67d4f);
            java.lang.String jSONObject2 = jSONObject.toString();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
            nVar.a(new fm.b(false, hVar.f69553xb5f54fe9, r26.i0.t(jSONObject2, ",", ";", false)));
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String mediaId, byte[] inbuf) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inbuf, "inbuf");
        return new byte[0];
    }
}
