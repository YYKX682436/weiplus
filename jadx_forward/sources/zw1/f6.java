package zw1;

/* loaded from: classes15.dex */
public class f6 extends ww1.z2 {

    /* renamed from: f, reason: collision with root package name */
    public final int f558161f;

    /* renamed from: g, reason: collision with root package name */
    public int f558162g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f558163h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558164i;

    public f6(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, int i17) {
        this.f558164i = activityC13149x63b02cb3;
        this.f558161f = i17;
    }

    @Override // ww1.z2, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean Y3(boolean z17) {
        android.widget.TextView textView = this.f531909d;
        if (textView != null) {
            if (!z17) {
                textView.setVisibility(8);
            } else if (this.f558164i.f177968d == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(this.f558162g);
                this.f531909d.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        android.widget.ImageView imageView = this.f531910e;
        if (imageView == null) {
            return true;
        }
        imageView.setVisibility(8);
        return true;
    }

    @Override // ww1.z2
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558164i;
        ww1.b3 b3Var = activityC13149x63b02cb3.f177972h;
        this.f531909d = b3Var.f531666g;
        this.f531910e = b3Var.f531668h;
        b3Var.f531658c.setOnClickListener(new zw1.d6(this));
        activityC13149x63b02cb3.f177972h.f531657b0.setOnClickListener(new zw1.e6(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    /* renamed from: getPath */
    public java.lang.String mo54844xfb83cc9b() {
        int i17 = this.f558161f;
        if (i17 == 4 || i17 == 5) {
            this.f558163h = "facingreceiveremerchantapplydot";
            this.f558162g = 40;
        } else {
            this.f558163h = "facingreceiveremerchantdot";
            this.f558162g = 41;
        }
        return this.f558163h;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public android.view.View h() {
        return this.f558164i.f177971g.f531658c;
    }

    @Override // ww1.z2, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        android.widget.ImageView imageView = this.f531910e;
        if (imageView != null) {
            if (!z17) {
                imageView.setVisibility(8);
            } else if (this.f558164i.f177968d == 2) {
                ((ua0.m) ((va0.p) i95.n0.c(va0.p.class))).getClass();
                rn3.i.Di().a(this.f558162g);
                this.f531910e.setVisibility(8);
            } else {
                imageView.setVisibility(0);
            }
        }
        android.widget.TextView textView = this.f531909d;
        if (textView == null) {
            return true;
        }
        textView.setVisibility(8);
        return true;
    }
}
