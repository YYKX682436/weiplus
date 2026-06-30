package com.p314xaae8f345.p347x615374d.p349x208df1fe.app;

/* renamed from: com.tencent.kinda.framework.app.KindaUIPageMap */
/* loaded from: classes11.dex */
public class C3146x1478468c {

    /* renamed from: data */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3146x1478468c.Value> f12136x2eefaa = new java.util.concurrent.ConcurrentHashMap<>();

    /* renamed from: com.tencent.kinda.framework.app.KindaUIPageMap$Value */
    /* loaded from: classes11.dex */
    public static class Value {

        /* renamed from: uiPage */
        public com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc f12137xcd947b43;
    }

    /* renamed from: getAndRemove */
    public static com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3146x1478468c.Value m25408xbbbd285(java.lang.String str) {
        if (!f12136x2eefaa.containsKey(str)) {
            return null;
        }
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3146x1478468c.Value value = f12136x2eefaa.get(str);
        f12136x2eefaa.remove(str);
        return value;
    }

    /* renamed from: getUUID */
    public static java.lang.String m25409xfb85e011() {
        return java.util.UUID.randomUUID().toString();
    }

    public static java.lang.String put(com.p314xaae8f345.p347x615374d.gen.AbstractC3414xaadd5ccc abstractC3414xaadd5ccc) {
        java.lang.String m25409xfb85e011 = m25409xfb85e011();
        com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3146x1478468c.Value value = new com.p314xaae8f345.p347x615374d.p349x208df1fe.app.C3146x1478468c.Value();
        value.f12137xcd947b43 = abstractC3414xaadd5ccc;
        f12136x2eefaa.put(m25409xfb85e011, value);
        return m25409xfb85e011;
    }
}
