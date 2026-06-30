package sc2;

/* loaded from: classes2.dex */
public final class r1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487718d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487719e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f487720f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(android.view.View view, android.view.View view2, android.view.View view3) {
        super(1);
        this.f487718d = view;
        this.f487719e = view2;
        this.f487720f = view3;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        android.graphics.drawable.Drawable background = this.f487718d.getBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background).setColor(intValue);
        android.graphics.drawable.Drawable background2 = this.f487719e.getBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background2, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background2).setColor(intValue);
        android.graphics.drawable.Drawable background3 = this.f487720f.getBackground();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(background3, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
        ((android.graphics.drawable.GradientDrawable) background3).setColor(intValue);
        return jz5.f0.f384359a;
    }
}
