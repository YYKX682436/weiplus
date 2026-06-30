package zd;

/* loaded from: classes7.dex */
public class e implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f553036d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int[] f553037e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean[] f553038f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f553039g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f553040h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ zd.d f553041i;

    public e(zd.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var, int[] iArr, boolean[] zArr, int i17, android.view.View view) {
        this.f553041i = dVar;
        this.f553036d = e9Var;
        this.f553037e = iArr;
        this.f553038f = zArr;
        this.f553039g = i17;
        this.f553040h = view;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var = this.f553036d;
        int[] a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.f5.a(e9Var);
        int i17 = a17[0];
        int[] iArr = this.f553037e;
        if (i17 == iArr[0] || a17[1] == iArr[1]) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiSetDeviceOrientation", "setDeviceOrientation layout done width[%d]  height[%d]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(a17[1]));
        this.f553038f[0] = true;
        e9Var.a(this.f553039g, this.f553041i.o("ok"));
        this.f553040h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
