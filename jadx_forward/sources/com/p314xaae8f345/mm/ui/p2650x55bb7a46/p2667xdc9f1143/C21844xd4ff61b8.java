package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2667xdc9f1143;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/ui/chatting/layoutmanager/ChattingLinearLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "app_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.ui.chatting.layoutmanager.ChattingLinearLayoutManager */
/* loaded from: classes15.dex */
public final class C21844xd4ff61b8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de {

    /* renamed from: w, reason: collision with root package name */
    public static tb5.v f283466w;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.List f283467v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21844xd4ff61b8(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f283467v = arrayList;
        arrayList.add(new fd5.c(this));
        arrayList.add(new fd5.d(this));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de
    public void P(int i17, int i18) {
        super.P(i17, i18);
    }

    public final fd5.a W(java.lang.Class lmClazz) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lmClazz, "lmClazz");
        java.util.Iterator it = this.f283467v.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (lmClazz.isInstance((fd5.a) obj)) {
                break;
            }
        }
        if (obj instanceof fd5.a) {
            return (fd5.a) obj;
        }
        return null;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: addView */
    public void mo7989xbb8aeee6(android.view.View child) {
        tb5.v vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        long nanoTime = java.lang.System.nanoTime();
        super.mo7989xbb8aeee6(child);
        long nanoTime2 = java.lang.System.nanoTime();
        java.lang.Object tag = child.getTag(com.p314xaae8f345.mm.R.id.ego);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        long j17 = nanoTime2 - nanoTime;
        if (j17 <= 500000.0d || (vVar = f283466w) == null) {
            return;
        }
        java.util.HashMap hashMap = vVar.f498628l;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(intValue, j17, "", false, 0, 16, null));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: generateDefaultLayoutParams */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams mo2417xcbb3b67c() {
        return new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutParams(-1, -2);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: measureChildWithMargins */
    public void mo8052x6ae7e3a1(android.view.View child, int i17, int i18) {
        tb5.v vVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(child, "child");
        long nanoTime = java.lang.System.nanoTime();
        super.mo8052x6ae7e3a1(child, i17, i18);
        long nanoTime2 = java.lang.System.nanoTime();
        java.lang.Object tag = child.getTag(com.p314xaae8f345.mm.R.id.ego);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        long j17 = nanoTime2 - nanoTime;
        if (j17 <= 500000.0d || (vVar = f283466w) == null) {
            return;
        }
        java.util.HashMap hashMap = vVar.f498629m;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(intValue);
        java.lang.Object obj = hashMap.get(valueOf);
        if (obj == null) {
            obj = new java.util.ArrayList();
            hashMap.put(valueOf, obj);
        }
        ((java.util.List) obj).add(new tb5.e(intValue, j17, "", false, 0, 16, null));
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        java.util.List list = this.f283467v;
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                ((fd5.a) it.next()).a(z2Var, h3Var);
            }
            super.mo2418x457c9b08(z2Var, h3Var);
            java.util.Iterator it6 = list.iterator();
            while (it6.hasNext()) {
                ((fd5.a) it6.next()).b(z2Var, h3Var);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLinearLayoutManager", th6, "onLayoutChildren err", new java.lang.Object[0]);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollHorizontallyBy */
    public int mo2419x96d40915(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        java.util.Objects.toString(z2Var);
        java.util.Objects.toString(h3Var);
        return super.mo2419x96d40915(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollToPosition */
    public void mo2420xc593c771(int i17) {
        super.mo2420xc593c771(i17);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        java.util.Objects.toString(z2Var);
        java.util.Objects.toString(h3Var);
        return super.mo7922xd8d712a7(i17, z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: smoothScrollToPosition */
    public void mo7942xd1b4653f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var, int i17) {
        android.content.Context context = c1163xf1deaba4 != null ? c1163xf1deaba4.getContext() : null;
        if (context == null) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = c1163xf1deaba4.mo7946xf939df19();
        int mo1894x7e414b06 = (mo7946xf939df19 != null ? mo7946xf939df19.mo1894x7e414b06() : 0) - 1;
        fd5.b bVar = new fd5.b(context, mo1894x7e414b06 == i17, c1163xf1deaba4);
        try {
            bVar.f93582a = i17;
            m8099x6305639d(bVar);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ChattingLinearLayoutManager", th6, "startSmoothScroll problem %s %s", java.lang.Integer.valueOf(mo1894x7e414b06), java.lang.Integer.valueOf(i17));
        }
    }
}
