package y9;

/* loaded from: classes14.dex */
public class i extends p012xc85e97e9.p016x746ad0e3.app.i0 {

    /* renamed from: f, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f541780f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f541781g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f541782h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f541783i;

    /* renamed from: m, reason: collision with root package name */
    public final y9.c f541784m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.content.Context r4, int r5) {
        /*
            r3 = this;
            r0 = 1
            if (r5 != 0) goto L1b
            android.util.TypedValue r5 = new android.util.TypedValue
            r5.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            r2 = 2130968776(0x7f0400c8, float:1.7546215E38)
            boolean r1 = r1.resolveAttribute(r2, r5, r0)
            if (r1 == 0) goto L18
            int r5 = r5.resourceId
            goto L1b
        L18:
            r5 = 2131821605(0x7f110425, float:1.9275958E38)
        L1b:
            r3.<init>(r4, r5)
            r3.f541781g = r0
            r3.f541782h = r0
            y9.h r4 = new y9.h
            r4.<init>(r3)
            r3.f541784m = r4
            r3.C(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: y9.i.<init>(android.content.Context, int):void");
    }

    public final android.view.View D(int i17, android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.a3s, null);
        p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a c1081xa22a3e5a = (p012xc85e97e9.p073xee01125a.p074xd1075a44.C1081xa22a3e5a) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.f565485cj4);
        if (i17 != 0 && view == null) {
            view = getLayoutInflater().inflate(i17, (android.view.ViewGroup) c1081xa22a3e5a, false);
        }
        android.widget.FrameLayout frameLayout2 = (android.widget.FrameLayout) c1081xa22a3e5a.findViewById(com.p314xaae8f345.mm.R.id.f565592cv0);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A(frameLayout2);
        this.f541780f = A;
        A.f125986z = this.f541784m;
        A.f125976p = this.f541781g;
        if (layoutParams == null) {
            frameLayout2.addView(view);
        } else {
            frameLayout2.addView(view, layoutParams);
        }
        c1081xa22a3e5a.findViewById(com.p314xaae8f345.mm.R.id.ohv).setOnClickListener(new y9.e(this));
        n3.l1.l(frameLayout2, new y9.f(this));
        frameLayout2.setOnTouchListener(new y9.g(this));
        return frameLayout;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    public void onStart() {
        super.onStart();
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541780f;
        if (c2690x46972046 == null || c2690x46972046.f125978r != 5) {
            return;
        }
        c2690x46972046.D(4);
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z17) {
        super.setCancelable(z17);
        if (this.f541781g != z17) {
            this.f541781g = z17;
            com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 c2690x46972046 = this.f541780f;
            if (c2690x46972046 != null) {
                c2690x46972046.f125976p = z17;
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z17) {
        super.setCanceledOnTouchOutside(z17);
        if (z17 && !this.f541781g) {
            this.f541781g = true;
        }
        this.f541782h = z17;
        this.f541783i = true;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(int i17) {
        super.setContentView(D(i17, null, null));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view) {
        super.setContentView(D(0, view, null));
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void setContentView(android.view.View view, android.view.ViewGroup.LayoutParams layoutParams) {
        super.setContentView(D(0, view, layoutParams));
    }
}
