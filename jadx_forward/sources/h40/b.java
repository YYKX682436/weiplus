package h40;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes12.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final h40.b f360253e;

    /* renamed from: f, reason: collision with root package name */
    public static final h40.b f360254f;

    /* renamed from: g, reason: collision with root package name */
    public static final h40.b f360255g;

    /* renamed from: h, reason: collision with root package name */
    public static final h40.b f360256h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ h40.b[] f360257i;

    /* renamed from: d, reason: collision with root package name */
    public final int f360258d;

    static {
        h40.b bVar = new h40.b("FILE_DOWNLOAD_FROM_OTHER", 0, 0);
        f360253e = bVar;
        h40.b bVar2 = new h40.b("FILE_DOWNLOAD_FROM_CHAT", 1, 1);
        f360254f = bVar2;
        h40.b bVar3 = new h40.b("FILE_DOWNLOAD_FROM_MID_PAGE", 2, 2);
        f360255g = bVar3;
        h40.b bVar4 = new h40.b("FILE_DOWNLOAD_FROM_PREVIEW_PAGE", 3, 3);
        f360256h = bVar4;
        h40.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f360257i = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f360258d = i18;
    }

    /* renamed from: valueOf */
    public static h40.b m132846xdce0328(java.lang.String str) {
        return (h40.b) java.lang.Enum.valueOf(h40.b.class, str);
    }

    /* renamed from: values */
    public static h40.b[] m132847xcee59d22() {
        return (h40.b[]) f360257i.clone();
    }
}
