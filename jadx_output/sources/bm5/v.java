package bm5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class v {

    /* renamed from: e, reason: collision with root package name */
    public static final bm5.u f22742e;

    /* renamed from: f, reason: collision with root package name */
    public static final bm5.v f22743f;

    /* renamed from: g, reason: collision with root package name */
    public static final bm5.v f22744g;

    /* renamed from: h, reason: collision with root package name */
    public static final bm5.v f22745h;

    /* renamed from: i, reason: collision with root package name */
    public static final bm5.v f22746i;

    /* renamed from: m, reason: collision with root package name */
    public static final bm5.v f22747m;

    /* renamed from: n, reason: collision with root package name */
    public static final bm5.v f22748n;

    /* renamed from: o, reason: collision with root package name */
    public static final bm5.v f22749o;

    /* renamed from: p, reason: collision with root package name */
    public static final bm5.v f22750p;

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ bm5.v[] f22751q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f22752r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f22753d;

    static {
        bm5.v vVar = new bm5.v("IMAGE", 0, "image");
        f22743f = vVar;
        bm5.v vVar2 = new bm5.v("VIDEO", 1, "video");
        f22744g = vVar2;
        bm5.v vVar3 = new bm5.v("FILE", 2, "opendata");
        f22745h = vVar3;
        bm5.v vVar4 = new bm5.v("APP_MSG", 3, "appmsg");
        f22746i = vVar4;
        bm5.v vVar5 = new bm5.v("RECORD", 4, "record");
        f22747m = vVar5;
        bm5.v vVar6 = new bm5.v("EMOJI", 5, "emoji");
        f22748n = vVar6;
        bm5.v vVar7 = new bm5.v("AUDIO", 6, "audio");
        f22749o = vVar7;
        bm5.v vVar8 = new bm5.v("UNKNOWN", 7, com.eclipsesource.mmv8.Platform.UNKNOWN);
        f22750p = vVar8;
        bm5.v[] vVarArr = {vVar, vVar2, vVar3, vVar4, vVar5, vVar6, vVar7, vVar8};
        f22751q = vVarArr;
        f22752r = rz5.b.a(vVarArr);
        f22742e = new bm5.u(null);
    }

    public v(java.lang.String str, int i17, java.lang.String str2) {
        this.f22753d = str2;
    }

    public static bm5.v valueOf(java.lang.String str) {
        return (bm5.v) java.lang.Enum.valueOf(bm5.v.class, str);
    }

    public static bm5.v[] values() {
        return (bm5.v[]) f22751q.clone();
    }
}
