package wj0;

/* loaded from: classes5.dex */
public class i implements com.p314xaae8f345.mm.app.a3 {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean[] f528094d = {false};

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: getHandler */
    public android.os.Handler mo14497x67189314() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppBackground */
    public void mo510x3be51a90(java.lang.String str) {
        boolean[] zArr = f528094d;
        synchronized (zArr) {
            zArr[0] = false;
        }
    }

    @Override // com.p314xaae8f345.mm.app.a3
    /* renamed from: onAppForeground */
    public void mo511x1952ea5(java.lang.String str) {
        boolean[] zArr = f528094d;
        synchronized (zArr) {
            zArr[0] = true;
        }
    }
}
