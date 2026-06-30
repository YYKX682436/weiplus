package jt3;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f383157d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jt3.h f383158e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ct0.b f383159f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f383160g;

    public g(int i17, jt3.h hVar, ct0.b bVar, int i18) {
        this.f383157d = i17;
        this.f383158e = hVar;
        this.f383159f = bVar;
        this.f383160g = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jt3.h hVar = this.f383158e;
        int i17 = this.f383157d;
        if (i17 == 0 && !hVar.f383169h) {
            hVar.f383172k = false;
            android.content.Context context = hVar.f383162a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.activity.MMRecordUI");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1984x9d4bf30f.ActivityC16984xe6e37465) context).finish();
            return;
        }
        if (hVar.f383167f.get(java.lang.Integer.valueOf(i17)) == null) {
            if (hVar.f383166e.get(i17) == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecordUIRouter", "No corresponding " + i17);
                hVar.f383172k = false;
                return;
            }
            java.lang.Object obj = hVar.f383166e.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type java.lang.Class<*>");
            java.lang.Class cls = (java.lang.Class) obj;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordUIRouter", "create BasePluginLayout :".concat(cls.getSimpleName()));
            hVar.c(i17, cls, false);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce = hVar.f383168g;
        hVar.f383168g = (com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce) hVar.f383167f.get(java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce2 = hVar.f383168g;
        if (abstractC17010x26b2d1ce2 != null) {
            abstractC17010x26b2d1ce2.r(this.f383159f);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce abstractC17010x26b2d1ce3 = hVar.f383168g;
        if (abstractC17010x26b2d1ce3 != null) {
            abstractC17010x26b2d1ce3.bringToFront();
        }
        if (abstractC17010x26b2d1ce != null) {
            abstractC17010x26b2d1ce.mo11000xb01dfb57();
        }
        if (abstractC17010x26b2d1ce != null) {
            abstractC17010x26b2d1ce.mo10989x3f5eee52();
        }
        if (i17 == 1) {
            nu3.i.f421751a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else if (i17 == 2) {
            nu3.i.f421751a.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else if (i17 == 3) {
            nu3.i iVar = nu3.i.f421751a;
            iVar.d(19);
            iVar.n("KEY_EXIT_TIME_MS_LONG", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        nu3.m mVar = nu3.m.f421762a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        java.lang.String simpleName = ((java.lang.Class) hVar.f383166e.get(this.f383160g)).getSimpleName();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoWidgetReporter", "setRouterLog >> time: " + elapsedRealtime + ", clazzName: " + simpleName);
        cl0.g gVar = new cl0.g();
        gVar.p("time", elapsedRealtime - nu3.m.f421764c);
        gVar.h("clazz", simpleName);
        nu3.m.f421765d.add(gVar.toString());
        hVar.f383172k = false;
    }
}
