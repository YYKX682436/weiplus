package gu1;

/* loaded from: classes15.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    public android.view.View f357431a;

    /* renamed from: b, reason: collision with root package name */
    public eu1.f f357432b;

    /* renamed from: c, reason: collision with root package name */
    public android.widget.ImageView f357433c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.LinearLayout f357434d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f357435e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f357436f;

    public m(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, android.view.View view) {
    }

    public void a() {
        java.lang.Integer num = (java.lang.Integer) xt1.t0.Di().a("key_share_card_show_type");
        if (num == null) {
            num = 0;
        }
        eu1.f fVar = this.f357432b;
        if (fVar != null && fVar.k() && ((num.intValue() == 1 || num.intValue() == 4) && eu1.f.c())) {
            this.f357436f.setVisibility(0);
            this.f357434d.setVisibility(8);
            this.f357435e.setVisibility(8);
            return;
        }
        this.f357436f.setVisibility(8);
        eu1.f fVar2 = this.f357432b;
        if (fVar2 == null) {
            this.f357434d.setVisibility(8);
            this.f357435e.setVisibility(8);
            return;
        }
        fVar2.k();
        this.f357432b.l();
        if (!this.f357432b.k() || !this.f357432b.l()) {
            this.f357434d.setVisibility(0);
            this.f357435e.setVisibility(8);
        } else if (this.f357432b.k() && this.f357432b.l()) {
            this.f357434d.setVisibility(8);
            this.f357435e.setVisibility(8);
        }
    }
}
