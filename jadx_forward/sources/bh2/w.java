package bh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final bh2.w f102438d;

    /* renamed from: e, reason: collision with root package name */
    public static final bh2.w f102439e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bh2.w[] f102440f;

    static {
        bh2.w wVar = new bh2.w("kMusicChannel_Accompany", 0);
        f102438d = wVar;
        bh2.w wVar2 = new bh2.w("kMusicChannel_Original", 1);
        f102439e = wVar2;
        bh2.w[] wVarArr = {wVar, wVar2, new bh2.w("kMusicChannel_Smart", 2)};
        f102440f = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static bh2.w m10570xdce0328(java.lang.String str) {
        return (bh2.w) java.lang.Enum.valueOf(bh2.w.class, str);
    }

    /* renamed from: values */
    public static bh2.w[] m10571xcee59d22() {
        return (bh2.w[]) f102440f.clone();
    }
}
