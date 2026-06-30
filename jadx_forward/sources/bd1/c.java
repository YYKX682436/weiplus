package bd1;

/* loaded from: classes7.dex */
public class c implements gb1.m {

    /* renamed from: d, reason: collision with root package name */
    public final uh1.d0 f100771d;

    /* renamed from: f, reason: collision with root package name */
    public final gb1.a f100773f;

    /* renamed from: e, reason: collision with root package name */
    public boolean f100772e = false;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f100774g = new java.util.concurrent.atomic.AtomicBoolean(false);

    public c(uh1.d0 d0Var, gb1.a aVar) {
        this.f100771d = d0Var;
        this.f100773f = aVar;
    }

    @Override // gb1.m
    public java.lang.String a() {
        return "uploadTaskId";
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, java.lang.String str, java.lang.String str2, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BaseCreateUploadTask", "sendFailMsg, uploadTaskId = %s, errMsg = %s, errno = %d", str, str2, java.lang.Integer.valueOf(i17));
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("uploadTaskId", str);
        hashMap.put("state", "fail");
        hashMap.put("errno", java.lang.Integer.valueOf(i17));
        hashMap.put("errMsg", str2);
        java.lang.String jSONObject = new org.json.JSONObject(hashMap).toString();
        bd1.b bVar = new bd1.b();
        bVar.p(lVar);
        bVar.r(jSONObject);
        bVar.n(this.f100773f.a(str));
    }

    @Override // gb1.m
    public void d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l lVar, org.json.JSONObject jSONObject, java.lang.String str) {
        uh1.a aVar;
        uh1.e0 a17;
        lVar.mo48798x74292566();
        if (!this.f100774g.getAndSet(true)) {
            if (this.f100771d != null) {
                lVar.mo48798x74292566();
                this.f100772e = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.vf.a(5);
            }
            if (this.f100772e) {
                uh1.a aVar2 = (uh1.a) lVar.b(uh1.a.class);
                fp.d0.o(org.p3343x72743996.net.p3358x316220.C29601xc6f6dfd1.m154080xdba63de6());
                if (aVar2 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateUploadTask", "setupRequestMode config not found, setUserCertVerify false appId(%s)", lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(false);
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "setupRequestMode(%b),appId(%s)", java.lang.Boolean.valueOf(aVar2.H), lVar.mo48798x74292566());
                    com.p314xaae8f345.p542x3306d5.cdn.C4447x56271981.m37958xae0bceea(aVar2.H);
                }
            }
        }
        java.lang.String mo48798x74292566 = lVar.mo48798x74292566();
        java.lang.String optString = jSONObject.optString(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString)) {
            b(lVar, str, "filePath is null", 600005);
            return;
        }
        com.p314xaae8f345.mm.vfs.r6 mo49620x1d537609 = lVar.mo50354x59eafec1().mo49620x1d537609(optString);
        if (mo49620x1d537609 == null || !mo49620x1d537609.m()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.BaseCreateUploadTask", "upload appId(%s) tempFilePath(%s), found no real file", lVar.mo48798x74292566(), optString);
            b(lVar, str, "fail:file doesn't exist", 600005);
            return;
        }
        java.lang.String o17 = mo49620x1d537609.o();
        java.lang.String c17 = q75.g.c(optString);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "upload appId(%s) uploadTaskId(%s)", lVar.mo48798x74292566(), str);
        bd1.a aVar3 = new bd1.a(this, str, o17, lVar);
        uh1.a aVar4 = (uh1.a) lVar.b(uh1.a.class);
        java.util.Map g17 = uh1.j0.g(jSONObject, aVar4);
        java.lang.String optString2 = jSONObject.optString("url");
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(optString2)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "url is null");
            b(lVar, str, "url is null or nil", 600005);
            return;
        }
        boolean z17 = jSONObject.optBoolean("__skipDomainCheck__") ? false : aVar4.f509273d;
        if (z17 && !uh1.j0.A(aVar4.f509284r, optString2, false)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "not in domain url %s", optString2);
            b(lVar, str, "url not in domain list", 600002);
            return;
        }
        if (aVar4.f509280n <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "concurrent <= 0 ");
        }
        int optInt = jSONObject.optInt("timeout", 0);
        if (optInt <= 0) {
            optInt = uh1.j0.n(aVar4, 2);
        }
        if (optInt <= 0) {
            optInt = com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54062xde855ea8;
        }
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f509329b;
        uh1.h0 h0Var = uh1.g0.f509327a;
        if (h0Var.a(mo48798x74292566) == null) {
            aVar = aVar4;
            uh1.e0 e0Var = new uh1.e0(lVar, this.f100772e);
            java.util.HashMap hashMap = h0Var.f509330a;
            if (!hashMap.containsKey(mo48798x74292566)) {
                hashMap.put(mo48798x74292566, e0Var);
            }
            a17 = e0Var;
        } else {
            aVar = aVar4;
            a17 = h0Var.a(mo48798x74292566);
        }
        java.lang.String d17 = s46.c.d(optString);
        if (a17 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseCreateUploadTask", "before do upload, checkDomains = %b, timeout %d, inputTimeout: %d", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(jSONObject.optInt("timeout", 0)));
            if (z17) {
                a17.a(optInt, c17, o17, jSONObject, g17, aVar.f509284r, aVar3, str, bd1.d.f4199x24728b, d17);
            } else {
                a17.a(optInt, c17, o17, jSONObject, g17, null, aVar3, str, bd1.d.f4199x24728b, d17);
            }
        }
    }

    @Override // gb1.m
    /* renamed from: getTaskId */
    public java.lang.String mo1076x30961476() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = uh1.h0.f509329b;
        uh1.g0.f509327a.getClass();
        sb6.append(uh1.h0.f509329b.incrementAndGet());
        sb6.append("");
        return sb6.toString();
    }
}
