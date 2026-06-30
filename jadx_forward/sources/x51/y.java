package x51;

/* loaded from: classes12.dex */
public class y implements j35.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f533645a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f533646b;

    public y(java.lang.Runnable runnable, java.lang.Runnable runnable2) {
        this.f533645a = runnable;
        this.f533646b = runnable2;
    }

    @Override // j35.b0
    /* renamed from: onRequestPermissionsResult */
    public void mo2413x953457f1(int i17, java.lang.String[] strArr, int[] iArr) {
        if (iArr[0] == 0) {
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.a(this.f533645a);
        } else {
            com.p314xaae8f345.mm.p1004x2137b148.C11325x6ace8b92.a(this.f533646b);
        }
    }
}
