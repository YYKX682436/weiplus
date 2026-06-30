package zy2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class oa {

    /* renamed from: e, reason: collision with root package name */
    public static final zy2.oa f559054e;

    /* renamed from: f, reason: collision with root package name */
    public static final zy2.oa f559055f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ zy2.oa[] f559056g;

    /* renamed from: d, reason: collision with root package name */
    public final int f559057d;

    static {
        zy2.oa oaVar = new zy2.oa("REPORT_SHOW_POSITION_UNKNOWN", 0, 0);
        zy2.oa oaVar2 = new zy2.oa("REPORT_SHOW_POSITION_CHATTING_SOURCE_VIEW", 1, 1);
        f559054e = oaVar2;
        zy2.oa oaVar3 = new zy2.oa("REPORT_SHOW_POSITION_BUBBLE_VIEW", 2, 2);
        f559055f = oaVar3;
        zy2.oa[] oaVarArr = {oaVar, oaVar2, oaVar3};
        f559056g = oaVarArr;
        rz5.b.a(oaVarArr);
    }

    public oa(java.lang.String str, int i17, int i18) {
        this.f559057d = i18;
    }

    /* renamed from: valueOf */
    public static zy2.oa m180022xdce0328(java.lang.String str) {
        return (zy2.oa) java.lang.Enum.valueOf(zy2.oa.class, str);
    }

    /* renamed from: values */
    public static zy2.oa[] m180023xcee59d22() {
        return (zy2.oa[]) f559056g.clone();
    }
}
