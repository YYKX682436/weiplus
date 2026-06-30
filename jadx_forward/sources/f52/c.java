package f52;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static volatile f52.c f341162b;

    /* renamed from: a, reason: collision with root package name */
    public final f52.d f341163a;

    public c() {
        f52.d dVar = new f52.d();
        this.f341163a = dVar;
        if (b52.b.m()) {
            dVar.f341164a.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.ActivityStackDao", "ActivityStackDao reset");
            c52.c.d("hell_astackd_mmkv_key", new byte[0]);
        }
    }

    public static f52.c b() {
        if (f341162b == null) {
            synchronized (f52.c.class) {
                if (f341162b == null) {
                    f341162b = new f52.c();
                }
            }
        }
        return f341162b;
    }

    public r45.b2 a(java.lang.String str) {
        this.f341163a.f341164a.getClass();
        r45.c2 a17 = f52.b.a();
        nm5.b g17 = f52.f.g(a17, str, 0);
        int intValue = ((java.lang.Integer) g17.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) g17.a(1)).intValue();
        if (intValue < 0 || intValue2 < 0) {
            return null;
        }
        return (r45.b2) ((r45.vk6) a17.f452769d.get(intValue)).f469860e.get(intValue2);
    }

    public nm5.b c() {
        r45.b2 b2Var;
        r45.a2 a2Var = f52.b.a().f452770e;
        if (a2Var != null && (b2Var = a2Var.f451184f) != null) {
            r45.bn6 bn6Var = b2Var.f451967d;
            return nm5.j.c(bn6Var.f452433d, java.lang.Integer.valueOf(bn6Var.f452434e));
        }
        return nm5.j.c(null, null);
    }

    public nm5.b d() {
        r45.b2 b2Var;
        r45.a2 a2Var = f52.b.a().f452770e;
        if (a2Var != null && (b2Var = a2Var.f451183e) != null) {
            r45.bn6 bn6Var = b2Var.f451967d;
            return nm5.j.c(bn6Var.f452433d, java.lang.Integer.valueOf(bn6Var.f452434e));
        }
        return nm5.j.c(null, null);
    }

    public r45.b2 e() {
        f52.f fVar = this.f341163a.f341164a;
        fVar.getClass();
        r45.c2 a17 = f52.b.a();
        return (r45.b2) nm5.j.c(a17, fVar.b(a17)).a(1);
    }

    public void f(java.lang.String str, java.lang.String str2, int i17) {
        r45.b2 b2Var;
        if (str == null || str2 == null || g52.a.a() == 8) {
            return;
        }
        this.f341163a.f341164a.getClass();
        r45.c2 a17 = f52.b.a();
        r45.a2 a2Var = a17.f452770e;
        if (a2Var != null && (b2Var = a2Var.f451184f) != null && str.equals(b2Var.f451967d.f452433d)) {
            r45.b2 b2Var2 = a17.f452770e.f451184f;
            b2Var2.f451970g = str2;
            b2Var2.f451974n = i17;
        }
        nm5.b g17 = f52.f.g(a17, str, 0);
        int intValue = ((java.lang.Integer) g17.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) g17.a(1)).intValue();
        if (intValue < 0 || intValue2 < 0) {
            return;
        }
        ((r45.b2) ((r45.vk6) a17.f452769d.get(intValue)).f469860e.get(intValue2)).f451971h = str2;
        f52.b.b(a17);
    }

    public void g(java.lang.String str, java.lang.String str2, int i17) {
        r45.b2 b2Var;
        if (str == null || str2 == null) {
            return;
        }
        this.f341163a.f341164a.getClass();
        r45.c2 a17 = f52.b.a();
        r45.a2 a2Var = a17.f452770e;
        if (a2Var != null && (b2Var = a2Var.f451183e) != null && str.equals(b2Var.f451967d.f452433d)) {
            r45.b2 b2Var2 = a17.f452770e.f451183e;
            b2Var2.f451970g = str2;
            b2Var2.f451974n = i17;
        }
        nm5.b g17 = f52.f.g(a17, str, 0);
        int intValue = ((java.lang.Integer) g17.a(0)).intValue();
        int intValue2 = ((java.lang.Integer) g17.a(1)).intValue();
        if (intValue < 0 || intValue2 < 0) {
            return;
        }
        r45.b2 b2Var3 = (r45.b2) ((r45.vk6) a17.f452769d.get(intValue)).f469860e.get(intValue2);
        b2Var3.f451970g = str2;
        b2Var3.f451974n = i17;
        f52.b.b(a17);
    }
}
