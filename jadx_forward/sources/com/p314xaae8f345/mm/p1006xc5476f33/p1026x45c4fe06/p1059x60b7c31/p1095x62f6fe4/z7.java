package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes14.dex */
public final class z7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c8 f163712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.c8 c8Var) {
        super(0);
        this.f163712d = c8Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = c4.f.f119816g;
        int i18 = p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f.f93226b;
        c4.b cVar = android.os.Build.VERSION.SDK_INT >= 26 ? new c4.c() : new c4.b();
        cVar.a(1);
        cVar.f119796a.setLegacyStreamType(3);
        p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f c1125xc009ef8f = new p012xc85e97e9.p096x62f6fe4.C1125xc009ef8f(cVar.mo14107x59bc66e());
        android.media.AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (android.media.AudioManager.OnAudioFocusChangeListener) ((jz5.n) this.f163712d.f163282i).mo141623x754a37bb();
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (onAudioFocusChangeListener != null) {
            return new c4.f(2, onAudioFocusChangeListener, handler, c1125xc009ef8f, false);
        }
        throw new java.lang.IllegalArgumentException("OnAudioFocusChangeListener must not be null");
    }
}
