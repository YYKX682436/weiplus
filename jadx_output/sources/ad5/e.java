package ad5;

/* loaded from: classes10.dex */
public final class e extends ad5.l0 {

    /* renamed from: a, reason: collision with root package name */
    public static final ad5.e f3244a = new ad5.e();

    public e() {
        super(null);
    }

    @Override // ad5.l0
    public int a() {
        return com.tencent.mm.R.string.pbe;
    }

    @Override // ad5.l0
    public int b() {
        return com.tencent.mm.R.raw.favorites_filled;
    }

    @Override // ad5.l0
    public int c() {
        return com.tencent.mm.R.raw.favorites_regular;
    }

    @Override // ad5.l0
    public void d(android.content.Context context, ad5.t0 t0Var) {
        ad5.h hVar;
        java.lang.Object obj;
        kotlin.jvm.internal.o.g(context, "context");
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onFavoriteClicked, payloads is null");
            return;
        }
        ad5.q0 q0Var = ad5.q0.f3300a;
        java.util.Map map = t0Var.f3314a;
        java.lang.Object obj2 = map.get(q0Var);
        if (!(obj2 instanceof java.util.List)) {
            obj2 = null;
        }
        java.util.List list = (java.util.List) obj2;
        if (list == null || list.isEmpty()) {
            com.tencent.mars.xlog.Log.e("MicroMsg.MsgHistoryGalleryOperation", "onFavoriteClicked, msgInfoList is empty");
            return;
        }
        java.lang.Object obj3 = map.get(ad5.n0.f3289a);
        if (!kotlin.jvm.internal.m0.f(obj3, 3)) {
            obj3 = null;
        }
        yz5.q qVar = (yz5.q) obj3;
        java.lang.String Q0 = ((com.tencent.mm.storage.f9) kz5.n0.X(list)).Q0();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (!com.tencent.mm.ui.chatting.la.a((com.tencent.mm.storage.f9) it.next())) {
                int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
                com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
                e4Var.f211776c = context.getResources().getString(com.tencent.mm.R.string.c96);
                e4Var.b(com.tencent.mm.R.raw.icons_filled_info);
                e4Var.c();
                return;
            }
        }
        long g17 = ip.c.g();
        com.tencent.mm.ui.chatting.e3 e3Var = com.tencent.mm.ui.chatting.e3.f200454a;
        if (e3Var.a(list, g17)) {
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var2.f211776c = context.getResources().getString(com.tencent.mm.R.string.f491233cf1, com.tencent.mm.sdk.platformtools.t8.f0(g17));
            e4Var2.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var2.c();
            return;
        }
        long i19 = ip.c.i();
        if (e3Var.b(list, i19)) {
            int i27 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var3 = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var3.f211776c = context.getResources().getString(com.tencent.mm.R.string.f491234cf2, com.tencent.mm.sdk.platformtools.t8.f0(i19));
            e4Var3.b(com.tencent.mm.R.raw.icons_filled_info);
            e4Var3.c();
            return;
        }
        com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent = new com.tencent.mm.autogen.events.DoFavoriteEvent();
        boolean i28 = com.tencent.mm.pluginsdk.model.e2.i(context, doFavoriteEvent, Q0, list, false, false);
        am.c4 c4Var = doFavoriteEvent.f54090g;
        if (!i28) {
            if (list.size() > 1) {
                java.lang.String string = c4Var.f6326l >= 0 ? context.getString(com.tencent.mm.R.string.caq) : context.getString(com.tencent.mm.R.string.cap);
                kotlin.jvm.internal.o.d(string);
                db5.e1.y(context, string, "", context.getString(com.tencent.mm.R.string.f490939bb1), null);
            } else {
                db5.e1.i(context, c4Var.f6326l, 0);
            }
            if (qVar != null) {
                qVar.invoke(this, new ad5.h(0, "fillEventInfo failed", 1, null), list);
                return;
            }
            return;
        }
        c4Var.f6323i = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        c4Var.f6327m = 45;
        doFavoriteEvent.e();
        int i29 = doFavoriteEvent.f54091h.f6433a;
        if (i29 == -2) {
            obj = new ad5.h(0, "fav storage full", 1, null);
        } else {
            if (i29 > 0) {
                hVar = new ad5.h(i29, "fav failed");
            } else if (i29 <= 0) {
                obj = ad5.i.f3267a;
            } else {
                hVar = new ad5.h(i29, "fav unknown error");
            }
            obj = hVar;
        }
        if (qVar != null) {
            qVar.invoke(this, obj, list);
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ad5.e)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return -1464516037;
    }

    public java.lang.String toString() {
        return "Favorite";
    }
}
