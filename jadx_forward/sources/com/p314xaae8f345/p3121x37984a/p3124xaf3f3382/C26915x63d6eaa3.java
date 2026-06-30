package com.p314xaae8f345.p3121x37984a.p3124xaf3f3382;

/* renamed from: com.tencent.wcdb.compat.SQLiteStatement */
/* loaded from: classes12.dex */
public final class C26915x63d6eaa3 extends android.database.sqlite.SQLiteClosable {

    /* renamed from: mBindArgs */
    private final java.util.ArrayList<java.lang.Object> f57996x5cf4aa47;
    private final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b mDB;

    /* renamed from: mSql */
    private final java.lang.String f57997x32d221;

    public C26915x63d6eaa3(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b c26918x6e83759b, java.lang.String str, java.lang.Object[] objArr) {
        java.util.ArrayList<java.lang.Object> arrayList = new java.util.ArrayList<>();
        this.f57996x5cf4aa47 = arrayList;
        this.mDB = c26918x6e83759b;
        this.f57997x32d221 = str;
        if (objArr != null) {
            arrayList.addAll(java.util.Arrays.asList(objArr));
        }
    }

    /* renamed from: bind */
    private void m106520x2e243d(int i17, java.lang.Object obj) {
        if (i17 < 1) {
            throw new java.lang.IllegalArgumentException("Cannot bind argument at index " + i17 + " because the index is out of range.");
        }
        if (this.f57996x5cf4aa47.size() < i17) {
            this.f57996x5cf4aa47.ensureCapacity(i17);
            do {
                this.f57996x5cf4aa47.add(null);
            } while (this.f57996x5cf4aa47.size() < i17);
        }
        this.f57996x5cf4aa47.set(i17 - 1, obj);
    }

    /* renamed from: execute */
    private void m106521xb158f775(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26912xdfc0f3d6.m106462x76fd00a8(c26919x80675a48, cancellationSignal);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        try {
            c26923xdf786992 = c26919x80675a48.m106781x1b7421d3(this.f57997x32d221);
            java.util.Iterator<java.lang.Object> it = this.f57996x5cf4aa47.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                c26923xdf786992.m107048xc8099b34(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(it.next()), i17);
                i17++;
            }
            do {
                c26923xdf786992.m107085x3606cc();
            } while (!c26923xdf786992.m107080xb9a1ffcc());
            c26923xdf786992.m107051xf2172ef1();
        } catch (java.lang.Throwable th6) {
            if (c26923xdf786992 != null) {
                c26923xdf786992.m107051xf2172ef1();
            }
            throw th6;
        }
    }

    /* renamed from: executeForValue */
    private com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m106522xc290c0bd(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3124xaf3f3382.C26912xdfc0f3d6.m106462x76fd00a8(c26919x80675a48, cancellationSignal);
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 c26923xdf786992 = null;
        try {
            com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26923xdf786992 m106781x1b7421d3 = c26919x80675a48.m106781x1b7421d3(this.f57997x32d221);
            java.util.Iterator<java.lang.Object> it = this.f57996x5cf4aa47.iterator();
            int i17 = 1;
            while (it.hasNext()) {
                m106781x1b7421d3.m107048xc8099b34(new com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151(it.next()), i17);
                i17++;
            }
            m106781x1b7421d3.m107085x3606cc();
            if (m106781x1b7421d3.m107080xb9a1ffcc()) {
                throw new android.database.sqlite.SQLiteDoneException();
            }
            com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26901x4e9a151 m107079x754a37bb = m106781x1b7421d3.m107079x754a37bb(0);
            m106781x1b7421d3.m107051xf2172ef1();
            return m107079x754a37bb;
        } catch (java.lang.Throwable th6) {
            if (0 != 0) {
                c26923xdf786992.m107051xf2172ef1();
            }
            throw th6;
        }
    }

    /* renamed from: bindAllArgs */
    public void m106523xa7daab21(java.lang.Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        if (this.f57996x5cf4aa47.size() < length) {
            this.f57996x5cf4aa47.ensureCapacity(length);
            do {
                this.f57996x5cf4aa47.add(null);
            } while (this.f57996x5cf4aa47.size() < length);
        }
        for (int i17 = 0; i17 < length; i17++) {
            this.f57996x5cf4aa47.set(i17, objArr[i17]);
        }
    }

    /* renamed from: bindBlob */
    public void m106524x37f7617a(int i17, byte[] bArr) {
        if (bArr != null) {
            m106520x2e243d(i17, bArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    /* renamed from: bindDouble */
    public void m106525x1b3baa6e(int i17, double d17) {
        m106520x2e243d(i17, java.lang.Double.valueOf(d17));
    }

    /* renamed from: bindLong */
    public void m106526x37fbf859(int i17, long j17) {
        m106520x2e243d(i17, java.lang.Long.valueOf(j17));
    }

    /* renamed from: bindNull */
    public void m106527x37fcf764(int i17) {
        m106520x2e243d(i17, null);
    }

    /* renamed from: bindString */
    public void m106528x35198eae(int i17, java.lang.String str) {
        if (str != null) {
            m106520x2e243d(i17, str);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    /* renamed from: clearBindings */
    public void m106529xc089ffb() {
        this.f57996x5cf4aa47.clear();
    }

    /* renamed from: executeInsert */
    public long m106532x22927a8e() {
        return m106533x22927a8e(null);
    }

    /* renamed from: executeUpdateDelete */
    public int m106534x91d1f3e9() {
        return m106535x91d1f3e9(null);
    }

    @Override // android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        m106529xc089ffb();
    }

    /* renamed from: simpleQueryForLong */
    public long m106536x58f653cf() {
        return m106537x58f653cf(null);
    }

    /* renamed from: simpleQueryForString */
    public java.lang.String m106538xeae4a4() {
        return m106539xeae4a4(null);
    }

    /* renamed from: toString */
    public java.lang.String m106540x9616526c() {
        return "SQLiteProgram: " + this.f57997x32d221;
    }

    /* renamed from: executeInsert */
    public long m106533x22927a8e(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(true);
        try {
            m106521xb158f775(mo106671x1c19911e, cancellationSignal);
            long m106773xc54eb6b1 = mo106671x1c19911e.m106773xc54eb6b1();
            mo106671x1c19911e.close();
            return m106773xc54eb6b1;
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: executeUpdateDelete */
    public int m106535x91d1f3e9(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(true);
        try {
            m106521xb158f775(mo106671x1c19911e, cancellationSignal);
            int m106771x69d89e8d = mo106671x1c19911e.m106771x69d89e8d();
            mo106671x1c19911e.close();
            return m106771x69d89e8d;
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: simpleQueryForLong */
    public long m106537x58f653cf(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(false);
        try {
            long m106361xfb822ef2 = m106522xc290c0bd(mo106671x1c19911e, cancellationSignal).m106361xfb822ef2();
            if (mo106671x1c19911e != null) {
                mo106671x1c19911e.close();
            }
            return m106361xfb822ef2;
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: simpleQueryForString */
    public java.lang.String m106539xeae4a4(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e(false);
        try {
            java.lang.String m106363xfb85ada3 = m106522xc290c0bd(mo106671x1c19911e, cancellationSignal).m106363xfb85ada3();
            if (mo106671x1c19911e != null) {
                mo106671x1c19911e.close();
            }
            return m106363xfb85ada3;
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }

    /* renamed from: execute */
    public int m106530xb158f775() {
        return m106531xb158f775(null);
    }

    /* renamed from: execute */
    public int m106531xb158f775(android.os.CancellationSignal cancellationSignal) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = this.mDB.mo106671x1c19911e((android.text.TextUtils.isEmpty(this.f57997x32d221) || this.f57997x32d221.toLowerCase().startsWith("select")) ? false : true);
        try {
            m106521xb158f775(mo106671x1c19911e, cancellationSignal);
            int m106771x69d89e8d = mo106671x1c19911e.m106771x69d89e8d();
            mo106671x1c19911e.close();
            return m106771x69d89e8d;
        } catch (java.lang.Throwable th6) {
            if (mo106671x1c19911e != null) {
                try {
                    mo106671x1c19911e.close();
                } catch (java.lang.Throwable th7) {
                    th6.addSuppressed(th7);
                }
            }
            throw th6;
        }
    }
}
