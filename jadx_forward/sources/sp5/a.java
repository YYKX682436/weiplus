package sp5;

/* loaded from: classes3.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f492858d;

    public a(android.view.View view) {
        this.f492858d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view = this.f492858d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) view.getLayoutParams();
        if (marginLayoutParams != null) {
            float f17 = j65.f.f379476g;
            int i17 = marginLayoutParams.height;
            if (i17 > 0) {
                marginLayoutParams.height = (int) (i17 / f17);
            }
            int i18 = marginLayoutParams.width;
            if (i18 > 0) {
                marginLayoutParams.width = (int) (i18 / f17);
            }
            marginLayoutParams.topMargin = (int) (marginLayoutParams.topMargin / f17);
            marginLayoutParams.bottomMargin = (int) (marginLayoutParams.bottomMargin / f17);
            marginLayoutParams.leftMargin = (int) (marginLayoutParams.leftMargin / f17);
            marginLayoutParams.rightMargin = (int) (marginLayoutParams.rightMargin / f17);
            view.setLayoutParams(marginLayoutParams);
        }
    }
}
