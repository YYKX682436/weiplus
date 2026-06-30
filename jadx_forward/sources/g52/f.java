package g52;

/* loaded from: classes14.dex */
public class f implements yj0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g52.h f350429a;

    public f(g52.h hVar) {
        this.f350429a = hVar;
    }

    @Override // yj0.b
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.b
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.Object obj, java.lang.Object[] objArr) {
        if (obj == null || objArr == null || objArr.length <= 0 || !(obj instanceof android.content.Context) || (obj instanceof android.app.Activity)) {
            return;
        }
        boolean equals = "startActivity".equals(str4);
        g52.h hVar = this.f350429a;
        if (equals) {
            if (objArr[0] instanceof android.content.Intent) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivity: %s, %s, %s, %d, %s", str, str2, obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()), "from: mContextListener");
                g52.i iVar = hVar.f350431a;
                if (iVar != null) {
                    ((g52.b) iVar).a(null, (android.content.Intent) objArr[0]);
                }
                g52.h.a(hVar, null, (android.content.Intent) objArr[0]);
                return;
            }
            return;
        }
        if ("startActivities".equals(str4)) {
            java.lang.Object obj2 = objArr[0];
            if (obj2 instanceof android.content.Intent[]) {
                android.content.Intent[] intentArr = (android.content.Intent[]) obj2;
                if (intentArr.length > 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellActivityStub", "mOnActivityListener, startActivities: %s, %s, %s, %d, %s", str, str2, obj.getClass().getName(), java.lang.Integer.valueOf(obj.hashCode()), "from: mContextListener");
                    g52.i iVar2 = hVar.f350431a;
                    if (iVar2 != null) {
                        ((g52.b) iVar2).a(null, intentArr[0]);
                    }
                    g52.h.a(hVar, null, intentArr[0]);
                }
            }
        }
    }
}
