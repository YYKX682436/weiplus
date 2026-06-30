package rq2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final rq2.b f480344e;

    /* renamed from: f, reason: collision with root package name */
    public static final rq2.b f480345f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ rq2.b[] f480346g;

    /* renamed from: d, reason: collision with root package name */
    public final int f480347d;

    static {
        rq2.b bVar = new rq2.b("USER_VERSION", 0, 8);
        rq2.b bVar2 = new rq2.b("STATE_REPORT_VERSION", 1, 5);
        rq2.b bVar3 = new rq2.b("RED_PRELOAD_TICK", 2, 6);
        f480344e = bVar3;
        rq2.b bVar4 = new rq2.b("RED_PRELOAD_CONSUME_TICK", 3, 7);
        f480345f = bVar4;
        rq2.b[] bVarArr = {bVar, bVar2, bVar3, bVar4};
        f480346g = bVarArr;
        rz5.b.a(bVarArr);
    }

    public b(java.lang.String str, int i17, int i18) {
        this.f480347d = i18;
    }

    /* renamed from: valueOf */
    public static rq2.b m162900xdce0328(java.lang.String str) {
        return (rq2.b) java.lang.Enum.valueOf(rq2.b.class, str);
    }

    /* renamed from: values */
    public static rq2.b[] m162901xcee59d22() {
        return (rq2.b[]) f480346g.clone();
    }
}
