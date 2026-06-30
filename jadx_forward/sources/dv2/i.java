package dv2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class i {

    /* renamed from: e, reason: collision with root package name */
    public static final dv2.i f325398e;

    /* renamed from: f, reason: collision with root package name */
    public static final dv2.i f325399f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ dv2.i[] f325400g;

    /* renamed from: d, reason: collision with root package name */
    public final int f325401d;

    static {
        dv2.i iVar = new dv2.i("FOLLOW", 0, 0, 1);
        f325398e = iVar;
        dv2.i iVar2 = new dv2.i("RECENT", 1, 1, 2);
        f325399f = iVar2;
        dv2.i[] iVarArr = {iVar, iVar2};
        f325400g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17, int i18, int i19) {
        this.f325401d = i19;
    }

    /* renamed from: valueOf */
    public static dv2.i m126287xdce0328(java.lang.String str) {
        return (dv2.i) java.lang.Enum.valueOf(dv2.i.class, str);
    }

    /* renamed from: values */
    public static dv2.i[] m126288xcee59d22() {
        return (dv2.i[]) f325400g.clone();
    }
}
