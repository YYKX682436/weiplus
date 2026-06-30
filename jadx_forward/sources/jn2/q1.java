package jn2;

/* loaded from: classes10.dex */
public final class q1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jn2.r1 f382204d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.z22 f382205e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f382206f;

    public q1(jn2.r1 r1Var, r45.z22 z22Var, int i17) {
        this.f382204d = r1Var;
        this.f382205e = z22Var;
        this.f382206f = i17;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        r45.ay1 ay1Var;
        r45.ay1 ay1Var2;
        int itemId = menuItem.getItemId();
        jn2.r1 r1Var = this.f382204d;
        if (itemId == r1Var.K) {
            r1Var.f382218p1.a();
            r45.z22 z22Var = this.f382205e;
            r45.by1 by1Var = z22Var.f473164h;
            if (by1Var != null && (ay1Var2 = by1Var.f452676d) != null) {
                sf2.x xVar = r1Var.I;
                xVar.getClass();
                te2.a9.f(te2.a9.f499416a, xVar.h7(), 4, kz5.b0.c(ay1Var2), null, 8, null);
            }
            int i18 = this.f382206f;
            r1Var.getClass();
            java.lang.String str = z22Var.f473162f;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = r1Var.f382215J;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str2, "deleteNewSong: unique_add_id is null or empty");
                return;
            }
            r45.by1 by1Var2 = z22Var.f473164h;
            java.lang.String str3 = (by1Var2 == null || (ay1Var = by1Var2.f452676d) == null) ? null : ay1Var.f451884e;
            if (str3 == null) {
                str3 = "";
            }
            java.lang.String str4 = str3;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "deleteNewSong: pos=" + i18 + ", song=" + str4 + ", uniqueAddId=" + str);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = r1Var.E;
            if (y0Var != null) {
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new jn2.e1(r1Var, z22Var, str4, i18, null), 3, null);
            }
        }
    }
}
