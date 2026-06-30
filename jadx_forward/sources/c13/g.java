package c13;

/* loaded from: classes11.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81 f119412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cv.v0 f119413e;

    public g(com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24112xdba77f81 c24112xdba77f81, cv.v0 v0Var) {
        this.f119412d = c24112xdba77f81;
        this.f119413e = v0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.p2845xc516c4b6.p2864x6eae83e3.C24132x9b57f23e c24132x9b57f23e = c13.b0.f119394e;
        if (c24132x9b57f23e != null) {
            c24132x9b57f23e.m89482xb3027546(this.f119412d, new c13.c("callback onAudioOutputDeviceChanged(" + this.f119413e + ')'));
        }
    }
}
