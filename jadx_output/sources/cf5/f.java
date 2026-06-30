package cf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes14.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final cf5.f f40967d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf5.f f40968e;

    /* renamed from: f, reason: collision with root package name */
    public static final cf5.f f40969f;

    /* renamed from: g, reason: collision with root package name */
    public static final cf5.f f40970g;

    /* renamed from: h, reason: collision with root package name */
    public static final cf5.f f40971h;

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ cf5.f[] f40972i;

    static {
        cf5.f fVar = new cf5.f("COPY", 0);
        f40967d = fVar;
        cf5.f fVar2 = new cf5.f("SELECT_ALL", 1);
        f40968e = fVar2;
        cf5.f fVar3 = new cf5.f("RETRANSMIT", 2);
        f40969f = fVar3;
        cf5.f fVar4 = new cf5.f("FAVORITE", 3);
        f40970g = fVar4;
        cf5.f fVar5 = new cf5.f("SOS", 4);
        f40971h = fVar5;
        cf5.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f40972i = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static cf5.f valueOf(java.lang.String str) {
        return (cf5.f) java.lang.Enum.valueOf(cf5.f.class, str);
    }

    public static cf5.f[] values() {
        return (cf5.f[]) f40972i.clone();
    }
}
