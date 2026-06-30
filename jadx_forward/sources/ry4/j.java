package ry4;

/* loaded from: classes.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.LinearLayout f483182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f483183e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f483184f;

    public j(android.widget.LinearLayout linearLayout, int i17, int i18) {
        this.f483182d = linearLayout;
        this.f483183e = i17;
        this.f483184f = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.LinearLayout linearLayout = this.f483182d;
        int paddingBottom = linearLayout.getPaddingBottom();
        if (paddingBottom == 0) {
            paddingBottom = this.f483183e;
        }
        int i17 = paddingBottom + this.f483184f;
        if (i17 < 0) {
            i17 = 0;
        }
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), i17);
    }
}
