package e33;

/* loaded from: classes3.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 f328996d;

    public s4(com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561) {
        this.f328996d = activityC15656x6f26b561;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328996d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC15656x6f26b561.V.getLayoutParams();
        activityC15656x6f26b561.getWindow().getDecorView().getWindowVisibleDisplayFrame(new android.graphics.Rect());
        marginLayoutParams.topMargin = (int) (r2.top + activityC15656x6f26b561.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561156ay));
        activityC15656x6f26b561.V.setLayoutParams(marginLayoutParams);
    }
}
