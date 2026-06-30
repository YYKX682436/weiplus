package id2;

/* loaded from: classes3.dex */
public final class z2 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ id2.u3 f372431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s f372432b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f372433c;

    public z2(id2.u3 u3Var, com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar, android.content.Context context) {
        this.f372431a = u3Var;
        this.f372432b = sVar;
        this.f372433c = context;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[live_record] actionName = " + str);
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[live_record] actionName = " + str + ", data = " + obj);
            id2.u3 u3Var = this.f372431a;
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = this.f372432b;
            android.content.Context context = this.f372433c;
            if (str == null || obj == null) {
                return false;
            }
            switch (str.hashCode()) {
                case -794725022:
                    if (!str.equals("openFinderPostGallery")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.util.ArrayList arrayList = new java.util.ArrayList();
                        com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646 c10598x47b4a646 = new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.api.p745xc4aaf986.C10598x47b4a646();
                        c10598x47b4a646.f148136d = 1;
                        java.lang.String string = ((org.json.JSONObject) obj).getString("uniqId");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                        c10598x47b4a646.f148137e = string;
                        c10598x47b4a646.f148138f = ((org.json.JSONObject) obj).getString("coverImageUrl");
                        c10598x47b4a646.f148139g = ((org.json.JSONObject) obj).getString("sliceMp4Url");
                        java.lang.String string2 = ((org.json.JSONObject) obj).getString("duration");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                        c10598x47b4a646.f148140h = java.lang.Long.parseLong(string2);
                        java.lang.String string3 = ((org.json.JSONObject) obj).getString("liveId");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                        c10598x47b4a646.f148141i = string3;
                        arrayList.add(c10598x47b4a646);
                        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).getClass();
                        ((ci5.h) ((s40.x0) i95.n0.c(s40.x0.class))).wi(context, new t40.b("task_FinderCdnDownloader", 2, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.e9.f183670f, t40.d.f497009d, 106), arrayList);
                        return false;
                    }
                case 127673242:
                    if (!str.equals("openCancelReplayPage")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString = ((org.json.JSONObject) obj).optString("liveId");
                        java.lang.String optString2 = ((org.json.JSONObject) obj).optString("objectId");
                        long q07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(optString == null ? "0" : optString, 0L);
                        long q08 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(optString2 == null ? "0" : optString2, 0L);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[openCancelReplayPage] objectId:" + optString2 + " liveId:" + optString);
                        android.content.Context context2 = (android.content.Context) sVar.f225702f.get();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        id2.y2 y2Var = new id2.y2(i17, j17, sVar);
                        u3Var.getClass();
                        u3Var.f372358m = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wt(context2, new id2.v2(u3Var, context2, q07, q08, y2Var));
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "openCancelReplayPage");
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.wt wtVar = u3Var.f372358m;
                        if (wtVar == null) {
                            return false;
                        }
                        wtVar.w();
                        return false;
                    }
                case 1945792096:
                    if (str.equals("openReplaySettingSheet")) {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString3 = ((org.json.JSONObject) obj).optString("finderUserName");
                        java.lang.String optString4 = ((org.json.JSONObject) obj).optString("liveId");
                        java.lang.String optString5 = ((org.json.JSONObject) obj).optString("objectId");
                        long q09 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(optString4 == null ? "0" : optString4, 0L);
                        long q010 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(optString5 == null ? "0" : optString5, 0L);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[openReplaySettingSheet] finderUserName:" + optString3 + " liveId:" + optString4 + " objectId:" + optString5);
                        android.content.Context context3 = (android.content.Context) sVar.f225702f.get();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                        p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(u3Var.m158354x19263085()), null, null, new id2.d3(context3, q09, u3Var, q010, new id2.x2(i17, j17, sVar), null), 3, null);
                        return false;
                    }
                    break;
                case 2056802828:
                    if (!str.equals("openLiveReplayPage")) {
                        break;
                    } else {
                        if ((obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null) == null) {
                            return false;
                        }
                        java.lang.String optString6 = ((org.json.JSONObject) obj).optString("objectId");
                        long q011 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0(optString6 == null ? "0" : optString6, 0L);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[openLiveReplayPage] objectId:" + optString6);
                        cl0.g gVar = new cl0.g();
                        gVar.r("statusChanged", true);
                        gVar.o("errCode", 0);
                        java.lang.String gVar2 = gVar.toString();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar2, "toString(...)");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[openLiveReplayPage] callback jsonStr:" + gVar2 + " callbackId:" + i17 + " instanceId:" + j17);
                        sVar.c(j17, i17, gVar2);
                        android.content.Context context4 = (android.content.Context) sVar.f225702f.get();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context4, "getContext(...)");
                        id2.u3.O6(u3Var, context4, q011);
                        return false;
                    }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[live_record] invalid action");
            return false;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLivePersonalCente", "[live_record] e = " + e17.getMessage());
            return false;
        }
    }
}
