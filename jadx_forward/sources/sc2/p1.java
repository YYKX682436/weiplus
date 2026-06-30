package sc2;

/* loaded from: classes2.dex */
public final class p1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487675d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.view.View view) {
        super(1);
        this.f487675d = view;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.drawable.Drawable background = this.f487675d.getBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background).setColor(intValue);
        return jz5.f0.f384359a;
    }
}
