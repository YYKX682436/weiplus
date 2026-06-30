package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class t extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.td {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class[] f168635a = {al1.b.class, al1.n.class, zl1.t.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.p1232xcb77185e.C12813xe3573f17.class};

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class[] f168636b = {mi1.h.class, al1.l.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.c9.class};

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s f168637c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ud
    public android.view.View a(android.content.Context context, java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        android.view.View a17 = this.f168637c.a(clazz, b(context, clazz));
        if (a17 == null) {
            a17 = super.a(b(context, clazz), clazz);
        }
        java.lang.System.currentTimeMillis();
        return a17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ud
    public android.content.Context b(android.content.Context originalContext, java.lang.Class clazz) {
        android.content.Context a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(originalContext, "originalContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mi1.i.class, clazz)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ed edVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ed) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ed.f171225e.get();
            edVar.setTheme(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ja.a(false));
            return edVar;
        }
        java.lang.ThreadLocal threadLocal = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171734a;
        boolean booleanValue = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n() ? false : ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.s5.f171734a.get()).booleanValue();
        java.lang.Class[] clsArr = this.f168635a;
        if (booleanValue) {
            if (c(clsArr, clazz)) {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u.b(originalContext, false);
            }
            a17 = originalContext;
        } else if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()) {
            if (c(clsArr, clazz)) {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u.a(originalContext);
            }
            a17 = originalContext;
        } else {
            if (c(clsArr, clazz)) {
                a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u.a(originalContext);
            }
            a17 = originalContext;
        }
        if (c(this.f168636b, clazz)) {
            a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.u.a(a17);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandDecorWidgetFactoryWC", "getFactoryContextForWidget: clazz [%s] adapted density [%f] original density [%f]", clazz.getCanonicalName(), java.lang.Float.valueOf(a17.getResources().getDisplayMetrics().density), java.lang.Float.valueOf(originalContext.getResources().getDisplayMetrics().density));
        return a17;
    }

    public final boolean c(java.lang.Object[] objArr, java.lang.Object obj) {
        for (java.lang.Object obj2 : objArr) {
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, obj)) {
                return true;
            }
        }
        return false;
    }

    public final void d(java.lang.Class clazz) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(clazz, "clazz");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.view.View a17 = super.a(b(context, clazz), clazz);
        if (a17 == null) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.s sVar = this.f168637c;
        sVar.getClass();
        java.util.HashMap hashMap = sVar.f168602a;
        if (((java.util.LinkedList) hashMap.get(clazz)) == null) {
            hashMap.put(clazz, new java.util.LinkedList());
        }
        java.lang.Object obj = hashMap.get(clazz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        ((java.util.LinkedList) obj).addLast(a17);
    }
}
