package c61;

/* loaded from: classes10.dex */
public final class w6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ c61.l7 f39384d;

    public w6(c61.l7 l7Var) {
        this.f39384d = l7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        c61.l7 l7Var = this.f39384d;
        if (currentTimeMillis - l7Var.f39135x1 <= 86400000) {
            return;
        }
        l7Var.f39135x1 = java.lang.System.currentTimeMillis();
        android.database.Cursor B = l7Var.Jj().f127296d.B("select count(*) from FinderContact", null);
        try {
            B.moveToFirst();
            long j17 = B.getLong(0);
            java.lang.String name = java.lang.Thread.currentThread().getName();
            kotlin.jvm.internal.o.f(name, "getName(...)");
            new qb2.r("FinderContactStorage.reportSize", r26.i0.u("select count(*) from FinderContact", ',', ';', false, 4, null), 0L, name, j17).a();
            vz5.b.a(B, null);
            B = l7Var.hk().f127184d.B("select count(*) from FinderMsgAliasContactStorage", null);
            try {
                B.moveToFirst();
                long j18 = B.getLong(0);
                java.lang.String name2 = java.lang.Thread.currentThread().getName();
                kotlin.jvm.internal.o.f(name2, "getName(...)");
                new qb2.r("FinderMsgAliasContactStorage.reportSize", r26.i0.u("select count(*) from FinderMsgAliasContactStorage", ',', ';', false, 4, null), 0L, name2, j18).a();
                vz5.b.a(B, null);
                B = l7Var.pk().f126658d.B("select count(*) from FinderSessionInfo", null);
                try {
                    B.moveToFirst();
                    long j19 = B.getLong(0);
                    java.lang.String name3 = java.lang.Thread.currentThread().getName();
                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                    new qb2.r("FinderSessionInfoStorage.reportSize", r26.i0.u("select count(*) from FinderSessionInfo", ',', ';', false, 4, null), 0L, name3, j19).a();
                    vz5.b.a(B, null);
                    B = l7Var.ik().f127241d.B("select count(*) from FinderMsgContactStorage", null);
                    try {
                        B.moveToFirst();
                        long j27 = B.getLong(0);
                        java.lang.String name4 = java.lang.Thread.currentThread().getName();
                        kotlin.jvm.internal.o.f(name4, "getName(...)");
                        new qb2.r("FinderMsgStrangerContactStorage.reportSize", r26.i0.u("select count(*) from FinderMsgContactStorage", ',', ';', false, 4, null), 0L, name4, j27).a();
                        vz5.b.a(B, null);
                        B = l7Var.Kj().f128069d.B("select count(*) from FinderConversation", null);
                        try {
                            B.moveToFirst();
                            long j28 = B.getLong(0);
                            java.lang.String name5 = java.lang.Thread.currentThread().getName();
                            kotlin.jvm.internal.o.f(name5, "getName(...)");
                            new qb2.r("FinderConversationStorage.reportSize", r26.i0.u("select count(*) from FinderConversation", ',', ';', false, 4, null), 0L, name5, j28).a();
                            vz5.b.a(B, null);
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                    try {
                        throw th;
                    } finally {
                    }
                }
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }
}
