package aq0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final aq0.i f94558d;

    /* renamed from: e, reason: collision with root package name */
    public static final aq0.i f94559e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ aq0.i[] f94560f;

    static {
        aq0.i iVar = new aq0.i("None", 0);
        f94558d = iVar;
        aq0.i iVar2 = new aq0.i("TimelineCoverPreview", 1);
        aq0.i iVar3 = new aq0.i("TimelineCoverFullscreen", 2);
        f94559e = iVar3;
        aq0.i[] iVarArr = {iVar, iVar2, iVar3, new aq0.i("AlbumCoverPreview", 3), new aq0.i("AlbumCoverFullscreen", 4), new aq0.i("CommentPreview", 5), new aq0.i("CommentFullscreen", 6)};
        f94560f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static aq0.i m8825xdce0328(java.lang.String str) {
        return (aq0.i) java.lang.Enum.valueOf(aq0.i.class, str);
    }

    /* renamed from: values */
    public static aq0.i[] m8826xcee59d22() {
        return (aq0.i[]) f94560f.clone();
    }
}
