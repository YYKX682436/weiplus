package bh2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class w {

    /* renamed from: d, reason: collision with root package name */
    public static final bh2.w f20905d;

    /* renamed from: e, reason: collision with root package name */
    public static final bh2.w f20906e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bh2.w[] f20907f;

    static {
        bh2.w wVar = new bh2.w("kMusicChannel_Accompany", 0);
        f20905d = wVar;
        bh2.w wVar2 = new bh2.w("kMusicChannel_Original", 1);
        f20906e = wVar2;
        bh2.w[] wVarArr = {wVar, wVar2, new bh2.w("kMusicChannel_Smart", 2)};
        f20907f = wVarArr;
        rz5.b.a(wVarArr);
    }

    public w(java.lang.String str, int i17) {
    }

    public static bh2.w valueOf(java.lang.String str) {
        return (bh2.w) java.lang.Enum.valueOf(bh2.w.class, str);
    }

    public static bh2.w[] values() {
        return (bh2.w[]) f20907f.clone();
    }
}
