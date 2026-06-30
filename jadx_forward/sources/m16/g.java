package m16;

/* loaded from: classes15.dex */
public final class g extends k16.a {

    /* renamed from: g, reason: collision with root package name */
    public static final m16.g f404425g;

    /* renamed from: h, reason: collision with root package name */
    public static final m16.g f404426h;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f404427f;

    static {
        m16.g gVar = new m16.g(1, 9, 0);
        f404425g = gVar;
        int i17 = gVar.f384959c;
        int i18 = gVar.f384958b;
        f404426h = (i18 == 1 && i17 == 9) ? new m16.g(2, 0, 0) : new m16.g(i18, i17 + 1, 0);
        new m16.g(new int[0]);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(int[] versionArray, boolean z17) {
        super(java.util.Arrays.copyOf(versionArray, versionArray.length));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(versionArray, "versionArray");
        this.f404427f = z17;
    }

    public final boolean b(m16.g metadataVersionFromLanguageVersion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(metadataVersionFromLanguageVersion, "metadataVersionFromLanguageVersion");
        m16.g gVar = f404425g;
        int i17 = this.f384959c;
        int i18 = this.f384958b;
        if (i18 == 2 && i17 == 0 && gVar.f384958b == 1 && gVar.f384959c == 8) {
            return true;
        }
        if (!this.f404427f) {
            gVar = f404426h;
        }
        gVar.getClass();
        boolean z17 = false;
        int i19 = metadataVersionFromLanguageVersion.f384958b;
        int i27 = gVar.f384958b;
        if (i27 > i19 || (i27 >= i19 && gVar.f384959c > metadataVersionFromLanguageVersion.f384959c)) {
            metadataVersionFromLanguageVersion = gVar;
        }
        if ((i18 == 1 && i17 == 0) || i18 == 0) {
            return false;
        }
        int i28 = metadataVersionFromLanguageVersion.f384958b;
        if (i18 > i28 || (i18 >= i28 && i17 > metadataVersionFromLanguageVersion.f384959c)) {
            z17 = true;
        }
        return !z17;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int... numbers) {
        this(numbers, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(numbers, "numbers");
    }
}
