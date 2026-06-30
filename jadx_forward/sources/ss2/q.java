package ss2;

/* loaded from: classes10.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ss2.a0 f493508d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493509e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f493510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f493511g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f493512h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f493513i;

    public q(ss2.a0 a0Var, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, android.graphics.Bitmap bitmap, int i17, android.graphics.Bitmap bitmap2) {
        this.f493508d = a0Var;
        this.f493509e = str;
        this.f493510f = h0Var;
        this.f493511g = bitmap;
        this.f493512h = i17;
        this.f493513i = bitmap2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ss2.a0 a0Var = this.f493508d;
        a0Var.f493450s.add(this.f493509e);
        java.lang.Object obj = this.f493510f.f391656d;
        if (obj != null && this.f493511g != null) {
            java.util.ArrayList arrayList = a0Var.f493452u;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            arrayList.add(obj);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a31969 = a0Var.f493441g;
        if (c15327x51a31969 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
            throw null;
        }
        java.util.List<android.view.View> m62271xf9bd9d24 = c15327x51a31969.m62271xf9bd9d24();
        int i17 = this.f493512h;
        android.view.View view = m62271xf9bd9d24.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
        com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view;
        c21405x85fc1ce0.setColorFilter(0);
        c21405x85fc1ce0.setAlpha(1.0f);
        android.graphics.drawable.Drawable drawable = c21405x85fc1ce0.getDrawable();
        android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
        if (mutate != null) {
            mutate.setAlpha(255);
        }
        c21405x85fc1ce0.setPadding(0, 0, 0, 0);
        c21405x85fc1ce0.setImageBitmap(this.f493513i);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("PostMediaWidget", "add thumb file, index:" + i17);
    }
}
