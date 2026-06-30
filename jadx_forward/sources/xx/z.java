package xx;

/* loaded from: classes14.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public int f539376a;

    /* renamed from: b, reason: collision with root package name */
    public int f539377b;

    /* renamed from: c, reason: collision with root package name */
    public int f539378c;

    /* renamed from: d, reason: collision with root package name */
    public int f539379d;

    /* renamed from: e, reason: collision with root package name */
    public int f539380e;

    /* renamed from: f, reason: collision with root package name */
    public int f539381f;

    /* renamed from: g, reason: collision with root package name */
    public int f539382g;

    public z(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i38 & 1) != 0 ? 0 : i17;
        i18 = (i38 & 2) != 0 ? 0 : i18;
        i19 = (i38 & 4) != 0 ? 0 : i19;
        i27 = (i38 & 8) != 0 ? 0 : i27;
        i28 = (i38 & 16) != 0 ? 0 : i28;
        i29 = (i38 & 32) != 0 ? 0 : i29;
        i37 = (i38 & 64) != 0 ? 0 : i37;
        this.f539376a = i17;
        this.f539377b = i18;
        this.f539378c = i19;
        this.f539379d = i27;
        this.f539380e = i28;
        this.f539381f = i29;
        this.f539382g = i37;
    }

    /* renamed from: equals */
    public boolean m176148xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xx.z)) {
            return false;
        }
        xx.z zVar = (xx.z) obj;
        return this.f539376a == zVar.f539376a && this.f539377b == zVar.f539377b && this.f539378c == zVar.f539378c && this.f539379d == zVar.f539379d && this.f539380e == zVar.f539380e && this.f539381f == zVar.f539381f && this.f539382g == zVar.f539382g;
    }

    /* renamed from: hashCode */
    public int m176149x8cdac1b() {
        return (((((((((((java.lang.Integer.hashCode(this.f539376a) * 31) + java.lang.Integer.hashCode(this.f539377b)) * 31) + java.lang.Integer.hashCode(this.f539378c)) * 31) + java.lang.Integer.hashCode(this.f539379d)) * 31) + java.lang.Integer.hashCode(this.f539380e)) * 31) + java.lang.Integer.hashCode(this.f539381f)) * 31) + java.lang.Integer.hashCode(this.f539382g);
    }

    /* renamed from: toString */
    public java.lang.String m176150x9616526c() {
        return "CommentExitInfo(userCommentCnt=" + this.f539376a + ", newQuestionCnt=" + this.f539377b + ", onlineUserCnt=" + this.f539378c + ", dailyChatPv=" + this.f539379d + ", ifAnswerQuestion=" + this.f539380e + ", avatarSelfAnswerCnt=" + this.f539381f + ", avatarAnswerCnt=" + this.f539382g + ')';
    }
}
