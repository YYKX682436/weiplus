package com.p314xaae8f345.p3121x37984a.p3125x2eaf9f;

/* renamed from: com.tencent.wcdb.core.TableORMOperation */
/* loaded from: classes12.dex */
public class C26925x1efa7c6b<T> extends com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26926x7a6eed59 {

    /* renamed from: binding */
    com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> f58048xf98cae85 = null;

    /* renamed from: deleteObjects */
    public void m107087x90df30e9() {
        m107162x2d9f5d92().m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107093xde3eb429() {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106424xeffdfc33();
    }

    /* renamed from: getBinding */
    public com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> m107125x3759ea4f() {
        return this.f58048xf98cae85;
    }

    /* renamed from: getFirstObject */
    public T m107126x946de4d9() {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106426xba979e0f();
    }

    /* renamed from: insertObject */
    public void m107150x251da358(T t17) {
        m107163x36a99aa0().m106421x6ac9171(t17).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: insertObjects */
    public void m107152x7e96c81b(java.util.Collection<T> collection) {
        m107163x36a99aa0().m106422xcee59d22(collection).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObject */
    public void m107154x9db6e44d(T t17) {
        m107163x36a99aa0().m106419x1b99c195().m106421x6ac9171(t17).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObjects */
    public void m107156x1925a5c6(java.util.Collection<T> collection) {
        m107163x36a99aa0().m106419x1b99c195().m106422xcee59d22(collection).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObject */
    public void m107158x7beb81f7(T t17) {
        m107163x36a99aa0().m106420x30676751().m106421x6ac9171(t17).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObjects */
    public void m107160x184bd5c(java.util.Collection<T> collection) {
        m107163x36a99aa0().m106420x30676751().m106422xcee59d22(collection).m106418x42fa5578(this.f58048xf98cae85.mo107912xefdf857d()).m106415xb158f775();
    }

    /* renamed from: prepareDelete */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26907x79cb71cb m107162x2d9f5d92() {
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26907x79cb71cb c26907x79cb71cb = new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26907x79cb71cb(this.f58049x6aa9117b.mo106671x1c19911e(true), false, true);
        c26907x79cb71cb.m106406x42b6e44(this.f58050x89769379);
        return c26907x79cb71cb;
    }

    /* renamed from: prepareInsert */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m107163x36a99aa0() {
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> c26908x82d5aed9 = new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<>(this.f58049x6aa9117b.mo106671x1c19911e(true), false, true);
        c26908x82d5aed9.m106417x2d5ce14e(this.f58050x89769379);
        return c26908x82d5aed9;
    }

    /* renamed from: prepareSelect */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m107164x47380ce3() {
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> c26909x9364211c = new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<>(this.f58049x6aa9117b.mo106671x1c19911e(false), false, true);
        c26909x9364211c.m106428x3017aa(this.f58050x89769379);
        return c26909x9364211c;
    }

    /* renamed from: prepareUpdate */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m107165x4b3910b0() {
        com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> c26910x976524e9 = new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<>(this.f58049x6aa9117b.mo106671x1c19911e(true), false, true);
        c26910x976524e9.m106448x6903bce(this.f58050x89769379);
        return c26910x976524e9;
    }

    /* renamed from: updateObject */
    public void m107166xc0204d68(T t17) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m107088x90df30e9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m107162x2d9f5d92().m106412x6bdbce7(c27003xbcd6eb8).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107108xde3eb429(java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107137x946de4d9(java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106427xba979e0f(cls);
    }

    /* renamed from: insertObject */
    public void m107151x251da358(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertObjects */
    public void m107153x7e96c81b(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObject */
    public void m107155x9db6e44d(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106419x1b99c195().m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObjects */
    public void m107157x1925a5c6(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106419x1b99c195().m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObject */
    public void m107159x7beb81f7(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106420x30676751().m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObjects */
    public void m107161x184bd5c(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107163x36a99aa0().m106420x30676751().m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: updateObject */
    public void m107173xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m107089x90df30e9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107162x2d9f5d92().m106412x6bdbce7(c27003xbcd6eb8).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107094xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107127x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107174xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m107090x90df30e9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107162x2d9f5d92().m106412x6bdbce7(c27003xbcd6eb8).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106409xc3376493(j18).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107101xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107132x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107175xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m107091x90df30e9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107162x2d9f5d92().m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107095xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107128x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107176xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m107092x90df30e9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107162x2d9f5d92().m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106409xc3376493(j18).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107100xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107131x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107177xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(this.f58048xf98cae85.mo107912xefdf857d()).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107096xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107129x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107167xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107099xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107130x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107168xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107097xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107133x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107169xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107098xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107136x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107170xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107102xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107134x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107171xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107107xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107135x946de4d9(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107172xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(c26981x40bb0da).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107103xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107138x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107178xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107106xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107149x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107179xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107104xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107139x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107180xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107105xde3eb429(com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(this.f58048xf98cae85.mo107912xefdf857d()).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107144x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107181xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107109xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107140x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public void m107182xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107124xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107143x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public void m107183xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m107165x4b3910b0().set(c26981x40bb0daArr).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107110xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107141x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107117xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107142x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107111xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107145x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107116xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107148x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107112xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public T m107146x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107115xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <R extends T> R m107147x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107113xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107114xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107118xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107123xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107119xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107122xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getAllObjects */
    public java.util.List<T> m107120xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <R extends T> java.util.List<R> m107121xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m107164x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }
}
