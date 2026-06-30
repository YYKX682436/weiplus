package com.tencent.mm.plugin.appbrand.jsapi.auth.entity;

/* loaded from: classes7.dex */
public final class l0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 f79512d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f79513e;

    public l0(com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var, int i17) {
        this.f79512d = m0Var;
        this.f79513e = i17;
    }

    @Override // db5.t4
    public final void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        int i18 = this.f79513e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.m0 m0Var = this.f79512d;
        if (itemId != 0) {
            if (itemId != 1) {
                return;
            }
            m0Var.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("0", m0Var.f79522d.getAppId());
            android.content.Context context = m0Var.f79519a;
            intent.putExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE, context.getResources().getString(com.tencent.mm.R.string.d4w));
            intent.putExtra("extra_call_by_appbrand", true);
            intent.putExtra("extra_is_edit_page", true);
            java.util.ArrayList arrayList = m0Var.f79523e;
            intent.putExtra("extra_edit_avatar_id", ((fl1.h1) arrayList.get(i18)).f263786h);
            intent.putExtra("extra_edit_frefill_avatar_name", ((fl1.h1) arrayList.get(i18)).f263780b);
            intent.putExtra("extra_edit_frefill_avatar_icon", ((fl1.h1) arrayList.get(i18)).f263785g);
            boolean z17 = context instanceof com.tencent.mm.ui.MMActivity;
            int i19 = m0Var.f79525g;
            if (z17) {
                j45.l.w((com.tencent.mm.ui.MMActivity) context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i19, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.h0(m0Var, i18));
                return;
            } else {
                nf.g.a(context).f(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.i0(m0Var, i18));
                j45.l.v(context, ".plugin.webview.ui.tools.CreateAvatarUI", intent, i19);
                return;
            }
        }
        com.tencent.mm.plugin.appbrand.jsapi.auth.entity.l lVar = m0Var.f79526h;
        m0Var.getClass();
        com.tencent.mars.xlog.Log.i("WxaUserInfoListOperationController", "[deleteUser] index=" + i18);
        if (!com.tencent.mars.comm.NetStatusUtil.isConnected(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            android.content.Context context2 = m0Var.f79519a;
            db5.t7.makeText(context2, context2.getResources().getString(com.tencent.mm.R.string.f490500wu), 1).show();
            if (lVar != null) {
                lVar.onStart();
            }
            if (lVar != null) {
                lVar.a(false);
                return;
            }
            return;
        }
        java.util.ArrayList arrayList2 = m0Var.f79523e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(arrayList2);
        arrayList3.remove(i18);
        java.lang.Object obj = arrayList2.get(i18);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        fl1.h1 h1Var = (fl1.h1) obj;
        if (h1Var.f263786h == m0Var.f79524f.get()) {
            ((fl1.h1) arrayList3.get(0)).f263784f = true;
        }
        h1Var.f263784f = false;
        m0Var.e(arrayList3);
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.c0(lVar));
        com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.ipcinvoker.type.IPCInteger(h1Var.f263786h), com.tencent.mm.plugin.appbrand.jsapi.auth.entity.b0.class, new com.tencent.mm.plugin.appbrand.jsapi.auth.entity.e0(m0Var, i18, arrayList3, lVar));
    }
}
