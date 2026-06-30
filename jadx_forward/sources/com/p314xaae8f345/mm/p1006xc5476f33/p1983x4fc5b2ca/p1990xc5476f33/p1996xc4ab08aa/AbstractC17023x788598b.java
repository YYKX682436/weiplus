package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\t\u001a\u00020\u00028\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/plugin/recordvideo/plugin/parent/RecordCheckAudioPermissionPluginLayout;", "Lcom/tencent/mm/plugin/recordvideo/plugin/parent/BaseScopePluginLayout;", "", "i", "Z", "getCheckAudioPermission", "()Z", "setCheckAudioPermission", "(Z)V", "checkAudioPermission", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.recordvideo.plugin.parent.RecordCheckAudioPermissionPluginLayout */
/* loaded from: classes10.dex */
public abstract class AbstractC17023x788598b extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17011x9ad37dc0 {

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean checkAudioPermission;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f237362m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC17023x788598b(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
    }

    public abstract void A(boolean z17);

    public final boolean getCheckAudioPermission() {
        return this.checkAudioPermission;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void m(it3.y navigator, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 configProvider) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(navigator, "navigator");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(configProvider, "configProvider");
        super.m(navigator, configProvider);
        this.f237362m = configProvider;
        if (!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d)) {
            z();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onRequestPermissionsResult */
    public void mo61366x953457f1(int i17, java.lang.String[] permissions, int[] grantResults) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(permissions, "permissions");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(grantResults, "grantResults");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "onRequestPermissionsResult requestCode:" + i17 + " permissions:" + permissions + " grantResults:" + grantResults);
        super.mo61366x953457f1(i17, permissions, grantResults);
        if (i17 == 80) {
            if ((!(grantResults.length == 0)) && grantResults[0] == 0) {
                A(true);
            } else {
                db5.e1.C(getContext(), i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hss), i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hsu), i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hst), i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.hsr), false, new ju3.g1(this), new ju3.h1(this));
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        super.mo11001x57429eec();
        if (this.checkAudioPermission || !(!(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.C17020xf8b8139d))) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f237362m;
            if (c16993xacc19624 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16993xacc19624.f237215t, java.lang.Boolean.TRUE) : false) {
                tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
                android.content.Context context = getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                ((sb0.f) jVar).getClass();
                A(j35.u.h((android.app.Activity) context, "android.permission.RECORD_AUDIO"));
            }
        }
    }

    /* renamed from: setCheckAudioPermission */
    public final void m68022x9562f79f(boolean z17) {
        this.checkAudioPermission = z17;
    }

    public boolean z() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = this.f237362m;
        if (c16993xacc19624 != null ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16993xacc19624.f237215t, java.lang.Boolean.FALSE) : false) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordPluginLayout", "jump check audio permission");
            return true;
        }
        tb0.j jVar = (tb0.j) i95.n0.c(tb0.j.class);
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        ((sb0.f) jVar).getClass();
        boolean a17 = j35.u.a((android.app.Activity) context, "android.permission.RECORD_AUDIO", 80, "", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordCheckAudioPermissionPluginLayout", "checkAudioPermission " + a17 + " !");
        return a17;
    }
}
