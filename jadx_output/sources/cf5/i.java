package cf5;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final cf5.i f40982d;

    /* renamed from: e, reason: collision with root package name */
    public static final cf5.i f40983e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ cf5.i[] f40984f;

    static {
        cf5.i iVar = new cf5.i("CHATTING", 0);
        f40982d = iVar;
        cf5.i iVar2 = new cf5.i("PREVIEW", 1);
        f40983e = iVar2;
        cf5.i[] iVarArr = {iVar, iVar2};
        f40984f = iVarArr;
        rz5.b.a(iVarArr);
    }

    public i(java.lang.String str, int i17) {
    }

    public static cf5.i valueOf(java.lang.String str) {
        return (cf5.i) java.lang.Enum.valueOf(cf5.i.class, str);
    }

    public static cf5.i[] values() {
        return (cf5.i[]) f40984f.clone();
    }
}
