package bm2;

/* loaded from: classes3.dex */
public final class r8 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f22278a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.il1 f22279b;

    /* renamed from: c, reason: collision with root package name */
    public final int f22280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f22281d;

    public r8(boolean z17, r45.il1 audienceFile, int i17, boolean z18, int i18, kotlin.jvm.internal.i iVar) {
        z17 = (i18 & 1) != 0 ? false : z17;
        i17 = (i18 & 4) != 0 ? 1 : i17;
        z18 = (i18 & 8) != 0 ? true : z18;
        kotlin.jvm.internal.o.g(audienceFile, "audienceFile");
        this.f22278a = z17;
        this.f22279b = audienceFile;
        this.f22280c = i17;
        this.f22281d = z18;
    }
}
