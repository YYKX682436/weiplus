package kv4;

/* loaded from: classes3.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f394275f;

    public v(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var3) {
        this.f394273d = h0Var;
        this.f394274e = h0Var2;
        this.f394275f = h0Var3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) this.f394273d.f391656d;
        int height = ((android.widget.TextView) this.f394274e.f391656d).getHeight();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(this.f394275f.f391656d);
        frameLayout.setPadding(0, (int) (((height - ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) r2).getHeight()) / 2.0f) + 0.5f), 0, 0);
    }
}
