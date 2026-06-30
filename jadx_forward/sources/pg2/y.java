package pg2;

/* loaded from: classes3.dex */
public final class y extends ug5.h {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nn0.c f435729e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug5.v f435730f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f435731g;

    public y(nn0.c cVar, ug5.v vVar, android.graphics.Bitmap bitmap) {
        this.f435729e = cVar;
        this.f435730f = vVar;
        this.f435731g = bitmap;
    }

    @Override // ug5.h
    public void c(android.animation.Animator animation, ug5.v performer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(animation, "animation");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.c(animation, performer);
        android.widget.ImageView imageView = (android.widget.ImageView) performer.f509193c;
        if (imageView != null) {
            imageView.setImageBitmap(this.f435731g);
        }
    }

    @Override // ug5.h
    public void g(android.content.Context context, ug5.v performer) {
        nn0.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(performer, "performer");
        super.g(context, performer);
        ug5.v vVar = this.f435730f;
        java.lang.Object d17 = vVar.d("key_player_view");
        java.lang.ref.WeakReference weakReference = d17 instanceof java.lang.ref.WeakReference ? (java.lang.ref.WeakReference) d17 : null;
        java.lang.Object obj = weakReference != null ? weakReference.get() : null;
        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = obj instanceof com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf ? (com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf) obj : null;
        java.lang.Object d18 = vVar.d("key_enter_square_preview_mode");
        java.lang.Integer num = d18 instanceof java.lang.Integer ? (java.lang.Integer) d18 : null;
        int intValue = num != null ? num.intValue() : 0;
        if (scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf == null || (cVar = this.f435729e) == null) {
            return;
        }
        cVar.Q(intValue);
        mn0.b0.B(cVar, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, null, 2, null);
    }
}
