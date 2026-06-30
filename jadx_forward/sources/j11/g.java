package j11;

/* loaded from: classes11.dex */
public class g extends l75.s0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f378643e = {"CREATE TABLE IF NOT EXISTS getcontactinfov2 ( username text  PRIMARY KEY , inserttime long  , type int  , lastgettime int  , reserved1 int  , reserved2 int  , reserved3 text  , reserved4 text  ) "};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f378644d;

    public g(l75.k0 k0Var) {
        this.f378644d = k0Var;
    }

    public boolean m0(java.lang.String str) {
        if (this.f378644d.mo70514xb06685ab("getcontactinfov2", "username= ?", new java.lang.String[]{"" + str}) <= 0) {
            return false;
        }
        mo145247xf35bbb4(str);
        return true;
    }

    public boolean n0(j11.f fVar) {
        if (fVar == null) {
            return false;
        }
        fVar.f378642i = -1;
        android.content.ContentValues contentValues = new android.content.ContentValues();
        if ((fVar.f378642i & 1) != 0) {
            java.lang.String str = fVar.f378634a;
            if (str == null) {
                str = "";
            }
            contentValues.put(dm.i4.f66875xa013b0d5, str);
        }
        if ((fVar.f378642i & 2) != 0) {
            contentValues.put("inserttime", java.lang.Long.valueOf(fVar.f378635b));
        }
        if ((fVar.f378642i & 4) != 0) {
            contentValues.put("type", java.lang.Integer.valueOf(fVar.f378636c));
        }
        if ((fVar.f378642i & 8) != 0) {
            contentValues.put("lastgettime", java.lang.Integer.valueOf(fVar.f378637d));
        }
        if ((fVar.f378642i & 16) != 0) {
            contentValues.put("reserved1", java.lang.Integer.valueOf(fVar.f378638e));
        }
        if ((fVar.f378642i & 32) != 0) {
            contentValues.put("reserved2", java.lang.Integer.valueOf(fVar.f378639f));
        }
        if ((fVar.f378642i & 64) != 0) {
            java.lang.String str2 = fVar.f378640g;
            if (str2 == null) {
                str2 = "";
            }
            contentValues.put("reserved3", str2);
        }
        if ((fVar.f378642i & 128) != 0) {
            java.lang.String str3 = fVar.f378641h;
            if (str3 == null) {
                str3 = "";
            }
            contentValues.put("reserved4", str3);
        }
        if (((int) this.f378644d.m("getcontactinfov2", dm.i4.f66875xa013b0d5, contentValues)) == -1) {
            return false;
        }
        java.lang.String str4 = fVar.f378634a;
        mo145247xf35bbb4(str4 != null ? str4 : "");
        return true;
    }
}
