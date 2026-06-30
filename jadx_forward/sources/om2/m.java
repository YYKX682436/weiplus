package om2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class m {

    /* renamed from: g, reason: collision with root package name */
    public static final om2.m f427880g;

    /* renamed from: h, reason: collision with root package name */
    public static final om2.m f427881h;

    /* renamed from: i, reason: collision with root package name */
    public static final om2.m f427882i;

    /* renamed from: m, reason: collision with root package name */
    public static final om2.m f427883m;

    /* renamed from: n, reason: collision with root package name */
    public static final om2.m f427884n;

    /* renamed from: o, reason: collision with root package name */
    public static final om2.m f427885o;

    /* renamed from: p, reason: collision with root package name */
    public static final om2.m f427886p;

    /* renamed from: q, reason: collision with root package name */
    public static final om2.m f427887q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ om2.m[] f427888r;

    /* renamed from: d, reason: collision with root package name */
    public final int f427889d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f427890e;

    /* renamed from: f, reason: collision with root package name */
    public final int f427891f;

    static {
        om2.m mVar = new om2.m("reverbNone", 0, 0, "录音棚", 0, 4, null);
        f427880g = mVar;
        om2.m mVar2 = new om2.m("reverbTheater", 1, 9, "剧场", 0, 4, null);
        f427881h = mVar2;
        om2.m mVar3 = new om2.m("reverChurch", 2, 10, "教堂", 0, 4, null);
        f427882i = mVar3;
        om2.m mVar4 = new om2.m("reverbConcertHall", 3, 11, "音乐厅", 0, 4, null);
        f427883m = mVar4;
        om2.m mVar5 = new om2.m("reverbPianoRoom", 4, 12, "琴房", 0, 4, null);
        f427884n = mVar5;
        om2.m mVar6 = new om2.m("reverbOriginalSound", 5, 13, "原声", 0, 4, null);
        f427885o = mVar6;
        om2.m mVar7 = new om2.m("reverbCD", 6, 14, "CD", 0, 4, null);
        f427886p = mVar7;
        om2.m mVar8 = new om2.m("reverbSinger", 7, 15, "唱将", 0, 4, null);
        f427887q = mVar8;
        om2.m[] mVarArr = {mVar, mVar2, mVar3, mVar4, mVar5, mVar6, mVar7, mVar8};
        f427888r = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18, java.lang.String str2, int i19, int i27, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        i19 = (i27 & 4) != 0 ? -1 : i19;
        this.f427889d = i18;
        this.f427890e = str2;
        this.f427891f = i19;
    }

    /* renamed from: valueOf */
    public static om2.m m151664xdce0328(java.lang.String str) {
        return (om2.m) java.lang.Enum.valueOf(om2.m.class, str);
    }

    /* renamed from: values */
    public static om2.m[] m151665xcee59d22() {
        return (om2.m[]) f427888r.clone();
    }
}
