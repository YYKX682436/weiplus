package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public final class l6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f268919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6 f268920e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f268921f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f268922g;

    public l6(android.app.Activity activity, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6 m6Var, int i17, android.os.Bundle bundle) {
        this.f268919d = activity;
        this.f268920e = m6Var;
        this.f268921f = i17;
        this.f268922g = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.u0 u0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d0 d0Var;
        if (this.f268919d.isFinishing()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.m6 m6Var = this.f268920e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0 r0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) m6Var.f268943e.get();
        if (r0Var == null) {
            return;
        }
        java.util.HashSet hashSet = new java.util.HashSet();
        int i17 = this.f268921f;
        if (i17 == 3003 || i17 == 3004) {
            hashSet.add("menuItem:share:appMessage");
            hashSet.add("menuItem:share:timeline");
            hashSet.add("menuItem:copyUrl");
        } else {
            android.os.Bundle bundle = this.f268922g;
            if (bundle == null) {
                return;
            }
            java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("menu_item_list");
            if (stringArrayList == null || stringArrayList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.PreloadWebViewStubCallback", "setMenuItemsVisible menuItems is null or nil.");
                return;
            } else {
                hashSet.addAll(stringArrayList);
                hashSet.remove("menuItem:exposeArticle");
            }
        }
        java.lang.String mo120156xb5887639 = r0Var.f263449a.mo120156xb5887639();
        if (mo120156xb5887639 == null || (weakReference = m6Var.f268945g) == null || (u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.u0) weakReference.get()) == null || (d0Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.o4) u0Var).f269007s) == null) {
            return;
        }
        java.util.HashMap hashMap = d0Var.f268682g;
        java.lang.Object obj = hashMap.get(mo120156xb5887639);
        java.util.HashMap hashMap2 = d0Var.f268683h;
        boolean z17 = false;
        switch (i17) {
            case 3001:
            case 3003:
                if (obj == null) {
                    obj = new android.util.SparseBooleanArray();
                    hashMap.put(mo120156xb5887639, obj);
                    if (((android.util.SparseBooleanArray) d0Var.f268682g.get(mo120156xb5887639)) == null) {
                        d0Var.f268682g.put(mo120156xb5887639, new android.util.SparseBooleanArray());
                    }
                }
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.Integer num = (java.lang.Integer) hashMap2.get((java.lang.String) it.next());
                    if (num == null) {
                        num = -1;
                    }
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
                    int intValue = num.intValue();
                    if (intValue > 0) {
                        ((android.util.SparseBooleanArray) obj).put(intValue, true);
                    }
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = d0Var.f268676a;
                if (k0Var != null && k0Var.i()) {
                    z17 = true;
                }
                if (z17) {
                    d0Var.h();
                    return;
                }
                return;
            case 3002:
            case 3004:
                if (obj != null) {
                    java.util.Iterator it6 = hashSet.iterator();
                    while (it6.hasNext()) {
                        java.lang.Integer num2 = (java.lang.Integer) hashMap2.get((java.lang.String) it6.next());
                        if (num2 == null) {
                            num2 = -1;
                        }
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num2);
                        int intValue2 = num2.intValue();
                        if (intValue2 > 0) {
                            ((android.util.SparseBooleanArray) obj).delete(intValue2);
                        }
                    }
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = d0Var.f268676a;
                    if (k0Var2 != null && k0Var2.i()) {
                        z17 = true;
                    }
                    if (z17) {
                        d0Var.h();
                        return;
                    }
                    return;
                }
                return;
            default:
                return;
        }
    }
}
