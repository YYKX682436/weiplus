package lr4;

/* loaded from: classes11.dex */
public final class s implements lr4.d, android.view.View.OnCreateContextMenuListener, db5.t4, android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public kr4.g f402295d;

    @Override // android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(android.view.ContextMenu menu, android.view.View v17, android.view.ContextMenu.ContextMenuInfo menuInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuInfo, "menuInfo");
        kr4.g gVar = this.f402295d;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(gVar != null ? gVar.f69048xbed8694c : null, "w1wsayhisessionholder@w1wmsg")) {
            return;
        }
        menu.add(0, 2, 0, com.p314xaae8f345.mm.R.C30867xcad56011.f571900t0);
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f402295d = null;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menuItem, "menuItem");
        kr4.g gVar = this.f402295d;
        if (gVar == null || menuItem.getItemId() != 2) {
            return;
        }
        fr4.g0 g0Var = (fr4.g0) i95.n0.c(fr4.g0.class);
        if (g0Var.Bi().mo60485xc9e4dcd4(gVar.f72763xa3c65b86, false)) {
            kr4.n Vi = g0Var.Vi();
            java.lang.String field_sessionId = gVar.f69048xbed8694c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_sessionId, "field_sessionId");
            kr4.o y07 = Vi.y0(field_sessionId);
            Vi.f393054f.remove(field_sessionId);
            Vi.f393053e.remove(y07.f69160x3e123854 + '_' + y07.f69157x5568d387);
            Vi.mo49766xb06685ab((l75.f0) y07, false, com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984);
            android.database.Cursor B = Vi.f393052d.B("select rowid from W1wSessionInfo  where selfUserName = '" + y07.f69157x5568d387 + "' limit 1", null);
            try {
                boolean z17 = B.getCount() > 0;
                vz5.b.a(B, null);
                if (!z17) {
                    fr4.g0 g0Var2 = (fr4.g0) i95.n0.c(fr4.g0.class);
                    java.lang.String field_selfUserName = y07.f69157x5568d387;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_selfUserName, "field_selfUserName");
                    g0Var2.getClass();
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = g0Var2.f347360n;
                    if (((java.lang.Boolean) concurrentHashMap.get(field_selfUserName)) != null) {
                    }
                }
                g0Var.Bi().mo142179xf35bbb4(gVar.f69048xbed8694c, 6, gVar);
                kr4.k Ai = g0Var.Ai();
                kr4.e eVar = new kr4.e();
                eVar.f68903xdec927b = gVar.f69048xbed8694c;
                Ai.mo9951xb06685ab(eVar, new java.lang.String[0]);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    vz5.b.a(B, th6);
                    throw th7;
                }
            }
        }
        c01.w9.h(gVar.f69048xbed8694c, new lr4.r(gVar));
    }
}
