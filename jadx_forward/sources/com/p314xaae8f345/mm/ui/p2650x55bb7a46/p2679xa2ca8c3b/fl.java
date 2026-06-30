package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes10.dex */
public final class fl extends com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.g0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f285511b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f285512c;

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21902xee4207b0 f285513d;

    public fl(java.util.HashMap selectors) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectors, "selectors");
        this.f285511b = new java.util.HashMap();
        java.util.Set<java.util.Map.Entry> entrySet = selectors.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        for (java.util.Map.Entry entry : entrySet) {
            java.util.HashMap hashMap = this.f285511b;
            java.lang.Object key = entry.getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            hashMap.put(key, ((xe5.g0) ((xe5.i0) entry.getValue())).f535561b);
        }
    }

    public final xe5.h0 a(java.lang.String tmplId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tmplId, "tmplId");
        java.util.HashMap hashMap = this.f285511b;
        xe5.h0 h0Var = (xe5.h0) hashMap.get(tmplId);
        java.util.Set entrySet = hashMap.entrySet();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(entrySet, "<get-entries>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : entrySet) {
            if (true ^ p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.Map.Entry) obj).getKey(), tmplId)) {
                arrayList.add(obj);
            }
        }
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((xe5.i) ((xe5.h0) ((java.util.Map.Entry) it.next()).getValue())).a(false);
        }
        if (h0Var != null) {
            ((xe5.i) h0Var).a(true);
        }
        return h0Var;
    }
}
