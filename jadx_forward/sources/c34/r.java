package c34;

/* loaded from: classes11.dex */
public class r extends dm.ea {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f119769y0 = dm.ea.m124955x3593deb(c34.r.class);

    /* renamed from: p0, reason: collision with root package name */
    public int f119770p0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public int f119771x0;

    public r() {
        this.f66429x63f8483c = 2;
    }

    @Override // dm.ea, l75.f0
    /* renamed from: convertTo */
    public android.content.ContentValues mo9763xeb27878e() {
        int i17;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f119770p0 & 2) != 0) {
            contentValues.put(dm.i4.f66875xa013b0d5, this.f66444xdec927b);
        }
        if ((this.f119770p0 & 4) != 0) {
            contentValues.put("nickname", this.f66431x21f9b213);
        }
        if ((this.f119770p0 & 8) != 0) {
            contentValues.put("province", u0());
        }
        if ((this.f119770p0 & 16) != 0) {
            contentValues.put("city", t0());
        }
        if ((this.f119770p0 & 32) != 0) {
            contentValues.put("signature", this.f66440xda9bc3b3);
        }
        if ((this.f119770p0 & 64) != 0) {
            contentValues.put("distance", this.f66426x2ef4959a);
        }
        if ((this.f119770p0 & 128) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.f66438x4b6e7fa1));
        }
        if ((this.f119770p0 & 256) != 0) {
            contentValues.put("imgstatus", java.lang.Integer.valueOf(this.f66428xb8ff7470));
        }
        if ((this.f119770p0 & 512) != 0) {
            contentValues.put("hasHDImg", java.lang.Integer.valueOf(this.f66427x24cdac72));
        }
        if ((this.f119770p0 & 1024) != 0) {
            contentValues.put("insertBatch", java.lang.Integer.valueOf(this.f66429x63f8483c));
        }
        if ((this.f119770p0 & 2048) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f66434x13320504));
        }
        if ((this.f119770p0 & 4096) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.f66435x13320505));
        }
        if ((this.f119770p0 & 8192) != 0) {
            contentValues.put("reserved3", this.f66436x13320506);
        }
        if ((this.f119770p0 & 16384) != 0) {
            try {
                i17 = java.lang.Integer.valueOf(this.f66437x13320507).intValue();
            } catch (java.lang.Throwable unused) {
                i17 = 0;
            }
            contentValues.put("reserved4", java.lang.Integer.valueOf(i17));
        }
        if ((this.f119770p0 & 32768) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.f66443x2262335f));
        }
        if ((this.f119770p0 & 65536) != 0) {
            contentValues.put("lvbuffer", this.f66430xbcdbef);
        }
        if ((this.f119770p0 & 131072) != 0) {
            contentValues.put("regionCode", this.f66433x427ae366);
        }
        if ((this.f119770p0 & 262144) != 0) {
            contentValues.put("snsFlag", java.lang.Integer.valueOf(this.f66441xfa2a62bf));
        }
        if ((this.f119770p0 & 524288) != 0) {
            contentValues.put("sns_bgurl", this.f66442x433be87e);
        }
        return contentValues;
    }

    @Override // dm.ea, l75.f0
    /* renamed from: getDBInfo */
    public l75.e0 mo232x1380a922() {
        return f119769y0;
    }

    public java.lang.String t0() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66433x427ae366)) {
            java.lang.String[] split = this.f66433x427ae366.split("_");
            if (split.length > 0) {
                if (split.length > 2) {
                    this.f66425x225a3d90 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().h(split[0], split[1], split[2]);
                } else if (split.length == 2) {
                    this.f66425x225a3d90 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(split[0], split[1]);
                } else {
                    this.f66425x225a3d90 = "";
                }
            }
        }
        return this.f66425x225a3d90;
    }

    public java.lang.String u0() {
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f66433x427ae366)) {
            java.lang.String[] split = this.f66433x427ae366.split("_");
            if (split.length > 0) {
                if (split.length <= 2 || !split[0].equalsIgnoreCase("cn")) {
                    this.f66432xe2e734d5 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().i(split[0]);
                } else {
                    this.f66432xe2e734d5 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.k().j(split[0], split[1]);
                }
            }
        }
        return this.f66432xe2e734d5;
    }

    public r(r45.p36 p36Var) {
        this.f66444xdec927b = p36Var.f464237d;
        this.f66431x21f9b213 = p36Var.f464238e;
        this.f66440xda9bc3b3 = p36Var.f464241h;
        this.f66426x2ef4959a = p36Var.f464242i;
        this.f66437x13320507 = java.lang.String.valueOf(p36Var.f464247q);
        this.f66438x4b6e7fa1 = p36Var.f464243m;
        this.f66428xb8ff7470 = p36Var.f464244n;
        this.f66427x24cdac72 = p36Var.f464245o;
        this.f66434x13320504 = p36Var.f464251u;
        this.f66436x13320506 = p36Var.f464252v;
        this.f66429x63f8483c = 2;
        r45.cb6 cb6Var = p36Var.f464255y;
        if (cb6Var != null) {
            this.f66441xfa2a62bf = cb6Var.f452961d;
            this.f66442x433be87e = cb6Var.f452962e;
        }
        java.lang.String str = p36Var.f464239f;
        this.f66432xe2e734d5 = str;
        java.lang.String str2 = p36Var.f464240g;
        this.f66425x225a3d90 = str2;
        this.f66433x427ae366 = com.p314xaae8f345.mm.p2621x8fb0427b.ha.q(p36Var.f464256z, str, str2);
    }
}
