package com.tencent.mm.app;

/* loaded from: classes11.dex */
public class b0 implements com.tencent.mm.pluginsdk.ui.j1 {

    /* renamed from: d, reason: collision with root package name */
    public volatile android.graphics.Bitmap f53335d = null;

    /* renamed from: e, reason: collision with root package name */
    public kv.c0 f53336e = null;

    /* renamed from: f, reason: collision with root package name */
    public kv.f0 f53337f;

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap W0(java.lang.String str) {
        if (this.f53337f == null) {
            synchronized (this) {
                if (this.f53337f == null) {
                    ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                    this.f53337f = com.tencent.mm.modelavatar.d1.Ai();
                }
            }
        }
        return ((com.tencent.mm.modelavatar.z) this.f53337f).l(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.pluginsdk.ui.j1
    public void X9(com.tencent.mm.pluginsdk.ui.n1 n1Var) {
        if (n1Var instanceof kv.e0) {
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ai().d((kv.e0) n1Var);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap Zg(java.lang.String str, int i17, int i18, int i19) {
        if (this.f53336e == null) {
            synchronized (this) {
                if (this.f53336e == null) {
                    this.f53336e = (kv.c0) i95.n0.c(kv.c0.class);
                }
            }
        }
        return ((com.tencent.mm.feature.avatar.w) this.f53336e).Vi(str, i17, i18, i19);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap loadBitmap(java.lang.String str) {
        if (this.f53336e == null) {
            synchronized (this) {
                if (this.f53336e == null) {
                    this.f53336e = (kv.c0) i95.n0.c(kv.c0.class);
                }
            }
        }
        ((com.tencent.mm.feature.avatar.w) this.f53336e).getClass();
        return com.tencent.mm.modelavatar.g.a(str);
    }

    @Override // com.tencent.mm.pluginsdk.ui.j1
    public android.graphics.Bitmap uc() {
        if (this.f53335d == null || this.f53335d.isRecycled()) {
            synchronized (this) {
                if (this.f53335d == null || this.f53335d.isRecycled()) {
                    this.f53335d = bp.b.decodeResource(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources(), com.tencent.mm.R.raw.default_avatar, null);
                }
            }
        }
        return this.f53335d;
    }
}
