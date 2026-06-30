package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes4.dex */
public class l4 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 f224433d;

    public l4(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144) {
        this.f224433d = activityC16145xcc3dc144;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public void mo887xc459429a(db5.g4 g4Var) {
        int i17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.ActivityC16145xcc3dc144 activityC16145xcc3dc144 = this.f224433d;
        java.util.LinkedList linkedList = activityC16145xcc3dc144.B.f468615d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList svr size =" + linkedList.size());
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        linkedList2.add(8);
        java.util.Iterator it = linkedList.iterator();
        while (true) {
            i17 = 1;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            r8 = true;
            boolean z17 = true;
            if (!it.hasNext()) {
                break;
            }
            r45.t57 t57Var = (r45.t57) it.next();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC16145xcc3dc144.mo55332x76847179();
            int i18 = t57Var.f467698d;
            if (i18 != 8 && i18 != 0 && i18 != 1 && i18 != 2 && i18 != 3 && i18 != 5) {
                if (i18 == 4) {
                    if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("com.whatsapp")) {
                        try {
                            mo55332x76847179.getPackageManager().getApplicationInfo("com.whatsapp", 8192);
                        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                        }
                    }
                    z17 = false;
                } else if (i18 == 6) {
                    z17 = c01.z1.C();
                } else {
                    if (i18 == 7 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0("com.facebook.orca")) {
                        mo55332x76847179.getPackageManager().getApplicationInfo("com.facebook.orca", 8192);
                    }
                    z17 = false;
                }
            }
            if (z17) {
                linkedList2.add(java.lang.Integer.valueOf(t57Var.f467698d));
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallShareCouponCardUI", "CheckedShareList final size =" + linkedList2.size());
        java.util.Iterator it6 = linkedList2.iterator();
        while (it6.hasNext()) {
            java.lang.Integer num = (java.lang.Integer) it6.next();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC16145xcc3dc144.mo55332x76847179();
            int intValue = num.intValue();
            java.util.HashMap hashMap = new java.util.HashMap();
            hashMap.put(8, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4l));
            hashMap.put(0, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l8i));
            hashMap.put(java.lang.Integer.valueOf(i17), mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4q));
            hashMap.put(3, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4m));
            hashMap.put(2, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4p));
            hashMap.put(5, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4r));
            hashMap.put(4, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4s));
            hashMap.put(6, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4o));
            hashMap.put(7, mo55332x768471792.getString(com.p314xaae8f345.mm.R.C30867xcad56011.g4n));
            java.lang.String str = hashMap.containsKey(java.lang.Integer.valueOf(intValue)) ? (java.lang.String) hashMap.get(java.lang.Integer.valueOf(intValue)) : null;
            int intValue2 = num.intValue();
            java.util.HashMap hashMap2 = new java.util.HashMap();
            hashMap2.put(8, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78669x1611aec0));
            hashMap2.put(0, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78706xf16cadde));
            hashMap2.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78705xe96fda8b));
            hashMap2.put(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78670xac3f35b1));
            hashMap2.put(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78707xd76c28ae));
            hashMap2.put(5, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78708xc44c6348));
            hashMap2.put(4, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78709xd5becb5d));
            hashMap2.put(6, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78671x800dfc91));
            hashMap2.put(7, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f78704x958692a8));
            int intValue3 = hashMap2.containsKey(java.lang.Integer.valueOf(intValue2)) ? ((java.lang.Integer) hashMap2.get(java.lang.Integer.valueOf(intValue2))).intValue() : -1;
            if (str != null && intValue3 != -1) {
                g4Var.g(num.intValue(), str, intValue3);
            }
            i17 = 1;
        }
    }
}
