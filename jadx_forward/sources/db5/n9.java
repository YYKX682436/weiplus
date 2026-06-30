package db5;

/* loaded from: classes15.dex */
public class n9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f309984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f309985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 f309986f;

    public n9(com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 abstractC21534x4b3e8b10, int i17, int i18) {
        this.f309986f = abstractC21534x4b3e8b10;
        this.f309984d = i17;
        this.f309985e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.AbstractC21534x4b3e8b10 abstractC21534x4b3e8b10 = this.f309986f;
        java.lang.String[] strArr = abstractC21534x4b3e8b10.f279239f;
        if (strArr.length <= 0) {
            return;
        }
        int measureText = strArr[strArr.length + (-1)] != null ? (int) abstractC21534x4b3e8b10.f279248r.measureText(strArr[strArr.length - 1]) : 0;
        int b17 = i65.a.b(abstractC21534x4b3e8b10.getContext(), 16) + measureText;
        int length = (int) (abstractC21534x4b3e8b10.f279239f.length * abstractC21534x4b3e8b10.f279241h * abstractC21534x4b3e8b10.f279237d);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(length);
        int i17 = this.f309984d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VerticalScrollBar", "onDraw newHeight:%s, viewHeight:%s, alphabetWidth:%s, newWidth:%s", valueOf, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(measureText), java.lang.Integer.valueOf(b17));
        if (length == 0) {
            length = i17;
        }
        int i18 = this.f309985e;
        if (b17 > i18) {
            b17 = i18;
        }
        android.view.ViewGroup.LayoutParams layoutParams = abstractC21534x4b3e8b10.getLayoutParams();
        layoutParams.width = b17;
        layoutParams.height = length;
        abstractC21534x4b3e8b10.setLayoutParams(layoutParams);
    }
}
