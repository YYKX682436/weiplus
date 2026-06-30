package kz3;

/* loaded from: classes15.dex */
public final class k implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kz3.l f395414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ry3.p f395415b;

    public k(kz3.l lVar, ry3.p pVar) {
        this.f395414a = lVar;
        this.f395415b = pVar;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "dealWithImageOcr onCallback session: %s, success: %b, errType: %s, errCode: %s, errMsg: %s, result: %s, reqKey: %s", java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(result.f483077b), java.lang.Integer.valueOf(result.f483078c), java.lang.Integer.valueOf(result.f483079d), result.f483080e, result.f483085j, result.f483082g);
        kz3.l lVar = this.f395414a;
        lVar.f395423h = true;
        kz3.m mVar = lVar.f395425j;
        if (mVar != null) {
            ((kz3.n) mVar).f395437c = result.f483087l;
        }
        if (!result.f483077b) {
            lVar.f(result.f483078c, result.f483079d);
            return;
        }
        java.lang.String str = result.f483085j;
        if ((str == null || str.length() == 0) || result.f483086k) {
            lVar.f(4, 202);
            return;
        }
        android.content.Context context = lVar.f395416a;
        boolean z17 = context.getResources().getConfiguration().orientation == 2;
        float f17 = !z17 ? 0.7f : 1.0f;
        int i17 = !z17 ? 1 : 2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageGalleryImageOCRHelper", "showImageOCRResult ocrResultType: %d, isLandscape: %s, dialogHeightRate: %f, animationType: %s", java.lang.Integer.valueOf(result.f483087l), java.lang.Boolean.valueOf(z17), java.lang.Float.valueOf(f17), java.lang.Integer.valueOf(i17));
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putLong("session_id", result.f483076a);
        bundle.putString("req_key", result.f483082g);
        bundle.putInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, this.f395415b.f483073n);
        bundle.putInt("template_type", 2);
        bundle.putFloat("fixed_dialog_height_rate", f17);
        bundle.putBoolean("enable_dialog_scroll", false);
        bundle.putBoolean("enable_cancel_outside", false);
        bundle.putBoolean("show_after_webview_ready", true);
        ry3.m mVar2 = lVar.f395418c;
        bundle.putBoolean("enable_full_screen", mVar2 != null ? mVar2.f483057a : true);
        ry3.m mVar3 = lVar.f395418c;
        bundle.putBoolean("enable_scroll_right_close", mVar3 != null ? mVar3.f483058b : false);
        kz3.p pVar = lVar.f395426k;
        if (pVar != null) {
            android.view.View view = lVar.f395420e;
            pVar.f395443h = view;
            if (view != null) {
                pVar.f395445m = view.getMeasuredWidth();
                pVar.f395444i = view.getMeasuredHeight();
            }
            pVar.f395442g = lVar.f395419d;
            pVar.f395452t = i17;
            pVar.f395451s = i17 != 1 ? i17 != 2 ? null : new lz3.a(i17) : new lz3.f(pVar.f395439d, i17);
            pVar.f395441f = lVar.f395418c;
        }
        uy3.j0 b17 = uy3.n0.b(context, bundle, lVar.f395429n);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(pVar);
        kz3.e eVar = new kz3.e(lVar, pVar);
        com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.AbstractC17267x816864c7 abstractC17267x816864c7 = b17.f513489q;
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68535xf45e5404(eVar);
        }
        kz3.i listener = lVar.f395434s;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        if (abstractC17267x816864c7 != null) {
            abstractC17267x816864c7.m68537xd439dbc3(listener);
        }
        if (i17 == 1) {
            android.content.Context context2 = b17.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd c17272xd6a1a6fd = new com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.box.C17272xd6a1a6fd(context2, null);
            lVar.f395430o = c17272xd6a1a6fd;
            c17272xd6a1a6fd.mo68549x3a44cbb7(lVar.f395431p);
            uy3.q qVar = lVar.f395430o;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(qVar);
            if (abstractC17267x816864c7 != null) {
                abstractC17267x816864c7.m68536xaa9a0776(qVar);
            }
        }
        lVar.f395428m = b17;
    }
}
