package com.tencent.mm.plugin.appbrand.appcache;

/* loaded from: classes7.dex */
public class t extends com.tencent.mm.plugin.appbrand.networking.d {

    /* renamed from: o, reason: collision with root package name */
    public final r45.jf f75967o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f75968p;

    public t(r45.jf jfVar, java.lang.String str) {
        this.f75967o = jfVar;
        this.f75968p = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1713;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/batchgetwxadownloadurl";
        lVar.f70664a = jfVar;
        lVar.f70665b = new r45.kf();
        r45.y50 y50Var = jfVar.f377777f;
        if (y50Var == null || y50Var.f390797d == 0) {
            java.util.Iterator it = jfVar.f377775d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) k91.e3.f305574e.get(((r45.le3) it.next()).f379367d.f378070d);
                if (num != null && num.intValue() > 0) {
                    if (jfVar.f377777f == null) {
                        r45.y50 y50Var2 = new r45.y50();
                        jfVar.f377777f = y50Var2;
                        y50Var2.f390798e = false;
                        y50Var2.f390799f = 1;
                    }
                    jfVar.f377777f.f390797d = num.intValue();
                }
            }
        }
        p(lVar.a());
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public r45.y50 A() {
        return this.f75967o.f377777f;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    public java.lang.String B() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.String str = this.f75968p;
        return str == null ? "" : str;
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(final int i17, final int i18, java.lang.String str, r45.kf kfVar, com.tencent.mm.modelbase.m1 m1Var) {
        final r45.kf kfVar2;
        java.util.LinkedList linkedList;
        super.x(i17, i18, str, kfVar, m1Var);
        r45.jf jfVar = (r45.jf) this.f70646f.f70710a.f70684a;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        r45.y50 y50Var = jfVar.f377777f;
        java.util.Objects.requireNonNull(y50Var);
        objArr[1] = wz0.a.a(y50Var);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = java.lang.Integer.valueOf((kfVar == null || (linkedList = kfVar.f378644d) == null) ? -1 : linkedList.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo", "onCgiBack(%d), source:%s, errType:%d, errCode:%d, errMsg:%s, resp_list:%d", objArr);
        if (kfVar != null) {
            kfVar2 = new r45.kf();
            kfVar2.setBaseResponse(kfVar.getBaseResponse());
            if (kfVar.f378644d != null) {
                kfVar2.f378644d = new java.util.LinkedList(kfVar.f378644d);
            }
        } else {
            kfVar2 = null;
        }
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t$$a
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
            
                r3.add(new com.tencent.mars.smc.IDKey(368, 114, 1));
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
            
                if (r3.isEmpty() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
            
                r0 = new com.tencent.mars.smc.IDKey(368, 110, 1);
             */
            /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
            
                return;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    Method dump skipped, instructions count: 247
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.appcache.t$$a.run():void");
            }
        });
    }

    @Override // com.tencent.mm.plugin.appbrand.networking.d, com.tencent.mm.modelbase.i
    public final pq5.g l() {
        pq5.g l17;
        r45.jf jfVar = (r45.jf) this.f70646f.f70710a.f70684a;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Integer.valueOf(jfVar.f377776e);
        r45.y50 y50Var = jfVar.f377777f;
        java.util.Objects.requireNonNull(y50Var);
        objArr[2] = wz0.a.a(y50Var);
        java.util.LinkedList<r45.le3> linkedList = jfVar.f377775d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (r45.le3 le3Var : linkedList) {
            sb6.append("{");
            if (!android.text.TextUtils.isEmpty(le3Var.f379367d.f378070d)) {
                sb6.append("appId:");
                sb6.append(le3Var.f379367d.f378070d);
            } else if (!android.text.TextUtils.isEmpty(le3Var.f379367d.f378071e)) {
                sb6.append("username:");
                sb6.append(le3Var.f379367d.f378071e);
            }
            sb6.append(", module:");
            sb6.append(le3Var.f379367d.f378072f);
            sb6.append(", package_type:");
            sb6.append(le3Var.f379367d.f378073g);
            sb6.append(", version_type:");
            sb6.append(le3Var.f379367d.f378074h);
            if (com.tencent.mm.plugin.appbrand.appcache.g0.a(le3Var.f379367d.f378074h) && le3Var.f379373m != 0) {
                sb6.append(", dev_uin:");
                sb6.append(kk.v.a(le3Var.f379373m));
            }
            if (le3Var.f379370g > 0) {
                sb6.append(", version:");
                sb6.append(le3Var.f379370g);
            }
            r45.jc4 jc4Var = le3Var.f379368e;
            if (jc4Var != null && jc4Var.f377698d > 0) {
                sb6.append(", local_version:");
                sb6.append(le3Var.f379368e.f377698d);
            }
            if (le3Var.f379372i) {
                sb6.append(", need_zstd:true");
            }
            sb6.append("},");
        }
        sb6.append("]");
        objArr[3] = sb6.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo", "run(%d), predownload_scene:%d, source:%s, req_list:%s", objArr);
        synchronized (this) {
            l17 = super.l();
        }
        return l17;
    }
}
