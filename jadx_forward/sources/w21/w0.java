package w21;

/* loaded from: classes12.dex */
public class w0 {

    /* renamed from: a, reason: collision with root package name */
    public int f524017a = -1;

    /* renamed from: y, reason: collision with root package name */
    public int f524041y = 0;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f524018b = "";

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f524019c = "";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f524020d = "";

    /* renamed from: e, reason: collision with root package name */
    public long f524021e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f524022f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f524023g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f524024h = 0;

    /* renamed from: i, reason: collision with root package name */
    public int f524025i = 0;

    /* renamed from: j, reason: collision with root package name */
    public long f524026j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f524027k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f524028l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f524029m = 0;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f524030n = "";

    /* renamed from: o, reason: collision with root package name */
    public int f524031o = 0;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f524032p = "";

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f524033q = "";

    /* renamed from: r, reason: collision with root package name */
    public int f524034r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f524035s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f524036t = 0;

    /* renamed from: u, reason: collision with root package name */
    public int f524037u = 0;

    /* renamed from: v, reason: collision with root package name */
    public int f524038v = 0;

    /* renamed from: w, reason: collision with root package name */
    public r45.f17 f524039w = null;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f524040x = "";

    public void a(android.database.Cursor cursor) {
        this.f524018b = cursor.getString(0);
        this.f524019c = cursor.getString(1);
        this.f524021e = cursor.getLong(2);
        this.f524022f = cursor.getInt(3);
        this.f524023g = cursor.getInt(4);
        this.f524024h = cursor.getInt(5);
        this.f524025i = cursor.getInt(6);
        this.f524026j = cursor.getLong(7);
        this.f524027k = cursor.getLong(8);
        this.f524020d = cursor.getString(9);
        this.f524028l = cursor.getInt(10);
        this.f524029m = cursor.getLong(11);
        this.f524030n = cursor.getString(12);
        this.f524031o = cursor.getInt(13);
        this.f524032p = cursor.getString(14);
        this.f524033q = cursor.getString(15);
        this.f524034r = cursor.getInt(16);
        this.f524035s = cursor.getInt(17);
        this.f524036t = cursor.getLong(18);
        this.f524037u = cursor.getInt(19);
        this.f524038v = cursor.getInt(20);
        try {
            byte[] blob = cursor.getBlob(21);
            if (blob != null) {
                r45.f17 f17Var = new r45.f17();
                f17Var.mo11468x92b714fd(blob);
                this.f524039w = f17Var;
            }
        } catch (java.lang.Exception unused) {
        }
        this.f524040x = cursor.getString(22);
    }

    public android.content.ContentValues b() {
        java.lang.String str;
        r45.f17 f17Var;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((this.f524017a & 1) != 0) {
            contentValues.put("FileName", this.f524018b);
        }
        if ((this.f524017a & 2) != 0) {
            contentValues.put("User", this.f524019c);
        }
        if ((this.f524017a & 4) != 0) {
            contentValues.put("MsgId", java.lang.Long.valueOf(this.f524021e));
        }
        if ((this.f524017a & 8) != 0) {
            contentValues.put("NetOffset", java.lang.Integer.valueOf(this.f524022f));
        }
        if ((this.f524017a & 16) != 0) {
            contentValues.put("FileNowSize", java.lang.Integer.valueOf(this.f524023g));
        }
        if ((this.f524017a & 32) != 0) {
            contentValues.put("TotalLen", java.lang.Integer.valueOf(this.f524024h));
        }
        if ((this.f524017a & 64) != 0) {
            contentValues.put("Status", java.lang.Integer.valueOf(this.f524025i));
        }
        if ((this.f524017a & 128) != 0) {
            contentValues.put("CreateTime", java.lang.Long.valueOf(this.f524026j));
        }
        if ((this.f524017a & 256) != 0) {
            contentValues.put("LastModifyTime", java.lang.Long.valueOf(this.f524027k));
        }
        if ((this.f524017a & 512) != 0) {
            contentValues.put("ClientId", this.f524020d);
        }
        if ((this.f524017a & 1024) != 0) {
            contentValues.put("VoiceLength", java.lang.Integer.valueOf(this.f524028l));
        }
        if ((this.f524017a & 2048) != 0) {
            contentValues.put("MsgLocalId", java.lang.Long.valueOf(this.f524029m));
        }
        if ((this.f524017a & 4096) != 0) {
            contentValues.put("Human", this.f524030n);
        }
        if ((this.f524017a & 8192) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(this.f524031o));
        }
        if ((this.f524017a & 16384) != 0) {
            contentValues.put("reserved2", this.f524032p);
        }
        if ((this.f524017a & 32768) != 0) {
            contentValues.put("MsgSource", this.f524033q);
        }
        if ((this.f524017a & 65536) != 0) {
            contentValues.put("MsgFlag", java.lang.Integer.valueOf(this.f524034r));
        }
        if ((this.f524017a & 131072) != 0) {
            contentValues.put("MsgSeq", java.lang.Integer.valueOf(this.f524035s));
        }
        if ((this.f524017a & 262144) != 0) {
            contentValues.put("MasterBufId", java.lang.Long.valueOf(this.f524036t));
        }
        if ((this.f524017a & 524288) != 0) {
            contentValues.put("checksum", java.lang.Integer.valueOf(this.f524037u));
        }
        if ((this.f524017a & 1048576) != 0) {
            contentValues.put("VoiceFlag", java.lang.Integer.valueOf(this.f524038v));
        }
        if ((this.f524017a & 2097152) != 0 && (f17Var = this.f524039w) != null) {
            try {
                contentValues.put("VoiceInfoExt", f17Var.mo14344x5f01b1f6());
            } catch (java.lang.Exception unused) {
            }
        }
        if ((this.f524017a & 4194304) != 0 && (str = this.f524040x) != null) {
            contentValues.put("MsgTalker", str);
        }
        return contentValues;
    }

    public boolean c() {
        return (this.f524038v & 1) != 0;
    }

    public boolean d() {
        int i17 = this.f524025i;
        return (i17 > 1 && i17 <= 3) || i17 == 8;
    }
}
