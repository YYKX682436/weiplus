package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b;

/* loaded from: classes8.dex */
public final class gj0 extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f208376e = {l75.n0.m145250x3fdc6f77(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0.f208314z, "FinderSnsKeyWordsJumpConfig")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f208377d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(l75.k0 db6) {
        super(db6, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0.f208314z, "FinderSnsKeyWordsJumpConfig", dm.d5.f317893o);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
        l75.e0 e0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0.f208314z;
        this.f208377d = db6;
    }

    public final void y0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.fj0 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsStorage", "insert, localId:" + info.f66248x88be67a1);
        java.lang.String str = "select *, rowid from FinderSnsKeyWordsJumpConfig where localId = '" + info.f66248x88be67a1 + "' ";
        l75.k0 k0Var = this.f208377d;
        android.database.Cursor B = k0Var.B(str, null);
        try {
            boolean z17 = B.getCount() > 0;
            vz5.b.a(B, null);
            if (!z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsStorage", "insert, result:" + super.mo51731x24249762(info, false));
                return;
            }
            android.content.ContentValues mo9763xeb27878e = info.mo9763xeb27878e();
            mo9763xeb27878e.remove("rowid");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsStorage", "update, result:" + k0Var.p("FinderSnsKeyWordsJumpConfig", mo9763xeb27878e, "localId=?", new java.lang.String[]{"" + info.f66248x88be67a1}));
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(B, th6);
                throw th7;
            }
        }
    }

    public final int z0(boolean z17) {
        int mo70514xb06685ab = this.f208377d.mo70514xb06685ab("FinderSnsKeyWordsJumpConfig", null, null);
        if (z17) {
            mo145247xf35bbb4("SnsHotWord remove data");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderSnsKeyWordsStorage", "removeAllInfo , result:" + mo70514xb06685ab);
        return mo70514xb06685ab;
    }
}
