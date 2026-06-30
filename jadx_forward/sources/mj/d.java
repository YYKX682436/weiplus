package mj;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f408489d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f408490e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f408491f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f408492g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6 f408493h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ mj.i f408494i;

    public d(mj.i iVar, com.p314xaae8f345.p552xbf8d97c1.p585x697f145.p588x373aa5.C4717x6bd28ad6 c4717x6bd28ad6) {
        this.f408494i = iVar;
        this.f408493h = c4717x6bd28ad6;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.view.View.OnClickListener onClickListener;
        int action = motionEvent.getAction();
        mj.i iVar = this.f408494i;
        if (action == 0) {
            this.f408489d = motionEvent.getX();
            this.f408490e = motionEvent.getY();
            android.view.WindowManager.LayoutParams layoutParams = iVar.f408505b;
            this.f408491f = layoutParams.x;
            this.f408492g = layoutParams.y;
        } else if (action == 1) {
            int[] iArr = new int[2];
            int i17 = iVar.f408505b.x;
            iArr[0] = i17;
            int i18 = iVar.f408509f.widthPixels;
            iArr[1] = i17 > i18 / 2 ? i18 - this.f408493h.getWidth() : 0;
            android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("trans", iArr));
            ofPropertyValuesHolder.addUpdateListener(new mj.c(this, view));
            ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateInterpolator());
            ofPropertyValuesHolder.setDuration(180L).start();
            android.view.WindowManager.LayoutParams layoutParams2 = iVar.f408505b;
            int i19 = layoutParams2.x;
            int i27 = layoutParams2.y;
            if (java.lang.Math.abs(i19 - this.f408491f) <= 20 && java.lang.Math.abs(i27 - this.f408492g) <= 20 && (onClickListener = iVar.f408508e) != null) {
                onClickListener.onClick(view);
            }
        } else if (action == 2) {
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            android.view.WindowManager.LayoutParams layoutParams3 = iVar.f408505b;
            layoutParams3.x = (int) (layoutParams3.x + ((x17 - this.f408489d) / 3.0f));
            layoutParams3.y = (int) (layoutParams3.y + ((y17 - this.f408490e) / 3.0f));
            if (view != null) {
                iVar.f408504a.updateViewLayout(view, layoutParams3);
            }
        }
        return true;
    }
}
