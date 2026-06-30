package w22;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class b {

    /* renamed from: d, reason: collision with root package name */
    public static final w22.b f524054d;

    /* renamed from: e, reason: collision with root package name */
    public static final w22.b f524055e;

    /* renamed from: f, reason: collision with root package name */
    public static final w22.b f524056f;

    /* renamed from: g, reason: collision with root package name */
    public static final w22.b f524057g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ w22.b[] f524058h;

    static {
        w22.b bVar = new w22.b("RECORD_STATE_IDLE", 0);
        f524054d = bVar;
        w22.b bVar2 = new w22.b("RECORD_STATE_PREVIEW", 1);
        f524055e = bVar2;
        w22.b bVar3 = new w22.b("RECORD_STATE_PREVIEW_PAUSED", 2);
        w22.b bVar4 = new w22.b("RECORD_STATE_STARTED", 3);
        f524056f = bVar4;
        w22.b bVar5 = new w22.b("RECORD_STATE_STOP", 4);
        f524057g = bVar5;
        w22.b[] bVarArr = {bVar, bVar2, bVar3, bVar4, bVar5};
        f524058h = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17) {
    }

    /* renamed from: valueOf */
    public static w22.b m173165xdce0328(java.lang.String str) {
        return (w22.b) java.lang.Enum.valueOf(w22.b.class, str);
    }

    /* renamed from: values */
    public static w22.b[] m173166xcee59d22() {
        return (w22.b[]) f524058h.clone();
    }
}
