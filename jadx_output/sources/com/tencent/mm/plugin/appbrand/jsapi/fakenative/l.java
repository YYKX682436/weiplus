package com.tencent.mm.plugin.appbrand.jsapi.fakenative;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f80980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f80981e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.fakenative.h f80982f;

    public l(com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar, android.content.Context context, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f80982f = hVar;
        this.f80980d = context;
        this.f80981e = onCancelListener;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.jsapi.fakenative.h hVar = this.f80982f;
        hVar.getClass();
        com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.appbrand.jsapi.fakenative.m(hVar));
        android.content.Context context = this.f80980d;
        if (context != null) {
            hVar.f80955h = db5.e1.Q(context, context.getString(com.tencent.mm.R.string.f490573yv), context.getString(com.tencent.mm.R.string.f490604zq), true, true, this.f80981e);
        }
    }
}
