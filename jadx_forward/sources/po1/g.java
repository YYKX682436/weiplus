package po1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g {

    /* renamed from: d, reason: collision with root package name */
    public static final po1.f f438839d;

    /* renamed from: e, reason: collision with root package name */
    public static final po1.e[] f438840e;

    /* renamed from: f, reason: collision with root package name */
    public static final po1.g f438841f;

    /* renamed from: g, reason: collision with root package name */
    public static final po1.g f438842g;

    /* renamed from: h, reason: collision with root package name */
    public static final po1.g f438843h;

    /* renamed from: i, reason: collision with root package name */
    public static final po1.g f438844i;

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ po1.g[] f438845m;

    static {
        po1.g gVar = new po1.g("DEVICE_PC", 0);
        f438841f = gVar;
        po1.g gVar2 = new po1.g("DEVICE_MAC", 1);
        f438842g = gVar2;
        po1.g gVar3 = new po1.g("DEVICE_USB_DISK", 2);
        f438843h = gVar3;
        po1.g gVar4 = new po1.g("DEVICE_NAS", 3);
        po1.g gVar5 = new po1.g("DEVICE_UNKNOWN", 4);
        f438844i = gVar5;
        po1.g[] gVarArr = {gVar, gVar2, gVar3, gVar4, gVar5};
        f438845m = gVarArr;
        rz5.b.a(gVarArr);
        f438839d = new po1.f(null);
        f438840e = new po1.e[]{new po1.e(gVar2, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w.AFFROAM_DEVICE_TYPE_MAC, 4011), new po1.e(gVar, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w.AFFROAM_DEVICE_TYPE_WINDOWS, 4011), new po1.e(gVar3, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w.AFFROAM_DEVICE_TYPE_PORTABLE_DISK, 13001), new po1.e(gVar4, com.p314xaae8f345.p3133xd0ce8b26.aff.p3134xbf1d9f8a.w.AFFROAM_DEVICE_TYPE_NAS, 13000)};
    }

    public g(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static po1.g m158789xdce0328(java.lang.String str) {
        return (po1.g) java.lang.Enum.valueOf(po1.g.class, str);
    }

    /* renamed from: values */
    public static po1.g[] m158790xcee59d22() {
        return (po1.g[]) f438845m.clone();
    }

    public final int h() {
        po1.e eVar;
        po1.e[] eVarArr = f438840e;
        int length = eVarArr.length;
        int i17 = 0;
        while (true) {
            if (i17 >= length) {
                eVar = null;
                break;
            }
            eVar = eVarArr[i17];
            if (eVar.f438836a == this) {
                break;
            }
            i17++;
        }
        if (eVar != null) {
            return eVar.f438838c;
        }
        return -1;
    }
}
