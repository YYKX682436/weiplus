package bm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes10.dex */
public final class y8 {

    /* renamed from: e, reason: collision with root package name */
    public static final bm2.y8 f22462e;

    /* renamed from: f, reason: collision with root package name */
    public static final bm2.y8 f22463f;

    /* renamed from: g, reason: collision with root package name */
    public static final bm2.y8 f22464g;

    /* renamed from: h, reason: collision with root package name */
    public static final bm2.y8 f22465h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ bm2.y8[] f22466i;

    /* renamed from: d, reason: collision with root package name */
    public final int f22467d;

    static {
        bm2.y8 y8Var = new bm2.y8("TUNE", 0, 1, "调音");
        bm2.y8 y8Var2 = new bm2.y8("STOP_PLAY", 1, 2, "结束");
        bm2.y8 y8Var3 = new bm2.y8("REQUEST_SONG", 2, 3, "点歌");
        f22462e = y8Var3;
        bm2.y8 y8Var4 = new bm2.y8("PIN", 3, 4, "置顶");
        f22463f = y8Var4;
        bm2.y8 y8Var5 = new bm2.y8("DELETE", 4, 5, "删除");
        f22464g = y8Var5;
        bm2.y8 y8Var6 = new bm2.y8("MORE", 5, 6, "更多");
        bm2.y8 y8Var7 = new bm2.y8("CONFIRM_STOP_PLAY", 6, 7, "确认结束半屏");
        bm2.y8 y8Var8 = new bm2.y8("PAUSE", 7, 8, "暂停");
        bm2.y8 y8Var9 = new bm2.y8("RESUME", 8, 9, "恢复");
        bm2.y8 y8Var10 = new bm2.y8("GO_REQUEST_SONG", 9, 10, "去点歌");
        f22465h = y8Var10;
        bm2.y8[] y8VarArr = {y8Var, y8Var2, y8Var3, y8Var4, y8Var5, y8Var6, y8Var7, y8Var8, y8Var9, y8Var10};
        f22466i = y8VarArr;
        rz5.b.a(y8VarArr);
    }

    public y8(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f22467d = i18;
    }

    public static bm2.y8 valueOf(java.lang.String str) {
        return (bm2.y8) java.lang.Enum.valueOf(bm2.y8.class, str);
    }

    public static bm2.y8[] values() {
        return (bm2.y8[]) f22466i.clone();
    }
}
