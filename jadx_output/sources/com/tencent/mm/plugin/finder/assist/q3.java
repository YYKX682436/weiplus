package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes5.dex */
public final class q3 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public long f102478a;

    /* renamed from: b, reason: collision with root package name */
    public int f102479b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.assist.r3 f102480c;

    public q3(com.tencent.mm.plugin.finder.assist.r3 r3Var) {
        this.f102480c = r3Var;
    }

    @Override // com.tencent.mm.plugin.lite.r
    public boolean onDispatch(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        android.app.Activity activity;
        boolean z17;
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo;
        com.tencent.mars.xlog.Log.i("FinderLiteAppStoreUtils", "onDispatch: actionName=" + str + ", json=" + obj + ", instanceId=" + j17 + ", callbackId=" + i17);
        if (str == null) {
            return true;
        }
        switch (str.hashCode()) {
            case -427176635:
                if (!str.equals("tingFinderProfileEvent")) {
                    return true;
                }
                com.tencent.mm.plugin.finder.assist.r3 r3Var = this.f102480c;
                r3Var.getClass();
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                org.json.JSONObject jSONObject = (org.json.JSONObject) obj;
                java.lang.String optString = jSONObject.optString("type");
                java.lang.String optString2 = jSONObject.optString("listType");
                if (kotlin.jvm.internal.o.b(optString, "refreshList")) {
                    com.tencent.mm.autogen.events.TingFinderProfileEvent tingFinderProfileEvent = new com.tencent.mm.autogen.events.TingFinderProfileEvent();
                    am.az azVar = tingFinderProfileEvent.f54895g;
                    azVar.f6197a = optString;
                    azVar.f6198b = optString2;
                    tingFinderProfileEvent.e();
                    com.tencent.mm.plugin.lite.s sVar = r3Var.f102503a;
                    if (sVar == null) {
                        return true;
                    }
                    sVar.c(j17, i17, new org.json.JSONObject().toString());
                    return true;
                }
                com.tencent.mm.plugin.lite.s sVar2 = r3Var.f102503a;
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
                com.tencent.mm.plugin.finder.assist.n5 n5Var = com.tencent.mm.plugin.finder.assist.n5.f102402a;
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                java.lang.ref.WeakReference k17 = com.tencent.mm.app.w.k();
                if ((k17 != null ? (android.app.Activity) k17.get() : null) == null) {
                    k17 = com.tencent.mm.app.w.INSTANCE.j();
                }
                if (k17 == null || (activity = (android.app.Activity) k17.get()) == null) {
                    return true;
                }
                try {
                    int optInt = ((org.json.JSONObject) obj).optInt("type");
                    java.lang.String optString3 = ((org.json.JSONObject) obj).optString("exportId");
                    java.lang.String optString4 = ((org.json.JSONObject) obj).optString("nonceId");
                    java.lang.String optString5 = ((org.json.JSONObject) obj).optString(dm.i4.COL_USERNAME);
                    int optInt2 = ((org.json.JSONObject) obj).optInt("mediaType");
                    long optLong = ((org.json.JSONObject) obj).optLong("feedId");
                    com.tencent.mars.xlog.Log.i("Finder.FinderOriginalUtil", "[finderOriginalStateDeclareAction] type:" + optInt + " mediaType:" + optInt2 + " exportId:" + optString3 + " nonceId:" + optString4 + " username:" + optString5);
                    kotlin.jvm.internal.o.d(optString3);
                    qd2.g1 g1Var = new qd2.g1(activity, optInt2, optLong, optString3, optInt == 1, 2);
                    g1Var.f361764r = new com.tencent.mm.plugin.finder.assist.l5(g1Var, optString3, optString4, activity, optInt);
                    g1Var.e(true, false);
                    return true;
                } catch (org.json.JSONException e17) {
                    com.tencent.mars.xlog.Log.e("Finder.FinderOriginalUtil", java.lang.String.valueOf(e17.getMessage()));
                    return true;
                }
            case -153910363:
                if (!str.equals("selectMusicFile")) {
                    return true;
                }
                this.f102478a = j17;
                this.f102479b = i17;
                this.f102480c.getClass();
                if (!(obj instanceof org.json.JSONObject)) {
                    return true;
                }
                try {
                    java.lang.String optString6 = ((org.json.JSONObject) obj).optString("picker_list");
                    int optInt3 = ((org.json.JSONObject) obj).optInt("min_audio_duration", 30);
                    int optInt4 = ((org.json.JSONObject) obj).optInt("max_audio_duration", Integer.MAX_VALUE);
                    int optInt5 = ((org.json.JSONObject) obj).optInt("max_file_size", 1073741824);
                    java.lang.String optString7 = ((org.json.JSONObject) obj).optString("max_file_size_wording", "");
                    com.tencent.mars.xlog.Log.i("FinderLiteAppStoreUtils", "selectMusicFile: pickerName=" + optString6 + ", minAudioDuration=" + optInt3 + ", maxAudioDuration=" + optInt4 + ", maxFileSize=" + optInt5 + ", maxFileSizeWording=" + optString7);
                    android.content.Intent intent = new android.content.Intent();
                    intent.putExtra("MINI_DURATION", optInt3);
                    intent.putExtra("MAX_DURATION", optInt4);
                    intent.putExtra("MAX_FILE_SIZE", optInt5);
                    intent.putExtra("MAX_FILE_SIZE_WORDING", optString7);
                    if (optString6 != null) {
                        int hashCode = optString6.hashCode();
                        com.tencent.mm.plugin.finder.assist.v1 v1Var = com.tencent.mm.plugin.finder.assist.v1.f102611a;
                        if (hashCode != 3052376) {
                            if (hashCode != 3138974) {
                                if (hashCode == 3143036 && optString6.equals("file")) {
                                    intent.putExtra("PICKER_TYPE", 0);
                                    ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).dl(v1Var.b(), intent);
                                }
                            } else if (optString6.equals("feed")) {
                                intent.putExtra("BIZ_SCENE", 6);
                                java.util.ArrayList<java.lang.Integer> arrayList = new java.util.ArrayList<>();
                                arrayList.add(5);
                                intent.putIntegerArrayListExtra("TAB_LIST", arrayList);
                                intent.putExtra("TITLE", com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.eqt));
                                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class);
                                kotlin.jvm.internal.o.f(c17, "getService(...)");
                                ((com.tencent.mm.plugin.finder.assist.i0) c17).yj(v1Var.b(), intent, 0);
                            }
                        } else if (optString6.equals("chat")) {
                            java.lang.String optString8 = ((org.json.JSONObject) obj).optString("type");
                            java.lang.String optString9 = ((org.json.JSONObject) obj).optString("extension");
                            intent.putExtra("PICKER_FILE_TYPE", optString8);
                            intent.putExtra("PICKER_FILE_EXTENSION", optString9);
                            intent.putExtra("PICKER_TYPE", 1);
                            ((com.tencent.mm.plugin.finder.assist.i0) i95.n0.c(com.tencent.mm.plugin.finder.assist.i0.class)).dl(v1Var.b(), intent);
                        }
                    }
                    return true;
                } catch (org.json.JSONException e18) {
                    com.tencent.mars.xlog.Log.e("FinderLiteAppStoreUtils", java.lang.String.valueOf(e18.getMessage()));
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
        com.tencent.mm.plugin.lite.s sVar3 = this.f102480c.f102503a;
        long j18 = sVar3 != null ? sVar3.f144166c : 0L;
        i95.m c18 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        com.tencent.mm.plugin.finder.assist.p3 p3Var = new com.tencent.mm.plugin.finder.assist.p3(j18, j17, i17);
        eu0.l lVar = eu0.l.f256717a;
        com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "dispatch: actionName=".concat(str));
        int hashCode2 = str.hashCode();
        if (hashCode2 == 492599480) {
            if (!str.equals("defaultMusicRecommend")) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "handleDefaultMusicRecommend: data=" + obj);
            org.json.JSONObject jSONObject3 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            eu0.g gVar = new eu0.g(p3Var);
            java.util.Objects.toString(jSONObject3);
            oz5.i a17 = kotlinx.coroutines.t3.a(null, 1, null);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            kotlinx.coroutines.y0 a18 = kotlinx.coroutines.z0.a(((kotlinx.coroutines.c3) a17).plus(kotlinx.coroutines.internal.b0.f310484a));
            kotlinx.coroutines.l.d(a18, null, null, new fu0.c(jSONObject3, gVar, new im5.c(), a18, null), 3, null);
            return true;
        }
        if (hashCode2 == 748948366) {
            if (!str.equals("finderMJComposingCreationCamPreviewOpen")) {
                return true;
            }
            com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "handleCamPreviewOpen: data=" + obj);
            org.json.JSONObject jSONObject4 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
            if (jSONObject4 == null) {
                org.json.JSONObject jSONObject5 = new org.json.JSONObject();
                jSONObject5.put("errCode", -1);
                jSONObject5.put("errMsg", "params is null");
                java.lang.String jSONObject6 = jSONObject5.toString();
                kotlin.jvm.internal.o.f(jSONObject6, "toString(...)");
                p3Var.invoke(jSONObject6);
                return true;
            }
            eu0.b a19 = eu0.b.f256694o.a(jSONObject4);
            if (a19 == null) {
                org.json.JSONObject jSONObject7 = new org.json.JSONObject();
                jSONObject7.put("errCode", -1);
                jSONObject7.put("errMsg", "Failed to parse CamParams");
                java.lang.String jSONObject8 = jSONObject7.toString();
                kotlin.jvm.internal.o.f(jSONObject8, "toString(...)");
                p3Var.invoke(jSONObject8);
                return true;
            }
            gu0.k2 k2Var = new gu0.k2(a19, new eu0.e(), new eu0.f(p3Var));
            com.tencent.mars.xlog.Log.i("MJCC.SessionMgr", "setSession: " + k2Var);
            gu0.l2.f275761a = k2Var;
            if (com.tencent.matrix.lifecycle.supervisor.AppUIForegroundOwner.INSTANCE.isForeground()) {
                lVar.a();
                return true;
            }
            com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "handleCamPreviewOpen: app is in background, defer opening preview page");
            com.tencent.mm.app.s2 s2Var = eu0.l.f256718b;
            if (s2Var != null) {
                s2Var.dead();
            }
            eu0.k kVar = new eu0.k();
            kVar.alive();
            eu0.l.f256718b = kVar;
            return true;
        }
        if (hashCode2 != 1653243508 || !str.equals("finderMJComposingCreationMusicPanelOpen")) {
            return true;
        }
        com.tencent.mars.xlog.Log.i("MJCC.LiteAppStore", "handleMusicPanelOpen: data=" + obj);
        org.json.JSONObject jSONObject9 = obj instanceof org.json.JSONObject ? (org.json.JSONObject) obj : null;
        gu0.k2 k2Var2 = gu0.l2.f275761a;
        eu0.h hVar = new eu0.h(p3Var);
        eu0.i iVar = new eu0.i(k2Var2);
        eu0.j jVar = new eu0.j(k2Var2);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("start: hasParams=");
        sb6.append(jSONObject9 != null);
        com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", sb6.toString());
        java.lang.ref.WeakReference k18 = com.tencent.mm.app.w.k();
        android.app.Activity activity2 = k18 != null ? (android.app.Activity) k18.get() : null;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = activity2 instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) activity2 : null;
        if (appCompatActivity == null || appCompatActivity.isFinishing() || appCompatActivity.isDestroyed()) {
            com.tencent.mars.xlog.Log.e("MJCC.MusicPicking", "start: no valid activity");
            org.json.JSONObject jSONObject10 = new org.json.JSONObject();
            jSONObject10.put("errCode", -2);
            jSONObject10.put("errMsg", "No valid activity for music panel");
            hVar.invoke(jSONObject10);
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
            com.tencent.mars.xlog.Log.i("MJCC.MusicPicking", "start: musicId=" + optString10 + ", musicName=" + optString11 + ", isMusicOn=" + z17);
            audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.C = optString10;
            audioCacheInfo.f155711e = optString10.hashCode();
            audioCacheInfo.f155723t = optString11;
            audioCacheInfo.f155714h.add(optString12);
            audioCacheInfo.f155725v = optString13;
            audioCacheInfo.f155715i = str2;
            audioCacheInfo.f155720q = optInt6;
            audioCacheInfo.f155722s = true;
            audioCacheInfo.f155716m = true;
            audioCacheInfo.I = 10000;
        } else {
            z17 = false;
            audioCacheInfo = null;
        }
        fu0.l lVar2 = new fu0.l(null);
        lVar2.f266787a = hVar;
        lVar2.f266788b = appCompatActivity;
        lVar2.f266793g = iVar;
        lVar2.f266794h = jVar;
        try {
            kotlinx.coroutines.l.d(lVar2.f266791e, null, null, new fu0.h(jSONObject9, lVar2, audioCacheInfo, z17, null), 3, null);
            return true;
        } catch (java.lang.Exception e19) {
            com.tencent.mars.xlog.Log.e("MJCC.MusicPicking", "start: exception: " + e19.getMessage());
            lVar2.c(null, false);
            return true;
        }
    }
}
