package pd3;

/* loaded from: classes7.dex */
public final class b extends od3.b {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f435083f = "MBJsApiCreateCDNDownloadTask";

    public static final boolean v(pd3.b bVar, java.lang.String str, java.lang.String str2) {
        bVar.getClass();
        jc3.v Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4.class))).Ai(str, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900.f37480x612bd3b5);
        if (Ai == null || !Ai.c(str2)) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(bVar.f435083f, "download abort %s", str2);
        return true;
    }

    @Override // od3.a
    public java.lang.String a() {
        return "downloadTaskId";
    }

    @Override // od3.a
    public void d(lc3.a0 data, java.lang.String taskId, java.lang.String url, java.lang.String bizName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskId, "taskId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        java.lang.String optString = data.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, "");
        int optInt = data.optInt("timeout", ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.d6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.e4.class))).wi(bizName).f380501d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f435083f, "bizName:" + bizName + ",configTimeout:" + optInt + ",url:" + url + ",dstPath:" + optString);
        jc3.v Ai = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4.class))).Ai(bizName, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900.f37480x612bd3b5);
        if (Ai != null) {
            Ai.d((lc3.h0) this.f399423a, bizName, data, optInt, taskId, "createCDNDownloadTask", new pd3.a(this, bizName, taskId, optString));
        }
    }

    @Override // lc3.c0
    public java.lang.String f() {
        return "createCDNDownloadTask";
    }

    @Override // od3.a
    /* renamed from: getTaskId */
    public java.lang.String mo151084x30961476() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.l6) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.h4.class))).Bi(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.EnumC16420x48ed1900.f37480x612bd3b5);
    }

    public final void w(java.lang.String bizName, java.lang.String str, int i17, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizName, "bizName");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(this.f435083f, "sendFailMsg, bizName = %s, downloadTaskId = %s, errno = %d, errMsg = %s", bizName, str, java.lang.Integer.valueOf(i17), str2);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("downloadTaskId", str);
        jSONObject.put("state", "fail");
        jSONObject.put("errno", i17);
        jSONObject.put("errMsg", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322 c16444x6bb88322 = new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1842x6de15a2e.p1843x551ac888.C16444x6bb88322();
        c16444x6bb88322.f229415e = jSONObject2;
        u(c16444x6bb88322);
    }
}
