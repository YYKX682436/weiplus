package qn;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final qn.a f446402e;

    /* renamed from: f, reason: collision with root package name */
    public static final qn.a f446403f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ qn.a[] f446404g;

    /* renamed from: d, reason: collision with root package name */
    public final int f446405d;

    static {
        qn.a aVar = new qn.a("SingleChat", 0, 1);
        f446402e = aVar;
        qn.a aVar2 = new qn.a("ChatRoom", 1, 2);
        f446403f = aVar2;
        qn.a[] aVarArr = {aVar, aVar2};
        f446404g = aVarArr;
        rz5.b.a(aVarArr);
    }

    public a(java.lang.String str, int i17, int i18) {
        this.f446405d = i18;
    }

    /* renamed from: valueOf */
    public static qn.a m160527xdce0328(java.lang.String str) {
        return (qn.a) java.lang.Enum.valueOf(qn.a.class, str);
    }

    /* renamed from: values */
    public static qn.a[] m160528xcee59d22() {
        return (qn.a[]) f446404g.clone();
    }
}
