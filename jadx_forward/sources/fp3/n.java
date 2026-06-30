package fp3;

/* loaded from: classes9.dex */
public class n implements y60.e {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f346850d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f346851e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f346852f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f346853g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f346854h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f346855i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f346856m;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1940x651874e.ui.ActivityC16777xd3921e27 activityC16777xd3921e27, fp3.k kVar) {
    }

    @Override // y60.e
    public void K4(java.lang.String str, android.graphics.Bitmap bitmap) {
        if (str == null || !str.equals(this.f346851e)) {
            return;
        }
        this.f346850d.post(new fp3.m(this, bitmap));
    }
}
