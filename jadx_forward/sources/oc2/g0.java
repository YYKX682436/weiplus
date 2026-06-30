package oc2;

/* loaded from: classes8.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ oc2.i0 f425712d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cp5 f425713e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b f425714f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.drawable.BitmapDrawable f425715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f425716h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f425717i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f425718m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f425719n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f425720o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425721p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(oc2.i0 i0Var, r45.cp5 cp5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b, android.graphics.drawable.BitmapDrawable bitmapDrawable, java.lang.ref.WeakReference weakReference, long j17, android.graphics.Bitmap bitmap, android.graphics.Rect rect, android.graphics.Rect rect2, java.lang.String str) {
        super(0);
        this.f425712d = i0Var;
        this.f425713e = cp5Var;
        this.f425714f = c13738xbdff117b;
        this.f425715g = bitmapDrawable;
        this.f425716h = weakReference;
        this.f425717i = j17;
        this.f425718m = bitmap;
        this.f425719n = rect;
        this.f425720o = rect2;
        this.f425721p = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.t60 t60Var;
        r45.yo5 yo5Var = this.f425713e.f453303f;
        int c17 = this.f425712d.c((yo5Var == null || (t60Var = yo5Var.f472794d) == null) ? null : t60Var.f467700e, 0);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b c13738xbdff117b = this.f425714f;
        android.graphics.drawable.BitmapDrawable bitmapDrawable = this.f425715g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.p1451xc84b4196.C13738xbdff117b.d(c13738xbdff117b, bitmapDrawable, c17);
        java.lang.ref.WeakReference weakReference = this.f425716h;
        android.view.View view = (android.view.View) weakReference.get();
        if (view != null) {
            bitmapDrawable.setCallback(view);
        }
        bitmapDrawable.invalidateSelf();
        android.view.View view2 = (android.view.View) weakReference.get();
        if (view2 != null) {
            view2.invalidate();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(c13738xbdff117b.h(), "[asyncLoadIcon] token=" + this.f425717i + " resource=" + this.f425718m + " src=" + this.f425719n + " dst=" + this.f425720o + " drawable callback=" + bitmapDrawable.getCallback() + " TextView=" + weakReference.get() + "color=" + c17 + " iconUrl=" + this.f425721p);
        return jz5.f0.f384359a;
    }
}
