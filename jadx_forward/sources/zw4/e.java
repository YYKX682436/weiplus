package zw4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class e {

    /* renamed from: e, reason: collision with root package name */
    public static final zw4.e f558443e;

    /* renamed from: f, reason: collision with root package name */
    public static final zw4.e f558444f;

    /* renamed from: g, reason: collision with root package name */
    public static final zw4.e f558445g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ zw4.e[] f558446h;

    /* renamed from: d, reason: collision with root package name */
    public final int f558447d;

    static {
        zw4.e eVar = new zw4.e("ACTION_CACHE_VALID_NOT_NEED_DOWNLOAD", 0, 1);
        f558443e = eVar;
        zw4.e eVar2 = new zw4.e("ACTION_CACHE_EXPIRE_AND_DOWNLOAD", 1, 2);
        f558444f = eVar2;
        zw4.e eVar3 = new zw4.e("ACTION_NO_CACHE_AND_DOWNLOAD", 2, 3);
        f558445g = eVar3;
        zw4.e[] eVarArr = {eVar, eVar2, eVar3};
        f558446h = eVarArr;
        rz5.b.a(eVarArr);
    }

    public e(java.lang.String str, int i17, int i18) {
        this.f558447d = i18;
    }

    /* renamed from: valueOf */
    public static zw4.e m179838xdce0328(java.lang.String str) {
        return (zw4.e) java.lang.Enum.valueOf(zw4.e.class, str);
    }

    /* renamed from: values */
    public static zw4.e[] m179839xcee59d22() {
        return (zw4.e[]) f558446h.clone();
    }
}
