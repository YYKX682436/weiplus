package m13;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final m13.b f404395a = new m13.b();

    public final void a(android.content.Context context, int i17, boolean z17, i50.n callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(context)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ForceNotifyPermissionUtil", "checkPermission already granted");
            callback.a(true);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = i17 == 2 ? com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FORCE_NOTIFY_PERMISSION_LIVE_POP_COUNT_INT_SYNC : null;
        if (u3Var != null) {
            int r17 = gm0.j1.u().c().r(u3Var, 0);
            if (r17 >= 1) {
                callback.a(false);
                return;
            }
            gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(r17 + 1));
        }
        m13.a aVar = new m13.a(callback, context);
        jz5.l lVar = i17 != 1 ? i17 != 2 ? i17 != 3 ? new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573688ff4), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573685ff1)) : new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573688ff4), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573687ff3)) : new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573689ff5), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573686ff2)) : new jz5.l(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573688ff4), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573685ff1));
        java.lang.String title = (java.lang.String) lVar.f384366d;
        java.lang.String warningContent = (java.lang.String) lVar.f384367e;
        k13.h hVar = com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.f218862f;
        java.lang.String a17 = n25.a.a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "getMessageChannelIdUse(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(warningContent, "warningContent");
        com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.f218862f = aVar;
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.class);
        intent.putExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, title);
        intent.putExtra("warning_content", warningContent);
        if (z17) {
            intent.addFlags(805306368);
        }
        uf0.e eVar = (uf0.e) i95.n0.c(uf0.e.class);
        java.lang.String canonicalName = com.p314xaae8f345.mm.p1006xc5476f33.p1712x126205f4.ui.ActivityC15560xcaaa67b0.class.getCanonicalName();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(canonicalName);
        ((tf0.a) eVar).getClass();
        bm5.e.a(context, intent, warningContent, canonicalName, false, a17, false);
    }
}
