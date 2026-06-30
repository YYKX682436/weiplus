package mx0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class m {

    /* renamed from: e, reason: collision with root package name */
    public static final mx0.m f413670e;

    /* renamed from: f, reason: collision with root package name */
    public static final mx0.m f413671f;

    /* renamed from: g, reason: collision with root package name */
    public static final mx0.m f413672g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ mx0.m[] f413673h;

    /* renamed from: d, reason: collision with root package name */
    public final int f413674d;

    static {
        mx0.m mVar = new mx0.m("kFinderAiGenderTypeMale", 0, 1);
        f413670e = mVar;
        mx0.m mVar2 = new mx0.m("kFinderAiGenderTypeFemale", 1, 2);
        f413671f = mVar2;
        mx0.m mVar3 = new mx0.m("kFinderAiGenderTypeUnknown", 2, 3);
        f413672g = mVar3;
        mx0.m[] mVarArr = {mVar, mVar2, mVar3};
        f413673h = mVarArr;
        rz5.b.a(mVarArr);
    }

    public m(java.lang.String str, int i17, int i18) {
        this.f413674d = i18;
    }

    /* renamed from: valueOf */
    public static mx0.m m148523xdce0328(java.lang.String str) {
        return (mx0.m) java.lang.Enum.valueOf(mx0.m.class, str);
    }

    /* renamed from: values */
    public static mx0.m[] m148524xcee59d22() {
        return (mx0.m[]) f413673h.clone();
    }
}
