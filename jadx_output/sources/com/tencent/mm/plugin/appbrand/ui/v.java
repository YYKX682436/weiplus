package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f90261d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData f90262e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.uf7 f90263f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI f90264g;

    public v(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI, java.util.List list, com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData, r45.uf7 uf7Var) {
        this.f90264g = appBrandAuthorizeUI;
        this.f90261d = list;
        this.f90262e = subscribeMsgSettingData;
        this.f90263f = uf7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String[] strArr;
        java.lang.String[] strArr2;
        java.lang.String[] strArr3 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI = this.f90264g;
        appBrandAuthorizeUI.getClass();
        java.util.List list = this.f90261d;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "updatePreferencesInternal, authItems size = %d", java.lang.Integer.valueOf(list.size()));
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = this.f90262e;
        if (subscribeMsgSettingData != null && subscribeMsgSettingData.f71834d) {
            com.tencent.mm.ui.base.preference.Preference preference = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
            preference.f197785v = false;
            preference.C("preference_key_subscribe_msg");
            preference.L(appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a57));
            preference.H(subscribeMsgSettingData.f71835e ? "" : appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a58));
            linkedHashMap.put(preference.f197780q, preference);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            r45.vb vbVar = (r45.vb) it.next();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "updatePreferencesInternal, find scope:%s, state:%d", vbVar.f388058d, java.lang.Integer.valueOf(vbVar.f388060f));
            if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userLocationBackground")) {
                appBrandAuthorizeUI.f89314t = vbVar;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userLocation")) {
                appBrandAuthorizeUI.f89313s = vbVar;
                com.tencent.mm.ui.base.preference.Preference preference2 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
                appBrandAuthorizeUI.f89309o = preference2;
                preference2.f197785v = false;
                preference2.C(vbVar.f388058d);
                appBrandAuthorizeUI.f89309o.H(vbVar.f388062h);
                appBrandAuthorizeUI.f89309o.L(vbVar.f388059e);
                com.tencent.mm.ui.base.preference.Preference preference3 = appBrandAuthorizeUI.f89309o;
                linkedHashMap.put(preference3.f197780q, preference3);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userFuzzyLocation")) {
                appBrandAuthorizeUI.f89315u = vbVar;
                com.tencent.mm.ui.base.preference.Preference preference4 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
                appBrandAuthorizeUI.f89310p = preference4;
                preference4.f197785v = false;
                preference4.C(vbVar.f388058d);
                appBrandAuthorizeUI.f89310p.H(vbVar.f388062h);
                appBrandAuthorizeUI.f89310p.L(vbVar.f388059e);
                com.tencent.mm.ui.base.preference.Preference preference5 = appBrandAuthorizeUI.f89310p;
                linkedHashMap.put(preference5.f197780q, preference5);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.bluetoothBackground")) {
                appBrandAuthorizeUI.I = vbVar;
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.bluetooth")) {
                appBrandAuthorizeUI.H = vbVar;
                com.tencent.mm.ui.base.preference.Preference preference6 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
                appBrandAuthorizeUI.G = preference6;
                preference6.f197785v = false;
                preference6.C(vbVar.f388058d);
                appBrandAuthorizeUI.G.H(vbVar.f388062h);
                appBrandAuthorizeUI.G.L(vbVar.f388059e);
                com.tencent.mm.ui.base.preference.Preference preference7 = appBrandAuthorizeUI.G;
                linkedHashMap.put(preference7.f197780q, preference7);
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userInfo")) {
                if (appBrandAuthorizeUI.f89311q == null) {
                    appBrandAuthorizeUI.f89311q = new com.tencent.mm.ui.base.preference.IconPreference(appBrandAuthorizeUI);
                }
                if (vbVar.f388061g == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "scope userinfo's UserAvatarInfo is null, can not be add into Preference");
                } else {
                    com.tencent.mm.ui.base.preference.IconPreference iconPreference = appBrandAuthorizeUI.f89311q;
                    iconPreference.f197785v = false;
                    appBrandAuthorizeUI.r7(iconPreference, vbVar);
                    com.tencent.mm.ui.base.preference.IconPreference iconPreference2 = appBrandAuthorizeUI.f89311q;
                    linkedHashMap.put(iconPreference2.f197780q, iconPreference2);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.userProfileChange")) {
                com.tencent.mm.ui.base.preference.IconPreference iconPreference3 = new com.tencent.mm.ui.base.preference.IconPreference(appBrandAuthorizeUI);
                appBrandAuthorizeUI.f89312r = iconPreference3;
                if (vbVar.f388061g == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandAuthorizeUI", "scope userinfo's UserAvatarInfo is null, can not be add into Preference");
                } else {
                    iconPreference3.f197785v = false;
                    appBrandAuthorizeUI.s7(iconPreference3, vbVar);
                    com.tencent.mm.ui.base.preference.IconPreference iconPreference4 = appBrandAuthorizeUI.f89312r;
                    linkedHashMap.put(iconPreference4.f197780q, iconPreference4);
                }
            } else if (!com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) && vbVar.f388058d.equalsIgnoreCase("scope.devicePanel")) {
                com.tencent.mm.ui.base.preference.RightBelowPreference rightBelowPreference = new com.tencent.mm.ui.base.preference.RightBelowPreference(appBrandAuthorizeUI);
                rightBelowPreference.f197785v = false;
                rightBelowPreference.C(vbVar.f388058d);
                rightBelowPreference.L(vbVar.f388059e);
                rightBelowPreference.H(vbVar.f388062h);
                rightBelowPreference.M = vbVar.f388060f == 1 ? appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490058jq) : appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490052jk);
                linkedHashMap.put(rightBelowPreference.f197780q, rightBelowPreference);
            } else if (com.tencent.mm.sdk.platformtools.t8.K0(vbVar.f388058d) || !vbVar.f388058d.equalsIgnoreCase("scope.EmployeeRelation")) {
                com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference = new com.tencent.mm.ui.base.preference.CheckBoxPreference(appBrandAuthorizeUI);
                checkBoxPreference.f197785v = false;
                checkBoxPreference.C(vbVar.f388058d);
                checkBoxPreference.L(vbVar.f388059e);
                checkBoxPreference.H(vbVar.f388062h);
                checkBoxPreference.L = vbVar.f388060f == 1;
                linkedHashMap.put(checkBoxPreference.f197780q, checkBoxPreference);
            } else {
                com.tencent.mm.ui.base.preference.Preference preference8 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
                preference8.f197785v = false;
                preference8.C("preference_key_employee_relation_info");
                preference8.L(vbVar.f388059e);
                preference8.H(vbVar.f388064m);
                linkedHashMap.put(preference8.f197780q, preference8);
            }
        }
        com.tencent.mm.ui.base.preference.Preference preference9 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
        preference9.f197785v = false;
        preference9.C("preference_key_voip_device_list");
        preference9.L(appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a5k));
        linkedHashMap.put(preference9.f197780q, preference9);
        if (appBrandAuthorizeUI.n7()) {
            com.tencent.mm.ui.base.preference.CheckBoxPreference checkBoxPreference2 = new com.tencent.mm.ui.base.preference.CheckBoxPreference(appBrandAuthorizeUI);
            checkBoxPreference2.f197785v = false;
            checkBoxPreference2.C("preference_key_notify_msg");
            checkBoxPreference2.L = appBrandAuthorizeUI.T;
            checkBoxPreference2.L(appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.f490652a35));
            linkedHashMap.put(checkBoxPreference2.f197780q, checkBoxPreference2);
        }
        if (ck1.n0.f42354a.e(this.f90263f)) {
            com.tencent.mm.ui.base.preference.Preference preference10 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
            preference10.f197785v = false;
            preference10.C("preference_key_user_info");
            preference10.L(appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a09));
            linkedHashMap.put(preference10.f197780q, preference10);
        }
        com.tencent.mm.ui.base.preference.Preference preference11 = new com.tencent.mm.ui.base.preference.Preference(appBrandAuthorizeUI);
        preference11.f197785v = false;
        preference11.C("preference_key_privacy_use_record");
        preference11.L(appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a4_));
        linkedHashMap.put(preference11.f197780q, preference11);
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        java.util.Iterator it6 = linkedHashMap.values().iterator();
        com.tencent.mm.ui.base.preference.Preference preference12 = null;
        com.tencent.mm.ui.base.preference.Preference preference13 = null;
        com.tencent.mm.ui.base.preference.Preference preference14 = null;
        while (true) {
            boolean hasNext = it6.hasNext();
            strArr = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.f89299p0;
            strArr2 = com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.Z;
            if (!hasNext) {
                break;
            }
            com.tencent.mm.ui.base.preference.Preference preference15 = (com.tencent.mm.ui.base.preference.Preference) it6.next();
            if (java.util.Arrays.asList(strArr).contains(preference15.f197780q)) {
                hashMap2.put(preference15.f197780q, preference15);
            } else if (java.util.Arrays.asList(strArr2).contains(preference15.f197780q)) {
                hashMap.put(preference15.f197780q, preference15);
            } else if ("scope.devicePanel".equals(preference15.f197780q)) {
                preference12 = preference15;
            } else if ("preference_key_user_info".equals(preference15.f197780q)) {
                preference13 = preference15;
            } else if ("preference_key_privacy_use_record".equals(preference15.f197780q)) {
                preference14 = preference15;
            } else {
                linkedHashMap2.put(preference15.f197780q, preference15);
            }
        }
        for (int i17 = 0; i17 < 7; i17++) {
            com.tencent.mm.ui.base.preference.Preference preference16 = (com.tencent.mm.ui.base.preference.Preference) hashMap.get(strArr2[i17]);
            if (preference16 != null) {
                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference16, -1);
            }
        }
        java.util.Iterator it7 = linkedHashMap2.values().iterator();
        while (it7.hasNext()) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d((com.tencent.mm.ui.base.preference.Preference) it7.next(), -1);
        }
        if (hashMap2.size() > 0) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(appBrandAuthorizeUI.getContext(), null), -1);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            com.tencent.mm.ui.base.preference.Preference preference17 = (com.tencent.mm.ui.base.preference.Preference) hashMap2.get(strArr[i18]);
            if (preference17 != null) {
                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference17, -1);
            }
        }
        if (preference12 != null) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(appBrandAuthorizeUI.getContext(), null), -1);
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference12, -1);
        }
        if (preference13 != null) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(appBrandAuthorizeUI.getContext(), null), -1);
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference13, -1);
        }
        if (preference14 != null) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(new com.tencent.mm.ui.base.preference.PreferenceSmallCategory(appBrandAuthorizeUI.getContext(), null), -1);
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).d(preference14, -1);
        }
        appBrandAuthorizeUI.q7();
        appBrandAuthorizeUI.o7();
        com.tencent.mm.ui.base.preference.Preference preference18 = appBrandAuthorizeUI.f89310p;
        if (preference18 != null) {
            if (appBrandAuthorizeUI.f89315u.f388060f != 1) {
                preference18.G(com.tencent.mm.R.string.f490062ju);
            } else {
                preference18.G(com.tencent.mm.R.string.f490061jt);
            }
        }
        ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
        if (appBrandAuthorizeUI.W.isEmpty() && appBrandAuthorizeUI.X.isEmpty()) {
            ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).m("preference_key_voip_device_list", true);
        }
    }
}
