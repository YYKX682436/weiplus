package w;

/* loaded from: classes13.dex */
public class a implements w.c {

    /* renamed from: a, reason: collision with root package name */
    public android.graphics.drawable.Drawable f523342a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 f523343b;

    public a(p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f5) {
        this.f523343b = c1055x35d85f5;
    }

    public void a(int i17, int i18, int i19, int i27) {
        p012xc85e97e9.p062xff91adb5.p063xd1075a44.C1055x35d85f5 c1055x35d85f5 = this.f523343b;
        c1055x35d85f5.f91920g.set(i17, i18, i19, i27);
        android.graphics.Rect rect = c1055x35d85f5.f91919f;
        super/*android.view.View*/.setPadding(i17 + rect.left, i18 + rect.top, i19 + rect.right, i27 + rect.bottom);
    }
}
