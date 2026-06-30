package al1;

/* loaded from: classes7.dex */
public final class k extends android.graphics.drawable.ColorDrawable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ al1.l f87316a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(al1.l lVar, int i17) {
        super(i17);
        this.f87316a = lVar;
    }

    @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
    public void setAlpha(int i17) {
        super.setAlpha(i17);
        this.f87316a.mo2242x7c84ae24(getColor());
    }

    @Override // android.graphics.drawable.ColorDrawable
    public void setColor(int i17) {
        super.setColor(i17);
        this.f87316a.mo2242x7c84ae24(getColor());
    }
}
