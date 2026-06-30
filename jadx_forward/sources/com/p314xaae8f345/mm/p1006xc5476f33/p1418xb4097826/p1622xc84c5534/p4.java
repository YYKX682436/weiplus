package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class p4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4 f206783a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.LinkedList f206784b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public static final android.util.LruCache f206785c = new android.util.LruCache(10);

    /* renamed from: d, reason: collision with root package name */
    public static volatile org.json.JSONObject f206786d;

    public final void a(java.lang.String str, org.json.JSONObject jSONObject) {
        java.util.Objects.toString(f206786d);
        f206786d = null;
        java.util.LinkedList linkedList = f206784b;
        boolean contains = linkedList.contains(str);
        android.util.LruCache lruCache = f206785c;
        if (!contains) {
            linkedList.push(str);
            lruCache.put(str, jSONObject);
            java.util.Objects.toString(linkedList);
            java.util.Objects.toString(lruCache);
            return;
        }
        lruCache.put(str, jSONObject);
        while (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(linkedList.peek(), str)) {
            java.lang.Object peek = linkedList.peek();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(peek, "peek(...)");
            java.lang.String str2 = (java.lang.String) peek;
            synchronized (this) {
                java.util.Objects.toString(f206786d);
                f206786d = null;
                java.util.LinkedList linkedList2 = f206784b;
                linkedList2.remove(str2);
                android.util.LruCache lruCache2 = f206785c;
                lruCache2.remove(str2);
                java.util.Objects.toString(linkedList2);
                java.util.Objects.toString(lruCache2);
            }
        }
        java.util.Objects.toString(linkedList);
        java.util.Objects.toString(lruCache);
    }

    public final void b(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, org.json.JSONObject obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        synchronized (this) {
            final java.lang.String simpleName = activity.getClass().getSimpleName();
            f206783a.a(simpleName, obj);
            activity.mo273xed6858b4().a(new p012xc85e97e9.p093xedfae76a.v() { // from class: com.tencent.mm.plugin.finder.report.FinderStackObjectReporter$initActivity$1$1
                @Override // p012xc85e97e9.p093xedfae76a.v
                /* renamed from: onStateChanged */
                public final void mo2520xaba1ac62(p012xc85e97e9.p093xedfae76a.y yVar, p012xc85e97e9.p093xedfae76a.m event) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(yVar, "<anonymous parameter 0>");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                    if (event == p012xc85e97e9.p093xedfae76a.m.ON_DESTROY) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4 p4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206783a;
                        java.lang.String name = simpleName;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "$name");
                        synchronized (p4Var) {
                            java.util.Objects.toString(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206786d);
                            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206786d = null;
                            java.util.LinkedList linkedList = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206784b;
                            linkedList.remove(name);
                            android.util.LruCache lruCache = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.p4.f206785c;
                            lruCache.remove(name);
                            java.util.Objects.toString(linkedList);
                            java.util.Objects.toString(lruCache);
                        }
                    }
                }
            });
        }
    }
}
