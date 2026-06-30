package y35;

/* loaded from: classes.dex */
public class a0 implements android.view.ViewTreeObserver.OnPreDrawListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f540717d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 f540718e;

    public a0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336, android.view.View view) {
        this.f540718e = c19708x15855336;
        this.f540717d = view;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        android.view.View view = this.f540717d;
        view.getViewTreeObserver().removeOnPreDrawListener(this);
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i17 = iArr[1];
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb.C19708x15855336 c19708x15855336 = this.f540718e;
        int b17 = i65.a.b(c19708x15855336.f279303d, 60);
        int h17 = com.p314xaae8f345.mm.ui.bl.h(c19708x15855336.f279303d);
        int a17 = com.p314xaae8f345.mm.ui.bl.a(c19708x15855336.f279303d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HelperHeaderPreference", "actionBarHeight=%s ,statusBarHeight=%s , rootTop:%s", java.lang.Integer.valueOf(a17), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(i17));
        if (h17 > 0 && a17 > 0) {
            b17 = a17 + i65.a.f(c19708x15855336.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561221cn);
        }
        if (i17 == 0) {
            b17 += h17;
        }
        if (b17 == view.getPaddingTop()) {
            return true;
        }
        view.setPadding(view.getPaddingLeft(), b17, view.getPaddingRight(), view.getPaddingBottom());
        return false;
    }
}
