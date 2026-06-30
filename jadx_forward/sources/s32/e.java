package s32;

/* loaded from: classes7.dex */
public class e extends l75.n0 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String[] f483999e = {l75.n0.m145250x3fdc6f77(r32.e.f450495v, "HardDeviceLikeUser")};

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f484000d;

    public e(l75.k0 k0Var) {
        super(k0Var, r32.e.f450495v, "HardDeviceLikeUser", null);
        this.f484000d = k0Var;
        k0Var.A("HardDeviceLikeUser", "CREATE INDEX IF NOT EXISTS ExdeviceRankLikeInfoRankIdAppNameIndex ON HardDeviceLikeUser ( rankID, appusername )");
    }
}
