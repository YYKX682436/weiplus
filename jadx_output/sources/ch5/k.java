package ch5;

/* loaded from: classes14.dex */
public final class k extends bh5.l {

    /* renamed from: e, reason: collision with root package name */
    public final android.content.Context f41595e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(android.content.Context r1, int r2, int r3, kotlin.jvm.internal.i r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 2131821121(0x7f110241, float:1.9274976E38)
        L7:
            java.lang.String r3 = "activityContext"
            kotlin.jvm.internal.o.g(r1, r3)
            r0.<init>(r1, r2)
            r0.f41595e = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ch5.k.<init>(android.content.Context, int, int, kotlin.jvm.internal.i):void");
    }

    @Override // android.app.Dialog
    public boolean onTouchEvent(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        android.content.Context context = this.f41595e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity != null) {
            return activity.dispatchTouchEvent(event);
        }
        return false;
    }
}
