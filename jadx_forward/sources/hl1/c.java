package hl1;

/* loaded from: classes3.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f363617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hl1.d f363618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f363619f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f363620g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f363621h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(long j17, hl1.d dVar, android.view.View view, android.graphics.Bitmap bitmap, android.graphics.Bitmap bitmap2) {
        super(1);
        this.f363617d = j17;
        this.f363618e = dVar;
        this.f363619f = view;
        this.f363620g = bitmap;
        this.f363621h = bitmap2;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        if (bitmap != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HalfScreenBackgroundEmbedRenderer", "requestEffect cost[" + (java.lang.System.currentTimeMillis() - this.f363617d) + ']');
            hl1.d dVar = this.f363618e;
            dVar.f363623f = bitmap;
            dVar.f363624g = false;
            android.view.View view = this.f363619f;
            android.view.ViewParent parent = view != null ? view.getParent() : null;
            android.view.View view2 = parent instanceof android.view.View ? (android.view.View) parent : null;
            if (view2 != null) {
                view2.invalidate();
            }
        }
        this.f363620g.recycle();
        this.f363621h.recycle();
        return jz5.f0.f384359a;
    }
}
