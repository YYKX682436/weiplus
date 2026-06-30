package yd;

/* loaded from: classes7.dex */
public class n extends p012xc85e97e9.p016x746ad0e3.p019xd1075a44.C0092xf45d4375 {

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f542488g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.StringBuilder f542489h;

    /* renamed from: i, reason: collision with root package name */
    public yd.r f542490i;

    /* renamed from: m, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f542491m;

    public n(android.content.Context context) {
        super(context, null);
        this.f542488g = new java.util.ArrayList(4);
        this.f542489h = new java.lang.StringBuilder(100);
        this.f542490i = null;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new yd.m(this), true);
        this.f542491m = b4Var;
        setTextSize(12.0f);
        setTextColor(-65536);
        setFocusable(false);
        setClickable(false);
        setOnClickListener(null);
        b4Var.c(1000L, 1000L);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }
}
