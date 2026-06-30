package jz1;

/* loaded from: classes13.dex */
public class g implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jz1.e f384224a;

    public g(jz1.e eVar) {
        this.f384224a = eVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        try {
            boolean c17 = u46.l.c(str2, "onScrollChange");
            jz1.e eVar = this.f384224a;
            if (c17) {
                jz1.e.wi(eVar, (android.view.View) objArr[0], ((java.lang.Integer) objArr[1]).intValue(), ((java.lang.Integer) objArr[2]).intValue());
            } else if (u46.l.c(str2, "onScroll")) {
                java.lang.Object obj2 = objArr[0];
                jz1.e.wi(eVar, (android.view.View) obj2, ((android.widget.ListView) obj2).getScrollX(), ((android.widget.ListView) objArr[0]).getScrollY());
            }
        } catch (java.lang.Exception unused) {
        }
    }
}
