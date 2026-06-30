package qe;

/* loaded from: classes7.dex */
public class i0 implements com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443494a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.m0 f443495b;

    public i0(qe.m0 m0Var, java.lang.ref.WeakReference weakReference) {
        this.f443495b = m0Var;
        this.f443494a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.tcp.p2626x32db76dc.C21324x81e9ef38.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo78210x9ac7b764(long j17, java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) this.f443494a.get()).mo51545x3498a0(new qe.h0(this, str, j17));
    }
}
