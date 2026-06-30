package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class c8 extends com.tencent.mm.plugin.appbrand.jsapi.media.e8 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f81747g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f81748h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f81749i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f81750m;

    public c8(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f81747g = "MicroMsg.WxaAudioFocusService#" + hashCode();
        this.f81748h = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.y7(context, this));
        this.f81749i = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.b8(this));
        this.f81750m = jz5.h.b(new com.tencent.mm.plugin.appbrand.jsapi.media.z7(this));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public boolean a() {
        jz5.g gVar = this.f81748h;
        if (((android.media.AudioManager) ((jz5.n) gVar).getValue()) == null) {
            return false;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.d(audioManager);
        return 1 == c4.h.a(audioManager, (c4.f) ((jz5.n) this.f81750m).getValue());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public java.lang.String c() {
        return this.f81747g;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.media.e8
    public boolean g() {
        jz5.g gVar = this.f81748h;
        if (((android.media.AudioManager) ((jz5.n) gVar).getValue()) == null) {
            return false;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) ((jz5.n) gVar).getValue();
        kotlin.jvm.internal.o.d(audioManager);
        return 1 == c4.h.b(audioManager, (c4.f) ((jz5.n) this.f81750m).getValue());
    }
}
