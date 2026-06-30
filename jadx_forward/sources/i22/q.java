package i22;

/* loaded from: classes8.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f369543a;

    /* renamed from: b, reason: collision with root package name */
    public int f369544b;

    /* renamed from: c, reason: collision with root package name */
    public final int f369545c;

    public q(int i17, int i18, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i17 = (i27 & 1) != 0 ? -1 : i17;
        i18 = (i27 & 2) != 0 ? -1 : i18;
        i19 = (i27 & 4) != 0 ? -1 : i19;
        this.f369543a = i17;
        this.f369544b = i18;
        this.f369545c = i19;
    }

    /* renamed from: equals */
    public boolean m134666xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i22.q)) {
            return false;
        }
        i22.q qVar = (i22.q) obj;
        return this.f369543a == qVar.f369543a && this.f369544b == qVar.f369544b && this.f369545c == qVar.f369545c;
    }

    /* renamed from: hashCode */
    public int m134667x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f369543a) * 31) + java.lang.Integer.hashCode(this.f369544b)) * 31) + java.lang.Integer.hashCode(this.f369545c);
    }

    /* renamed from: toString */
    public java.lang.String m134668x9616526c() {
        return "EmojiStoreV3EmotionRecRange(startPos=" + this.f369543a + ", endPos=" + this.f369544b + ", reportScene=" + this.f369545c + ')';
    }
}
