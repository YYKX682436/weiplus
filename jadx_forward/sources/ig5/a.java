package ig5;

/* loaded from: classes12.dex */
public class a extends android.graphics.drawable.AnimationDrawable {

    /* renamed from: d, reason: collision with root package name */
    public int f372996d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f372997e;

    public a() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMAnimationDrawable", "[init] %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
    }

    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMAnimationDrawable", "setCustomDuration() called with: customDuration = [" + i17 + "]");
        this.f372996d = i17;
        unscheduleSelf(this);
        selectDrawable(this.f372997e);
        scheduleSelf(this, android.os.SystemClock.uptimeMillis() + i17);
    }

    @Override // android.graphics.drawable.AnimationDrawable, java.lang.Runnable
    public void run() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMAnimationDrawable", "[stop] %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        int numberOfFrames = getNumberOfFrames();
        int i17 = this.f372997e + 1;
        this.f372997e = i17;
        if (i17 >= numberOfFrames) {
            this.f372997e = 0;
        }
        if (this.f372996d == 0) {
            super.run();
        } else {
            selectDrawable(this.f372997e);
            scheduleSelf(this, android.os.SystemClock.uptimeMillis() + this.f372996d);
        }
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void start() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMAnimationDrawable", "[start] %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        super.start();
    }

    @Override // android.graphics.drawable.AnimationDrawable, android.graphics.drawable.Animatable
    public void stop() {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hashCode());
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMAnimationDrawable", "[stop] %s %s", valueOf, new com.p314xaae8f345.mm.sdk.p2603x2137b148.z3());
        super.stop();
    }
}
