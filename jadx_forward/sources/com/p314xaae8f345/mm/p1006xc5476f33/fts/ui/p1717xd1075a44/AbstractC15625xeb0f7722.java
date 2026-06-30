package com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44;

/* renamed from: com.tencent.mm.plugin.fts.ui.widget.VoiceInputLayout */
/* loaded from: classes15.dex */
public abstract class AbstractC15625xeb0f7722 extends com.p314xaae8f345.mm.p2776x373aa5.x2c.C22869xb039b5f8 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 f219764d;

    /* renamed from: e, reason: collision with root package name */
    public z21.e f219765e;

    /* renamed from: f, reason: collision with root package name */
    public int f219766f;

    /* renamed from: g, reason: collision with root package name */
    public android.app.Activity f219767g;

    /* renamed from: h, reason: collision with root package name */
    public final int f219768h;

    /* renamed from: i, reason: collision with root package name */
    public final int f219769i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.t1 f219770m;

    /* renamed from: n, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219771n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f219772o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f219773p;

    public AbstractC15625xeb0f7722(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.f219764d = null;
        this.f219766f = 1;
        this.f219767g = null;
        this.f219768h = 3000;
        this.f219769i = 10000;
        this.f219771n = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.p1(this);
        this.f219772o = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.r1(this);
        this.f219773p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.s1(this), true);
    }

    public void c() {
        if (this.f219766f == 1) {
            return;
        }
        this.f219766f = 1;
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var = this.f219764d;
        if (u1Var != null) {
            u1Var.getClass();
        }
        z21.e eVar = this.f219765e;
        if (eVar != null) {
            eVar.mo48278xae7a2e7a(true);
        }
        j();
    }

    public abstract void e(boolean z17);

    /* renamed from: getCurrentState */
    public int m63633xb7d72d0e() {
        return this.f219766f;
    }

    public abstract void i(int i17);

    public abstract void j();

    public void k(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var;
        if (this.f219766f == 1) {
            return;
        }
        this.f219766f = 1;
        j();
        if (!z17 || (u1Var = this.f219764d) == null) {
            return;
        }
        u1Var.getClass();
    }

    /* renamed from: setActivity */
    public void m63634x13de9191(android.app.Activity activity) {
        this.f219767g = activity;
    }

    /* renamed from: setFromFullScreen */
    public void m63635xed728427(boolean z17) {
    }

    /* renamed from: setLongClickLisnter */
    public void m63636xa5426eff(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.t1 t1Var) {
        this.f219770m = t1Var;
    }

    /* renamed from: setVoiceDetectListener */
    public void m63637xc1b94687(com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.u1 u1Var) {
        this.f219764d = u1Var;
    }

    public AbstractC15625xeb0f7722(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f219764d = null;
        this.f219766f = 1;
        this.f219767g = null;
        this.f219768h = 3000;
        this.f219769i = 10000;
        this.f219771n = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.p1(this);
        this.f219772o = new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.r1(this);
        this.f219773p = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(new com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.p1717xd1075a44.s1(this), true);
    }
}
