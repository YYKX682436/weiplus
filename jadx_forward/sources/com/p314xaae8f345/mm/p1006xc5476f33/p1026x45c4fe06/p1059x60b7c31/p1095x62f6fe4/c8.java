package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4;

/* loaded from: classes7.dex */
public final class c8 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8 {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f163280g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f163281h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f163282i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f163283m;

    public c8(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f163280g = "MicroMsg.WxaAudioFocusService#" + hashCode();
        this.f163281h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.y7(context, this));
        this.f163282i = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.b8(this));
        this.f163283m = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.z7(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public boolean a() {
        jz5.g gVar = this.f163281h;
        if (((android.media.AudioManager) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
            return false;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(audioManager);
        return 1 == c4.h.a(audioManager, (c4.f) ((jz5.n) this.f163283m).mo141623x754a37bb());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public java.lang.String c() {
        return this.f163280g;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.e8
    public boolean g() {
        jz5.g gVar = this.f163281h;
        if (((android.media.AudioManager) ((jz5.n) gVar).mo141623x754a37bb()) == null) {
            return false;
        }
        android.media.AudioManager audioManager = (android.media.AudioManager) ((jz5.n) gVar).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(audioManager);
        return 1 == c4.h.b(audioManager, (c4.f) ((jz5.n) this.f163283m).mo141623x754a37bb());
    }
}
