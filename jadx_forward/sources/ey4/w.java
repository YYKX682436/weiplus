package ey4;

/* loaded from: classes8.dex */
public class w extends ey4.v {

    /* renamed from: d, reason: collision with root package name */
    public static final int f339166d = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 48);

    /* renamed from: e, reason: collision with root package name */
    public static final int f339167e = i65.a.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 43);

    public w() {
        super(0);
    }

    public int a() {
        ey4.c0 c0Var = this.f339164b;
        if (c0Var.f339147f) {
            return 7;
        }
        if (c0Var.f339146e <= 1) {
            android.view.Display defaultDisplay = ((android.view.WindowManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("window")).getDefaultDisplay();
            c0Var.f339146e = new int[]{defaultDisplay.getWidth(), defaultDisplay.getHeight()}[0];
        }
        return c0Var.f339146e / f339167e;
    }

    public int b() {
        int i17 = this.f339164b.f339145d / f339166d;
        if (i17 > 3) {
            i17 = 3;
        }
        if (i17 < 1) {
            return 1;
        }
        return i17;
    }
}
