package rb5;

/* loaded from: classes11.dex */
public class f implements db5.x8 {

    /* renamed from: a, reason: collision with root package name */
    public long f475400a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ rb5.l f475401b;

    public f(rb5.l lVar) {
        this.f475401b = lVar;
    }

    @Override // db5.x8
    public void a() {
        rb5.l lVar = this.f475401b;
        if (lVar.f475417h == null) {
            android.view.animation.Animation loadAnimation = android.view.animation.AnimationUtils.loadAnimation(lVar.f475413d, com.p314xaae8f345.mm.ui.uc.f292611a);
            lVar.f475417h = loadAnimation;
            loadAnimation.setAnimationListener(new rb5.d(this));
        }
        lVar.f475418i.m81107xd394853f(new rb5.e(this));
        android.view.View m7474xfb86a31b = lVar.f475415f.m7474xfb86a31b();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba c21527x310c6aba = m7474xfb86a31b != null ? (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21527x310c6aba) m7474xfb86a31b.findViewById(com.p314xaae8f345.mm.R.id.bkb) : null;
        java.util.Objects.requireNonNull(c21527x310c6aba);
        c21527x310c6aba.f279219d = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChattingCompat", "klem CHATTING ONLAYOUT ");
    }
}
