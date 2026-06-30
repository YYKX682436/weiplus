package dk2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ad {

    /* renamed from: d, reason: collision with root package name */
    public static final dk2.ad f314737d;

    /* renamed from: e, reason: collision with root package name */
    public static final dk2.ad f314738e;

    /* renamed from: f, reason: collision with root package name */
    public static final dk2.ad f314739f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dk2.ad[] f314740g;

    static {
        dk2.ad adVar = new dk2.ad("OnPause", 0);
        f314737d = adVar;
        dk2.ad adVar2 = new dk2.ad("OnStop", 1);
        f314738e = adVar2;
        dk2.ad adVar3 = new dk2.ad("GainFail", 2);
        f314739f = adVar3;
        dk2.ad[] adVarArr = {adVar, adVar2, adVar3};
        f314740g = adVarArr;
        rz5.b.a(adVarArr);
    }

    public ad(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static dk2.ad m124535xdce0328(java.lang.String str) {
        return (dk2.ad) java.lang.Enum.valueOf(dk2.ad.class, str);
    }

    /* renamed from: values */
    public static dk2.ad[] m124536xcee59d22() {
        return (dk2.ad[]) f314740g.clone();
    }
}
