package eh0;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: j, reason: collision with root package name */
    public static final eh0.h f334410j = new eh0.h(null);

    /* renamed from: a, reason: collision with root package name */
    public final long f334411a;

    /* renamed from: b, reason: collision with root package name */
    public long f334412b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f334413c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f334414d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f334415e;

    /* renamed from: f, reason: collision with root package name */
    public final long f334416f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f334417g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.StringBuilder f334418h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f334419i;

    public i(long j17, long j18, java.lang.String str, java.lang.String str2, java.lang.String str3, long j19, java.lang.String initText, java.lang.StringBuilder streamText, boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        j18 = (i17 & 2) != 0 ? 0L : j18;
        str = (i17 & 4) != 0 ? null : str;
        j19 = (i17 & 32) != 0 ? c01.id.c() : j19;
        initText = (i17 & 64) != 0 ? "" : initText;
        streamText = (i17 & 128) != 0 ? new java.lang.StringBuilder() : streamText;
        z17 = (i17 & 256) != 0 ? false : z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(initText, "initText");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(streamText, "streamText");
        this.f334411a = j17;
        this.f334412b = j18;
        this.f334413c = str;
        this.f334414d = str2;
        this.f334415e = str3;
        this.f334416f = j19;
        this.f334417g = initText;
        this.f334418h = streamText;
        this.f334419i = z17;
    }

    public final java.lang.String a() {
        java.lang.String sb6 = this.f334418h.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb6, "toString(...)");
        return sb6;
    }

    /* renamed from: equals */
    public boolean m127729xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eh0.i)) {
            return false;
        }
        eh0.i iVar = (eh0.i) obj;
        return this.f334411a == iVar.f334411a && this.f334412b == iVar.f334412b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334413c, iVar.f334413c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334414d, iVar.f334414d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334415e, iVar.f334415e) && this.f334416f == iVar.f334416f && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334417g, iVar.f334417g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f334418h, iVar.f334418h) && this.f334419i == iVar.f334419i;
    }

    /* renamed from: hashCode */
    public int m127730x8cdac1b() {
        int hashCode = ((java.lang.Long.hashCode(this.f334411a) * 31) + java.lang.Long.hashCode(this.f334412b)) * 31;
        java.lang.String str = this.f334413c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f334414d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f334415e;
        return ((((((((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Long.hashCode(this.f334416f)) * 31) + this.f334417g.hashCode()) * 31) + this.f334418h.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f334419i);
    }

    /* renamed from: toString */
    public java.lang.String m127731x9616526c() {
        return "StreamSession(msgSvrId=" + this.f334411a + ", msgId=" + this.f334412b + ", ilinkStreamId=" + this.f334413c + ", streamTicket=" + this.f334414d + ", talker=" + this.f334415e + ", createTime=" + this.f334416f + ", initText=" + this.f334417g + ", streamText=" + ((java.lang.Object) this.f334418h) + ", isThinking=" + this.f334419i + ')';
    }
}
