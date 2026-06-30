package gt4;

/* loaded from: classes5.dex */
public class y1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 f357110d;

    public y1(com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577) {
        this.f357110d = c19151x10374577;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2373x373aa5.C19151x10374577 c19151x10374577 = this.f357110d;
        if (c19151x10374577.f262273o.getHeight() != c19151x10374577.getHeight()) {
            android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) c19151x10374577.f262273o.getLayoutParams();
            layoutParams.width = c19151x10374577.f262269h.getWidth();
            layoutParams.height = c19151x10374577.f262269h.getHeight() - i65.a.b(c19151x10374577.getContext(), 2);
            layoutParams.topMargin = i65.a.b(c19151x10374577.getContext(), 1);
            layoutParams.bottomMargin = i65.a.b(c19151x10374577.getContext(), 1);
            c19151x10374577.f262273o.setLayoutParams(layoutParams);
        }
    }
}
