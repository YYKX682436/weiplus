package bm2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class v {

    /* renamed from: d, reason: collision with root package name */
    public static final bm2.v f22358d;

    /* renamed from: e, reason: collision with root package name */
    public static final bm2.v f22359e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bm2.v[] f22360f;

    static {
        bm2.v vVar = new bm2.v("ITEM", 0);
        f22358d = vVar;
        bm2.v vVar2 = new bm2.v("FOOTER", 1);
        f22359e = vVar2;
        bm2.v[] vVarArr = {vVar, vVar2};
        f22360f = vVarArr;
        rz5.b.a(vVarArr);
    }

    public v(java.lang.String str, int i17) {
    }

    public static bm2.v valueOf(java.lang.String str) {
        return (bm2.v) java.lang.Enum.valueOf(bm2.v.class, str);
    }

    public static bm2.v[] values() {
        return (bm2.v[]) f22360f.clone();
    }
}
