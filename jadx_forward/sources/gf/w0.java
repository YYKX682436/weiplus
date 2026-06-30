package gf;

/* loaded from: classes7.dex */
public final class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gf.x0 f352715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f352716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback f352717f;

    public w0(gf.x0 x0Var, java.lang.String str, com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback resourceLoadCallback) {
        this.f352715d = x0Var;
        this.f352716e = str;
        this.f352717f = resourceLoadCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] mo95914x3830a714 = this.f352715d.mo95914x3830a714(this.f352716e);
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25597x90fd3ced.ResourceLoadCallback resourceLoadCallback = this.f352717f;
        if (resourceLoadCallback != null) {
            resourceLoadCallback.mo95917x2027c572(mo95914x3830a714);
        }
    }
}
