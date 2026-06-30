package com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.ui;

/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f239197a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.mn0 f239198b;

    /* renamed from: c, reason: collision with root package name */
    public r45.mn0 f239199c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f239200d;

    public d() {
        this.f239197a = null;
        this.f239198b = null;
        this.f239199c = null;
        this.f239200d = false;
    }

    public final int a() {
        java.util.Iterator it = b().f462223f.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((r45.ln0) it.next()).f461188m == 0) {
                i17++;
            }
        }
        return i17;
    }

    public r45.mn0 b() {
        r45.mn0 mn0Var = this.f239199c;
        return mn0Var != null ? mn0Var : this.f239198b;
    }

    public long c() {
        long j17 = 0;
        if (this.f239198b == null) {
            return 0L;
        }
        java.util.Iterator it = b().f462223f.iterator();
        while (it.hasNext()) {
            r45.ln0 ln0Var = (r45.ln0) it.next();
            if (ln0Var.f461188m == 0 && ln0Var.f461190o) {
                j17 += ln0Var.f461185g;
            }
        }
        return j17;
    }

    public boolean d() {
        return b() != null && b().f462223f.size() > 0;
    }

    public d(android.content.Context context, r45.mn0 mn0Var) {
        this.f239197a = null;
        this.f239198b = null;
        this.f239199c = null;
        this.f239200d = false;
        this.f239197a = context;
        this.f239198b = mn0Var;
        if (mn0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtraBuyInfoHelper", "no extra buy info");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtraBuyInfoHelper", "init. title = %s, detail count = %d", mn0Var.f462222e, java.lang.Integer.valueOf(mn0Var.f462223f.size()));
        java.util.Iterator it = mn0Var.f462223f.iterator();
        while (it.hasNext()) {
            r45.ln0 ln0Var = (r45.ln0) it.next();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtraBuyInfoHelper", "extra buy item: %d, %s", java.lang.Long.valueOf(ln0Var.f461182d), ln0Var.f461183e);
        }
    }
}
