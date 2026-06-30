package or1;

/* loaded from: classes9.dex */
public class h1 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or1.i1 f429035d;

    public h1(or1.i1 i1Var) {
        this.f429035d = i1Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        java.lang.String str;
        int itemId = menuItem.getItemId();
        or1.i1 i1Var = this.f429035d;
        if (itemId != 2) {
            if (itemId != 3) {
                if (itemId != 4) {
                    return;
                }
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("Contact_User", i1Var.f429039d.f429044b);
                ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.l(intent, i1Var.f429039d.f429043a);
                return;
            }
            android.content.Intent intent2 = new android.content.Intent(i1Var.f429039d.f429043a, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.ActivityC12981xe277674e.class);
            or1.j1 j1Var = i1Var.f429039d;
            intent2.putExtra("enterprise_biz_name", j1Var.f429044b);
            intent2.putExtra("enterprise_scene", 2);
            android.app.Activity activity = j1Var.f429043a;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent2);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activity.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activity, "com/tencent/mm/plugin/brandservice/ui/EnterpriseBizEntranceListHelper$1$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return;
        }
        qk.o6 o6Var = (qk.o6) i95.n0.c(qk.o6.class);
        java.lang.String str2 = i1Var.f429039d.f429044b;
        ((c01.j0) o6Var).getClass();
        try {
            r01.m y07 = r01.q3.bj().y0(str2);
            r45.ik ikVar = new r45.ik();
            ikVar.mo11468x92b714fd(y07.f66039x3c18ecc6);
            str = ikVar.f458638g;
        } catch (java.lang.Throwable unused) {
            str = "";
        }
        boolean z17 = !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
        or1.j1 j1Var2 = i1Var.f429039d;
        if (z17) {
            android.content.Intent intent3 = new android.content.Intent();
            intent3.putExtra("rawUrl", str);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EnterpriseBizEntranceListHelper", "KRawUrl :%s", str);
            intent3.putExtra("useJs", true);
            intent3.addFlags(67108864);
            j45.l.n(j1Var2.f429043a, "webview", ".ui.tools.WebViewUI", intent3, 0);
            return;
        }
        qk.o6 o6Var2 = (qk.o6) i95.n0.c(qk.o6.class);
        java.lang.String str3 = j1Var2.f429044b;
        android.util.LruCache lruCache = ((c01.j0) o6Var2).f118800d;
        w01.c cVar = (w01.c) lruCache.get(str3);
        if (cVar == null) {
            cVar = new w01.c();
            lruCache.put(str3, cVar);
        }
        cVar.a(str3);
        qk.o6 o6Var3 = (qk.o6) i95.n0.c(qk.o6.class);
        android.app.Activity activity2 = j1Var2.f429043a;
        android.util.LruCache lruCache2 = ((c01.j0) o6Var3).f118800d;
        java.lang.String str4 = j1Var2.f429044b;
        w01.c cVar2 = (w01.c) lruCache2.get(str4);
        if (cVar2 == null) {
            cVar2 = new w01.c();
            lruCache2.put(str4, cVar2);
        }
        cVar2.b(activity2);
    }
}
