package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes3.dex */
public final class j7 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.fav.ui.z7 f101201d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f101202e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f101203f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f101204g;

    public j7(com.tencent.mm.plugin.fav.ui.z7 z7Var, java.lang.String str, int i17, int i18) {
        this.f101201d = z7Var;
        this.f101202e = str;
        this.f101203f = i17;
        this.f101204g = i18;
    }

    @Override // com.tencent.mm.ui.xc
    public final void mmOnActivityResult(int i17, int i18, android.content.Intent intent) {
        if (i17 == 52428 && i18 == -1) {
            java.lang.String stringExtra = intent.getStringExtra("change_name");
            if (com.tencent.mm.sdk.platformtools.t8.K0(stringExtra)) {
                return;
            }
            com.tencent.mm.plugin.fav.ui.z7 z7Var = this.f101201d;
            com.tencent.mm.plugin.fav.ui.y8 y8Var = z7Var.f101669o;
            java.lang.String tag = this.f101202e;
            if (y8Var != null) {
                int i19 = this.f101203f;
                int i27 = this.f101204g;
                kotlin.jvm.internal.o.d(stringExtra);
                boolean x17 = y8Var.x(stringExtra);
                kotlinx.coroutines.y0 y0Var = y8Var.f101627f;
                if (x17) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FavTopFilter", "remove origin tag = " + tag + ", because rename changeName = " + stringExtra);
                    kotlin.jvm.internal.o.d(tag);
                    kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.fav.ui.t8(y8Var, tag, null), 3, null);
                } else {
                    kotlin.jvm.internal.o.d(tag);
                    kotlinx.coroutines.l.d(y0Var, null, null, new com.tencent.mm.plugin.fav.ui.i8(tag, stringExtra, y8Var, i27, i19, null), 3, null);
                }
            }
            kotlin.jvm.internal.o.f(tag, "$tag");
            kotlin.jvm.internal.o.d(stringExtra);
            com.tencent.mm.plugin.fav.ui.widget.FavTopTagPanel favTopTagPanel = z7Var.f101661g;
            favTopTagPanel.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.FavTopTagPanel", "[notifyFavTagChange] fav tag change listener call, origin name = " + tag + ", new name = " + stringExtra);
            java.util.Iterator it = favTopTagPanel.M.iterator();
            while (it.hasNext()) {
                w82.s0 s0Var = (w82.s0) it.next();
                if (kotlin.jvm.internal.o.b(s0Var.f443925a, tag)) {
                    java.lang.Object obj = favTopTagPanel.N.get(s0Var);
                    kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type android.view.ViewGroup");
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) obj;
                    ((android.widget.TextView) viewGroup.findViewById(com.tencent.mm.R.id.dvf)).setText(stringExtra);
                    favTopTagPanel.w(viewGroup);
                }
            }
        }
    }
}
