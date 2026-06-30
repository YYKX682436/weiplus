package c34;

/* loaded from: classes11.dex */
public class r extends dm.ea {

    /* renamed from: y0, reason: collision with root package name */
    public static final l75.e0 f38236y0 = dm.ea.initAutoDBInfo(c34.r.class);

    /* renamed from: p0, reason: collision with root package name */
    public int f38237p0 = -1;

    /* renamed from: x0, reason: collision with root package name */
    public int f38238x0;

    public r() {
        this.field_insertBatch = 2;
    }

    @Override // dm.ea, l75.f0
    public android.content.ContentValues convertTo() {
        int i17;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f38237p0 & 2) != 0) {
            contentValues.put(dm.i4.COL_USERNAME, this.field_username);
        }
        if ((this.f38237p0 & 4) != 0) {
            contentValues.put("nickname", this.field_nickname);
        }
        if ((this.f38237p0 & 8) != 0) {
            contentValues.put("province", u0());
        }
        if ((this.f38237p0 & 16) != 0) {
            contentValues.put("city", t0());
        }
        if ((this.f38237p0 & 32) != 0) {
            contentValues.put("signature", this.field_signature);
        }
        if ((this.f38237p0 & 64) != 0) {
            contentValues.put("distance", this.field_distance);
        }
        if ((this.f38237p0 & 128) != 0) {
            contentValues.put("sex", java.lang.Integer.valueOf(this.field_sex));
        }
        if ((this.f38237p0 & 256) != 0) {
            contentValues.put("imgstatus", java.lang.Integer.valueOf(this.field_imgstatus));
        }
        if ((this.f38237p0 & 512) != 0) {
            contentValues.put("hasHDImg", java.lang.Integer.valueOf(this.field_hasHDImg));
        }
        if ((this.f38237p0 & 1024) != 0) {
            contentValues.put("insertBatch", java.lang.Integer.valueOf(this.field_insertBatch));
        }
        if ((this.f38237p0 & 2048) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.field_reserved1));
        }
        if ((this.f38237p0 & 4096) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(this.field_reserved2));
        }
        if ((this.f38237p0 & 8192) != 0) {
            contentValues.put("reserved3", this.field_reserved3);
        }
        if ((this.f38237p0 & 16384) != 0) {
            try {
                i17 = java.lang.Integer.valueOf(this.field_reserved4).intValue();
            } catch (java.lang.Throwable unused) {
                i17 = 0;
            }
            contentValues.put("reserved4", java.lang.Integer.valueOf(i17));
        }
        if ((this.f38237p0 & 32768) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(this.field_type));
        }
        if ((this.f38237p0 & 65536) != 0) {
            contentValues.put("lvbuffer", this.field_lvbuffer);
        }
        if ((this.f38237p0 & 131072) != 0) {
            contentValues.put("regionCode", this.field_regionCode);
        }
        if ((this.f38237p0 & 262144) != 0) {
            contentValues.put("snsFlag", java.lang.Integer.valueOf(this.field_snsFlag));
        }
        if ((this.f38237p0 & 524288) != 0) {
            contentValues.put("sns_bgurl", this.field_sns_bgurl);
        }
        return contentValues;
    }

    @Override // dm.ea, l75.f0
    public l75.e0 getDBInfo() {
        return f38236y0;
    }

    public java.lang.String t0() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_regionCode)) {
            java.lang.String[] split = this.field_regionCode.split("_");
            if (split.length > 0) {
                if (split.length > 2) {
                    this.field_city = com.tencent.mm.storage.ha.k().h(split[0], split[1], split[2]);
                } else if (split.length == 2) {
                    this.field_city = com.tencent.mm.storage.ha.k().j(split[0], split[1]);
                } else {
                    this.field_city = "";
                }
            }
        }
        return this.field_city;
    }

    public java.lang.String u0() {
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_regionCode)) {
            java.lang.String[] split = this.field_regionCode.split("_");
            if (split.length > 0) {
                if (split.length <= 2 || !split[0].equalsIgnoreCase("cn")) {
                    this.field_province = com.tencent.mm.storage.ha.k().i(split[0]);
                } else {
                    this.field_province = com.tencent.mm.storage.ha.k().j(split[0], split[1]);
                }
            }
        }
        return this.field_province;
    }

    public r(r45.p36 p36Var) {
        this.field_username = p36Var.f382704d;
        this.field_nickname = p36Var.f382705e;
        this.field_signature = p36Var.f382708h;
        this.field_distance = p36Var.f382709i;
        this.field_reserved4 = java.lang.String.valueOf(p36Var.f382714q);
        this.field_sex = p36Var.f382710m;
        this.field_imgstatus = p36Var.f382711n;
        this.field_hasHDImg = p36Var.f382712o;
        this.field_reserved1 = p36Var.f382718u;
        this.field_reserved3 = p36Var.f382719v;
        this.field_insertBatch = 2;
        r45.cb6 cb6Var = p36Var.f382722y;
        if (cb6Var != null) {
            this.field_snsFlag = cb6Var.f371428d;
            this.field_sns_bgurl = cb6Var.f371429e;
        }
        java.lang.String str = p36Var.f382706f;
        this.field_province = str;
        java.lang.String str2 = p36Var.f382707g;
        this.field_city = str2;
        this.field_regionCode = com.tencent.mm.storage.ha.q(p36Var.f382723z, str, str2);
    }
}
