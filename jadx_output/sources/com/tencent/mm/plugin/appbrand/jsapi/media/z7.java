package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes14.dex */
public final class z7 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.media.c8 f82179d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.tencent.mm.plugin.appbrand.jsapi.media.c8 c8Var) {
        super(0);
        this.f82179d = c8Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        int i17 = c4.f.f38283g;
        int i18 = androidx.media.AudioAttributesCompat.f11693b;
        c4.b cVar = android.os.Build.VERSION.SDK_INT >= 26 ? new c4.c() : new c4.b();
        cVar.a(1);
        cVar.f38263a.setLegacyStreamType(3);
        androidx.media.AudioAttributesCompat audioAttributesCompat = new androidx.media.AudioAttributesCompat(cVar.build());
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (android.media.AudioManager.OnAudioFocusChangeListener) ((jz5.n) this.f82179d.f81749i).getValue();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (onAudioFocusChangeListener != null) {
            return new c4.f(2, onAudioFocusChangeListener, handler, audioAttributesCompat, false);
        }
        throw new java.lang.IllegalArgumentException("OnAudioFocusChangeListener must not be null");
    }
}
