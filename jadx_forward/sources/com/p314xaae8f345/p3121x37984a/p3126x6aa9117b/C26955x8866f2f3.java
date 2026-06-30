package com.p314xaae8f345.p3121x37984a.p3126x6aa9117b;

/* renamed from: com.tencent.wcdb.database.SQLiteDirectCursorDriver */
/* loaded from: classes12.dex */
public final class C26955x8866f2f3 implements com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a {

    /* renamed from: DEFAULT_FACTORY */
    private static com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory f58288xfd7614cc = com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26945x5aacfea2.f58198xe9b6bcea;

    /* renamed from: mCancellationSignal */
    private final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f58289x808230d8;

    /* renamed from: mDatabase */
    private final com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 f58290x8fa6b908;

    /* renamed from: mEditTable */
    private final java.lang.String f58291xada5df7;

    /* renamed from: mQuery */
    private com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 f58292xbeac645b;

    /* renamed from: mSql */
    private final java.lang.String f58293x32d221;

    public C26955x8866f2f3(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7 c26948xabb259c7, java.lang.String str, java.lang.String str2, com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab c26987xeef691ab) {
        this.f58290x8fa6b908 = c26948xabb259c7;
        this.f58291xada5df7 = str2;
        this.f58293x32d221 = str;
        this.f58289x808230d8 = c26987xeef691ab;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a
    /* renamed from: cursorClosed */
    public void mo107609x7b4e8862() {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a
    /* renamed from: cursorDeactivated */
    public void mo107610x9585813a() {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a
    /* renamed from: cursorRequeried */
    public void mo107611x9e09670e(com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 interfaceC26872x78faff76) {
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a
    /* renamed from: query */
    public com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107612x66f18c8(com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.C26948xabb259c7.CursorFactory cursorFactory, java.lang.Object[] objArr) {
        if (cursorFactory == null) {
            cursorFactory = f58288xfd7614cc;
        }
        com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.AbstractC26965xa5559cb8 abstractC26965xa5559cb8 = null;
        try {
            abstractC26965xa5559cb8 = cursorFactory.mo107386x51538308(this.f58290x8fa6b908, this.f58293x32d221, objArr, this.f58289x808230d8);
            com.p314xaae8f345.p3121x37984a.InterfaceC26872x78faff76 mo107385xc13ef116 = cursorFactory.mo107385xc13ef116(this.f58290x8fa6b908, this, this.f58291xada5df7, abstractC26965xa5559cb8);
            this.f58292xbeac645b = abstractC26965xa5559cb8;
            return mo107385xc13ef116;
        } catch (java.lang.RuntimeException e17) {
            if (abstractC26965xa5559cb8 != null) {
                abstractC26965xa5559cb8.close();
            }
            throw e17;
        }
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3126x6aa9117b.InterfaceC26946xca9816a
    /* renamed from: setBindArguments */
    public void mo107613x2b4f0c57(java.lang.String[] strArr) {
        this.f58292xbeac645b.m107796x5c03dbcf(strArr);
    }

    /* renamed from: toString */
    public java.lang.String m107759x9616526c() {
        return "SQLiteDirectCursorDriver: " + this.f58293x32d221;
    }
}
