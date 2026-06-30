package pg5;

/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.CharSequence f435775a;

    /* renamed from: b, reason: collision with root package name */
    public final int f435776b;

    /* renamed from: c, reason: collision with root package name */
    public final int f435777c;

    /* renamed from: d, reason: collision with root package name */
    public final int f435778d;

    /* renamed from: e, reason: collision with root package name */
    public final int f435779e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f435780f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f435781g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f435782h;

    public a(java.lang.CharSequence source, int i17, int i18, int i19, int i27, boolean z17, boolean z18, boolean z19, int i28, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i27 = (i28 & 16) != 0 ? 300 : i27;
        z17 = (i28 & 32) != 0 ? true : z17;
        z18 = (i28 & 64) != 0 ? false : z18;
        z19 = (i28 & 128) != 0 ? true : z19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        this.f435775a = source;
        this.f435776b = i17;
        this.f435777c = i18;
        this.f435778d = i19;
        this.f435779e = i27;
        this.f435780f = z17;
        this.f435781g = z18;
        this.f435782h = z19;
    }

    /* renamed from: equals */
    public boolean m158515xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pg5.a)) {
            return false;
        }
        pg5.a aVar = (pg5.a) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f435775a, aVar.f435775a) && this.f435776b == aVar.f435776b && this.f435777c == aVar.f435777c && this.f435778d == aVar.f435778d && this.f435779e == aVar.f435779e && this.f435780f == aVar.f435780f && this.f435781g == aVar.f435781g && this.f435782h == aVar.f435782h;
    }

    /* renamed from: hashCode */
    public int m158516x8cdac1b() {
        return (((((((((((((this.f435775a.hashCode() * 31) + java.lang.Integer.hashCode(this.f435776b)) * 31) + java.lang.Integer.hashCode(this.f435777c)) * 31) + java.lang.Integer.hashCode(this.f435778d)) * 31) + java.lang.Integer.hashCode(this.f435779e)) * 31) + java.lang.Boolean.hashCode(this.f435780f)) * 31) + java.lang.Boolean.hashCode(this.f435781g)) * 31) + java.lang.Boolean.hashCode(this.f435782h);
    }

    /* renamed from: toString */
    public java.lang.String m158517x9616526c() {
        return "EmojiProcessRequest(source=" + ((java.lang.Object) this.f435775a) + ", start=" + this.f435776b + ", end=" + this.f435777c + ", processEmojiType=" + this.f435778d + ", maxSysNum=" + this.f435779e + ", needGetResultSpan=" + this.f435780f + ", needClearExistEmojiSpan=" + this.f435781g + ", withSoftBank=" + this.f435782h + ')';
    }
}
