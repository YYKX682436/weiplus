package sf4;

/* loaded from: classes4.dex */
public final class h extends oj5.y {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 f489016a;

    /* renamed from: b, reason: collision with root package name */
    public float f489017b;

    /* renamed from: c, reason: collision with root package name */
    public int f489018c;

    /* renamed from: d, reason: collision with root package name */
    public int f489019d;

    @Override // oj5.y
    public boolean a(android.view.MotionEvent event, boolean z17, int i17) {
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationY;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x85806502;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int actionMasked = event.getActionMasked();
        if (actionMasked == 0) {
            event.getX();
            this.f489017b = event.getY();
        } else if (actionMasked == 1) {
            if (this.f489018c > 0 && this.f489019d == 1) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065022 = this.f489016a;
                if (c18497x858065022 != null && (animate = c18497x858065022.animate()) != null && (translationY = animate.translationY(0.0f)) != null) {
                    translationY.start();
                }
                this.f489019d = 0;
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                java.lang.Object systemService = context.getSystemService("vibrator");
                android.os.Vibrator vibrator = systemService instanceof android.os.Vibrator ? (android.os.Vibrator) systemService : null;
                if (vibrator != null) {
                    vibrator.vibrate(10L);
                }
                db5.e1.T(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlz));
            }
            this.f489018c = 0;
        } else if (actionMasked != 2) {
            if (actionMasked == 3) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GalleryOverScrollConsumer", "LogStory: touch cancel");
                this.f489019d = 0;
                com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18497x85806502 c18497x858065023 = this.f489016a;
                if (c18497x858065023 != null) {
                    c18497x858065023.setTranslationY(0.0f);
                }
                this.f489018c = 0;
            }
        } else if (z17) {
            this.f489019d = i17;
            r1 = i17 == 1;
            float y17 = event.getY() - this.f489017b;
            if (y17 <= 0.0f && (c18497x85806502 = this.f489016a) != null) {
                this.f489018c = -((int) y17);
                c18497x85806502.animate().cancel();
                c18497x85806502.setTranslationY(y17 / 2);
            }
        }
        return r1;
    }

    @Override // oj5.y
    public int b() {
        return 1;
    }
}
