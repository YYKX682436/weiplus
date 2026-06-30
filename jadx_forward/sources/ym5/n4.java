package ym5;

/* loaded from: classes10.dex */
public final class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f544976d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f544977e;

    public n4(com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 c22801x87cbdc00, int i17) {
        this.f544976d = c22801x87cbdc00;
        this.f544977e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ym5.q3 actionCallback = this.f544976d.getActionCallback();
        if (actionCallback != null) {
            actionCallback.a(this.f544977e);
        }
    }
}
