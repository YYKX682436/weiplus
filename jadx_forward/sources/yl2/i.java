package yl2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final yl2.i f544554d;

    /* renamed from: e, reason: collision with root package name */
    public static final yl2.i f544555e;

    /* renamed from: f, reason: collision with root package name */
    public static final yl2.i f544556f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ yl2.i[] f544557g;

    static {
        yl2.i iVar = new yl2.i("WEPAY", 0);
        f544554d = iVar;
        yl2.i iVar2 = new yl2.i("CTID", 1);
        f544555e = iVar2;
        yl2.i iVar3 = new yl2.i("CANCEL", 2);
        f544556f = iVar3;
        yl2.i[] iVarArr = {iVar, iVar2, iVar3};
        f544557g = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static yl2.i m177258xdce0328(java.lang.String str) {
        return (yl2.i) java.lang.Enum.valueOf(yl2.i.class, str);
    }

    /* renamed from: values */
    public static yl2.i[] m177259xcee59d22() {
        return (yl2.i[]) f544557g.clone();
    }
}
