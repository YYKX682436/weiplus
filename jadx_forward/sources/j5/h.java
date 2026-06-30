package j5;

/* loaded from: classes13.dex */
public final class h implements j5.f {

    /* renamed from: a, reason: collision with root package name */
    public final l4.q f379276a;

    /* renamed from: b, reason: collision with root package name */
    public final l4.b f379277b;

    public h(l4.q qVar) {
        this.f379276a = qVar;
        this.f379277b = new j5.g(this, qVar);
    }

    public java.lang.Long a(java.lang.String str) {
        l4.u c17 = l4.u.c("SELECT long_value FROM Preference where `key`=?", 1);
        if (str == null) {
            c17.mo145066x37fcf764(1);
        } else {
            c17.mo145067x35198eae(1, str);
        }
        l4.q qVar = this.f379276a;
        qVar.b();
        java.lang.Long l17 = null;
        android.database.Cursor a17 = n4.b.a(qVar, c17, false, null);
        try {
            if (a17.moveToFirst() && !a17.isNull(0)) {
                l17 = java.lang.Long.valueOf(a17.getLong(0));
            }
            return l17;
        } finally {
            a17.close();
            c17.m145068x41012807();
        }
    }

    public void b(j5.e eVar) {
        l4.q qVar = this.f379276a;
        qVar.b();
        qVar.c();
        try {
            this.f379277b.e(eVar);
            qVar.h();
        } finally {
            qVar.f();
        }
    }
}
