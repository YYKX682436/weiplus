package cf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final cf5.i f122515d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf5.i f122516e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cf5.i[] f122517f;

    static {
        cf5.i iVar = new cf5.i("CHATTING", 0);
        f122515d = iVar;
        cf5.i iVar2 = new cf5.i("PREVIEW", 1);
        f122516e = iVar2;
        cf5.i[] iVarArr = {iVar, iVar2};
        f122517f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static cf5.i m14768xdce0328(java.lang.String str) {
        return (cf5.i) java.lang.Enum.valueOf(cf5.i.class, str);
    }

    /* renamed from: values */
    public static cf5.i[] m14769xcee59d22() {
        return (cf5.i[]) f122517f.clone();
    }
}
