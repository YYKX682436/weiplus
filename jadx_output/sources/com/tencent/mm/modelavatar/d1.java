package com.tencent.mm.modelavatar;

@j95.b
/* loaded from: classes11.dex */
public class d1 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelavatar.s0 f70435d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelavatar.z f70436e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelavatar.r f70437f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelavatar.o0 f70438g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f70439h = new com.tencent.mm.sdk.platformtools.b4(gm0.j1.e().a(), (com.tencent.mm.sdk.platformtools.a4) new com.tencent.mm.modelavatar.c1(this), false);

    public static com.tencent.mm.modelavatar.z Ai() {
        gm0.j1.b().c();
        if (Bi().f70436e == null) {
            Bi().f70436e = new com.tencent.mm.modelavatar.z();
        }
        return Bi().f70436e;
    }

    public static com.tencent.mm.modelavatar.d1 Bi() {
        return (com.tencent.mm.modelavatar.d1) i95.n0.c(com.tencent.mm.modelavatar.d1.class);
    }

    public static com.tencent.mm.modelavatar.o0 Di() {
        gm0.j1.b().c();
        if (Bi().f70438g == null) {
            Bi().f70438g = new com.tencent.mm.modelavatar.o0(gm0.j1.u().f273153f);
        }
        return Bi().f70438g;
    }

    public static com.tencent.mm.modelavatar.s0 Ni() {
        gm0.j1.b().c();
        if (Bi().f70435d == null) {
            Bi().f70435d = new com.tencent.mm.modelavatar.s0(gm0.j1.u().f273153f);
        }
        return Bi().f70435d;
    }

    public static com.tencent.mm.modelavatar.r wi() {
        gm0.j1.b().c();
        if (Bi().f70437f == null) {
            Bi().f70437f = new com.tencent.mm.modelavatar.r();
        }
        return Bi().f70437f;
    }

    @Override // i95.w
    public void onAccountInitialized(android.content.Context context) {
        super.onAccountInitialized(context);
        if (gm0.j1.b().f273244g.f273257a) {
            gm0.j1.u().c().w(90113, java.lang.Boolean.TRUE);
        }
        this.f70439h.c(com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        q25.b.b(new hn1.c(), "//avatar");
    }

    @Override // i95.w
    public void onAccountReleased(android.content.Context context) {
        super.onAccountReleased(context);
        this.f70439h.d();
        if (Bi().f70436e != null && com.tencent.mm.modelavatar.z.f70577d == null) {
            com.tencent.mm.modelavatar.z.f70577d = new com.tencent.mm.modelavatar.a(100);
        }
        com.tencent.mm.modelavatar.r rVar = Bi().f70437f;
        if (rVar != null) {
            gm0.j1.d().q(123, rVar);
        }
        com.tencent.mm.modelavatar.s0 s0Var = Bi().f70435d;
        if (s0Var != null) {
            ((lt0.f) s0Var.f70540e).clear();
        }
        q25.b.c("//avatar");
    }
}
