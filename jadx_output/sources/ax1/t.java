package ax1;

/* loaded from: classes3.dex */
public final class t extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f15012d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f15013e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(android.view.View view, android.graphics.drawable.BitmapDrawable bitmapDrawable) {
        super(0);
        this.f15012d = view;
        this.f15013e = bitmapDrawable;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        this.f15012d.setBackground(this.f15013e);
        return jz5.f0.f302826a;
    }
}
