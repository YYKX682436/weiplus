package cf0;

/* loaded from: classes12.dex */
public final class w implements com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cf0.z f40859a;

    public w(cf0.z zVar) {
        this.f40859a = zVar;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int d(java.lang.String str, java.lang.String str2) {
        cf0.z zVar = this.f40859a;
        if (cf0.z.wi(zVar, zVar.f40863e)) {
            com.tencent.mars.xlog.Log.LogInstance logInstance = zVar.f40862d;
            if (logInstance == null) {
                kotlin.jvm.internal.o.o("log");
                throw null;
            }
            logInstance.d("Finder.TPPlayerMgr", str + ':' + str2, new java.lang.Object[0]);
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int e(java.lang.String str, java.lang.String str2) {
        cf0.z zVar = this.f40859a;
        if (cf0.z.wi(zVar, zVar.f40863e)) {
            com.tencent.mars.xlog.Log.LogInstance logInstance = zVar.f40862d;
            if (logInstance == null) {
                kotlin.jvm.internal.o.o("log");
                throw null;
            }
            logInstance.e("Finder.TPPlayerMgr", str + ':' + str2, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.e("Finder.TPPlayerMgr", str + ':' + str2);
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int i(java.lang.String str, java.lang.String str2) {
        cf0.z zVar = this.f40859a;
        if (cf0.z.wi(zVar, zVar.f40863e)) {
            com.tencent.mars.xlog.Log.LogInstance logInstance = zVar.f40862d;
            if (logInstance == null) {
                kotlin.jvm.internal.o.o("log");
                throw null;
            }
            logInstance.i("Finder.TPPlayerMgr", str + ':' + str2, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.TPPlayerMgr", str + ':' + str2);
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int v(java.lang.String str, java.lang.String str2) {
        cf0.z zVar = this.f40859a;
        if (cf0.z.wi(zVar, zVar.f40863e)) {
            com.tencent.mars.xlog.Log.LogInstance logInstance = zVar.f40862d;
            if (logInstance == null) {
                kotlin.jvm.internal.o.o("log");
                throw null;
            }
            logInstance.v("Finder.TPPlayerMgr", str + ':' + str2, new java.lang.Object[0]);
        }
        return 0;
    }

    @Override // com.tencent.thumbplayer.api.TPPlayerMgr.OnLogListener
    public int w(java.lang.String str, java.lang.String str2) {
        cf0.z zVar = this.f40859a;
        if (cf0.z.wi(zVar, zVar.f40863e)) {
            com.tencent.mars.xlog.Log.LogInstance logInstance = zVar.f40862d;
            if (logInstance == null) {
                kotlin.jvm.internal.o.o("log");
                throw null;
            }
            logInstance.w("Finder.TPPlayerMgr", str + ':' + str2, new java.lang.Object[0]);
        } else {
            com.tencent.mars.xlog.Log.w("Finder.TPPlayerMgr", str + ':' + str2);
        }
        return 0;
    }
}
