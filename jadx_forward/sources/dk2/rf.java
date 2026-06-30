package dk2;

/* loaded from: classes10.dex */
public final class rf implements java.io.Serializable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315572d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f315573e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315574f;

    /* renamed from: g, reason: collision with root package name */
    public final float f315575g;

    /* renamed from: h, reason: collision with root package name */
    public final float f315576h;

    /* renamed from: i, reason: collision with root package name */
    public final long f315577i;

    /* renamed from: m, reason: collision with root package name */
    public final int f315578m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Long f315579n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.Long f315580o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f315581p;

    /* renamed from: q, reason: collision with root package name */
    public final int f315582q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f315583r;

    public rf(r45.gl4 micReplayInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micReplayInfo, "micReplayInfo");
        this.f315572d = null;
        this.f315573e = null;
        this.f315574f = null;
        this.f315575g = 0.0f;
        this.f315576h = 0.0f;
        this.f315577i = 0L;
        this.f315578m = 0;
        this.f315579n = null;
        this.f315580o = null;
        this.f315581p = null;
        this.f315582q = 0;
        this.f315583r = null;
        this.f315572d = micReplayInfo.m75945x2fec8307(0);
        this.f315573e = micReplayInfo.m75945x2fec8307(1);
        this.f315574f = micReplayInfo.m75945x2fec8307(11);
        this.f315575g = micReplayInfo.m75938x746dc8a6(6);
        this.f315576h = micReplayInfo.m75938x746dc8a6(12);
        this.f315577i = micReplayInfo.m75942xfb822ef2(14);
        this.f315578m = (int) micReplayInfo.m75942xfb822ef2(2);
        this.f315579n = java.lang.Long.valueOf(micReplayInfo.m75942xfb822ef2(10));
        this.f315580o = java.lang.Long.valueOf(micReplayInfo.m75942xfb822ef2(9));
        r45.c54 c54Var = (r45.c54) micReplayInfo.m75936x14adae67(15);
        this.f315581p = c54Var != null ? c54Var.m75945x2fec8307(0) : null;
        r45.c54 c54Var2 = (r45.c54) micReplayInfo.m75936x14adae67(15);
        this.f315582q = c54Var2 != null ? c54Var2.m75939xb282bd08(1) : 0;
        r45.c54 c54Var3 = (r45.c54) micReplayInfo.m75936x14adae67(15);
        this.f315583r = c54Var3 != null ? c54Var3.m75945x2fec8307(2) : null;
    }

    /* renamed from: equals */
    public boolean m124651xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.rf)) {
            return false;
        }
        dk2.rf rfVar = (dk2.rf) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315572d, rfVar.f315572d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315573e, rfVar.f315573e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315574f, rfVar.f315574f) && java.lang.Float.compare(this.f315575g, rfVar.f315575g) == 0 && java.lang.Float.compare(this.f315576h, rfVar.f315576h) == 0 && this.f315577i == rfVar.f315577i && this.f315578m == rfVar.f315578m && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315579n, rfVar.f315579n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315580o, rfVar.f315580o) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315581p, rfVar.f315581p) && this.f315582q == rfVar.f315582q && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f315583r, rfVar.f315583r);
    }

    /* renamed from: hashCode */
    public int m124652x8cdac1b() {
        java.lang.String str = this.f315572d;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f315573e;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f315574f;
        int hashCode3 = (((((((((hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + java.lang.Float.hashCode(this.f315575g)) * 31) + java.lang.Float.hashCode(this.f315576h)) * 31) + java.lang.Long.hashCode(this.f315577i)) * 31) + java.lang.Integer.hashCode(this.f315578m)) * 31;
        java.lang.Long l17 = this.f315579n;
        int hashCode4 = (hashCode3 + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f315580o;
        int hashCode5 = (hashCode4 + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.String str4 = this.f315581p;
        int hashCode6 = (((hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31) + java.lang.Integer.hashCode(this.f315582q)) * 31;
        java.lang.String str5 = this.f315583r;
        return hashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m124653x9616526c() {
        return "FinderLiveVisitorMicReplayInfo(micReplayId=" + this.f315572d + ", micReplayUrl=" + this.f315573e + ", coverImageUrl=" + this.f315574f + ", replayDuration=" + this.f315575g + ", progress=" + this.f315576h + ", expiredTs=" + this.f315577i + ", status=" + this.f315578m + ", liveId=" + this.f315579n + ", objectId=" + this.f315580o + ", songName=" + this.f315581p + ", songScore=" + this.f315582q + ", songLevel=" + this.f315583r + ')';
    }
}
