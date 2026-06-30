package kz0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class a {

    /* renamed from: h, reason: collision with root package name */
    public static final kz0.a f395176h;

    /* renamed from: i, reason: collision with root package name */
    public static final kz0.a f395177i;

    /* renamed from: m, reason: collision with root package name */
    public static final kz0.a f395178m;

    /* renamed from: n, reason: collision with root package name */
    public static final kz0.a f395179n;

    /* renamed from: o, reason: collision with root package name */
    public static final kz0.a f395180o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ kz0.a[] f395181p;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f395182d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f395183e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f395184f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f395185g;

    static {
        kz0.a aVar = new kz0.a("MusicPanel", 0, false, false, true, false, 8, null);
        f395176h = aVar;
        boolean z17 = true;
        boolean z18 = false;
        boolean z19 = false;
        int i17 = 8;
        p3321xbce91901.jvm.p3324x21ffc6bd.i iVar = null;
        kz0.a aVar2 = new kz0.a("MoreTemplatePanel", 1, z17, true, z18, z19, i17, iVar);
        f395177i = aVar2;
        kz0.a aVar3 = new kz0.a("MusicSearch", 2, false, false, false, false, 8, null);
        f395178m = aVar3;
        kz0.a aVar4 = new kz0.a("SegmentClip", 3, z17, false, z18, z19, i17, iVar);
        f395179n = aVar4;
        kz0.a aVar5 = new kz0.a("MusicPanelV2", 4, false, false, true, false);
        f395180o = aVar5;
        kz0.a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
        f395181p = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, boolean z27) {
        this.f395182d = z17;
        this.f395183e = z18;
        this.f395184f = z19;
        this.f395185g = z27;
    }

    /* renamed from: valueOf */
    public static kz0.a m144640xdce0328(java.lang.String str) {
        return (kz0.a) java.lang.Enum.valueOf(kz0.a.class, str);
    }

    /* renamed from: values */
    public static kz0.a[] m144641xcee59d22() {
        return (kz0.a[]) f395181p.clone();
    }

    public /* synthetic */ a(java.lang.String str, int i17, boolean z17, boolean z18, boolean z19, boolean z27, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, i17, (i18 & 1) != 0 ? false : z17, (i18 & 2) != 0 ? false : z18, (i18 & 4) != 0 ? true : z19, (i18 & 8) != 0 ? true : z27);
    }
}
