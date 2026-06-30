package ri;

/* loaded from: classes12.dex */
public class h implements yj0.b {
    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (((aq1.q0) ((a25.q) i95.n0.c(a25.q.class))).Ui()) {
            ri.a.c("bindService", str, str2, str3, str4, str5, obj, objArr);
            for (java.lang.Object obj2 : objArr) {
                if (obj2 instanceof android.content.Intent) {
                    l85.j1.b(str, (android.content.Intent) obj2);
                }
            }
        }
    }
}
