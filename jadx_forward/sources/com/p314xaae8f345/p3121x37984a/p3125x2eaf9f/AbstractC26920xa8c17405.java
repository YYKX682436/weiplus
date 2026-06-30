package com.p314xaae8f345.p3121x37984a.p3125x2eaf9f;

/* renamed from: com.tencent.wcdb.core.HandleORMOperation */
/* loaded from: classes12.dex */
public abstract class AbstractC26920xa8c17405 extends com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.AbstractC26921x6472abff {
    /* renamed from: createTable */
    public <T> void m106786xe1f0e832(java.lang.String str, com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> interfaceC26982x5a8a1af7) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = mo106671x1c19911e(true);
        try {
            if (!interfaceC26982x5a8a1af7.mo107913x82ba2274().m107898xe1f0e832(str, mo106671x1c19911e)) {
                throw mo106671x1c19911e.m106767xfbaab3();
            }
        } finally {
            if (mo106650x96555712() && mo106671x1c19911e != null) {
                mo106671x1c19911e.m106777x92d0313b();
            }
        }
    }

    /* renamed from: createVirtualTable */
    public <T> void m106787x4e60369f(java.lang.String str, com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> interfaceC26982x5a8a1af7) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = mo106671x1c19911e(true);
        try {
            if (!interfaceC26982x5a8a1af7.mo107913x82ba2274().m107899x4e60369f(str, mo106671x1c19911e)) {
                throw mo106671x1c19911e.m106767xfbaab3();
            }
        } finally {
            if (mo106650x96555712() && mo106671x1c19911e != null) {
                mo106671x1c19911e.m106777x92d0313b();
            }
        }
    }

    /* renamed from: deleteObjects */
    public void m106788x90df30e9(java.lang.String str) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106405xb158f775();
    }

    /* renamed from: dropIndex */
    public void m106794xe02c0723(java.lang.String str) {
        m106861xb158f775(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27037x2e80e694().m108683xe02c0723(str).m108684x648117da());
    }

    /* renamed from: dropTable */
    public void m106795xe0c11a1f(java.lang.String str) {
        m106861xb158f775(new com.p314xaae8f345.p3121x37984a.p3131x37b015.C27038x2f15f990().m108689xe0c11a1f(str).m108690x648117da());
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106796xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106424xeffdfc33();
    }

    /* renamed from: getDatabase */
    public abstract com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b mo106668xe6834ef1();

    /* renamed from: getFirstObject */
    public <T> T m106812x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106426xba979e0f();
    }

    /* renamed from: getTable */
    public <T> com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae<T> m106824x752de218(java.lang.String str, com.p314xaae8f345.p3121x37984a.orm.InterfaceC26982x5a8a1af7<T> interfaceC26982x5a8a1af7) {
        return new com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae<>(str, interfaceC26982x5a8a1af7, mo106668xe6834ef1());
    }

    /* renamed from: insertObject */
    public <T> void m106825x251da358(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106417x2d5ce14e(str).m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertObjects */
    public <T> void m106826x7e96c81b(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106417x2d5ce14e(str).m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObject */
    public <T> void m106827x9db6e44d(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106419x1b99c195().m106417x2d5ce14e(str).m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrIgnoreObjects */
    public <T> void m106828x1925a5c6(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106419x1b99c195().m106417x2d5ce14e(str).m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObject */
    public <T> void m106829x7beb81f7(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106420x30676751().m106417x2d5ce14e(str).m106421x6ac9171(t17).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: insertOrReplaceObjects */
    public <T> void m106830x184bd5c(java.util.Collection<T> collection, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106832x36a99aa0().m106420x30676751().m106417x2d5ce14e(str).m106422xcee59d22(collection).m106418x42fa5578(c26981x40bb0daArr).m106415xb158f775();
    }

    /* renamed from: prepareDelete */
    public com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26907x79cb71cb m106831x2d9f5d92() {
        return new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26907x79cb71cb(mo106671x1c19911e(true), false, mo106650x96555712());
    }

    /* renamed from: prepareInsert */
    public <T> com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<T> m106832x36a99aa0() {
        return new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26908x82d5aed9<>(mo106671x1c19911e(true), false, mo106650x96555712());
    }

    /* renamed from: prepareSelect */
    public <T> com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<T> m106833x47380ce3() {
        return new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26909x9364211c<>(mo106671x1c19911e(false), false, mo106650x96555712());
    }

    /* renamed from: prepareUpdate */
    public <T> com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<T> m106834x4b3910b0() {
        return new com.p314xaae8f345.p3121x37984a.p3123x4e97089f.C26910x976524e9<>(mo106671x1c19911e(true), false, mo106650x96555712());
    }

    /* renamed from: tableExist */
    public boolean m106835xa4e76fc9(java.lang.String str) {
        com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48 mo106671x1c19911e = mo106671x1c19911e(false);
        int m106764xa4e76fc9 = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26919x80675a48.m106764xa4e76fc9(mo106671x1c19911e.m106772x6d8946f5(), str);
        com.p314xaae8f345.p3121x37984a.p3122x2e06d1.C26903x69761325 m106767xfbaab3 = m106764xa4e76fc9 > 1 ? mo106671x1c19911e.m106767xfbaab3() : null;
        if (mo106650x96555712()) {
            mo106671x1c19911e.m106777x92d0313b();
        }
        if (m106767xfbaab3 == null) {
            return m106764xa4e76fc9 == 1;
        }
        throw m106767xfbaab3;
    }

    /* renamed from: updateObject */
    public <T> void m106836xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m106789x90df30e9(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106412x6bdbce7(c27003xbcd6eb8).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106811xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106823x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106837xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m106790x90df30e9(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106412x6bdbce7(c27003xbcd6eb8).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106797xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public <T> T m106813x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public <T> void m106838xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m106791x90df30e9(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106412x6bdbce7(c27003xbcd6eb8).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106409xc3376493(j18).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106804xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106818x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106839xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m106792x90df30e9(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106798xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public <T> T m106814x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public <T> void m106840xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: deleteObjects */
    public void m106793x90df30e9(java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106831x2d9f5d92().m106406x42b6e44(str).m106411xb80cf445(c27017x4f962880).m106407x6234bbb(j17).m106409xc3376493(j18).m106405xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106803xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106817x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106841xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T> c26981x40bb0da, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0da).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106799xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public <T> T m106815x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public <T> void m106842xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106802xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106816x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106843xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106800xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public <T> T m106819x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public <T> void m106844xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106801xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106436x6bdbce7(c27003xbcd6eb8).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106822x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106845xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27003xbcd6eb8 c27003xbcd6eb8, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106460x6bdbce7(c27003xbcd6eb8).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106805xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106424xeffdfc33();
    }

    /* renamed from: getFirstObject */
    public <T> T m106820x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106426xba979e0f();
    }

    /* renamed from: updateObject */
    public <T> void m106846xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106810xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106425xeffdfc33(cls);
    }

    /* renamed from: getFirstObject */
    public <T, R extends T> R m106821x946de4d9(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return (R) m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(1L).m106431xc3376493(j17).m106427xba979e0f(cls);
    }

    /* renamed from: updateObject */
    public <T> void m106847xc0204d68(T t17, com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        m106834x4b3910b0().m106448x6903bce(str).set(c26981x40bb0daArr).m106449x8e41959a(t17).m106446xb80cf445(c27017x4f962880).m106439x6234bbb(j17).m106443xc3376493(j18).m106437xb158f775();
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106806xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106809xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106425xeffdfc33(cls);
    }

    /* renamed from: getAllObjects */
    public <T> java.util.List<T> m106807xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106424xeffdfc33();
    }

    /* renamed from: getAllObjects */
    public <T, R extends T> java.util.List<R> m106808xde3eb429(com.p314xaae8f345.p3121x37984a.orm.C26981x40bb0da<T>[] c26981x40bb0daArr, java.lang.String str, com.p314xaae8f345.p3121x37984a.p3131x37b015.C27017x4f962880 c27017x4f962880, long j17, long j18, java.lang.Class<R> cls) {
        return m106833x47380ce3().m106435xc9ff34fc(c26981x40bb0daArr).m106428x3017aa(str).m106433xb80cf445(c27017x4f962880).m106429x6234bbb(j17).m106431xc3376493(j18).m106425xeffdfc33(cls);
    }
}
