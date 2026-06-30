package vm2;

/* loaded from: classes3.dex */
public final class b0 implements in5.c {

    /* renamed from: d, reason: collision with root package name */
    public int f519615d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f519616e;

    /* renamed from: f, reason: collision with root package name */
    public int f519617f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f519618g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f519619h;

    public b0(int i17, java.lang.String text, int i18, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        this.f519615d = i17;
        this.f519616e = text;
        this.f519617f = i18;
        this.f519618g = z17;
        this.f519619h = z18;
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return hashCode();
    }

    @Override // in5.c
    public int h() {
        return 0;
    }

    public /* synthetic */ b0(int i17, java.lang.String str, int i18, boolean z17, boolean z18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, str, i18, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18);
    }
}
