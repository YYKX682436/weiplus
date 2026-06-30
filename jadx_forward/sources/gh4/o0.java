package gh4;

/* loaded from: classes8.dex */
public final class o0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f353478e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.A, "TaskBarInfo")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f353479d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c.A, "TaskBarInfo", null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        this.f353479d = db6;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public boolean mo9952xce0038c9(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c, java.lang.String... keys) {
        byte[] bArr;
        r45.lr4 v07;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(keys, "keys");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("update:");
        java.lang.String str = null;
        sb6.append(c16601x7ed0e40c != null ? java.lang.Integer.valueOf(c16601x7ed0e40c.f66793x2262335f) : null);
        sb6.append(' ');
        sb6.append(c16601x7ed0e40c != null ? c16601x7ed0e40c.f66791xc8a07680 : null);
        sb6.append(' ');
        if (c16601x7ed0e40c != null && (v07 = c16601x7ed0e40c.v0()) != null) {
            str = v07.m75945x2fec8307(1);
        }
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarStorage", sb6.toString());
        if (((c16601x7ed0e40c == null || (bArr = c16601x7ed0e40c.f66790x225a93cf) == null) ? 0 : bArr.length) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskBarStorage", "empty data!");
        }
        if (c16601x7ed0e40c == null) {
            return false;
        }
        boolean mo51732xbf274172 = mo51732xbf274172(c16601x7ed0e40c, false, new java.lang.String[0]);
        mo142179xf35bbb4("single", 3, c16601x7ed0e40c);
        return mo51732xbf274172;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c y0(java.lang.String id6) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c c16601x7ed0e40c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        android.database.Cursor B = this.f353479d.B("SELECT * FROM TaskBarInfo WHERE id = ?;", new java.lang.String[]{id6});
        if (B.moveToNext()) {
            c16601x7ed0e40c = new com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c();
            c16601x7ed0e40c.mo9015xbf5d97fd(B);
        } else {
            c16601x7ed0e40c = null;
        }
        B.close();
        return c16601x7ed0e40c;
    }

    @Override // l75.n0, l75.g0
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public boolean mo880xb970c2b9(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.p1897x633fb29.C16601x7ed0e40c item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TaskBarStorage", "insert:" + item.f66793x2262335f + ' ' + item.f66791xc8a07680 + ' ' + item.v0().m75945x2fec8307(1));
        byte[] bArr = item.f66790x225a93cf;
        if ((bArr != null ? bArr.length : 0) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.TaskBarStorage", "empty data!");
        }
        boolean mo51731x24249762 = mo51731x24249762(item, false);
        mo142179xf35bbb4("single", 2, item);
        return mo51731x24249762;
    }
}
