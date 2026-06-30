package xh3;

/* loaded from: classes12.dex */
public final class g implements sx.z {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xh3.h f536111d;

    public g(xh3.h hVar) {
        this.f536111d = hVar;
    }

    @Override // sx.z
    public int a(java.lang.String str, dn.g gVar, dn.h hVar) {
        java.util.List c17 = this.f536111d.c(str);
        xh3.h hVar2 = this.f536111d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("progressFinishLength:");
        sb6.append(gVar != null ? gVar.f69496x83ec3dd : -123456L);
        sb6.append(" sceneResultRet:");
        sb6.append(hVar != null ? hVar.f69553xb5f54fe9 : -123456);
        if (!xh3.h.a(hVar2, str, c17, "callback", "downloader", sb6.toString())) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            if (gVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "callback by downloader onProgress progressFinishLength:" + gVar.f69496x83ec3dd + ' ' + dVar + ' ');
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                dVar.f(str, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59);
            }
            if (hVar != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "callback by downloader onFinish sceneResultRet:" + hVar.f69553xb5f54fe9 + ' ' + dVar);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                dVar.g(str, hVar.f69553xb5f54fe9, hVar);
            }
        }
        return 1;
    }

    @Override // sx.z
    public int b(java.lang.String str, int i17, int i18) {
        return 0;
    }

    @Override // sx.z
    public int c(java.lang.String str, int i17, int i18) {
        java.util.List c17 = this.f536111d.c(str);
        if (!xh3.h.a(this.f536111d, str, c17, "onDataAvailable", "downloader", "offset:" + i17 + " length:" + i18)) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "onDataAvailable by downloader offset:" + i17 + " length:" + i18 + " task" + dVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            dVar.mo65706x9bb59ea0(str, (long) i17, (long) i18);
        }
        return 1;
    }

    @Override // sx.z
    public int d(java.lang.String str, int i17, int i18, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.VideoInfo videoInfo) {
        java.lang.String str2 = videoInfo != null ? videoInfo.f18114x9330627b : null;
        if (str2 == null) {
            str2 = "";
        }
        java.util.List c17 = this.f536111d.c(str);
        if (!xh3.h.a(this.f536111d, str, c17, "onMoovReady", "downloader", "offset:" + i17 + " length:" + i18 + " svrflag:" + str2)) {
            return 0;
        }
        java.util.ArrayList<yh3.d> arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : c17) {
            if (obj instanceof yh3.d) {
                arrayList.add(obj);
            }
        }
        for (yh3.d dVar : arrayList) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMMarsTaskDistributor", "onMoovReady by downloader onMoovReady mediaId:" + str + " offset:" + i17 + " length:" + i18 + " task:" + dVar);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            dVar.mo65708xe7d268fb(str, (long) i17, (long) i18, videoInfo);
        }
        return 1;
    }

    @Override // sx.z
    /* renamed from: onM3U8Ready */
    public int mo48095xc5dd699b(java.lang.String str, java.lang.String str2) {
        return 0;
    }
}
