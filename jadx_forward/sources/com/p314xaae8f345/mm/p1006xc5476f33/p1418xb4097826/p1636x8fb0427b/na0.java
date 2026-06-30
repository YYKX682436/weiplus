package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes10.dex */
public final class na0 extends l75.n0 implements zy2.a9 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f208772e = {"CREATE INDEX IF NOT EXISTS FinderMsgContactStorage_username_index ON FinderMsgContactStorage(username)"};

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String[] f208773f = {l75.n0.m145250x3fdc6f77(ya2.b2.O2, "FinderMsgContactStorage")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f208774d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public na0(l75.k0 storage) {
        super(storage, ya2.b2.O2, "FinderMsgContactStorage", f208772e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storage, "storage");
        l75.e0 e0Var = ya2.b2.O2;
        this.f208774d = storage;
    }

    public final void D0(ya2.b2 b2Var) {
        com.p314xaae8f345.mm.p2621x8fb0427b.k4 Bi = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi();
        java.lang.String z07 = ((c61.l7) i95.n0.c(c61.l7.class)).pk().z0(b2Var.D0(), 3);
        Bi.k0(b2Var.D0());
        Bi.k0(z07);
    }

    public boolean J0(ya2.b2 ct6, boolean z17) {
        boolean L0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ct6, "ct");
        if (z17) {
            ct6.f69344xa783a79b = c01.id.c();
        }
        if (y0(ct6.D0()) == null) {
            long z07 = z0(ct6);
            ct6.f72763xa3c65b86 = z07;
            L0 = z07 > 0;
        } else {
            L0 = L0(ct6);
        }
        if (L0) {
            D0(ct6);
            mo142179xf35bbb4("FinderMsgContactStorage", 4, ct6.D0());
        }
        return L0;
    }

    public boolean L0(ya2.b2 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        android.content.ContentValues mo9763xeb27878e = contact.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        int p17 = this.f208774d.p("FinderMsgContactStorage", mo9763xeb27878e, "username=?", new java.lang.String[]{"" + contact.f69347xdec927b});
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderMsgStrangerContactStorage.updateContact", r26.i0.u("updateContact", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MsgContactStorage", "updateContact " + contact.L0() + ' ' + p17);
        if (p17 > 0) {
            D0(contact);
        }
        return p17 > 0;
    }

    public ya2.b2 y0(java.lang.String username) {
        ya2.b2 b2Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        java.lang.String sql = "SELECT *, rowid FROM FinderMsgContactStorage WHERE username = " + d95.b0.O(username);
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        android.database.Cursor f17 = this.f208774d.f(sql, null, 2);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sql, "sql");
        new qb2.r("FinderMsgStrangerContactStorage.getContact", r26.i0.u(sql, ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
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
            b2Var = new ya2.b2();
            b2Var.mo9015xbf5d97fd(f17);
        } else {
            b2Var = null;
        }
        vz5.b.a(f17, null);
        return b2Var;
    }

    public long z0(ya2.b2 contact) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        android.content.ContentValues mo9763xeb27878e = contact.mo9763xeb27878e();
        long uptimeMillis = android.os.SystemClock.uptimeMillis();
        long l17 = this.f208774d.l("FinderMsgContactStorage", "", mo9763xeb27878e);
        java.lang.String name = java.lang.Thread.currentThread().getName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
        new qb2.r("FinderMsgStrangerContactStorage.insertContact", r26.i0.u("insertContact", ',', ';', false, 4, null), android.os.SystemClock.uptimeMillis() - uptimeMillis, name, 0L).a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.MsgContactStorage", "insert contact " + contact + ' ' + l17);
        return l17;
    }
}
