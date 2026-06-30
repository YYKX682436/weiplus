package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteProgram */
/* loaded from: classes12.dex */
public abstract class AbstractC26965xa5559cb8 extends com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333 {

    /* renamed from: EMPTY_STRING_ARRAY */
    private static final java.lang.String[] f58318x19b28e5d = new java.lang.String[0];
    private static final java.lang.String TAG = "WCDB.SQLiteProgram";

    /* renamed from: mBindArgs */
    private final java.lang.Object[] f58319x5cf4aa47;

    /* renamed from: mBoundSession */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca f58320xe136f045;

    /* renamed from: mColumnNames */
    private final java.lang.String[] f58321x7753cae5;

    /* renamed from: mDatabase */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f58322x8fa6b908;

    /* renamed from: mNumParameters */
    private final int f58323x531522a3;

    /* renamed from: mPreparedStatement */
    protected com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement f58324x9195b0c5;

    /* renamed from: mReadOnly */
    private final boolean f58325xf145d9ef;

    /* renamed from: mSql */
    private final java.lang.String f58326x32d221;

    public AbstractC26965xa5559cb8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.Object[] objArr, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f58322x8fa6b908 = c26948xabb259c7;
        java.lang.String trim = str.trim();
        this.f58326x32d221 = trim;
        int m106264x37a81591 = com.p314xaae8f345.p3121x37984a.C26880xdfc0f3d6.m106264x37a81591(trim);
        if (m106264x37a81591 == 4 || m106264x37a81591 == 5 || m106264x37a81591 == 6) {
            this.f58325xf145d9ef = false;
            this.f58321x7753cae5 = f58318x19b28e5d;
            this.f58323x531522a3 = 0;
        } else {
            boolean z17 = m106264x37a81591 == 1;
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26971x736db9f1 c26971x736db9f1 = new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26971x736db9f1();
            c26948xabb259c7.m107686x3b27c976().m107861xed060d07(trim, c26948xabb259c7.m107685x1472aee8(z17), c26987xeef691ab, c26971x736db9f1);
            this.f58325xf145d9ef = m106264x37a81591 != 8 && c26971x736db9f1.f58352xcc483262;
            this.f58321x7753cae5 = c26971x736db9f1.f58350xcd46b992;
            this.f58323x531522a3 = c26971x736db9f1.f58351xf8071a10;
        }
        if (objArr != null && objArr.length > this.f58323x531522a3) {
            throw new java.lang.IllegalArgumentException("Too many bind arguments.  " + objArr.length + " arguments were provided but the statement needs " + this.f58323x531522a3 + " arguments.");
        }
        int i17 = this.f58323x531522a3;
        if (i17 != 0) {
            java.lang.Object[] objArr2 = new java.lang.Object[i17];
            this.f58319x5cf4aa47 = objArr2;
            if (objArr != null) {
                java.lang.System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
            }
        } else {
            this.f58319x5cf4aa47 = null;
        }
        this.f58324x9195b0c5 = null;
        this.f58320xe136f045 = null;
    }

    /* renamed from: bind */
    private void m107793x2e243d(int i17, java.lang.Object obj) {
        if (i17 >= 1 && i17 <= this.f58323x531522a3) {
            this.f58319x5cf4aa47[i17 - 1] = obj;
            return;
        }
        throw new java.lang.IllegalArgumentException("Cannot bind argument at index " + i17 + " because the index is out of range.  The statement has " + this.f58323x531522a3 + " parameters.");
    }

    /* renamed from: acquirePreparedStatement */
    public synchronized boolean m107794x54fc0f7c(boolean z17) {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca m107686x3b27c976 = this.f58322x8fa6b908.m107686x3b27c976();
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca c26969x2e1700ca = this.f58320xe136f045;
        if (m107686x3b27c976 == c26969x2e1700ca) {
            return false;
        }
        if (c26969x2e1700ca != null) {
            throw new java.lang.IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26942xf59ce42a.PreparedStatement m107849x54fc0f7c = m107686x3b27c976.m107849x54fc0f7c(this.f58326x32d221, this.f58322x8fa6b908.m107685x1472aee8(this.f58325xf145d9ef), z17);
        this.f58324x9195b0c5 = m107849x54fc0f7c;
        m107849x54fc0f7c.m107542xdb18e999(this.f58319x5cf4aa47);
        this.f58320xe136f045 = m107686x3b27c976;
        return true;
    }

    /* renamed from: bindAllArgs */
    public void m107795xa7daab21(java.lang.Object[] objArr) {
        for (int length = objArr.length; length != 0; length--) {
            m107793x2e243d(length, objArr[length - 1]);
        }
    }

    /* renamed from: bindAllArgsAsStrings */
    public void m107796x5c03dbcf(java.lang.String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                m107801x35198eae(length, strArr[length - 1]);
            }
        }
    }

    /* renamed from: bindBlob */
    public void m107797x37f7617a(int i17, byte[] bArr) {
        if (bArr != null) {
            m107793x2e243d(i17, bArr);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    /* renamed from: bindDouble */
    public void m107798x1b3baa6e(int i17, double d17) {
        m107793x2e243d(i17, java.lang.Double.valueOf(d17));
    }

    /* renamed from: bindLong */
    public void m107799x37fbf859(int i17, long j17) {
        m107793x2e243d(i17, java.lang.Long.valueOf(j17));
    }

    /* renamed from: bindNull */
    public void m107800x37fcf764(int i17) {
        m107793x2e243d(i17, null);
    }

    /* renamed from: bindString */
    public void m107801x35198eae(int i17, java.lang.String str) {
        if (str != null) {
            m107793x2e243d(i17, str);
            return;
        }
        throw new java.lang.IllegalArgumentException("the bind value at index " + i17 + " is null");
    }

    /* renamed from: checkCorruption */
    public final void m107802xa8a7f203(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26959x386f9183 c26959x386f9183) {
        boolean z17 = true;
        if (!(c26959x386f9183 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26950xbda0b8a9) && (!(c26959x386f9183 instanceof com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26960x96d245b4) || !this.f58325xf145d9ef)) {
            z17 = false;
        }
        if (z17) {
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107743x264f8700(this.f58322x8fa6b908);
            com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26953xd9a91187.m107754xab4bfa7c(c26959x386f9183);
            this.f58322x8fa6b908.m107703x28043a1a();
        }
    }

    /* renamed from: clearBindings */
    public void m107803xc089ffb() {
        java.lang.Object[] objArr = this.f58319x5cf4aa47;
        if (objArr != null) {
            java.util.Arrays.fill(objArr, (java.lang.Object) null);
        }
    }

    /* renamed from: finalize */
    public void m107804xd764dc1e() {
        synchronized (this) {
            if (this.f58320xe136f045 != null || this.f58324x9195b0c5 != null) {
                throw new com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26962x1375893("Acquired prepared statement is not released.");
            }
        }
        super.finalize();
    }

    /* renamed from: getBindArgs */
    public final java.lang.Object[] m107805xb3d14030() {
        return this.f58319x5cf4aa47;
    }

    /* renamed from: getColumnNames */
    public final java.lang.String[] m107806xa71d005c() {
        return this.f58321x7753cae5;
    }

    /* renamed from: getConnectionFlags */
    public final int m107807xe9cec13() {
        return this.f58322x8fa6b908.m107685x1472aee8(this.f58325xf145d9ef);
    }

    /* renamed from: getDatabase */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 m107808xe6834ef1() {
        return this.f58322x8fa6b908;
    }

    /* renamed from: getSession */
    public final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca m107809xb41dbe60() {
        return this.f58322x8fa6b908.m107686x3b27c976();
    }

    /* renamed from: getSql */
    public final java.lang.String m107810xb5886e98() {
        return this.f58326x32d221;
    }

    @java.lang.Deprecated
    /* renamed from: getUniqueId */
    public final int m107811x6a4d2242() {
        return -1;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26941x822ab333
    /* renamed from: onAllReferencesReleased */
    public void mo106213x355542c7() {
        m107812xcbe9706b();
        m107803xc089ffb();
    }

    /* renamed from: releasePreparedStatement */
    public synchronized void m107812xcbe9706b() {
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26969x2e1700ca c26969x2e1700ca = this.f58320xe136f045;
        if (c26969x2e1700ca == null && this.f58324x9195b0c5 == null) {
            return;
        }
        if (c26969x2e1700ca == null || this.f58324x9195b0c5 == null) {
            throw new java.lang.IllegalStateException("Internal state error.");
        }
        if (c26969x2e1700ca != this.f58322x8fa6b908.m107686x3b27c976()) {
            throw new java.lang.IllegalStateException("SQLiteProgram has bound to another thread.");
        }
        this.f58320xe136f045.m107863xcbe9706b(this.f58324x9195b0c5);
        this.f58324x9195b0c5 = null;
        this.f58320xe136f045 = null;
    }
}
