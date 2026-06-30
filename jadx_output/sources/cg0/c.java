package cg0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes11.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public static final cg0.c f41044d;

    /* renamed from: e, reason: collision with root package name */
    public static final cg0.c f41045e;

    /* renamed from: f, reason: collision with root package name */
    public static final cg0.c f41046f;

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ cg0.c[] f41047g;

    static {
        cg0.c cVar = new cg0.c("Success", 0);
        f41044d = cVar;
        cg0.c cVar2 = new cg0.c("Cancel", 1);
        f41045e = cVar2;
        cg0.c cVar3 = new cg0.c("DownloadError", 2);
        f41046f = cVar3;
        cg0.c[] cVarArr = {cVar, cVar2, cVar3, new cg0.c("OtherError", 3)};
        f41047g = cVarArr;
        rz5.b.a(cVarArr);
    }

    public c(java.lang.String str, int i17) {
    }

    public static cg0.c valueOf(java.lang.String str) {
        return (cg0.c) java.lang.Enum.valueOf(cg0.c.class, str);
    }

    public static cg0.c[] values() {
        return (cg0.c[]) f41047g.clone();
    }
}
