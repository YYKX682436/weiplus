package com.p314xaae8f345.p3121x37984a.p3123x4e97089f;

/* renamed from: com.tencent.wcdb.chaincall.ChainCall */
/* loaded from: classes12.dex */
public class C26906xc5fa9c9f<T extends com.p314xaae8f345.p3121x37984a.p3131x37b015.C27024xfb29494f> {

    /* renamed from: autoInvalidateHandle */
    boolean f57951x96555712;

    /* renamed from: changes */
    int f57952x2c0b62c3 = 0;

    /* renamed from: handle */
    com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 f57953xb7026e28;

    /* renamed from: needChanges */
    boolean f57954xfd77bd4d;

    /* renamed from: statement */
    T f57955x83b7296f;

    public C26906xc5fa9c9f(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 c26919x80675a48, boolean z17, boolean z18) {
        this.f57953xb7026e28 = c26919x80675a48;
        this.f57954xfd77bd4d = z17;
        this.f57951x96555712 = z18;
    }

    /* renamed from: getChanges */
    public int m106401x69d89e8d() {
        return this.f57952x2c0b62c3;
    }

    /* renamed from: getStatement */
    public T m106402x83249ab9() {
        return this.f57955x83b7296f;
    }

    /* renamed from: invalidateHandle */
    public void m106403xf99e7343() {
        if (this.f57951x96555712) {
            this.f57953xb7026e28.m106777x92d0313b();
        }
    }

    /* renamed from: updateChanges */
    public void m106404xd2e0fdba() {
        if (this.f57954xfd77bd4d) {
            this.f57952x2c0b62c3 = this.f57953xb7026e28.m106771x69d89e8d();
        }
    }
}
