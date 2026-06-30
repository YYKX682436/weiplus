package cu0;

/* loaded from: classes5.dex */
public final class a extends android.view.View {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cu0.c f303839d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(cu0.c cVar, android.content.Context context) {
        super(context);
        this.f303839d = cVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent == null || !((java.lang.Boolean) this.f303839d.f303842c.mo146xb9724478(motionEvent)).booleanValue()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }
}
