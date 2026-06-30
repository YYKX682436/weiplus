package yi4;

/* loaded from: classes11.dex */
public final class l implements com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3 {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f544152a;

    /* renamed from: b, reason: collision with root package name */
    public yi4.i f544153b;

    /* renamed from: c, reason: collision with root package name */
    public xj4.b f544154c;

    public final void a(android.app.Activity activity) {
        if (activity == null) {
            b("activity detached");
            c();
        }
        this.f544152a = activity != null ? new java.lang.ref.WeakReference(activity) : null;
    }

    public final void b(java.lang.String str) {
        yi4.i iVar = this.f544153b;
        if (iVar == null) {
            return;
        }
        this.f544153b = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "cancelPending: reason=" + str);
        try {
            iVar.f544148b.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusPublishPoiApiImpl", "cancelPending: callback throw, err=" + th6.getMessage());
        }
    }

    public final void c() {
        java.lang.ref.WeakReference weakReference = this.f544152a;
        android.app.Activity activity = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 ? (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834) activity : null;
        xj4.b bVar = this.f544154c;
        if (bVar != null && activityC18678x2dd96834 != null) {
            activityC18678x2dd96834.C.remove(bVar);
        }
        this.f544154c = null;
    }

    public final void d(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834, byte[] bArr, yz5.l lVar) {
        java.lang.Object m143895xf1229813;
        android.content.Intent intent = new android.content.Intent();
        if (bArr != null) {
            try {
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                r45.c64 c64Var = new r45.c64();
                c64Var.mo11468x92b714fd(bArr);
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c64Var);
            } catch (java.lang.Throwable th6) {
                p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
            }
            if (p3321xbce91901.C29043x91b2b43d.m143903xa8fbbff4(m143895xf1229813)) {
                r45.c64 c64Var2 = (r45.c64) m143895xf1229813;
                java.lang.String str = c64Var2.f452843d;
                if (!(str == null || str.length() == 0)) {
                    intent.putExtra("get_poi_classify_id", c64Var2.f452843d);
                }
                intent.putExtra("get_lat", (float) c64Var2.f452862z);
                intent.putExtra("get_lng", (float) c64Var2.f452861y);
            }
            java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
            if (m143898xd4a2fc34 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "launchCheckInLifeUI: parse current LbsLife failed, err=" + m143898xd4a2fc34.getMessage());
            }
            p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(m143895xf1229813);
        }
        intent.putExtra("show_distance", true);
        intent.putExtra("near_life_scene", 1);
        yi4.k kVar = new yi4.k(this, lVar);
        activityC18678x2dd96834.getClass();
        java.util.concurrent.atomic.AtomicInteger atomicInteger = com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834.E;
        int incrementAndGet = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834.E.incrementAndGet() & 65535) + com.p314xaae8f345.mm.R.C30854x2dc211.f559246a;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(incrementAndGet);
        java.util.HashMap hashMap = activityC18678x2dd96834.B;
        hashMap.put(valueOf, kVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusFlutterPublishActivity", "launchPluginForResult: reqCode=" + incrementAndGet + ", plugin=nearlife, cls=com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI");
        try {
            j45.l.n(activityC18678x2dd96834, "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, incrementAndGet);
        } catch (java.lang.Throwable th7) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusFlutterPublishActivity", "launchPluginForResult: failed, err=" + th7.getMessage());
            hashMap.remove(java.lang.Integer.valueOf(incrementAndGet));
            try {
                kVar.mo149xb9724478(0, null);
            } catch (java.lang.Throwable unused) {
            }
        }
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3
    /* renamed from: jumpPoiMapPage */
    public void mo91970xc379fb2f(double d17, double d18, long j17, java.lang.String label, java.lang.String mapType, java.lang.String poiName, java.lang.String poiId, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(label, "label");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mapType, "mapType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiName, "poiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(poiId, "poiId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "jumpPoiMapPage: not implemented for status publish flow");
        p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
        callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(new java.lang.UnsupportedOperationException("jumpPoiMapPage not implemented for status")))));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v44, types: [android.app.Activity] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24827x8c9371e3
    /* renamed from: selectPoi */
    public void mo91971x99b813ae(byte[] bArr, yz5.l callback) {
        boolean z17;
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.ref.WeakReference weakReference = this.f544152a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd96834 = weakReference != null ? (android.app.Activity) weakReference.get() : null;
        if (!(activityC18678x2dd96834 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: activity not bound");
            callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
            return;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        try {
            java.lang.Object l17 = gm0.j1.u().c().l(274436, null);
            z17 = u11.c.f(l17 instanceof java.lang.String ? (java.lang.String) l17 : null);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: check EU country failed, err=" + th6.getMessage());
            z17 = false;
        }
        java.lang.String[] strArr = {"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"};
        boolean z18 = true;
        if (z17) {
            ((sb0.f) jVar).getClass();
            if (j35.u.d(activityC18678x2dd96834, "android.permission.ACCESS_FINE_LOCATION", true) && j35.u.d(activityC18678x2dd96834, "android.permission.ACCESS_COARSE_LOCATION", true)) {
                i17 = 1;
            } else {
                i17 = 1;
                z18 = false;
            }
        } else {
            i17 = 1;
            z18 = ((sb0.f) jVar).Di(activityC18678x2dd96834, strArr, 64, null, null);
        }
        if (z18) {
            d(activityC18678x2dd96834, bArr, callback);
            return;
        }
        if (z17) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_GDPR_LOCATION_PERMISSION_DESCRIBE_CONFIRM_BOOLEAN_SYNC;
            java.lang.Boolean bool = java.lang.Boolean.FALSE;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17.m(u3Var, bool), bool)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: EU user, jump GDPR page");
                try {
                    java.lang.Object[] objArr = new java.lang.Object[i17];
                    objArr[0] = com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d();
                    c71.b.c(activityC18678x2dd96834, activityC18678x2dd96834.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573932gh2, objArr), 30764, i17);
                } catch (java.lang.Throwable th7) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: jump GDPR page failed, err=" + th7.getMessage());
                }
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(null)));
                return;
            }
        }
        b("superseded by new selectPoi");
        this.f544153b = new yi4.i(bArr, callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.p2275xd2ae381c.ActivityC18678x2dd96834 activityC18678x2dd968342 = activityC18678x2dd96834;
        if (this.f544154c == null) {
            yi4.j jVar2 = new yi4.j(this);
            this.f544154c = jVar2;
            activityC18678x2dd968342.getClass();
            activityC18678x2dd968342.C.addIfAbsent(jVar2);
        }
        try {
            ((sb0.f) jVar).getClass();
            j35.u.l(activityC18678x2dd96834, strArr, 64);
        } catch (java.lang.Throwable th8) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.StatusPublishPoiApiImpl", "selectPoi: requestPermissions failed, err=" + th8.getMessage());
            b("requestPermissions failed");
            c();
        }
    }
}
