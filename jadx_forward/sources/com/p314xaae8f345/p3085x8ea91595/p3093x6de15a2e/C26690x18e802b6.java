package com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e;

/* renamed from: com.tencent.tmassistantsdk.network.GetAuthorizedHttpRequest */
/* loaded from: classes13.dex */
public class C26690x18e802b6 extends com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26691x125a6bd1 {
    protected static final java.lang.String TAG = "GetAuthorizedHttpRequest";

    /* renamed from: mGetAuthorizedListener */
    protected com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935 f56256xb97c7af8 = null;

    /* renamed from: authorizedInfoToString */
    private java.lang.String m104997x67e74675(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0) {
        return ((((((((((("?appId=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56390x58b7f1c)) + "&userId=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56396xce2b2e46)) + "&userIdType=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56397x4ce69ea0)) + "&identityInfo=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56394xf8c8ba8c)) + "&identityType=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56395xf8cde518)) + "&gamePackageName=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56392xecc5609f)) + "&gameVersionCode=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56393xdfa5e393)) + "&gameChannelId=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56391x75f375ac)) + "&actionFlag=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56388x6e5ae6c2)) + "&verifyType=" + java.net.URLEncoder.encode(c26712xd27f11a0.f56398xc26da753)) + "&via=" + java.net.URLEncoder.encode(c26712xd27f11a0.via)) + "&actionType=" + c26712xd27f11a0.f56389x6e617690;
    }

    /* renamed from: jsonObjectToRespData */
    private com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 m104998xa4eb3cdc(org.json.JSONObject jSONObject) {
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426 c26718x8de73426;
        com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 c26717x4b1e0db8 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8();
        c26717x4b1e0db8.f56475x1736dfe3 = jSONObject.getInt("hasAuthoried");
        c26717x4b1e0db8.f56474x139cb015 = jSONObject.getInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.C26701x53b1f632.f56295xe7a05993);
        c26717x4b1e0db8.f56473xb7cf57c7 = jSONObject.getString("downloadUrl");
        c26717x4b1e0db8.f56477x290b12e5 = jSONObject.getInt(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56321xa96d32a5);
        org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("tipsInfo");
        if (jSONObject2 == null || jSONObject2.length() <= 0) {
            c26718x8de73426 = null;
        } else {
            c26718x8de73426 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26718x8de73426();
            c26718x8de73426.f56480x6942258 = jSONObject2.getString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
            c26718x8de73426.f56479x38b73479 = jSONObject2.getString("content");
            org.json.JSONArray jSONArray = jSONObject2.getJSONArray("actionButton");
            java.util.ArrayList<com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528> arrayList = new java.util.ArrayList<>();
            if (jSONArray != null && jSONArray.length() > 0) {
                for (int i17 = 0; i17 < jSONArray.length(); i17++) {
                    com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528 c26716x46bbe528 = new com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26716x46bbe528();
                    c26716x46bbe528.f56471x121d94cd = jSONArray.getJSONObject(i17).getString("textInstalled");
                    c26716x46bbe528.f56472x870fd994 = jSONArray.getJSONObject(i17).getString("textUninstalled");
                    c26716x46bbe528.f56469xf0c83088 = jSONArray.getJSONObject(i17).getInt("jumpType");
                    c26716x46bbe528.f56470xb52fc261 = jSONArray.getJSONObject(i17).getString("jumpUrl");
                    arrayList.add(c26716x46bbe528);
                }
            }
            c26718x8de73426.f56478x3cf09108 = arrayList;
        }
        c26717x4b1e0db8.f56476x8a0cd006 = c26718x8de73426;
        com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "dataInfo :" + c26717x4b1e0db8.toString());
        return c26717x4b1e0db8;
    }

    @Override // com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.AbstractC26691x125a6bd1
    /* renamed from: onFinished */
    public void mo104999x7cf2e371(org.json.JSONObject jSONObject, int i17) {
        com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935 interfaceC26693x480da935 = this.f56256xb97c7af8;
        if (interfaceC26693x480da935 == null) {
            com.p314xaae8f345.p3085x8ea91595.p3105x36f002.C26781x4c3e20b.i(TAG, "mGetAuthorizedListener is null !");
            return;
        }
        try {
            if (i17 != 0 || jSONObject == null) {
                interfaceC26693x480da935.mo105006x15efdbcf(null, i17);
            } else {
                com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.p3098x2eefaa.C26717x4b1e0db8 m104998xa4eb3cdc = m104998xa4eb3cdc(jSONObject);
                if (m104998xa4eb3cdc != null) {
                    this.f56256xb97c7af8.mo105006x15efdbcf(m104998xa4eb3cdc, 0);
                }
            }
        } catch (org.json.JSONException e17) {
            this.f56256xb97c7af8.mo105006x15efdbcf(null, 704);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    /* renamed from: sendRequest */
    public void m105000x319ab1e7(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3096x95811758.C26712xd27f11a0 c26712xd27f11a0) {
        if (c26712xd27f11a0 != null) {
            super.m105003x4a532f52(m104997x67e74675(c26712xd27f11a0));
        }
    }

    /* renamed from: setListenner */
    public void m105001x131d2432(com.p314xaae8f345.p3085x8ea91595.p3093x6de15a2e.InterfaceC26693x480da935 interfaceC26693x480da935) {
        this.f56256xb97c7af8 = interfaceC26693x480da935;
    }
}
