package sd4;

/* loaded from: classes15.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f488214a;

    /* renamed from: b, reason: collision with root package name */
    public int f488215b;

    /* renamed from: c, reason: collision with root package name */
    public long f488216c;

    /* renamed from: d, reason: collision with root package name */
    public long f488217d;

    /* renamed from: e, reason: collision with root package name */
    public int f488218e;

    /* renamed from: f, reason: collision with root package name */
    public long f488219f;

    /* renamed from: g, reason: collision with root package name */
    public int f488220g;

    /* renamed from: h, reason: collision with root package name */
    public int f488221h;

    public a(long j17, int i17, long j18, long j19, int i18, long j27, int i19, int i27, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        long j28 = (i28 & 1) != 0 ? 0L : j17;
        int i29 = (i28 & 2) != 0 ? 0 : i17;
        long j29 = (i28 & 4) != 0 ? 0L : j18;
        long j37 = (i28 & 8) != 0 ? 0L : j19;
        int i37 = (i28 & 16) != 0 ? 0 : i18;
        long j38 = (i28 & 32) == 0 ? j27 : 0L;
        int i38 = (i28 & 64) != 0 ? 0 : i19;
        int i39 = (i28 & 128) == 0 ? i27 : 0;
        this.f488214a = j28;
        this.f488215b = i29;
        this.f488216c = j29;
        this.f488217d = j37;
        this.f488218e = i37;
        this.f488219f = j38;
        this.f488220g = i38;
        this.f488221h = i39;
    }

    /* renamed from: equals */
    public boolean m164320xb2c87fbf(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        if (this == obj) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return true;
        }
        if (!(obj instanceof sd4.a)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        sd4.a aVar = (sd4.a) obj;
        if (this.f488214a != aVar.f488214a) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488215b != aVar.f488215b) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488216c != aVar.f488216c) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488217d != aVar.f488217d) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488218e != aVar.f488218e) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488219f != aVar.f488219f) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        if (this.f488220g != aVar.f488220g) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
            return false;
        }
        int i17 = this.f488221h;
        int i18 = aVar.f488221h;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("equals", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        return i17 == i18;
    }

    /* renamed from: hashCode */
    public int m164321x8cdac1b() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        int hashCode = (((((((((((((java.lang.Long.hashCode(this.f488214a) * 31) + java.lang.Integer.hashCode(this.f488215b)) * 31) + java.lang.Long.hashCode(this.f488216c)) * 31) + java.lang.Long.hashCode(this.f488217d)) * 31) + java.lang.Integer.hashCode(this.f488218e)) * 31) + java.lang.Long.hashCode(this.f488219f)) * 31) + java.lang.Integer.hashCode(this.f488220g)) * 31) + java.lang.Integer.hashCode(this.f488221h);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hashCode", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        return hashCode;
    }

    /* renamed from: toString */
    public java.lang.String m164322x9616526c() {
        java.lang.String str;
        long j17;
        long j18;
        long j19;
        long j27;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("toString", "com.tencent.mm.plugin.sns.ui.monitor.JankModel");
        long j28 = this.f488214a;
        long j29 = this.f488216c;
        long j37 = j28 - j29;
        int i17 = this.f488218e;
        int i18 = i17 - this.f488220g;
        long j38 = this.f488219f;
        long j39 = this.f488217d;
        long j47 = j38 - j39;
        if (j38 > 0) {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j17 = j37;
            j18 = (100 * j39) / j38;
        } else {
            str = "com.tencent.mm.plugin.sns.ui.monitor.JankModel";
            j17 = j37;
            j18 = -1;
        }
        if (j29 > 0) {
            j19 = j18;
            j27 = (this.f488221h * 1000) / j29;
        } else {
            j19 = j18;
            j27 = -1;
        }
        if (j38 > 0) {
            long j48 = (i17 * 1000) / j38;
        }
        long j49 = i17 > 0 ? j38 / i17 : -1L;
        if (j39 > 0) {
            long j57 = (r8 * 1000) / j39;
        }
        if (j47 > 0) {
            long j58 = (i18 * 1000) / j47;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("总停留时长:");
        sb6.append(this.f488214a);
        sb6.append(" ms, 滑动时长:");
        sb6.append(this.f488216c);
        sb6.append("ms(");
        long j59 = 100;
        sb6.append((this.f488216c * j59) / this.f488214a);
        sb6.append("%) 静止时长:");
        long j66 = j17;
        sb6.append(j66);
        sb6.append("ms\n累计卡顿时长:");
        sb6.append(j49);
        sb6.append("ms(");
        sb6.append((j59 * j49) / this.f488214a);
        sb6.append("%) 滑动卡顿时长:");
        sb6.append(this.f488217d);
        sb6.append("ms(");
        sb6.append(j19);
        sb6.append("%) 静止卡顿时长:");
        sb6.append(j49 - this.f488217d);
        sb6.append("ms\n总帧数:");
        sb6.append(this.f488215b);
        sb6.append(",正常帧数:");
        sb6.append(this.f488215b - this.f488218e);
        sb6.append(",卡顿帧数=");
        sb6.append(this.f488218e);
        sb6.append(",静止帧数:");
        sb6.append(this.f488215b - this.f488221h);
        sb6.append(",滑动帧数:");
        sb6.append(this.f488221h);
        sb6.append("\n页面平均帧率:");
        sb6.append((this.f488215b * 1000) / this.f488214a);
        sb6.append(",帧均耗时:");
        sb6.append((this.f488215b * 1000) / this.f488214a);
        sb6.append("ms 静止帧率:");
        sb6.append(((this.f488215b - this.f488221h) * 1000) / j66);
        sb6.append(" 滑动帧率:");
        sb6.append(j27);
        sb6.append(" \n");
        java.lang.String sb7 = sb6.toString();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("toString", str);
        return sb7;
    }
}
