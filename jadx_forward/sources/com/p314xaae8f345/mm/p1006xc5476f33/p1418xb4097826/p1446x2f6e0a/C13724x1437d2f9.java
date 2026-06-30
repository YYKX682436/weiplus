package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1446x2f6e0a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\f"}, d2 = {"Lcom/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/EditPhotoPluginLayout;", "", com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, "Ljz5/f0;", "setOutputSize", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-vlog-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.edit.FinderFixRatioPhoneEditPluginLayout */
/* loaded from: classes3.dex */
public final class C13724x1437d2f9 extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13724x1437d2f9(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    /* renamed from: setOutputSize */
    private final void m55750xd0770aa4(java.lang.String str) {
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, options);
        if (options.outWidth <= 0 || options.outHeight <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize getOption error. path:" + str);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditPhotoPluginLayout", "setOutputSize config[origin[" + options.outWidth + ',' + options.outHeight + "] target[1080,1440]");
        l45.q qVar = getEditPhotoWrapper().f547120o;
        if (qVar != null) {
            ((l45.n) qVar).x(1080, 1440);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        android.os.Bundle bundle;
        super.r(bVar);
        l45.q qVar = getEditPhotoWrapper().f547120o;
        if (qVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider = getConfigProvider();
            ((l45.n) qVar).f398001i = (configProvider == null || (bundle = configProvider.M) == null) ? 0.75f : bundle.getFloat("crop_fix_ratio");
        }
        post(new dc2.d(this));
        if (bVar != null) {
            m55750xd0770aa4(bVar.f303746j);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17015x41d97285, ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        int ordinal = status.ordinal();
        if (ordinal != 72) {
            if (ordinal == 79 || ordinal == 90) {
                return;
            }
            if (ordinal == 85) {
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((android.app.Activity) context).finish();
                return;
            } else if (ordinal != 86) {
                super.w(status, bundle);
                return;
            } else {
                getEditPhotoWrapper().b();
                getEditPhotoWrapper().c(null);
                return;
            }
        }
        super.w(status, bundle);
        getPhotoControlUI().f547210m.setVisibility(4);
        getPhotoControlUI().f547211n.setVisibility(4);
        getPhotoControlUI().f547210m.setOnClickListener(null);
        getPhotoControlUI().f547211n.setOnClickListener(null);
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.d7y);
        if (findViewById != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.d8n);
        if (findViewById2 == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/edit/FinderFixRatioPhoneEditPluginLayout", "statusChange", "(Lcom/tencent/mm/plugin/recordvideo/plugin/parent/IRecordStatus$RecordStatus;Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }
}
