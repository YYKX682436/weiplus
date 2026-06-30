package tk;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class w {

    /* renamed from: e, reason: collision with root package name */
    public static final tk.v f501411e;

    /* renamed from: f, reason: collision with root package name */
    public static final tk.w f501412f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ tk.w[] f501413g;

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ rz5.a f501414h;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f501415d;

    static {
        tk.w wVar = new tk.w("OPEN_IMAGE_STR", 0, "openImage");
        f501412f = wVar;
        tk.w[] wVarArr = {wVar, new tk.w("OPEN_MP_PUBLISH_STR", 1, "openMpPublish"), new tk.w("OPEN_MP_ARTICLE_STR", 2, "openMpArticle"), new tk.w("OPEN_REGISTER_PAGE_STR", 3, "openRegisterPage"), new tk.w("OPEN_WEAPP_STR", 4, "openWeApp")};
        f501413g = wVarArr;
        f501414h = rz5.b.a(wVarArr);
        f501411e = new tk.v(null);
    }

    public w(java.lang.String str, int i17, java.lang.String str2) {
        this.f501415d = str2;
    }

    /* renamed from: valueOf */
    public static tk.w m166703xdce0328(java.lang.String str) {
        return (tk.w) java.lang.Enum.valueOf(tk.w.class, str);
    }

    /* renamed from: values */
    public static tk.w[] m166704xcee59d22() {
        return (tk.w[]) f501413g.clone();
    }
}
