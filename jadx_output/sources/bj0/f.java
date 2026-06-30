package bj0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final bj0.f f21104d;

    /* renamed from: e, reason: collision with root package name */
    public static final bj0.f f21105e;

    /* renamed from: f, reason: collision with root package name */
    public static final bj0.f f21106f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ bj0.f[] f21107g;

    static {
        bj0.f fVar = new bj0.f("Unknown", 0);
        bj0.f fVar2 = new bj0.f("PostDelayed", 1);
        bj0.f fVar3 = new bj0.f("OnSurfaceTextureUpdated", 2);
        f21104d = fVar3;
        bj0.f fVar4 = new bj0.f("OnNextFrameDisplayed", 3);
        f21105e = fVar4;
        bj0.f fVar5 = new bj0.f("onSurfaceChanged", 4);
        f21106f = fVar5;
        bj0.f[] fVarArr = {fVar, fVar2, fVar3, fVar4, fVar5};
        f21107g = fVarArr;
        rz5.b.a(fVarArr);
    }

    public f(java.lang.String str, int i17) {
    }

    public static bj0.f valueOf(java.lang.String str) {
        return (bj0.f) java.lang.Enum.valueOf(bj0.f.class, str);
    }

    public static bj0.f[] values() {
        return (bj0.f[]) f21107g.clone();
    }
}
