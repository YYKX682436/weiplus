package k91;

/* loaded from: classes4.dex */
public abstract class j4 extends l75.n0 {

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f387158d;

    public j4(l75.k0 k0Var, java.lang.String str, java.lang.String[] strArr) {
        super(k0Var, k91.v5.E1, str, strArr);
        this.f387158d = k0Var;
    }

    public static boolean P0(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) != android.text.TextUtils.isEmpty(str2)) {
            return false;
        }
        if (android.text.TextUtils.isEmpty(str)) {
            return true;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        if (str == null) {
            str = "";
        }
        int hashCode = str.hashCode();
        if (str2 == null) {
            str2 = "";
        }
        return hashCode == str2.hashCode();
    }

    public static com.p314xaae8f345.mm.p2495xc50a8b8b.g i1(k91.v5 v5Var) {
        byte[] h17;
        if (v5Var == null) {
            h17 = new byte[0];
        } else {
            java.lang.String str = v5Var.f68923x1edbddf8;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            h17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.h(str);
        }
        return new com.p314xaae8f345.mm.p2495xc50a8b8b.g(h17, 0, h17.length);
    }

    public boolean D0() {
        l75.k0 k0Var = this.f387158d;
        return (k0Var == null || k0Var.J()) ? false : true;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: J0, reason: merged with bridge method [inline-methods] */
    public boolean mo49766xb06685ab(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(v5Var.f68924xdec927b)) {
            v5Var.f68925x483b1229 = v5Var.f68924xdec927b.hashCode();
        }
        boolean mo49766xb06685ab = super.mo49766xb06685ab((l75.f0) v5Var, false, strArr);
        if (mo49766xb06685ab && z17 && !android.text.TextUtils.isEmpty(v5Var.f68924xdec927b)) {
            mo142179xf35bbb4("single", 5, v5Var.f68924xdec927b);
        }
        return mo49766xb06685ab;
    }

    public boolean L0(java.lang.String str, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorage", "delete with invalid username");
            return false;
        }
        k91.v5 v5Var = new k91.v5();
        v5Var.f68924xdec927b = str;
        return mo49766xb06685ab(v5Var, z17, new java.lang.String[0]);
    }

    public boolean W0(java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, java.util.List list, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(list)) {
            return false;
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d", str, java.lang.Integer.valueOf(list.size()));
        }
        k91.v5 v5Var = new k91.v5();
        v5Var.f68924xdec927b = str;
        boolean z18 = !get(v5Var, dm.i4.f66875xa013b0d5);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18));
        }
        java.util.Iterator it = list.iterator();
        boolean z19 = false;
        while (it.hasNext()) {
            r45.yc7 yc7Var = (r45.yc7) it.next();
            if (yc7Var != null) {
                if (!z17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, applyFieldChange(%s):start", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), yc7Var.f472504d);
                }
                z19 |= y0(v5Var, yc7Var);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, applyFieldChange(%s):%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), yc7Var.f472504d, java.lang.Boolean.valueOf(z19));
            }
        }
        v5Var.f68922x6a92a081 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.i1();
        v5Var.f68923x1edbddf8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.l(gVar == null ? new byte[0] : gVar.f273689a);
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, apply:%b", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        }
        if (!z19) {
            mo51732xbf274172(v5Var, false, dm.i4.f66875xa013b0d5);
        } else if (z18) {
            mo51731x24249762(v5Var, z17);
        } else {
            mo51732xbf274172(v5Var, z17, dm.i4.f66875xa013b0d5);
        }
        if (!z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaAttrStorage", "flushAttrs username:%s, list.size:%d, doInsert:%b, apply:%b, complete", str, java.lang.Integer.valueOf(list.size()), java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
        }
        return z19;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public boolean get(k91.v5 v5Var, java.lang.String... strArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals(dm.i4.f66875xa013b0d5)) {
                    strArr[i17] = "usernameHash";
                    v5Var.f68925x483b1229 = v5Var.f68924xdec927b.hashCode();
                    break;
                }
                i17++;
            }
        }
        return super.get(v5Var, strArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x001f, code lost:
    
        if (r10.moveToFirst() != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0021, code lost:
    
        r1 = new k91.v5();
        r1.mo9015xbf5d97fd(r10);
        r0.add(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r10.moveToNext() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List d1(java.lang.String... r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            l75.k0 r1 = r9.f387158d     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r9.mo145255x88e404c3()     // Catch: java.lang.Throwable -> L45
            int r3 = r10.length     // Catch: java.lang.Throwable -> L45
            if (r3 != 0) goto Lf
            r10 = 0
        Lf:
            r3 = r10
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            android.database.Cursor r10 = r1.E(r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L45
            if (r10 == 0) goto L3f
            boolean r1 = r10.moveToFirst()     // Catch: java.lang.Throwable -> L33
            if (r1 == 0) goto L3f
        L21:
            k91.v5 r1 = new k91.v5     // Catch: java.lang.Throwable -> L33
            r1.<init>()     // Catch: java.lang.Throwable -> L33
            r1.mo9015xbf5d97fd(r10)     // Catch: java.lang.Throwable -> L33
            r0.add(r1)     // Catch: java.lang.Throwable -> L33
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L33
            if (r1 != 0) goto L21
            goto L3f
        L33:
            r1 = move-exception
            if (r10 == 0) goto L3e
            r10.close()     // Catch: java.lang.Throwable -> L3a
            goto L3e
        L3a:
            r10 = move-exception
            r1.addSuppressed(r10)     // Catch: java.lang.Throwable -> L45
        L3e:
            throw r1     // Catch: java.lang.Throwable -> L45
        L3f:
            if (r10 == 0) goto L51
            r10.close()     // Catch: java.lang.Throwable -> L45
            goto L51
        L45:
            r10 = move-exception
            java.lang.String r1 = "getAllRecords t=%s"
            java.lang.Object[] r10 = new java.lang.Object[]{r10}
            java.lang.String r2 = "MicroMsg.WxaAttrStorage"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r1, r10)
        L51:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.j4.d1(java.lang.String[]):java.util.List");
    }

    @Override // l75.s0
    /* renamed from: doNotify */
    public void mo142179xf35bbb4(java.lang.String str, int i17, java.lang.Object obj) {
        super.mo142179xf35bbb4(str, i17, obj);
        new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11822x3b96e8c7(str, i17, obj).e();
    }

    @Override // l75.n0
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public final boolean mo51731x24249762(k91.v5 v5Var, boolean z17) {
        v5Var.f68925x483b1229 = v5Var.f68924xdec927b.hashCode();
        super.mo51731x24249762(v5Var, false);
        boolean z18 = n1(v5Var.f68924xdec927b, "appId") != null;
        if (z18 && z17 && !android.text.TextUtils.isEmpty(v5Var.f68924xdec927b)) {
            mo142179xf35bbb4("single", 2, v5Var.f68924xdec927b);
            mo142179xf35bbb4("single", 3, v5Var.f68924xdec927b);
        }
        return z18;
    }

    public k91.v5 k1(java.lang.String str, java.lang.String... strArr) {
        k91.v5 v5Var = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return null;
        }
        android.database.Cursor D = this.f387158d.D(mo145255x88e404c3(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=?", "appId"), new java.lang.String[]{str}, null, null, null, 2);
        if (D == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) null==cursor", str);
            return null;
        }
        if (D.moveToFirst()) {
            v5Var = new k91.v5();
            v5Var.mo9015xbf5d97fd(D);
            v5Var.f68904x28d45f97 = str;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorage", "queryWithAppId(%s) !cursor.moveToFirst()", str);
        }
        D.close();
        return v5Var;
    }

    public k91.v5 n1(java.lang.String str, java.lang.String... strArr) {
        k91.v5 v5Var;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !str.endsWith("@app")) {
            return null;
        }
        try {
            android.database.Cursor D = this.f387158d.D(mo145255x88e404c3(), com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr) ? null : strArr, java.lang.String.format(java.util.Locale.US, "%s=?", "usernameHash"), new java.lang.String[]{java.lang.String.valueOf(str.hashCode())}, null, null, null, 2);
            if (D == null) {
                if (D != null) {
                    D.close();
                }
                return null;
            }
            try {
                if (D.moveToFirst()) {
                    v5Var = new k91.v5();
                    v5Var.mo9015xbf5d97fd(D);
                    v5Var.f68924xdec927b = str;
                } else {
                    v5Var = null;
                }
                D.close();
                return v5Var;
            } finally {
            }
        } catch (java.lang.RuntimeException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.WxaAttrStorage", e17, "queryWithUsername", new java.lang.Object[0]);
            return null;
        }
    }

    public final boolean o1(java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return false;
        }
        android.content.ContentValues contentValues = new android.content.ContentValues(1);
        contentValues.put("syncTimeSecond", (java.lang.Long) 0L);
        return this.f387158d.p(mo145255x88e404c3(), contentValues, java.lang.String.format(java.util.Locale.US, "%s=?", "appId"), new java.lang.String[]{str}) > 0;
    }

    public boolean p1(java.lang.String str, r45.zc7 zc7Var) {
        k91.v5 k17;
        java.lang.String str2 = null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && (k17 = k1(str, dm.i4.f66875xa013b0d5)) != null) {
            str2 = k17.f68924xdec927b;
        }
        if (android.text.TextUtils.isEmpty(str2)) {
            java.util.Iterator it = zc7Var.f473454e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                r45.yc7 yc7Var = (r45.yc7) it.next();
                if ("UserName".equalsIgnoreCase(yc7Var.f472504d)) {
                    str2 = yc7Var.f472505e;
                    break;
                }
            }
            if (android.text.TextUtils.isEmpty(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaAttrStorage", "updateAttrsWithProto appId=%s, username EMPTY", str);
                return false;
            }
        }
        return W0(str2, zc7Var.f473453d, zc7Var.f473454e, true);
    }

    @Override // l75.n0
    /* renamed from: u1, reason: merged with bridge method [inline-methods] */
    public final boolean mo51732xbf274172(k91.v5 v5Var, boolean z17, java.lang.String... strArr) {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.N0(strArr)) {
            int i17 = 0;
            while (true) {
                if (i17 >= strArr.length) {
                    break;
                }
                if (strArr[i17].equals(dm.i4.f66875xa013b0d5)) {
                    strArr[i17] = "usernameHash";
                    v5Var.f68925x483b1229 = v5Var.f68924xdec927b.hashCode();
                    break;
                }
                i17++;
            }
        }
        boolean mo51732xbf274172 = super.mo51732xbf274172(v5Var, false, strArr);
        if (mo51732xbf274172 && z17 && !android.text.TextUtils.isEmpty(v5Var.f68924xdec927b)) {
            mo142179xf35bbb4("single", 3, v5Var.f68924xdec927b);
        }
        return mo51732xbf274172;
    }

    public boolean y0(k91.v5 v5Var, r45.yc7 yc7Var) {
        int P;
        if ("NickName".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68913x21f9b213)) {
            java.lang.String str = yc7Var.f472505e;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            if (str == null) {
                str = "";
            }
            v5Var.f68913x21f9b213 = str;
            return true;
        }
        if ("BrandIconURL".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68910xea1bd3d4)) {
            v5Var.f68910xea1bd3d4 = yc7Var.f472505e;
            return true;
        }
        if ("BigHeadImgUrl".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68907x6b8edeb4)) {
            v5Var.f68907x6b8edeb4 = yc7Var.f472505e;
            return true;
        }
        if ("SmallHeadImgUrl".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68920x68aa7b8d)) {
            v5Var.f68920x68aa7b8d = yc7Var.f472505e;
            return true;
        }
        if ("Signature".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68919xda9bc3b3)) {
            v5Var.f68919xda9bc3b3 = yc7Var.f472505e;
            return true;
        }
        if ("WxAppOpt".equals(yc7Var.f472504d) && (P = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(yc7Var.f472505e, 0)) != v5Var.f68906xf1b7abb7) {
            v5Var.f68906xf1b7abb7 = P;
            return true;
        }
        if ("RegisterSource".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68915x930b3683)) {
            v5Var.f68915x930b3683 = yc7Var.f472505e;
            return true;
        }
        if ("WxaAppInfo".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68905x453b082a)) {
            v5Var.f68905x453b082a = yc7Var.f472505e;
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(yc7Var.f472505e);
                v5Var.f68904x28d45f97 = jSONObject.getString("Appid");
                v5Var.f68917xa22f9ad1 = jSONObject.getString("RoundedSquareIconUrl");
                v5Var.f68918x4d428a85 = jSONObject.optString("ShortNickName");
            } catch (java.lang.Exception unused) {
            }
            return true;
        }
        if ("WxaAppVersionInfo".equalsIgnoreCase(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68926x94cd21e1)) {
            v5Var.f68926x94cd21e1 = yc7Var.f472505e;
            return true;
        }
        if ("BindWxaInfo".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68908xb345d3ac)) {
            v5Var.f68908xb345d3ac = yc7Var.f472505e;
            return true;
        }
        if ("WxaAppDynamic".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68911x5c4f59c8)) {
            v5Var.f68911x5c4f59c8 = yc7Var.f472505e;
            return true;
        }
        if ("MMBizMenu".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68909x6ebdf2cd)) {
            v5Var.f68909x6ebdf2cd = yc7Var.f472505e;
            return true;
        }
        if ("PassThroughInfo".equals(yc7Var.f472504d) && !P0(yc7Var.f472505e, v5Var.f68914xdb18fafd)) {
            v5Var.f68914xdb18fafd = yc7Var.f472505e;
            return true;
        }
        if (!"StablePassThroughInfo".equals(yc7Var.f472504d) || P0(yc7Var.f472505e, v5Var.f68921x18e8b202)) {
            return false;
        }
        v5Var.f68921x18e8b202 = yc7Var.f472505e;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean z0(int r18, r45.gh r19, java.util.List r20) {
        /*
            r17 = this;
            r1 = r17
            r0 = r19
            r2 = r20
            java.lang.String r3 = "MicroMsg.WxaAttrStorage"
            java.util.LinkedList r4 = r0.f456776d
            int r4 = r4.size()
            l75.k0 r5 = r1.f387158d
            r8 = 1
            if (r4 > r8) goto L16
            r9 = -1
            goto L28
        L16:
            java.lang.String r4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            long r9 = r4.getId()
            java.lang.Long r4 = java.lang.Long.valueOf(r9)
            long r9 = r5.F(r4)
        L28:
            java.util.LinkedList r4 = new java.util.LinkedList
            r4.<init>()
            r11 = 0
            java.util.LinkedList r0 = r0.f456776d     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L81
            r12 = r11
        L35:
            boolean r13 = r0.hasNext()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            if (r13 == 0) goto L6e
            java.lang.Object r13 = r0.next()     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r45.bd7 r13 = (r45.bd7) r13     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r14 = "batchSyncInGroup, scene(%d), flushAttrs(%s)"
            r15 = 2
            java.lang.Object[] r15 = new java.lang.Object[r15]     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.Integer r16 = java.lang.Integer.valueOf(r18)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r15[r11] = r16     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r6 = r13.f452217d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r15[r8] = r6     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r14, r15)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.lang.String r6 = r13.f452217d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            com.tencent.mm.protobuf.g r7 = r13.f452218e     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            java.util.LinkedList r14 = r13.f452219f     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            boolean r6 = r1.W0(r6, r7, r14, r11)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r12 = r12 | r6
            if (r12 == 0) goto L35
            java.lang.String r6 = r13.f452217d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            boolean r6 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            if (r6 != 0) goto L35
            java.lang.String r6 = r13.f452217d     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            r4.add(r6)     // Catch: java.lang.Exception -> L7c java.lang.Throwable -> L7f
            goto L35
        L6e:
            r6 = -1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L99
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.w(r0)
            goto L99
        L7c:
            r0 = move-exception
            r11 = r12
            goto L82
        L7f:
            r0 = move-exception
            goto Lab
        L81:
            r0 = move-exception
        L82:
            java.lang.String r6 = "batchUpdateWithProto fail: %s"
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch: java.lang.Throwable -> L7f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r6, r0)     // Catch: java.lang.Throwable -> L7f
            r6 = -1
            int r0 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r0 == 0) goto L98
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            r5.w(r0)
        L98:
            r12 = r11
        L99:
            int r0 = r4.size()
            if (r0 <= 0) goto Laa
            if (r2 == 0) goto La4
            r2.addAll(r4)
        La4:
            java.lang.String r0 = "batch"
            r2 = 3
            r1.mo142179xf35bbb4(r0, r2, r4)
        Laa:
            return r12
        Lab:
            r2 = -1
            int r2 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r2 == 0) goto Lb8
            java.lang.Long r2 = java.lang.Long.valueOf(r9)
            r5.w(r2)
        Lb8:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: k91.j4.z0(int, r45.gh, java.util.List):boolean");
    }
}
