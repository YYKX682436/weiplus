package wc5;

/* loaded from: classes10.dex */
public final class e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wc5.q f526084d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de f526085e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f526086f;

    public e(wc5.q qVar, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de, int i17) {
        this.f526084d = qVar;
        this.f526085e = c1162x665295de;
        this.f526086f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int height;
        wc5.q qVar = this.f526084d;
        qVar.getClass();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = this.f526085e;
        int i17 = this.f526086f;
        android.view.View mo7935xa188593e = c1162x665295de.mo7935xa188593e(i17);
        if (mo7935xa188593e != null && (height = qVar.m173460x4905e9fa().getHeight()) > 0) {
            int height2 = (height - mo7935xa188593e.getHeight()) / 2;
            if (height2 < 0) {
                height2 = 0;
            }
            int top = mo7935xa188593e.getTop() - height2;
            if (top != 0) {
                qVar.m173460x4905e9fa().scrollBy(0, top);
            }
        }
        qVar.m173460x4905e9fa().post(new wc5.d(qVar, i17));
    }
}
