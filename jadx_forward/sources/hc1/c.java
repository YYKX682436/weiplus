package hc1;

/* loaded from: classes13.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public final int[] f361819a = new int[2];

    /* renamed from: b, reason: collision with root package name */
    public int f361820b = -1;

    /* renamed from: c, reason: collision with root package name */
    public int f361821c = -1;

    public final int[] a() {
        android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
        int width = defaultDisplay.getWidth();
        int[] iArr = this.f361819a;
        iArr[0] = width;
        iArr[1] = defaultDisplay.getHeight();
        return iArr;
    }
}
