package yu3;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final yu3.a f547394a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f547395b;

    /* renamed from: c, reason: collision with root package name */
    public final st3.k f547396c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f547397d;

    public b(yu3.a createInfo, boolean z17, st3.k editorConfig, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(createInfo, "createInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editorConfig, "editorConfig");
        this.f547394a = createInfo;
        this.f547395b = z17;
        this.f547396c = editorConfig;
        this.f547397d = z18;
    }

    /* renamed from: equals */
    public boolean m177688xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yu3.b)) {
            return false;
        }
        yu3.b bVar = (yu3.b) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547394a, bVar.f547394a) && this.f547395b == bVar.f547395b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f547396c, bVar.f547396c) && this.f547397d == bVar.f547397d;
    }

    /* renamed from: hashCode */
    public int m177689x8cdac1b() {
        return (((((this.f547394a.m177686x8cdac1b() * 31) + java.lang.Boolean.hashCode(this.f547395b)) * 31) + this.f547396c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f547397d);
    }

    /* renamed from: toString */
    public java.lang.String m177690x9616526c() {
        return "MusicPickerSetupInfo(createInfo=" + this.f547394a + ", isPhotoToVideo=" + this.f547395b + ", editorConfig=" + this.f547396c + ", disableRecommendMusic=" + this.f547397d + ')';
    }
}
