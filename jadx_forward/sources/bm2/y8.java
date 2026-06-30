package bm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class y8 {

    /* renamed from: e, reason: collision with root package name */
    public static final bm2.y8 f103995e;

    /* renamed from: f, reason: collision with root package name */
    public static final bm2.y8 f103996f;

    /* renamed from: g, reason: collision with root package name */
    public static final bm2.y8 f103997g;

    /* renamed from: h, reason: collision with root package name */
    public static final bm2.y8 f103998h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ bm2.y8[] f103999i;

    /* renamed from: d, reason: collision with root package name */
    public final int f104000d;

    static {
        bm2.y8 y8Var = new bm2.y8("TUNE", 0, 1, "调音");
        bm2.y8 y8Var2 = new bm2.y8("STOP_PLAY", 1, 2, "结束");
        bm2.y8 y8Var3 = new bm2.y8("REQUEST_SONG", 2, 3, "点歌");
        f103995e = y8Var3;
        bm2.y8 y8Var4 = new bm2.y8("PIN", 3, 4, "置顶");
        f103996f = y8Var4;
        bm2.y8 y8Var5 = new bm2.y8("DELETE", 4, 5, "删除");
        f103997g = y8Var5;
        bm2.y8 y8Var6 = new bm2.y8("MORE", 5, 6, "更多");
        bm2.y8 y8Var7 = new bm2.y8("CONFIRM_STOP_PLAY", 6, 7, "确认结束半屏");
        bm2.y8 y8Var8 = new bm2.y8("PAUSE", 7, 8, "暂停");
        bm2.y8 y8Var9 = new bm2.y8("RESUME", 8, 9, "恢复");
        bm2.y8 y8Var10 = new bm2.y8("GO_REQUEST_SONG", 9, 10, "去点歌");
        f103998h = y8Var10;
        bm2.y8[] y8VarArr = {y8Var, y8Var2, y8Var3, y8Var4, y8Var5, y8Var6, y8Var7, y8Var8, y8Var9, y8Var10};
        f103999i = y8VarArr;
        rz5.b.a(y8VarArr);
    }

    public y8(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f104000d = i18;
    }

    /* renamed from: valueOf */
    public static bm2.y8 m10796xdce0328(java.lang.String str) {
        return (bm2.y8) java.lang.Enum.valueOf(bm2.y8.class, str);
    }

    /* renamed from: values */
    public static bm2.y8[] m10797xcee59d22() {
        return (bm2.y8[]) f103999i.clone();
    }
}
