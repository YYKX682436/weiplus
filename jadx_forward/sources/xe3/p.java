package xe3;

@j95.b
/* loaded from: classes15.dex */
public final class p extends i95.w implements ve3.s {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f535495d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f535496e = new java.util.concurrent.ConcurrentHashMap();

    public final void Ai(int i17, ve3.o callback, yz5.l command, java.lang.String errorMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(command, "command");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errorMsg, "errorMsg");
        xe3.f fVar = (xe3.f) this.f535495d.get(java.lang.Integer.valueOf(i17));
        if (fVar != null) {
            command.mo146xb9724478(fVar);
            ve3.o.a(callback, null, 1, null);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_video_service", "id:" + i17 + " not found, " + errorMsg);
        ((xd3.c) callback).b(-1, "id:" + i17 + " not found,  " + errorMsg);
    }

    @Override // ve3.r
    public void G1(int i17, ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        Ai(i17, callback, new xe3.o(this, i17), "unregisterFinderLiveTexture failed");
    }

    @Override // ve3.r
    public boolean H1(int i17) {
        boolean z17 = !this.f535495d.containsKey(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_service", "isIdValid: " + i17 + ", result: " + z17);
        return z17;
    }

    @Override // ve3.r
    public void Id(int i17, org.json.JSONObject extraData, android.view.Surface surface, ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(surface, "surface");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        Ai(i17, callback, new xe3.i(extraData, callback, surface), "registerExternalTexture failed");
    }

    @Override // ve3.r
    public void R7(int i17, ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        Ai(i17, callback, new xe3.h(callback), "play failed");
    }

    @Override // ve3.r
    public void r4(int i17, ve3.o callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        Ai(i17, callback, new xe3.n(callback), "stopPlay failed");
    }

    public void wi(int i17, org.json.JSONObject extraData, ve3.o callback) {
        qh3.a kVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f535495d;
        if (concurrentHashMap.containsKey(java.lang.Integer.valueOf(i17))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_service", "id duplicated, registerExternalTexture failed, id: " + i17);
            ((xd3.c) callback).b(-1, "id duplicated, registerExternalTexture failed, id: " + i17);
            return;
        }
        java.lang.String optString = extraData.optString("src");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        xe3.f fVar = new xe3.f(i17, optString, false, false, null, 28, null);
        concurrentHashMap.put(java.lang.Integer.valueOf(i17), fVar);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("prepare source playId ");
        sb6.append(fVar.f535474a);
        sb6.append(" url ");
        java.lang.String str = fVar.f535475b;
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", sb6.toString());
        if (r26.i0.A(str, "http", false, 2, null)) {
            char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
            java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(str.getBytes());
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
            fVar.f535476c = b17;
            java.lang.String path = ze3.a.f553311a.a(b17, str);
            wh3.c cVar = wh3.d.f527500d;
            java.lang.String mediaId = fVar.f535476c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
            dn.o oVar = new dn.o();
            oVar.f323318d = "task_RewardADUtil";
            oVar.f69601xaca5bdda = mediaId;
            oVar.M1 = str;
            oVar.A = 60;
            oVar.B = 60;
            oVar.H1 = 1;
            oVar.Z = 11;
            oVar.f69595x6d25b0d9 = path;
            oVar.f323342y0 = wh3.d.f527501e;
            oVar.X = wh3.d.f527504h;
            oVar.f323339x0 = wh3.d.f527502f;
            oVar.T1 = "reward-ad-video";
            wh3.d dVar = new wh3.d(fVar.f535476c, str, oVar);
            ye3.a aVar = ye3.a.f542747a;
            rh3.q onePlayContext = fVar.f535479f;
            java.lang.String mediaId2 = fVar.f535476c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onePlayContext, "onePlayContext");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId2, "mediaId");
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar, ye3.b.f542748a)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "Create Memory Cache: mediaId=".concat(mediaId2));
                kVar = new ze3.b(onePlayContext, mediaId2, path);
            } else {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar, aVar)) {
                    throw new jz5.j();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "Create File DB Cache: mediaId=".concat(mediaId2));
                kVar = new ye3.k(dVar, mediaId2);
            }
            onePlayContext.d(dVar, kVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "step 1 setDataSourceImp videoFileStateCache:" + kVar);
            rh3.r rVar = fVar.f535477d;
            rVar.d(onePlayContext);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "step 2 setDataSourceImp attach videoFileStateCache:" + onePlayContext.e());
            rVar.n(dVar);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "step 3 setMediaSourceImp");
            rVar.j(new xe3.e(fVar, callback));
            rVar.mo162426x857611b5();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_item", "step 4 setDataSourceImp prepareAsync");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MB_External_surface_video_item", "url is not http protocol");
            ((xd3.c) callback).b(-1, "url is not http protocol");
        }
        java.lang.String str2 = (java.lang.String) this.f535496e.get(java.lang.Integer.valueOf(i17));
        if (str2 != null) {
            af3.b bVar = fVar.f535478e;
            bVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MB_External_surface_video_tpp_listener", "setUpReportInfo ".concat(str2));
            bVar.f86077i = str2;
        }
    }
}
