package androidx.appcompat.app;

/* loaded from: classes15.dex */
public class ActionBar$LayoutParams extends android.view.ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public int f9070a;

    public ActionBar$LayoutParams(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9070a = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.a.f296174b);
        this.f9070a = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
    }

    public ActionBar$LayoutParams(int i17, int i18) {
        super(i17, i18);
        this.f9070a = 8388627;
    }

    public ActionBar$LayoutParams(androidx.appcompat.app.ActionBar$LayoutParams actionBar$LayoutParams) {
        super((android.view.ViewGroup.MarginLayoutParams) actionBar$LayoutParams);
        this.f9070a = 0;
        this.f9070a = actionBar$LayoutParams.f9070a;
    }

    public ActionBar$LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f9070a = 0;
    }
}
