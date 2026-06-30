package ds2;

/* loaded from: classes10.dex */
public final class m implements dn.l {

    /* renamed from: d, reason: collision with root package name */
    public final int f324408d;

    /* renamed from: e, reason: collision with root package name */
    public final long f324409e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f324410f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedQueue f324411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ds2.b0 f324412h;

    public m(ds2.b0 b0Var, int i17, long j17, java.util.HashMap loadingMap, java.util.concurrent.ConcurrentLinkedQueue preLoadCallbacks) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadingMap, "loadingMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(preLoadCallbacks, "preLoadCallbacks");
        this.f324412h = b0Var;
        this.f324408d = i17;
        this.f324409e = j17;
        this.f324410f = loadingMap;
        this.f324411g = preLoadCallbacks;
    }

    @Override // dn.l
    public void x(java.lang.String mediaId, dn.h hVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        ((c61.l7) i95.n0.c(c61.l7.class)).Uj().i(mediaId, hVar, "worker#complete");
        boolean z17 = hVar != null && hVar.f69553xb5f54fe9 == -21112;
        java.util.concurrent.ConcurrentLinkedQueue concurrentLinkedQueue = this.f324411g;
        if (z17) {
            java.util.Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                ((vr2.i) it.next()).a(mediaId);
            }
            return;
        }
        java.util.HashMap hashMap = this.f324410f;
        ds2.b0 b0Var = this.f324412h;
        if (hVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f324392g, "[onPreloadCompleted] sceneResult == null");
            cs2.p pVar = (cs2.p) b0Var.f("onPreloadCompleted", new ds2.k(this, mediaId));
            if (pVar != null) {
                java.util.Iterator it6 = concurrentLinkedQueue.iterator();
                while (it6.hasNext()) {
                    ((vr2.i) it6.next()).e(mediaId, "onPreloadCompleted sceneResult null error", pVar, hashMap.size(), b0Var.f324389d.size());
                }
                return;
            }
            return;
        }
        long[] jArr = new long[3];
        ((com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0) com.p314xaae8f345.p542x3306d5.C4435xa52e04fa.m37502x6f964b77(com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.class)).m37761x660d22b0(mediaId, jArr);
        long j17 = jArr[0];
        long j18 = jArr[2];
        cs2.p pVar2 = (cs2.p) b0Var.f("onPreloadCompleted", new ds2.l(this, mediaId));
        ((rx.l) ((sx.e0) i95.n0.c(sx.e0.class))).Di(mediaId);
        cu2.x xVar = cu2.x.f303982a;
        java.lang.String profile = hVar.f323311m;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(profile, "profile");
        xVar.l(mediaId, profile);
        int i17 = this.f324408d;
        long j19 = this.f324409e;
        if (j17 > 0 && j18 > 0 && pVar2 != null) {
            so2.i3 c17 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
            c17.f68968x799e9d9e = j17;
            c17.f68989x78351860 = j18;
            c17.f68988x29d3a50c = j18 <= j17 ? 3 : 2;
            int i18 = c17.f68987x74535930;
            int i19 = hVar.f69571x9373c88d;
            if (i18 != i19) {
                c17.f68987x74535930 = i19;
            }
            if (pVar2.f303628l2 == cs2.n.f303613e && c17.f68977x19959117 == 0) {
                c17.f68977x19959117 = j17;
            }
            java.lang.String str = hVar.f69570xea0afd82;
            if (str == null) {
                str = pVar2.k();
            }
            c17.f68976xe1500f8 = str;
            xVar.g(c17, "onPreloadCompleted");
            java.lang.String str2 = b0Var.f324392g;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[onPreloadCompleted] successfully! mediaId=");
            sb6.append(mediaId);
            sb6.append(" startTick=");
            sb6.append(j19);
            sb6.append(" receivedBytes=");
            sb6.append(j17);
            sb6.append(" (query[0]:");
            sb6.append(jArr[0]);
            sb6.append(" x:");
            sb6.append(hVar.f69548xe026fea1);
            sb6.append(") fileLength=");
            sb6.append(j18);
            sb6.append(" expect=");
            sb6.append(i17);
            sb6.append("% result=");
            float f17 = (((float) j17) * 100.0f) / ((float) j18);
            sb6.append((int) f17);
            sb6.append("% fileFormat=");
            sb6.append(hVar.f69570xea0afd82);
            sb6.append(" videoFormat=");
            sb6.append(hVar.f69571x9373c88d);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, sb6.toString());
            java.util.Iterator it7 = concurrentLinkedQueue.iterator();
            while (it7.hasNext()) {
                ((vr2.i) it7.next()).d(mediaId, j18 == j17, a06.d.b(f17), pVar2, j17, hashMap.size(), b0Var.f324389d.size());
            }
            vr2.h.a(hVar, pVar2);
            pm0.v.X(new ds2.j(mediaId));
            return;
        }
        if (j17 <= 0 || j18 <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f324392g, "[onPreloadCompleted] ERROR! mediaId=" + mediaId + " startTick=" + j19 + " recvedBytes=" + j17 + " fileLength=" + j18 + " fileFormat=" + hVar.f69570xea0afd82 + " videoFormat=" + hVar.f69571x9373c88d);
            if (pVar2 != null) {
                java.util.Iterator it8 = concurrentLinkedQueue.iterator();
                while (it8.hasNext()) {
                    ((vr2.i) it8.next()).e(mediaId, "onPreloadCompleted error", pVar2, hashMap.size(), b0Var.f324389d.size());
                }
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f324392g, "[onPreloadCompleted] canceled! mediaId=" + mediaId + " startTick=" + j19 + " receivedBytes=" + j17 + " (query[0]:" + jArr[0] + " x:" + hVar.f69548xe026fea1 + ") fileLength=" + j18 + " expect=" + i17 + "% result=" + ((int) ((((float) j17) * 100.0f) / ((float) j18))) + "% fileFormat=" + hVar.f69570xea0afd82 + " videoFormat=" + hVar.f69571x9373c88d);
        so2.i3 c18 = cu2.x.c(xVar, mediaId, false, false, false, 14, null);
        c18.f68968x799e9d9e = j17;
        c18.f68989x78351860 = j18;
        xVar.g(c18, "onPreloadCompleted#cancel");
    }
}
