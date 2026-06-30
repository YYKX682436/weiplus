package d62;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr != null && objArr.length >= 2) {
            p52.h.f433551c = false;
            java.lang.Object obj2 = objArr[1];
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.ui.base.preference.Preference");
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb) obj2;
            d62.b.f308298a = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("jd_market_entrance", c21560x1fce98fb.f279313q);
            d62.b.f308299b = p3321xbce91901.jvm.p3324x21ffc6bd.o.b("find_friends_by_qrcode", c21560x1fce98fb.f279313q);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b("find_friends_by_finder", c21560x1fce98fb.f279313q)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.FindMoreFriendUIMonitor", "Finder, 19354, 1");
                jx3.f.INSTANCE.d(19354, 1);
            }
            java.lang.String str4 = c21560x1fce98fb.f279313q;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str4, "getKey(...)");
            r45.a07 a07Var = new r45.a07();
            a07Var.f451134d = str4;
            a07Var.f451142o = java.lang.System.currentTimeMillis();
            a07Var.f451135e = str4;
            a07Var.f451137g = b52.b.g(obj != null ? obj.getClass().getName() : null);
            a07Var.f451141n = obj != null ? obj.hashCode() : -1;
            java.lang.String str5 = a07Var.f451137g;
            a07Var.f451138h = str5;
            k52.g gVar = k52.g.f385827e;
            a07Var.f451139i = 1;
            a07Var.f451136f = str5;
            a07Var.f451148u = 0;
            java.util.Map map = k52.l.f385843a;
            k52.l.f385847e.a(null, a07Var);
        }
    }
}
