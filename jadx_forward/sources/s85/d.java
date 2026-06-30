package s85;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final s85.c[] f486439a;

    public d(android.content.Context context) {
        s85.j jVar = new s85.j(context);
        this.f486439a = new s85.c[]{jVar.f486447a, jVar.f486448b};
        new java.util.HashMap();
    }

    public s85.c a(int i17, java.lang.Class cls) {
        if (i17 >= 0) {
            s85.c[] cVarArr = this.f486439a;
            if (i17 < cVarArr.length) {
                return cVarArr[i17];
            }
        }
        return null;
    }
}
