package com.p314xaae8f345.p3121x37984a.p3124xaf3f3382;

/* renamed from: com.tencent.wcdb.compat.DatabaseUtils */
/* loaded from: classes12.dex */
public final class C26912xdfc0f3d6 {
    private C26912xdfc0f3d6() {
    }

    /* renamed from: bindCancellationSignal */
    public static void m106462x76fd00a8(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, android.os.CancellationSignal cancellationSignal) {
        if (cancellationSignal == null) {
            return;
        }
        final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal cancellationSignal2 = new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal();
        cancellationSignal.setOnCancelListener(new android.os.CancellationSignal.OnCancelListener() { // from class: com.tencent.wcdb.compat.DatabaseUtils.1
            @Override // android.os.CancellationSignal.OnCancelListener
            public void onCancel() {
                com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.CancellationSignal.this.m106785xae7a2e7a();
            }
        });
        if (cancellationSignal.isCanceled()) {
            cancellationSignal2.m106785xae7a2e7a();
        }
        c26919x80675a48.m106766xe56258b0(cancellationSignal2);
    }

    /* renamed from: longForQuery */
    public static long m106463x8bcd201b(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7, java.lang.String str, java.lang.Object[] objArr) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 m106487xac8b87c = c26914xabb259c7.m106487xac8b87c(str);
        try {
            m106487xac8b87c.m106523xa7daab21(objArr);
            long m106536x58f653cf = m106487xac8b87c.m106536x58f653cf();
            m106487xac8b87c.close();
            return m106536x58f653cf;
        } catch (java.lang.Throwable th6) {
            if (m106487xac8b87c != null) {
                try {
                    m106487xac8b87c.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: stringForQuery */
    public static java.lang.String m106464xc69b54b0(com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26914xabb259c7 c26914xabb259c7, java.lang.String str, java.lang.Object[] objArr) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26915x63d6eaa3 m106487xac8b87c = c26914xabb259c7.m106487xac8b87c(str);
        try {
            m106487xac8b87c.m106523xa7daab21(objArr);
            java.lang.String m106538xeae4a4 = m106487xac8b87c.m106538xeae4a4();
            m106487xac8b87c.close();
            return m106538xeae4a4;
        } catch (java.lang.Throwable th6) {
            if (m106487xac8b87c != null) {
                try {
                    m106487xac8b87c.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
