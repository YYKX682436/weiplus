package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class y7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f82158d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.c8 f82159e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y7(android.content.Context context, com.tencent.mm.plugin.appbrand.jsapi.media.c8 c8Var) {
        super(0);
        this.f82158d = context;
        this.f82159e = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.Object systemService = this.f82158d.getSystemService("audio");
        android.media.AudioManager audioManager = systemService instanceof android.media.AudioManager ? (android.media.AudioManager) systemService : null;
        if (audioManager == null) {
            com.tencent.mars.xlog.Log.e(this.f82159e.f81747g, "audioManager is null");
        }
        return audioManager;
    }
}
