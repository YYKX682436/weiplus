package cy3;

/* loaded from: classes.dex */
public final class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f306308d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f306309e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f306310f;

    public h(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, android.widget.ImageView imageView, android.content.Context context) {
        this.f306308d = c0Var;
        this.f306309e = imageView;
        this.f306310f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = this.f306308d;
        boolean z17 = !c0Var.f391645d;
        c0Var.f391645d = z17;
        android.widget.ImageView imageView = this.f306309e;
        if (imageView != null) {
            android.content.Context context = this.f306310f;
            if (z17) {
                imageView.setImageDrawable(i65.a.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.raw.f78838xa71f2f0a));
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.d_));
            } else {
                imageView.setImageDrawable(i65.a.i(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30861xcebc809e.f562789oo));
                imageView.setContentDescription(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571376db));
            }
        }
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_RINGTONE_SET_AS_STATUS_WHEN_USE_BOOLEAN_SYNC, java.lang.Boolean.valueOf(c0Var.f391645d));
        yj0.a.h(this, "com/tencent/mm/plugin/ringtone/widget/RingtoneHalfBottomDialog$showRingtoneSettingHalfUI$1$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
