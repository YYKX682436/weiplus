package bs2;

/* loaded from: classes2.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final bs2.d f105356d = new bs2.d();

    public d() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        p012xc85e97e9.p093xedfae76a.o mo273xed6858b4;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15188xd8bd4bd c15188xd8bd4bd = bs2.f.f105364b;
        if (c15188xd8bd4bd != null) {
            c15188xd8bd4bd.mo58801x360802();
            c15188xd8bd4bd.b();
        }
        bs2.f.f105364b = null;
        bs2.f.f105365c = null;
        bs2.f.f105366d = null;
        android.widget.FrameLayout frameLayout = bs2.f.f105367e;
        if (frameLayout != null) {
            p012xc85e97e9.p093xedfae76a.x xVar = bs2.f.f105368f;
            if (xVar != null) {
                android.content.Context context = frameLayout.getContext();
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 ? (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context : null;
                if (activityC0065xcd7aa112 != null && (mo273xed6858b4 = activityC0065xcd7aa112.mo273xed6858b4()) != null) {
                    mo273xed6858b4.c(xVar);
                }
            }
            bs2.f.f105368f = null;
            frameLayout.removeAllViews();
            android.view.ViewParent parent = frameLayout.getParent();
            android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(frameLayout);
            }
        }
        bs2.f.f105367e = null;
        return jz5.f0.f384359a;
    }
}
