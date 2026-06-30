package ol1;

/* loaded from: classes15.dex */
public class q implements ol1.p {

    /* renamed from: d, reason: collision with root package name */
    public final int[] f427669d = new int[2];

    /* renamed from: e, reason: collision with root package name */
    public int f427670e = -1;

    /* renamed from: f, reason: collision with root package name */
    public int f427671f = -1;

    public final int[] a() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int[] iArr = this.f427669d;
        iArr[0] = width;
        iArr[1] = defaultDisplay.getHeight();
        return iArr;
    }

    @Override // ol1.p
    /* renamed from: setForceHeight */
    public void mo151622x4133a630(int i17) {
        this.f427670e = i17;
    }
}
