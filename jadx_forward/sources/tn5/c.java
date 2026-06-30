package tn5;

/* loaded from: classes15.dex */
public final class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public float f502393d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f502394e;

    /* renamed from: f, reason: collision with root package name */
    public int f502395f;

    /* renamed from: g, reason: collision with root package name */
    public long f502396g;

    /* renamed from: h, reason: collision with root package name */
    public long f502397h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ tn5.f f502398i;

    public c(tn5.f fVar, float f17, boolean z17) {
        this.f502398i = fVar;
        this.f502393d = f17;
        this.f502394e = z17;
        mn5.b bVar = fVar.f502403c;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        this.f502395f = bVar.f411742b;
        this.f502397h = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
    }

    @Override // java.lang.Runnable
    public void run() {
        tn5.f fVar = this.f502398i;
        if (fVar.f502404d != this || fVar.f502402b.f502384b.f491705h) {
            return;
        }
        long currentAnimationTimeMillis = android.view.animation.AnimationUtils.currentAnimationTimeMillis();
        long j17 = currentAnimationTimeMillis - this.f502397h;
        float pow = this.f502393d * ((float) java.lang.Math.pow(0.98f, ((float) (currentAnimationTimeMillis - this.f502396g)) / (1000.0f / 10)));
        this.f502393d = pow;
        float f17 = pow * ((((float) j17) * 1.0f) / 1000);
        if (java.lang.Math.abs(f17) <= 1.0f) {
            fVar.f502404d = null;
            return;
        }
        this.f502397h = currentAnimationTimeMillis;
        int i17 = this.f502395f + ((int) f17);
        this.f502395f = i17;
        mn5.b bVar = fVar.f502403c;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        int i18 = bVar.f411742b * i17;
        com.p314xaae8f345.mm.p2776x373aa5.p2788x8931a9e5.C22851x22587864 c22851x22587864 = fVar.f502401a;
        if (i18 > 0) {
            c22851x22587864.s(i17, true);
            c22851x22587864.getF295283w().mo50297x7c4d7ca2(this, 10);
            return;
        }
        fVar.f502404d = null;
        c22851x22587864.s(0, true);
        on5.b m82916xc2a54588 = c22851x22587864.m82916xc2a54588();
        android.view.View view = m82916xc2a54588 != null ? ((un5.b) m82916xc2a54588).f511030i : null;
        int i19 = (int) (-this.f502393d);
        boolean z17 = view instanceof android.widget.ScrollView;
        boolean z18 = this.f502394e;
        if (z17) {
            if (z18) {
                ((android.widget.ScrollView) view).smoothScrollBy(0, i19);
            } else {
                ((android.widget.ScrollView) view).fling(i19);
            }
        } else if (view instanceof android.widget.AbsListView) {
            ((android.widget.AbsListView) view).fling(i19);
        } else if (view instanceof android.webkit.WebView) {
            ((android.webkit.WebView) view).flingScroll(0, i19);
        } else if (view instanceof p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) {
            if (z18) {
                ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view).s(0, i19, 250, false);
            } else {
                ((p012xc85e97e9.p075x2eaf9f.p079xd1075a44.C1095x65355f89) view).d(i19);
            }
        } else if (view instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) {
            if (z18) {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).mo7976xc291bbd2(0, i19);
            } else {
                ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) view).r0(0, i19);
            }
        }
        mn5.b bVar2 = fVar.f502403c;
        if (bVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cValues");
            throw null;
        }
        if (!bVar2.f411746f || f17 <= 0.0f) {
            return;
        }
        bVar2.f411746f = false;
    }
}
