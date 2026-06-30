package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class mb implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ob {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a f168413a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 f168414b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f168415c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f168416d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashSet f168417e;

    public mb(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a renderer, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 separatedPluginsMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(renderer, "renderer");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(separatedPluginsMap, "separatedPluginsMap");
        this.f168413a = renderer;
        this.f168414b = separatedPluginsMap;
        this.f168415c = "Luggage.FULL.IWxaPageSeparatedPluginsInjectHelper.IMPL";
        this.f168416d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.lb(this));
        this.f168417e = new java.util.HashSet();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ob
    public void a(java.lang.String moduleName, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(moduleName, "moduleName");
        java.lang.String str = "injectPlugins moduleName(" + moduleName + ") useLazyCodeLoading(" + z17 + ") hash(" + hashCode() + ')';
        java.lang.String str2 = this.f168415c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11670x2ef26cc7 c11670x2ef26cc7 = this.f168414b;
        java.util.List b17 = c11670x2ef26cc7.b(moduleName);
        if (b17 == null) {
            java.lang.String i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.l1.i(moduleName);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(i17, moduleName)) {
                b17 = null;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(i17);
                b17 = c11670x2ef26cc7.b(i17);
            }
        }
        if (b17 == null || b17.isEmpty()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "injectPlugins, try with module(" + moduleName + "), get empty pluginList");
            return;
        }
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            java.lang.String a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.ac.f156974j.a(moduleName, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.C11669x3195c847) it.next());
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar = this.f168413a;
            if (z17) {
                if (((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.y3) ((jz5.n) this.f168416d).mo141623x754a37bb()).d(a17 + "/common.app.js")) {
                    b(aVar, a17 + "/common.app.js");
                    b(aVar, a17 + "/webview.app.js");
                }
            }
            b(aVar, a17 + "/pageframe.js");
        }
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.a aVar, java.lang.String str) {
        java.util.HashSet hashSet = this.f168417e;
        if (hashSet.contains(str)) {
            return;
        }
        java.lang.String str2 = "inner evaluateScriptFile fileName(" + str + ") hash(" + hashCode() + ')';
        java.lang.String str3 = this.f168415c;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, str2);
        java.lang.String a17 = aVar.O().a(str);
        if (!(a17 == null || a17.length() == 0)) {
            aVar.P(str, a17);
            hashSet.add(str);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str3, "evaluateScriptFile source EMPTY for " + str + ", skip adding to injectedScriptNames");
        }
    }
}
