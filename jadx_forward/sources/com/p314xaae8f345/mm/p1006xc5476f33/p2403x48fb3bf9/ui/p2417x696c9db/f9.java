package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class f9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f265710d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f265711e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 f265712f;

    public f9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var, int i17, android.os.Bundle bundle) {
        this.f265712f = u7Var;
        this.f265710d = i17;
        this.f265711e = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var = this.f265712f;
        if (u7Var.f268462e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f268462e;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing() || ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f == null) {
                return;
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setMenuItemsVisible, actionCode = ");
            int i17 = this.f265710d;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", sb6.toString());
            java.util.HashSet hashSet = new java.util.HashSet();
            java.lang.String mo120156xb5887639 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265348f.mo120156xb5887639();
            if (i17 == 3003 || i17 == 3004) {
                hashSet.add("menuItem:share:brand");
                hashSet.add("menuItem:share:appMessage");
                hashSet.add("menuItem:share:dataMessage");
                hashSet.add("menuItem:share:timeline");
                hashSet.add("menuItem:favorite");
                hashSet.add("menuItem:profile");
                hashSet.add("menuItem:addContact");
                hashSet.add("menuItem:copyUrl");
                hashSet.add("menuItem:openWithSafari");
                hashSet.add("menuItem:share:email");
                hashSet.add("menuItem:delete");
                hashSet.add("menuItem:editTag");
                hashSet.add("menuItem:readMode");
                hashSet.add("menuItem:originPage");
                hashSet.add("menuItem:share:qq");
                hashSet.add("menuItem:share:weiboApp");
                hashSet.add("menuItem:share:QZone");
                hashSet.add("menuItem:share:facebook");
                hashSet.add("menuItem:share:enterprise");
                hashSet.add("menuItem:share:wework");
                hashSet.add("menuItem:share:wework_LOCAL");
                hashSet.add("menuItem:share:weread");
                hashSet.add("menuItem:addShortcut");
                hashSet.add("menuItem:haoKan");
                hashSet.add("menuItem:cancelHaoKan");
                hashSet.add("menuItem:recentRead");
                hashSet.add("menuItem:underline");
            } else {
                android.os.Bundle bundle = this.f265711e;
                if (bundle == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible data is null.");
                    return;
                }
                java.util.ArrayList<java.lang.String> stringArrayList = bundle.getStringArrayList("menu_item_list");
                if (stringArrayList == null || stringArrayList.size() == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WebViewStubCallbackAIDLStub", "setMenuItemsVisible menuItems is null or nil.");
                    return;
                }
                hashSet.addAll(stringArrayList);
                hashSet.remove("menuItem:exposeArticle");
                hashSet.remove("menuItem:keepTop");
                hashSet.remove("menuItem:cancelKeepTop");
                if (i17 != 3001) {
                    hashSet.remove("menuItem:profile");
                }
                hashSet.remove("menuItem:addContact");
                if (!((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).p(mo120156xb5887639)) {
                    hashSet.remove("menuItem:setFont");
                    hashSet.remove("menuItem:refresh");
                }
            }
            android.util.SparseBooleanArray sparseBooleanArray = (android.util.SparseBooleanArray) ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2.f265578b).get(mo120156xb5887639);
            switch (i17) {
                case 3001:
                case 3003:
                    if (sparseBooleanArray == null) {
                        sparseBooleanArray = new android.util.SparseBooleanArray();
                        ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2.f265578b).put(mo120156xb5887639, sparseBooleanArray);
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2.B(mo120156xb5887639, u7Var.j());
                    }
                    java.util.Iterator it = hashSet.iterator();
                    while (it.hasNext()) {
                        int j17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2.f265579c).get(it.next()), -1);
                        if (j17 >= 0) {
                            sparseBooleanArray.put(j17, true);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2;
                    if (c6Var.C()) {
                        c6Var.g0();
                        return;
                    }
                    return;
                case 3002:
                case 3004:
                    if (sparseBooleanArray != null) {
                        java.util.Iterator it6 = hashSet.iterator();
                        while (it6.hasNext()) {
                            int j18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.j1((java.lang.Integer) ((java.util.HashMap) ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2.f265579c).get(it6.next()), -1);
                            if (j18 >= 0) {
                                sparseBooleanArray.delete(j18);
                            }
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).f265382q2;
                        if (c6Var2.C()) {
                            c6Var2.g0();
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
}
