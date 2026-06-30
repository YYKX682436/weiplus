package ka4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: e, reason: collision with root package name */
    public static final ka4.c f387655e;

    /* renamed from: f, reason: collision with root package name */
    public static final ka4.c f387656f;

    /* renamed from: g, reason: collision with root package name */
    public static final ka4.c f387657g;

    /* renamed from: h, reason: collision with root package name */
    public static final ka4.c f387658h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ ka4.c[] f387659i;

    /* renamed from: d, reason: collision with root package name */
    public final int f387660d;

    static {
        ka4.c cVar = new ka4.c("FIRST", 0, 1);
        f387655e = cVar;
        ka4.c cVar2 = new ka4.c("AFTER_MAX", 1, 2);
        f387656f = cVar2;
        ka4.c cVar3 = new ka4.c("BEFORE_MIN", 2, 3);
        f387657g = cVar3;
        ka4.c cVar4 = new ka4.c("EMPTY", 3, 4);
        f387658h = cVar4;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("$values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("$values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        f387659i = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17, int i18) {
        this.f387660d = i18;
    }

    /* renamed from: valueOf */
    public static ka4.c m142318xdce0328(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("valueOf", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c cVar = (ka4.c) java.lang.Enum.valueOf(ka4.c.class, str);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("valueOf", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return cVar;
    }

    /* renamed from: values */
    public static ka4.c[] m142319xcee59d22() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        ka4.c[] cVarArr = (ka4.c[]) f387659i.clone();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("values", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return cVarArr;
    }

    /* renamed from: getType */
    public final int m142320xfb85f7b0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getType", "com.tencent.mm.plugin.sns.model.config.SetSnsInfoType");
        return this.f387660d;
    }
}
