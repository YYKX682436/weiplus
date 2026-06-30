package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f172041d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f172042e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f172043f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(int i17, java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        super(0);
        this.f172041d = i17;
        this.f172042e = runnable;
        this.f172043f = runnable2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        if (this.f172041d == 0) {
            java.lang.Runnable runnable = this.f172042e;
            if (runnable != null) {
                runnable.run();
            }
        } else {
            java.lang.Runnable runnable2 = this.f172043f;
            if (runnable2 != null) {
                runnable2.run();
            }
        }
        return jz5.f0.f384359a;
    }
}
