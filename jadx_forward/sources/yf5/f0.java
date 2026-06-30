package yf5;

/* loaded from: classes11.dex */
public final class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22361x72e80a33 f543402d;

    public f0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22361x72e80a33 c22361x72e80a33) {
        this.f543402d = c22361x72e80a33;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.C22361x72e80a33 c22361x72e80a33 = this.f543402d;
        c22361x72e80a33.requestLayout();
        c22361x72e80a33.invalidate();
    }
}
