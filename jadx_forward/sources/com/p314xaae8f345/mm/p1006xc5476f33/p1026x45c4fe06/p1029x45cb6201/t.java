package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201;

/* loaded from: classes7.dex */
public class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d {

    /* renamed from: o, reason: collision with root package name */
    public final r45.jf f157500o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f157501p;

    public t(r45.jf jfVar, java.lang.String str) {
        this.f157500o = jfVar;
        this.f157501p = str;
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152200d = 1713;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaapp/batchgetwxadownloadurl";
        lVar.f152197a = jfVar;
        lVar.f152198b = new r45.kf();
        r45.y50 y50Var = jfVar.f459310f;
        if (y50Var == null || y50Var.f472330d == 0) {
            java.util.Iterator it = jfVar.f459308d.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Integer num = (java.lang.Integer) k91.e3.f387107e.get(((r45.le3) it.next()).f460900d.f459603d);
                if (num != null && num.intValue() > 0) {
                    if (jfVar.f459310f == null) {
                        r45.y50 y50Var2 = new r45.y50();
                        jfVar.f459310f = y50Var2;
                        y50Var2.f472331e = false;
                        y50Var2.f472332f = 1;
                    }
                    jfVar.f459310f.f472330d = num.intValue();
                }
            }
        }
        p(lVar.a());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public r45.y50 A() {
        return this.f157500o.f459310f;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    public java.lang.String B() {
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.String str = this.f157501p;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public void x(final int i17, final int i18, java.lang.String str, r45.kf kfVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        final r45.kf kfVar2;
        java.util.LinkedList linkedList;
        super.x(i17, i18, str, kfVar, m1Var);
        r45.jf jfVar = (r45.jf) this.f152179f.f152243a.f152217a;
        java.lang.Object[] objArr = new java.lang.Object[6];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        r45.y50 y50Var = jfVar.f459310f;
        java.util.Objects.requireNonNull(y50Var);
        objArr[1] = wz0.a.a(y50Var);
        objArr[2] = java.lang.Integer.valueOf(i17);
        objArr[3] = java.lang.Integer.valueOf(i18);
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        objArr[4] = str;
        objArr[5] = java.lang.Integer.valueOf((kfVar == null || (linkedList = kfVar.f460177d) == null) ? -1 : linkedList.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo", "onCgiBack(%d), source:%s, errType:%d, errCode:%d, errMsg:%s, resp_list:%d", objArr);
        if (kfVar != null) {
            kfVar2 = new r45.kf();
            kfVar2.mo11485x1f73abb4(kfVar.mo11484xe92ab0a8());
            if (kfVar.f460177d != null) {
                kfVar2.f460177d = new java.util.LinkedList(kfVar.f460177d);
            }
        } else {
            kfVar2 = null;
        }
        ((ku5.t0) ku5.t0.f394148d).q(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.appbrand.appcache.t$$a
            /* JADX WARN: Code restructure failed: missing block: B:52:0x00b2, code lost:
            
                r3.add(new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(368, 114, 1));
             */
            /* JADX WARN: Code restructure failed: missing block: B:54:0x00c0, code lost:
            
                if (r3.isEmpty() != false) goto L69;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x00c2, code lost:
            
                r0 = new com.p314xaae8f345.p542x3306d5.smc.C4582x424c344(368, 110, 1);
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
                throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.RunnableC11686x3546ed.run():void");
            }
        });
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.d, com.p314xaae8f345.mm.p944x882e457a.i
    public final pq5.g l() {
        pq5.g l17;
        r45.jf jfVar = (r45.jf) this.f152179f.f152243a.f152217a;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(hashCode());
        objArr[1] = java.lang.Integer.valueOf(jfVar.f459309e);
        r45.y50 y50Var = jfVar.f459310f;
        java.util.Objects.requireNonNull(y50Var);
        objArr[2] = wz0.a.a(y50Var);
        java.util.LinkedList<r45.le3> linkedList = jfVar.f459308d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        for (r45.le3 le3Var : linkedList) {
            sb6.append("{");
            if (!android.text.TextUtils.isEmpty(le3Var.f460900d.f459603d)) {
                sb6.append("appId:");
                sb6.append(le3Var.f460900d.f459603d);
            } else if (!android.text.TextUtils.isEmpty(le3Var.f460900d.f459604e)) {
                sb6.append("username:");
                sb6.append(le3Var.f460900d.f459604e);
            }
            sb6.append(", module:");
            sb6.append(le3Var.f460900d.f459605f);
            sb6.append(", package_type:");
            sb6.append(le3Var.f460900d.f459606g);
            sb6.append(", version_type:");
            sb6.append(le3Var.f460900d.f459607h);
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.g0.a(le3Var.f460900d.f459607h) && le3Var.f460906m != 0) {
                sb6.append(", dev_uin:");
                sb6.append(kk.v.a(le3Var.f460906m));
            }
            if (le3Var.f460903g > 0) {
                sb6.append(", version:");
                sb6.append(le3Var.f460903g);
            }
            r45.jc4 jc4Var = le3Var.f460901e;
            if (jc4Var != null && jc4Var.f459231d > 0) {
                sb6.append(", local_version:");
                sb6.append(le3Var.f460901e.f459231d);
            }
            if (le3Var.f460905i) {
                sb6.append(", need_zstd:true");
            }
            sb6.append("},");
        }
        sb6.append("]");
        objArr[3] = sb6.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiBatchGetPkgDownloadInfo", "run(%d), predownload_scene:%d, source:%s, req_list:%s", objArr);
        synchronized (this) {
            l17 = super.l();
        }
        return l17;
    }
}
