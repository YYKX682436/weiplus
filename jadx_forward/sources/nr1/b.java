package nr1;

/* loaded from: classes11.dex */
public final class b extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final nr1.a f420668e = new nr1.a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f420669f;

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f420670d;

    static {
        l75.e0 e0Var = hr1.a.Y;
        f420669f = new java.lang.String[]{l75.n0.m145250x3fdc6f77(hr1.a.Y, "BizPhotoFansContact")};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(l75.k0 db6) {
        super(db6, hr1.a.Y, "BizPhotoFansContact", dm.d1.A);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = hr1.a.Y;
        this.f420670d = db6;
    }

    public final hr1.a y0(java.lang.String openid) {
        hr1.a aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(openid, "openid");
        android.database.Cursor f17 = this.f420670d.f("SELECT *, rowid FROM BizPhotoFansContact WHERE openid = " + d95.b0.O(openid), null, 2);
        boolean z17 = false;
        if (f17 != null) {
            try {
                if (f17.moveToFirst()) {
                    z17 = true;
                }
            } finally {
            }
        }
        if (z17) {
            aVar = new hr1.a();
            aVar.mo9015xbf5d97fd(f17);
        } else {
            aVar = null;
        }
        vz5.b.a(f17, null);
        return aVar;
    }

    public final boolean z0(hr1.a contact) {
        int p17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        java.lang.String str = contact.f66213x996f7ca;
        if (str == null || str.length() == 0) {
            return false;
        }
        contact.f66206xac3be4e = c01.id.e();
        java.lang.String field_openid = contact.f66213x996f7ca;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_openid, "field_openid");
        hr1.a y07 = y0(field_openid);
        l75.k0 k0Var = this.f420670d;
        if (y07 == null) {
            p17 = (int) k0Var.l("BizPhotoFansContact", com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5857xdf813330, contact.mo9763xeb27878e());
        } else {
            android.content.ContentValues mo9763xeb27878e = contact.mo9763xeb27878e();
            mo9763xeb27878e.remove("rowid");
            java.lang.String field_openid2 = contact.f66213x996f7ca;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_openid2, "field_openid");
            p17 = k0Var.p("BizPhotoFansContact", mo9763xeb27878e, "openid=?", new java.lang.String[]{field_openid2});
        }
        if (p17 > 0) {
            mo142179xf35bbb4("BizPhotoFansContact", 3, contact);
        }
        return p17 > 0;
    }
}
