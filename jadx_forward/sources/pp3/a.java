package pp3;

/* loaded from: classes5.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f439000d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf f439001e;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf c16784x72b881cf, int[] iArr) {
        this.f439001e = c16784x72b881cf;
        this.f439000d = iArr;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1943xc4ac0ffe.ui.C16784x72b881cf c16784x72b881cf = this.f439001e;
        android.view.View contentView = c16784x72b881cf.f234428i.getContentView();
        contentView.getLocationOnScreen(iArr);
        android.view.View findViewById = contentView.findViewById(com.p314xaae8f345.mm.R.id.o_p);
        android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) findViewById.getLayoutParams();
        layoutParams.leftMargin = ((this.f439000d[0] + (c16784x72b881cf.getWidth() / 2)) - iArr[0]) - (findViewById.getWidth() / 2);
        findViewById.setLayoutParams(layoutParams);
    }
}
