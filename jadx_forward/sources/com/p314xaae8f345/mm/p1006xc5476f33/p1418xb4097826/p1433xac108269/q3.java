package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269;

/* loaded from: classes5.dex */
public final class q3 implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public long f184011a;

    /* renamed from: b, reason: collision with root package name */
    public int f184012b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3 f184013c;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3 r3Var) {
        this.f184013c = r3Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        android.app.Activity activity;
        boolean z17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiteAppStoreUtils", "onDispatch: actionName=" + str + ", json=" + obj + ", instanceId=" + j17 + ", callbackId=" + i17);
        if (str == null) {
            return true;
        }
        switch (str.hashCode()) {
            case -427176635:
                if (!str.equals("tingFinderProfileEvent")) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.r3 r3Var = this.f184013c;
                r3Var.getClass();
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String optString = jSONObject.optString("type");
                java.lang.String optString2 = jSONObject.optString("listType");
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(optString, "refreshList")) {
                    com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6168x15d27965 c6168x15d27965 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6168x15d27965();
                    am.az azVar = c6168x15d27965.f136428g;
                    azVar.f87730a = optString;
                    azVar.f87731b = optString2;
                    c6168x15d27965.e();
                    com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = r3Var.f184036a;
                    if (sVar == null) {
                        return true;
                    }
                    sVar.c(j17, i17, new org.json.JSONObject().toString());
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar2 = r3Var.f184036a;
                if (sVar2 == null) {
                    return true;
                }
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                jSONObject2.put("errCode", -1);
                jSONObject2.put("errMsg", "type invalid. " + optString);
                sVar2.c(j17, i17, jSONObject2.toString());
                return true;
            case -251462746:
                if (!str.equals("finderOriginalStateDeclareAction")) {
                    return true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5 n5Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.n5.f183935a;
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                java.lang.ref.WeakReference k17 = com.p314xaae8f345.mm.app.w.k();
                if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
                    k17 = com.p314xaae8f345.mm.app.w.INSTANCE.j();
                }
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    return true;
                }
                try {
                    int optInt = ((org.json.JSONObject) obj).optInt("type");
                    java.lang.String optString3 = ((org.json.JSONObject) obj).optString("exportId");
                    java.lang.String optString4 = ((org.json.JSONObject) obj).optString("nonceId");
                    java.lang.String optString5 = ((org.json.JSONObject) obj).optString(dm.i4.f66875xa013b0d5);
                    int optInt2 = ((org.json.JSONObject) obj).optInt("mediaType");
                    long optLong = ((org.json.JSONObject) obj).optLong("feedId");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderOriginalUtil", "[finderOriginalStateDeclareAction] type:" + optInt + " mediaType:" + optInt2 + " exportId:" + optString3 + " nonceId:" + optString4 + " username:" + optString5);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString3);
                    qd2.g1 g1Var = new qd2.g1(activity, optInt2, optLong, optString3, optInt == 1, 2);
                    g1Var.f443297r = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.l5(g1Var, optString3, optString4, activity, optInt);
                    g1Var.e(true, false);
                    return true;
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderOriginalUtil", java.lang.String.valueOf(e17.getMessage()));
                    return true;
                }
            case -153910363:
                if (!str.equals("selectMusicFile")) {
                    return true;
                }
                this.f184011a = j17;
                this.f184012b = i17;
                this.f184013c.getClass();
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                try {
                    java.lang.String optString6 = ((org.json.JSONObject) obj).optString("picker_list");
                    int optInt3 = ((org.json.JSONObject) obj).optInt("min_audio_duration", 30);
                    int optInt4 = ((org.json.JSONObject) obj).optInt("max_audio_duration", Integer.MAX_VALUE);
                    int optInt5 = ((org.json.JSONObject) obj).optInt("max_file_size", 1073741824);
                    java.lang.String optString7 = ((org.json.JSONObject) obj).optString("max_file_size_wording", "");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiteAppStoreUtils", "selectMusicFile: pickerName=" + optString6 + ", minAudioDuration=" + optInt3 + ", maxAudioDuration=" + optInt4 + ", maxFileSize=" + optInt5 + ", maxFileSizeWording=" + optString7);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("MINI_DURATION", optInt3);
                    intent.putExtra("MAX_DURATION", optInt4);
                    intent.putExtra("MAX_FILE_SIZE", optInt5);
                    intent.putExtra("MAX_FILE_SIZE_WORDING", optString7);
                    if (optString6 != null) {
                        int hashCode = optString6.hashCode();
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1 v1Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.v1.f184144a;
                        if (hashCode != 3052376) {
                            if (hashCode != 3138974) {
                                if (hashCode == 3143036 && optString6.equals("file")) {
                                    intent.putExtra("PICKER_TYPE", 0);
                                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).dl(v1Var.b(), intent);
                                }
                            } else if (optString6.equals("feed")) {
                                intent.putExtra("BIZ_SCENE", 6);
                                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                                arrayList.add(5);
                                intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
                                intent.putExtra("TITLE", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.eqt));
                                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).yj(v1Var.b(), intent, 0);
                            }
                        } else if (optString6.equals("chat")) {
                            java.lang.String optString8 = ((org.json.JSONObject) obj).optString("type");
                            java.lang.String optString9 = ((org.json.JSONObject) obj).optString("extension");
                            intent.putExtra("PICKER_FILE_TYPE", optString8);
                            intent.putExtra("PICKER_FILE_EXTENSION", optString9);
                            intent.putExtra("PICKER_TYPE", 1);
                            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class)).dl(v1Var.b(), intent);
                        }
                    }
                    return true;
                } catch (org.json.JSONException e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderLiteAppStoreUtils", java.lang.String.valueOf(e18.getMessage()));
                    return true;
                }
            case 492599480:
                if (!str.equals("defaultMusicRecommend")) {
                    return true;
                }
                break;
            case 748948366:
                if (!str.equals("finderMJComposingCreationCamPreviewOpen")) {
                    return true;
                }
                break;
            case 1653243508:
                if (!str.equals("finderMJComposingCreationMusicPanelOpen")) {
                    return true;
                }
                break;
            default:
                return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar3 = this.f184013c.f184036a;
        long j18 = sVar3 != null ? sVar3.f225699c : 0L;
        i95.m c18 = i95.n0.c(pp0.h0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p3 p3Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.p3(j18, j17, i17);
        eu0.l lVar = eu0.l.f338250a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "dispatch: actionName=".concat(str));
        int hashCode2 = str.hashCode();
        if (hashCode2 == 492599480) {
            if (!str.equals("defaultMusicRecommend")) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "handleDefaultMusicRecommend: data=" + obj);
            org.json.JSONObject jSONObject3 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            eu0.g gVar = new eu0.g(p3Var);
            java.util.Objects.toString(jSONObject3);
            oz5.i a17 = p3325xe03a0797.p3326xc267989b.t3.a(null, 1, null);
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.y0 a18 = p3325xe03a0797.p3326xc267989b.z0.a(((p3325xe03a0797.p3326xc267989b.c3) a17).mo7096x348d9a(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a));
            p3325xe03a0797.p3326xc267989b.l.d(a18, null, null, new fu0.c(jSONObject3, gVar, new im5.c(), a18, null), 3, null);
            return true;
        }
        if (hashCode2 == 748948366) {
            if (!str.equals("finderMJComposingCreationCamPreviewOpen")) {
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "handleCamPreviewOpen: data=" + obj);
            org.json.JSONObject jSONObject4 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject4 == null) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("errCode", -1);
                jSONObject5.put("errMsg", "params is null");
                java.lang.String jSONObject6 = jSONObject5.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject6, "toString(...)");
                p3Var.mo146xb9724478(jSONObject6);
                return true;
            }
            eu0.b a19 = eu0.b.f338227o.a(jSONObject4);
            if (a19 == null) {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                jSONObject7.put("errCode", -1);
                jSONObject7.put("errMsg", "Failed to parse CamParams");
                java.lang.String jSONObject8 = jSONObject7.toString();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject8, "toString(...)");
                p3Var.mo146xb9724478(jSONObject8);
                return true;
            }
            gu0.k2 k2Var = new gu0.k2(a19, new eu0.e(), new eu0.f(p3Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.SessionMgr", "setSession: " + k2Var);
            gu0.l2.f357294a = k2Var;
            if (com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p569x9ad65368.C4683x847dbe1b.f19974x4fbc8495.mo40975xf7b3660d()) {
                lVar.a();
                return true;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "handleCamPreviewOpen: app is in background, defer opening preview page");
            com.p314xaae8f345.mm.app.s2 s2Var = eu0.l.f338251b;
            if (s2Var != null) {
                s2Var.m43072x2efc64();
            }
            eu0.k kVar = new eu0.k();
            kVar.m43071x58998cd();
            eu0.l.f338251b = kVar;
            return true;
        }
        if (hashCode2 != 1653243508 || !str.equals("finderMJComposingCreationMusicPanelOpen")) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.LiteAppStore", "handleMusicPanelOpen: data=" + obj);
        org.json.JSONObject jSONObject9 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        gu0.k2 k2Var2 = gu0.l2.f357294a;
        eu0.h hVar = new eu0.h(p3Var);
        eu0.i iVar = new eu0.i(k2Var2);
        eu0.j jVar = new eu0.j(k2Var2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: hasParams=");
        sb6.append(jSONObject9 != null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", sb6.toString());
        java.lang.ref.WeakReference k18 = com.p314xaae8f345.mm.app.w.k();
        android.app.Activity activity2 = k18 != null ? (android.app.Activity) k18.get() : null;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = activity2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) activity2 : null;
        if (activityC0065xcd7aa112 == null || activityC0065xcd7aa112.isFinishing() || activityC0065xcd7aa112.isDestroyed()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.MusicPicking", "start: no valid activity");
            org.json.JSONObject jSONObject10 = new org.json.JSONObject();
            jSONObject10.put("errCode", -2);
            jSONObject10.put("errMsg", "No valid activity for music panel");
            hVar.mo146xb9724478(jSONObject10);
            return true;
        }
        org.json.JSONObject optJSONObject = jSONObject9 != null ? jSONObject9.optJSONObject("musicInfo") : null;
        if (optJSONObject != null) {
            java.lang.String optString10 = optJSONObject.optString("musicID", "");
            if (optString10 == null) {
                optString10 = "";
            }
            java.lang.String optString11 = optJSONObject.optString("musicName", "");
            if (optString11 == null) {
                optString11 = "";
            }
            java.lang.String optString12 = optJSONObject.optString("authorName", "");
            if (optString12 == null) {
                optString12 = "";
            }
            java.lang.String optString13 = optJSONObject.optString("coverUrl", "");
            if (optString13 == null) {
                optString13 = "";
            }
            java.lang.String optString14 = optJSONObject.optString("musicFilePath", "");
            java.lang.String str2 = optString14 != null ? optString14 : "";
            int optInt6 = optJSONObject.optInt("durationInMs", 0);
            z17 = optJSONObject.optBoolean("isMusicOn", true);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.MusicPicking", "start: musicId=" + optString10 + ", musicName=" + optString11 + ", isMusicOn=" + z17);
            c16997xb0aa383a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a();
            c16997xb0aa383a.C = optString10;
            c16997xb0aa383a.f237244e = optString10.hashCode();
            c16997xb0aa383a.f237256t = optString11;
            c16997xb0aa383a.f237247h.add(optString12);
            c16997xb0aa383a.f237258v = optString13;
            c16997xb0aa383a.f237248i = str2;
            c16997xb0aa383a.f237253q = optInt6;
            c16997xb0aa383a.f237255s = true;
            c16997xb0aa383a.f237249m = true;
            c16997xb0aa383a.I = 10000;
        } else {
            z17 = false;
            c16997xb0aa383a = null;
        }
        fu0.l lVar2 = new fu0.l(null);
        lVar2.f348320a = hVar;
        lVar2.f348321b = activityC0065xcd7aa112;
        lVar2.f348326g = iVar;
        lVar2.f348327h = jVar;
        try {
            p3325xe03a0797.p3326xc267989b.l.d(lVar2.f348324e, null, null, new fu0.h(jSONObject9, lVar2, c16997xb0aa383a, z17, null), 3, null);
            return true;
        } catch (java.lang.Exception e19) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCC.MusicPicking", "start: exception: " + e19.getMessage());
            lVar2.c(null, false);
            return true;
        }
    }
}
