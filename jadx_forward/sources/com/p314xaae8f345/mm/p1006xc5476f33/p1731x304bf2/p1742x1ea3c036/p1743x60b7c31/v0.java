package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31;

/* loaded from: classes12.dex */
public final class v0 implements dr.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 f221286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w0 f221287b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f221288c;

    public v0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w0 w0Var, android.content.Context context) {
        this.f221286a = q5Var;
        this.f221287b = w0Var;
        this.f221288c = context;
    }

    @Override // dr.r
    public void a(int i17, com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb emojiInfo, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(emojiInfo, "emojiInfo");
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.p2409x60b7c31.q5 q5Var = this.f221286a;
        if (i17 == -1) {
            q5Var.a("emoji load failed", null);
            return;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1743x60b7c31.w0 w0Var = this.f221287b;
            w0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("getStoreEmoticonImage", "EmojiLoader.loadCover StateSuccess cover path = " + emojiInfo.h0());
            if (o35.a.b(emojiInfo.h0())) {
                w0Var.f(emojiInfo, q5Var);
            } else {
                emojiInfo.W(this.f221288c);
                w0Var.f(emojiInfo, q5Var);
            }
        }
    }
}
