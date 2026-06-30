package p012xc85e97e9.p016x746ad0e3.app;

/* renamed from: androidx.appcompat.app.ActionBar$LayoutParams */
/* loaded from: classes15.dex */
public class C0063x293d4d7 extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f90603a;

    public C0063x293d4d7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f90603a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f377707b);
        this.f90603a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public C0063x293d4d7(int i17, int i18) {
        super(i17, i18);
        this.f90603a = 8388627;
    }

    public C0063x293d4d7(p012xc85e97e9.p016x746ad0e3.app.C0063x293d4d7 c0063x293d4d7) {
        super((android.view.ViewGroup.MarginLayoutParams) c0063x293d4d7);
        this.f90603a = 0;
        this.f90603a = c0063x293d4d7.f90603a;
    }

    public C0063x293d4d7(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f90603a = 0;
    }
}
