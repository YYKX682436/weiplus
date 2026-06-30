package nk;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public static final nk.c f419473a = new nk.c();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f419474b = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L();

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.HashSet f419476d = new java.util.HashSet();

    /* renamed from: c, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24 f419475c = new com.p314xaae8f345.mm.p621xcc7b5c73.C4984xbc204a24(new java.util.HashSet());

    public final void a(java.lang.String taskID, com.p314xaae8f345.p542x3306d5.cdn.C4446x11b6e6e0.C2CDownloadResult result, int i17) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(taskID, "taskID");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        java.util.Iterator it = f419475c.f134721d.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e) obj).f134723e, taskID)) {
                    break;
                }
            }
        }
        com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e c4985x6dc3c08e = (com.p314xaae8f345.mm.p621xcc7b5c73.C4985x6dc3c08e) obj;
        if (c4985x6dc3c08e == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long j17 = c4985x6dc3c08e.f134722d;
        sb6.append(j17);
        sb6.append('-');
        java.lang.String str = c4985x6dc3c08e.f134723e;
        sb6.append(str);
        java.lang.String sb7 = sb6.toString();
        java.util.HashSet hashSet = f419476d;
        if (hashSet.contains(sb7)) {
            return;
        }
        hashSet.add(sb7);
        long j18 = result.f17873xd4282b9d;
        c4985x6dc3c08e.f134727i = j18;
        c4985x6dc3c08e.f134729n = 0L;
        if (j18 > 0) {
            long j19 = c4985x6dc3c08e.f134728m;
            if (j19 > j18) {
                c4985x6dc3c08e.f134729n = result.f17900x7467a666;
            } else {
                long j27 = result.f17900x7467a666;
                if (j19 + j27 > j18) {
                    c4985x6dc3c08e.f134729n = (j19 + j27) - j18;
                }
            }
        }
        c4985x6dc3c08e.f134728m += result.f17900x7467a666;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.DownloadAnalyse", "stopDownload type:" + i17 + " receive:" + result.f17900x7467a666 + " target:" + c4985x6dc3c08e);
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6830x434d7d18 c6830x434d7d18 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6830x434d7d18();
        c6830x434d7d18.f141518d = j17;
        c6830x434d7d18.f141519e = c6830x434d7d18.b("taskID", str, true);
        c6830x434d7d18.f141520f = c6830x434d7d18.b("mediaID", c4985x6dc3c08e.f134725g, true);
        c6830x434d7d18.f141523i = c6830x434d7d18.b("snsID", c4985x6dc3c08e.f134724f, true);
        c6830x434d7d18.f141525k = c6830x434d7d18.b("downloadFlag", c4985x6dc3c08e.f134726h, true);
        c6830x434d7d18.f141524j = (int) result.f17900x7467a666;
        c6830x434d7d18.f141521g = c4985x6dc3c08e.f134729n;
        c6830x434d7d18.f141526l = i17;
        c6830x434d7d18.f141527m = c4985x6dc3c08e.f134732q;
        c6830x434d7d18.f141528n = c6830x434d7d18.b("url", c4985x6dc3c08e.f134733r, true);
        c6830x434d7d18.k();
    }
}
