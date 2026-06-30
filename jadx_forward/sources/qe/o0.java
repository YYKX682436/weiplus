package qe;

/* loaded from: classes7.dex */
public class o0 implements com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f443514a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ qe.s0 f443515b;

    public o0(qe.s0 s0Var, java.lang.ref.WeakReference weakReference) {
        this.f443515b = s0Var;
        this.f443514a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.udp.p2634x32db7abc.C21331x7e0f8b18.NativeCallBackInterface
    /* renamed from: onCallBack */
    public void mo78290x9ac7b764(long j17, java.lang.String str) {
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.f0) this.f443514a.get()).mo51545x3498a0(new qe.n0(this, str, j17));
    }
}
