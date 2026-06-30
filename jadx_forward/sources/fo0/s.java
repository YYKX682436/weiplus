package fo0;

/* loaded from: classes11.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f346374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f346375b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f346376c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f346377d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f346378e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f346379f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f346380g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f346381h;

    public s(boolean z17, int i17, boolean z18, boolean z19, boolean z27, java.lang.String str, android.graphics.Bitmap bitmap, boolean z28, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i18 & 1) != 0 ? true : z17;
        i17 = (i18 & 2) != 0 ? -1 : i17;
        z18 = (i18 & 4) != 0 ? true : z18;
        z19 = (i18 & 8) != 0 ? true : z19;
        z27 = (i18 & 16) != 0 ? true : z27;
        str = (i18 & 32) != 0 ? null : str;
        bitmap = (i18 & 64) != 0 ? null : bitmap;
        z28 = (i18 & 128) != 0 ? false : z28;
        this.f346374a = z17;
        this.f346375b = i17;
        this.f346376c = z18;
        this.f346377d = z19;
        this.f346378e = z27;
        this.f346379f = str;
        this.f346380g = bitmap;
        this.f346381h = z28;
    }

    /* renamed from: equals */
    public boolean m129886xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fo0.s)) {
            return false;
        }
        fo0.s sVar = (fo0.s) obj;
        return this.f346374a == sVar.f346374a && this.f346375b == sVar.f346375b && this.f346376c == sVar.f346376c && this.f346377d == sVar.f346377d && this.f346378e == sVar.f346378e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346379f, sVar.f346379f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f346380g, sVar.f346380g) && this.f346381h == sVar.f346381h;
    }

    /* renamed from: hashCode */
    public int m129887x8cdac1b() {
        int hashCode = ((((((((java.lang.Boolean.hashCode(this.f346374a) * 31) + java.lang.Integer.hashCode(this.f346375b)) * 31) + java.lang.Boolean.hashCode(this.f346376c)) * 31) + java.lang.Boolean.hashCode(this.f346377d)) * 31) + java.lang.Boolean.hashCode(this.f346378e)) * 31;
        java.lang.String str = this.f346379f;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        android.graphics.Bitmap bitmap = this.f346380g;
        return ((hashCode2 + (bitmap != null ? bitmap.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f346381h);
    }

    /* renamed from: toString */
    public java.lang.String m129888x9616526c() {
        return "MiniWindowInfo(isPlaying=" + this.f346374a + ", showBtnColor=" + this.f346375b + ", enablePlayButton=" + this.f346376c + ", showPlayButton=" + this.f346377d + ", showDeleteButton=" + this.f346378e + ", coverUrl=" + this.f346379f + ", bitmap=" + this.f346380g + ", isAudioOnlyMode=" + this.f346381h + ')';
    }
}
