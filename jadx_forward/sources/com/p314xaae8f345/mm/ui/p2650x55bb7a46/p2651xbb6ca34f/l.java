package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f;

/* loaded from: classes.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.l f279967d = new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.l();

    public l() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.Set set = mb5.a.f407025b;
        java.util.HashSet hashSet = new java.util.HashSet();
        hashSet.addAll(mb5.a.f407025b);
        if (!android.text.TextUtils.isEmpty("")) {
            try {
                org.json.JSONArray optJSONArray = new org.json.JSONObject("").optJSONArray("noCompareTypes");
                if (optJSONArray != null) {
                    int length = optJSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        int optInt = optJSONArray.optInt(i17, -1);
                        if (optInt != -1) {
                            hashSet.add(java.lang.Integer.valueOf(optInt));
                        }
                    }
                }
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("ChattingViewConfig", th6, "parse err", new java.lang.Object[0]);
            }
        }
        mb5.a aVar = new mb5.a(hashSet);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingDataAdapterHelper", "viewConfig init:%s", aVar);
        return aVar;
    }
}
