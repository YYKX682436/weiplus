package c62;

/* loaded from: classes15.dex */
public final class f implements yj0.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c62.g f120991a;

    public f(c62.g gVar, c62.e eVar) {
        this.f120991a = gVar;
    }

    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        int intValue;
        c62.g gVar = this.f120991a;
        if (obj != null) {
            gVar.f120995d = obj.getClass().getCanonicalName();
            gVar.f120996e = obj.hashCode();
        }
        if ("finish".equals(str2) && "()V".equals(str3)) {
            if (gVar.f120994c) {
                return;
            }
            gVar.f120994c = true;
            d52.d.a().d(217, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            return;
        }
        if ("dealContentView".equals(str2) && "(Landroid/view/View;)V".equals(str3)) {
            gVar.f120994c = false;
            d52.d.a().d(219, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        } else if ("onKeyDown".equals(str2) && "(ILandroid/view/KeyEvent;)Z".equals(str3)) {
            if (objArr == null || objArr.length < 2 || !((intValue = ((java.lang.Integer) objArr[0]).intValue()) == 4 || intValue == 25 || intValue == 24)) {
                d52.d.a().d(218, java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
    }
}
