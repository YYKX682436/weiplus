package m95;

/* loaded from: classes13.dex */
public class c extends android.graphics.drawable.Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Picture f406619a;

    /* renamed from: b, reason: collision with root package name */
    public android.graphics.Bitmap f406620b;

    /* renamed from: c, reason: collision with root package name */
    public final int f406621c;

    public c(android.graphics.Picture picture, int i17) {
        this.f406619a = picture;
        this.f406621c = i17;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable() {
        return new m95.d(this.f406619a, this.f406621c);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
        return newDrawable();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
        return newDrawable();
    }
}
