package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class z0 extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f90359a;

    public z0(com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI) {
        this.f90359a = new java.lang.ref.WeakReference(appBrandAuthorizeUI);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI;
        java.lang.String str;
        int i17;
        java.lang.Object obj;
        java.lang.Object obj2;
        super.handleMessage(message);
        int i18 = message.what;
        java.lang.ref.WeakReference weakReference = this.f90359a;
        if (i18 == 1) {
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI appBrandAuthorizeUI2 = (com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI) weakReference.get();
            if (appBrandAuthorizeUI2 == null) {
                return;
            }
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData = (com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData) message.obj;
            appBrandAuthorizeUI2.M = true;
            if (subscribeMsgSettingData == null) {
                com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.V6(appBrandAuthorizeUI2, appBrandAuthorizeUI2.f89301d, null, appBrandAuthorizeUI2.f89302e);
                return;
            } else {
                appBrandAuthorizeUI2.N = subscribeMsgSettingData;
                com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.V6(appBrandAuthorizeUI2, appBrandAuthorizeUI2.f89301d, subscribeMsgSettingData, appBrandAuthorizeUI2.f89302e);
                return;
            }
        }
        if (i18 == 2 && (appBrandAuthorizeUI = (com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI) weakReference.get()) != null) {
            com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult = (com.tencent.mm.msgsubscription.SubscribeMsgRequestResult) message.obj;
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.X6(appBrandAuthorizeUI);
            if (subscribeMsgRequestResult == null) {
                db5.t7.makeText(appBrandAuthorizeUI, appBrandAuthorizeUI.getString(com.tencent.mm.R.string.f490500wu), 1).show();
                return;
            }
            com.tencent.mm.msgsubscription.presenter.SubscribeMsgSettingData subscribeMsgSettingData2 = appBrandAuthorizeUI.N;
            subscribeMsgSettingData2.getClass();
            subscribeMsgSettingData2.f71834d = subscribeMsgRequestResult.f71790p;
            subscribeMsgSettingData2.f71835e = subscribeMsgRequestResult.f71789o;
            com.tencent.mm.msgsubscription.WordingInfo wordingInfo = subscribeMsgRequestResult.f71788n;
            if (wordingInfo == null || (str = wordingInfo.f71825h) == null) {
                str = "";
            }
            subscribeMsgSettingData2.f71837g = str;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList<com.tencent.mm.msgsubscription.SubscribeMsgTmpItem> arrayList2 = subscribeMsgRequestResult.f71785h;
            java.util.Iterator it = arrayList2.iterator();
            while (true) {
                i17 = 0;
                if (!it.hasNext()) {
                    break;
                }
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) it.next();
                android.os.Parcel obtain = android.os.Parcel.obtain();
                kotlin.jvm.internal.o.f(obtain, "obtain(...)");
                subscribeMsgTmpItem.writeToParcel(obtain, 0);
                obtain.setDataPosition(0);
                arrayList.add(new com.tencent.mm.msgsubscription.SubscribeMsgTmpItem(obtain));
                obtain.recycle();
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            arrayList3.addAll(subscribeMsgSettingData2.f71836f);
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                int i19 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem2 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) next;
                java.util.Iterator it7 = arrayList3.iterator();
                while (true) {
                    if (it7.hasNext()) {
                        obj2 = it7.next();
                        if (android.text.TextUtils.equals(((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj2).f71803f, subscribeMsgTmpItem2.f71803f)) {
                            break;
                        }
                    } else {
                        obj2 = null;
                        break;
                    }
                }
                com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem3 = (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj2;
                if (subscribeMsgTmpItem3 != null) {
                    arrayList3.set(arrayList3.indexOf(subscribeMsgTmpItem3), subscribeMsgTmpItem2);
                }
                i17 = i19;
            }
            subscribeMsgSettingData2.f71836f = arrayList3;
            for (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem subscribeMsgTmpItem4 : arrayList2) {
                com.tencent.mm.msgsubscription.SubscribeMsgRequestResult subscribeMsgRequestResult2 = subscribeMsgSettingData2.f71838h;
                java.util.Iterator it8 = subscribeMsgRequestResult2.f71785h.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        obj = it8.next();
                        if (android.text.TextUtils.equals(subscribeMsgTmpItem4.f71803f, ((com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj).f71803f)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                java.util.ArrayList arrayList4 = subscribeMsgRequestResult2.f71785h;
                arrayList4.set(kz5.n0.c0(arrayList4, (com.tencent.mm.msgsubscription.SubscribeMsgTmpItem) obj), subscribeMsgTmpItem4);
            }
            if (appBrandAuthorizeUI.N.f71834d) {
                com.tencent.mm.ui.base.preference.Preference h17 = ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).h("preference_key_subscribe_msg");
                if (h17 != null) {
                    h17.H(appBrandAuthorizeUI.N.f71835e ? "" : appBrandAuthorizeUI.getContext().getString(com.tencent.mm.R.string.a58));
                    ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
                }
            } else {
                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).w("preference_key_subscribe_msg");
                ((com.tencent.mm.ui.base.preference.h0) appBrandAuthorizeUI.f89308n).notifyDataSetChanged();
            }
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.d7(appBrandAuthorizeUI.f89303f, appBrandAuthorizeUI.f89301d);
            com.tencent.mm.plugin.appbrand.ui.AppBrandAuthorizeUI.c7(appBrandAuthorizeUI.f89303f, appBrandAuthorizeUI.f89301d);
            com.tencent.mm.autogen.events.UpdateWxaOptionsEvent updateWxaOptionsEvent = new com.tencent.mm.autogen.events.UpdateWxaOptionsEvent();
            java.lang.String str2 = appBrandAuthorizeUI.f89305h;
            am.g00 g00Var = updateWxaOptionsEvent.f54927g;
            g00Var.f6724a = str2;
            g00Var.f6725b = appBrandAuthorizeUI.N.f71835e ? 2 : 1;
            g00Var.f6726c = 1;
            updateWxaOptionsEvent.e();
        }
    }
}
