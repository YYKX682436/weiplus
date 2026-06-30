package bw3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final bw3.c f24904d;

    /* renamed from: e, reason: collision with root package name */
    public static final bw3.c f24905e;

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ bw3.c[] f24906f;

    static {
        bw3.c cVar = new bw3.c("FREE", 0);
        f24904d = cVar;
        bw3.c cVar2 = new bw3.c("CENTER", 1);
        f24905e = cVar2;
        bw3.c[] cVarArr = {cVar, cVar2};
        f24906f = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static bw3.c valueOf(java.lang.String str) {
        return (bw3.c) java.lang.Enum.valueOf(bw3.c.class, str);
    }

    public static bw3.c[] values() {
        return (bw3.c[]) f24906f.clone();
    }
}
