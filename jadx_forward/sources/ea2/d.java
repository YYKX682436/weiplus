package ea2;

/* loaded from: classes2.dex */
public final class d extends x92.e {
    public final jz5.g B;
    public final jz5.g C;
    public final jz5.g D;
    public float E;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.B = jz5.h.b(new ea2.c(activity));
        this.C = jz5.h.b(new ea2.b(activity));
        this.D = jz5.h.b(new ea2.a(this));
        this.E = -1.0f;
    }

    @Override // x92.e
    public void W6(com.p176xb6135e39.p177xcca8366f.p244x11d36527.p245xabe4c252.C2678xa407981c view, float f17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        super.W6(view, f17);
        float abs = java.lang.Math.abs(f17) / ((java.lang.Number) ((jz5.n) this.B).mo141623x754a37bb()).intValue();
        if (abs > 1.0f) {
            abs = 1.0f;
        }
        if (abs < 0.0f) {
            abs = 0.0f;
        }
        if (this.E == abs) {
            return;
        }
        this.E = abs;
        ((android.view.View) ((jz5.n) this.D).mo141623x754a37bb()).setTranslationY((1.0f - abs) * ((java.lang.Number) ((jz5.n) this.C).mo141623x754a37bb()).intValue());
    }

    @Override // x92.e
    public v92.g X6() {
        return new da2.i((r45.r03) this.f534252d, m158354x19263085());
    }

    @Override // x92.e
    public java.lang.String Y6() {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        jz5.g gVar = this.D;
        android.view.View view = (android.view.View) ((jz5.n) gVar).mo141623x754a37bb();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/activity/music/uic/FinderMusicTopicActionBarUIC", "onCreateAfter", "(Landroid/os/Bundle;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        ((android.view.View) ((jz5.n) gVar).mo141623x754a37bb()).setTranslationY(((java.lang.Number) ((jz5.n) this.C).mo141623x754a37bb()).intValue());
    }
}
