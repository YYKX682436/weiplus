package gn5;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 f355208d;

    public g(com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190) {
        this.f355208d = c22838xaf7a8190;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355208d;
        if (c22838xaf7a8190.f295223z != null) {
            return;
        }
        c22838xaf7a8190.f295223z = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(c22838xaf7a8190.getContext(), c22838xaf7a8190.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.c0d), true, 0, new gn5.f(this));
    }
}
