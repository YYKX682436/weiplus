package i64;

/* loaded from: classes4.dex */
public class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f370646a;

    /* renamed from: b, reason: collision with root package name */
    public int f370647b = 0;

    /* renamed from: c, reason: collision with root package name */
    public int f370648c = 0;

    /* renamed from: d, reason: collision with root package name */
    public long f370649d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f370650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f370651f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f370652g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f370653h = 0;

    /* renamed from: i, reason: collision with root package name */
    public j64.b f370654i = new j64.b();

    /* renamed from: j, reason: collision with root package name */
    public final java.util.LinkedList f370655j = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public long f370656k = 0;

    /* renamed from: l, reason: collision with root package name */
    public long f370657l = 0;

    /* renamed from: m, reason: collision with root package name */
    public long f370658m;

    public c1(java.lang.String str) {
        this.f370646a = "MicroMsg.SnsAdVideoStatistic";
        this.f370646a = "MicroMsg.SnsAdVideoStatistic:" + str;
    }

    public synchronized void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f370657l;
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime() - j17;
        this.f370657l = 0L;
        j64.b bVar = this.f370654i;
        if (bVar != null) {
            bVar.f379449h += elapsedRealtime;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f370646a, "calcPauseTime, thisPauseTime=" + elapsedRealtime + ", total=" + this.f370654i.f379449h);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcPauseTime", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f370656k = android.os.SystemClock.elapsedRealtime();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onPause", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void c() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f370656k;
        if (j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
            return;
        }
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        this.f370650e += android.os.SystemClock.elapsedRealtime() - j17;
        this.f370656k = 0L;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onResume", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public synchronized java.lang.String d() {
        int elapsedRealtime;
        java.lang.String stringBuffer;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        long j17 = this.f370649d;
        if (j17 == 0) {
            elapsedRealtime = 0;
        } else {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j17);
        }
        this.f370648c = elapsedRealtime;
        java.lang.StringBuffer stringBuffer2 = new java.lang.StringBuffer();
        stringBuffer2.append("<viewinfo>");
        stringBuffer2.append("<downloadstatus>");
        stringBuffer2.append(this.f370647b);
        stringBuffer2.append("</downloadstatus>");
        stringBuffer2.append("<staytotaltime>");
        stringBuffer2.append(this.f370648c);
        stringBuffer2.append("</staytotaltime>");
        java.util.LinkedList linkedList = this.f370655j;
        stringBuffer2.append(java.lang.String.format("<playitemlist count=\"%d\">", java.lang.Integer.valueOf(linkedList.size())));
        for (int i17 = 0; i17 < linkedList.size(); i17++) {
            j64.b bVar = (j64.b) linkedList.get(i17);
            stringBuffer2.append("<playitem>");
            stringBuffer2.append(java.lang.String.format("<playcount>%d</playcount>", java.lang.Integer.valueOf(bVar.f379443b)));
            stringBuffer2.append(java.lang.String.format("<playtotaltime>%d</playtotaltime>", java.lang.Integer.valueOf(bVar.f379444c)));
            stringBuffer2.append(java.lang.String.format("<videototaltime>%d</videototaltime>", java.lang.Integer.valueOf(bVar.f379445d * 1000)));
            stringBuffer2.append(java.lang.String.format("<playmode>%d</playmode>", java.lang.Integer.valueOf(bVar.f379446e)));
            stringBuffer2.append(java.lang.String.format("<playorientation>%d</playorientation>", java.lang.Integer.valueOf(bVar.f379447f)));
            stringBuffer2.append("</playitem>");
            i64.u1.a(120, bVar.f379443b);
            i64.u1.a(19, bVar.f379444c);
        }
        stringBuffer2.append("</playitemlist>");
        stringBuffer2.append("</viewinfo>");
        stringBuffer = stringBuffer2.toString();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f370646a, "xml " + stringBuffer);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pullXml", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        return stringBuffer;
    }

    public synchronized void e(int i17) {
        int elapsedRealtime;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        j64.b bVar = this.f370654i;
        if (bVar.f379444c <= 0) {
            long j17 = bVar.f379448g;
            if (j17 == 0) {
                elapsedRealtime = 0;
            } else {
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                elapsedRealtime = (int) (android.os.SystemClock.elapsedRealtime() - j17);
            }
            bVar.f379444c = elapsedRealtime;
            a();
            java.lang.String str = this.f370646a;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("endPlay, playTotaltime=");
            sb6.append(this.f370654i.f379444c);
            sb6.append(", pauseTotalTime=");
            sb6.append(this.f370654i.f379449h);
            sb6.append(", playTime=");
            sb6.append(r0.f379444c - this.f370654i.f379449h);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            j64.b bVar2 = this.f370654i;
            int i18 = bVar2.f379444c;
            long j18 = bVar2.f379449h;
            if (i18 - j18 > 0) {
                bVar2.f379444c = (int) (i18 - j18);
            }
        }
        if (i17 != 0) {
            this.f370654i.f379445d = i17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f370646a, "pushplayitem duration " + this.f370654i.f379444c + " " + this.f370654i.f379447f);
        this.f370655j.add(this.f370654i);
        this.f370654i = new j64.b();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("pushPlayItem", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }

    public void f() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
        this.f370651f = 0;
        this.f370652g = 0;
        this.f370653h = 0;
        java.util.LinkedList linkedList = this.f370655j;
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            j64.b bVar = (j64.b) it.next();
            this.f370651f += bVar.f379442a;
            this.f370652g += bVar.f379443b;
            this.f370653h += bVar.f379444c;
        }
        j64.b bVar2 = this.f370654i;
        if (bVar2 != null && !linkedList.contains(bVar2)) {
            int i17 = this.f370651f;
            j64.b bVar3 = this.f370654i;
            this.f370651f = i17 + bVar3.f379442a;
            this.f370652g += bVar3.f379443b;
            this.f370653h += bVar3.f379444c;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("settlePlayitemsStatistics", "com.tencent.mm.plugin.sns.ad.model.SnsAdVideoStatistic");
    }
}
