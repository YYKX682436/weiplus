package com.p314xaae8f345.mm.ui;

/* renamed from: com.tencent.mm.ui.FriendSnsPreference */
/* loaded from: classes8.dex */
public final class C21368x560b7e55 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54 {
    public java.lang.String Y1;
    public long Z1;

    public C21368x560b7e55(android.content.Context context) {
        this(context, null);
    }

    public void h0(java.lang.String str) {
        this.Q = -1;
        this.Y1 = str;
        this.Z1 = 0L;
        if (this.S != null) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, str, null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21549x15041e54, com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        if (this.Y1 != null && gm0.j1.a()) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, this.Y1, null);
        }
        if (this.Z1 == 0 || this.S == null) {
            return;
        }
        ((n34.v4) ((p94.s0) i95.n0.c(p94.s0.class))).Bi(this.Z1, this.S, this.f279303d.hashCode());
    }

    public C21368x560b7e55(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21368x560b7e55(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.Y1 = null;
    }
}
