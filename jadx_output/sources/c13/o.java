package c13;

/* loaded from: classes11.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f37890d;

    public o(boolean z17) {
        this.f37890d = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.pigeon.flutter_voip.VoIPFlutterApi voIPFlutterApi = c13.b0.f37861e;
        if (voIPFlutterApi != null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callback onScreenStateChanged(");
            boolean z17 = this.f37890d;
            sb6.append(z17);
            sb6.append(')');
            voIPFlutterApi.onScreenStateChanged(z17, new c13.c(sb6.toString()));
        }
    }
}
