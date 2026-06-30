package ka4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final ka4.b f387649e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka4.b f387650f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka4.b f387651g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka4.b f387652h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka4.b[] f387653i;

    /* renamed from: d, reason: collision with root package name */
    public final int f387654d;

    static {
        ka4.b bVar = new ka4.b("SUBMIT", 0, 1);
        f387649e = bVar;
        ka4.b bVar2 = new ka4.b("START", 1, 2);
        f387650f = bVar2;
        ka4.b bVar3 = new ka4.b("FINISH_V2", 2, 3);
        f387651g = bVar3;
        ka4.b bVar4 = new ka4.b("FINISH_V4", 3, 4);
        f387652h = bVar4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        f387653i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f387654d = i18;
    }

    /* renamed from: valueOf */
    public static ka4.b m142314xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b bVar = (ka4.b) java.lang.Enum.valueOf(ka4.b.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return bVar;
    }

    /* renamed from: values */
    public static ka4.b[] m142315xcee59d22() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        ka4.b[] bVarArr = (ka4.b[]) f387653i.clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return bVarArr;
    }

    /* renamed from: getType */
    public final int m142316xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.config.PredictType");
        return this.f387654d;
    }
}
