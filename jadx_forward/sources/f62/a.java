package f62;

/* loaded from: classes15.dex */
public final class a implements yj0.d {
    @Override // yj0.d
    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object obj2) {
    }

    @Override // yj0.d
    public void b(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.Object obj, java.lang.Object[] objArr) {
        if (objArr == null) {
            return;
        }
        if (objArr.length == 0) {
            return;
        }
        java.lang.Object obj2 = objArr[0];
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((java.lang.Integer) obj2).intValue();
        f62.b.f341378a = 10 == intValue;
        f62.b.f341380c = Integer.MAX_VALUE == intValue;
        r45.a07 a07Var = new r45.a07();
        a07Var.f451134d = java.lang.String.valueOf(intValue);
        a07Var.f451142o = java.lang.System.currentTimeMillis();
        a07Var.f451135e = a07Var.f451134d;
        a07Var.f451136f = "MMPopupWindow$PopupViewContainer";
        a07Var.f451138h = "MMPopupWindow$PopupViewContainer";
        k52.g gVar = k52.g.f385827e;
        a07Var.f451139i = 1;
        a07Var.f451148u = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.SubMenuMonitor", "SubMenuMonitor, viewCallback:\nid=" + a07Var.f451134d + "\ntimestamp=" + a07Var.f451142o + "\neventId=" + a07Var.f451139i);
        java.util.Map map = k52.l.f385843a;
        k52.l.f385847e.a(null, a07Var);
    }
}
