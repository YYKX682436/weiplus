package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

/* loaded from: classes3.dex */
public final class q1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1 f197186a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.q1();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.concurrent.ConcurrentHashMap f197187b = new java.util.concurrent.ConcurrentHashMap();

    public final java.io.Serializable a(android.content.Intent intent, java.lang.String key) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.io.Serializable serializable = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14290x5ef4def9 c14290x5ef4def9 = intent != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14290x5ef4def9) intent.getParcelableExtra(key) : null;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = f197187b;
        if (c14290x5ef4def9 != null && (str2 = c14290x5ef4def9.f196965d) != null) {
            serializable = (java.io.Serializable) concurrentHashMap.get(str2);
        }
        if (c14290x5ef4def9 != null && (str = c14290x5ef4def9.f196965d) != null) {
        }
        return serializable;
    }

    public final java.lang.String b(android.content.Intent intent, java.lang.String key, java.io.Serializable serializable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        if (serializable == null) {
            return null;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(java.util.UUID.randomUUID());
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        sb6.append('_');
        sb6.append(gm0.j1.b().h());
        java.lang.String sb7 = sb6.toString();
        f197187b.put(sb7, serializable);
        intent.putExtra(key, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.C14290x5ef4def9(sb7));
        return sb7;
    }
}
