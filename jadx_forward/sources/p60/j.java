package p60;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class j {

    /* renamed from: e, reason: collision with root package name */
    public static final p60.i f433693e;

    /* renamed from: f, reason: collision with root package name */
    public static final p60.j f433694f;

    /* renamed from: g, reason: collision with root package name */
    public static final p60.j f433695g;

    /* renamed from: h, reason: collision with root package name */
    public static final p60.j f433696h;

    /* renamed from: i, reason: collision with root package name */
    public static final p60.j f433697i;

    /* renamed from: m, reason: collision with root package name */
    public static final p60.j f433698m;

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ p60.j[] f433699n;

    /* renamed from: d, reason: collision with root package name */
    public final int f433700d;

    static {
        p60.j jVar = new p60.j("GameLiveState_NotInited", 0, 0);
        f433694f = jVar;
        p60.j jVar2 = new p60.j("GameLiveState_PrePare", 1, 1);
        f433695g = jVar2;
        p60.j jVar3 = new p60.j("GameLiveState_LivingForeGround", 2, 2);
        f433696h = jVar3;
        p60.j jVar4 = new p60.j("GameLiveState_LivingBackGround", 3, 3);
        f433697i = jVar4;
        p60.j jVar5 = new p60.j("GameLiveState_Destroy", 4, 4);
        f433698m = jVar5;
        p60.j[] jVarArr = {jVar, jVar2, jVar3, jVar4, jVar5};
        f433699n = jVarArr;
        rz5.b.a(jVarArr);
        f433693e = new p60.i(null);
    }

    public j(java.lang.String str, int i17, int i18) {
        this.f433700d = i18;
    }

    /* renamed from: valueOf */
    public static p60.j m157887xdce0328(java.lang.String str) {
        return (p60.j) java.lang.Enum.valueOf(p60.j.class, str);
    }

    /* renamed from: values */
    public static p60.j[] m157888xcee59d22() {
        return (p60.j[]) f433699n.clone();
    }

    public final java.lang.String h() {
        int i17 = this.f433700d;
        return i17 != 0 ? i17 != 1 ? i17 != 2 ? i17 != 3 ? i17 != 4 ? com.p159x477cd522.p160x333422.C1461x7397cc93.f4739x19d1382a : "GameLiveState_Destroy" : "GameLiveState_LivingBackGround" : "GameLiveState_LivingForeGround" : "GameLiveState_PrePare" : "GameLiveState_NotInited";
    }
}
