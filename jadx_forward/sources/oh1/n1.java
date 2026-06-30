package oh1;

/* loaded from: classes9.dex */
public class n1 implements l01.u {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f426796d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f426797e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.text.SpannableString f426798f;

    public n1(oh1.o1 o1Var, java.lang.ref.WeakReference weakReference, java.lang.ref.WeakReference weakReference2, android.text.SpannableString spannableString) {
        this.f426796d = weakReference;
        this.f426797e = weakReference2;
        this.f426798f = spannableString;
    }

    @Override // l01.u
    public void b() {
    }

    @Override // l01.u
    public void d() {
    }

    @Override // l01.i0
    public java.lang.String key() {
        return oh1.o1.class.getSimpleName();
    }

    @Override // l01.u
    /* renamed from: onBitmapLoaded */
    public void mo1040x5481b993(android.graphics.Bitmap bitmap) {
        com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc c23001x9d3a0bdc = (com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) this.f426796d.get();
        android.content.Context context = (android.content.Context) this.f426797e.get();
        if (context == null || c23001x9d3a0bdc == null) {
            return;
        }
        android.graphics.drawable.BitmapDrawable bitmapDrawable = new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap);
        bitmapDrawable.setBounds(0, 0, ik1.j0.a(16), ik1.j0.a(16));
        yl1.b bVar = new yl1.b(bitmapDrawable, 1);
        android.text.SpannableString spannableString = new android.text.SpannableString("@ ");
        spannableString.setSpan(bVar, 0, 1, 33);
        c23001x9d3a0bdc.b(android.text.TextUtils.concat(spannableString, this.f426798f));
        c23001x9d3a0bdc.invalidate();
    }
}
