package w9;

/* loaded from: classes13.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public final long f525580a;

    /* renamed from: b, reason: collision with root package name */
    public final long f525581b;

    /* renamed from: c, reason: collision with root package name */
    public final android.animation.TimeInterpolator f525582c;

    /* renamed from: d, reason: collision with root package name */
    public int f525583d;

    /* renamed from: e, reason: collision with root package name */
    public int f525584e;

    public i(long j17, long j18) {
        this.f525580a = 0L;
        this.f525581b = 300L;
        this.f525582c = null;
        this.f525583d = 0;
        this.f525584e = 1;
        this.f525580a = j17;
        this.f525581b = j18;
    }

    public void a(android.animation.Animator animator) {
        animator.setStartDelay(this.f525580a);
        animator.setDuration(this.f525581b);
        animator.setInterpolator(b());
        if (animator instanceof android.animation.ValueAnimator) {
            android.animation.ValueAnimator valueAnimator = (android.animation.ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.f525583d);
            valueAnimator.setRepeatMode(this.f525584e);
        }
    }

    public android.animation.TimeInterpolator b() {
        android.animation.TimeInterpolator timeInterpolator = this.f525582c;
        return timeInterpolator != null ? timeInterpolator : w9.a.f525568b;
    }

    /* renamed from: equals */
    public boolean m173346xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || w9.i.class != obj.getClass()) {
            return false;
        }
        w9.i iVar = (w9.i) obj;
        if (this.f525580a == iVar.f525580a && this.f525581b == iVar.f525581b && this.f525583d == iVar.f525583d && this.f525584e == iVar.f525584e) {
            return b().getClass().equals(iVar.b().getClass());
        }
        return false;
    }

    /* renamed from: hashCode */
    public int m173347x8cdac1b() {
        long j17 = this.f525580a;
        int i17 = ((int) (j17 ^ (j17 >>> 32))) * 31;
        long j18 = this.f525581b;
        return ((((((i17 + ((int) ((j18 >>> 32) ^ j18))) * 31) + b().getClass().hashCode()) * 31) + this.f525583d) * 31) + this.f525584e;
    }

    /* renamed from: toString */
    public java.lang.String m173348x9616526c() {
        return "\n" + w9.i.class.getName() + '{' + java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)) + " delay: " + this.f525580a + " duration: " + this.f525581b + " interpolator: " + b().getClass() + " repeatCount: " + this.f525583d + " repeatMode: " + this.f525584e + "}\n";
    }

    public i(long j17, long j18, android.animation.TimeInterpolator timeInterpolator) {
        this.f525580a = 0L;
        this.f525581b = 300L;
        this.f525582c = null;
        this.f525583d = 0;
        this.f525584e = 1;
        this.f525580a = j17;
        this.f525581b = j18;
        this.f525582c = timeInterpolator;
    }
}
