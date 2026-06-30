package qd1;

/* loaded from: classes7.dex */
public class d implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f443150d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qd1.f f443151e;

    public d(qd1.f fVar, java.util.Map map) {
        this.f443151e = fVar;
        this.f443150d = map;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        qd1.g gVar;
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("tapIndex", java.lang.Integer.valueOf(menuItem.getItemId()));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        java.util.Map map = this.f443150d;
        if (map.containsKey(valueOf) && (gVar = qd1.h.f443168g) != null) {
            int intValue = ((java.lang.Integer) map.get(java.lang.Integer.valueOf(i17))).intValue();
            ((cj1.a) gVar).getClass();
            cj1.b.a(intValue);
        }
        qd1.f fVar = this.f443151e;
        fVar.f443160d.a(fVar.f443166m, fVar.f443167n.p("ok", hashMap));
    }
}
