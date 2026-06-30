package qs5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: e, reason: collision with root package name */
    public static final qs5.d f447959e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ qs5.d[] f447960f;

    /* renamed from: d, reason: collision with root package name */
    public final int f447961d;

    static {
        qs5.d dVar = new qs5.d("Chat", 0, 1);
        qs5.d dVar2 = new qs5.d("SNS", 1, 2);
        f447959e = dVar2;
        qs5.d[] dVarArr = {dVar, dVar2, new qs5.d("BIZ", 2, 3), new qs5.d("OpenReplay", 3, 4), new qs5.d("Notice", 4, 5), new qs5.d("FinderFeed", 5, 6), new qs5.d("LiveFeed", 6, 7), new qs5.d("ClosePage", 7, 8), new qs5.d("LiveRoom", 8, 9), new qs5.d("StatusSquare", 9, 10), new qs5.d("SNSAutoPlayAD", 10, 11), new qs5.d("AudienceMicStats", 11, 16), new qs5.d("AudienceKtvMicStats", 12, 17)};
        f447960f = dVarArr;
        rz5.b.a(dVarArr);
    }

    public d(java.lang.String str, int i17, int i18) {
        this.f447961d = i18;
    }

    /* renamed from: valueOf */
    public static qs5.d m160843xdce0328(java.lang.String str) {
        return (qs5.d) java.lang.Enum.valueOf(qs5.d.class, str);
    }

    /* renamed from: values */
    public static qs5.d[] m160844xcee59d22() {
        return (qs5.d[]) f447960f.clone();
    }

    public final int h() {
        return this.f447961d;
    }
}
