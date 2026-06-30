package mx0;

/* loaded from: classes5.dex */
public final class z7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f414005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.a f414006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414007f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f414008g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f414009h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z7(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, yz5.a aVar, java.lang.String str, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2) {
        super(0);
        this.f414005d = c10977x8e40eced;
        this.f414006e = aVar;
        this.f414007f = str;
        this.f414008g = c0Var;
        this.f414009h = c0Var2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        mx0.o1 m47307x8c723d89;
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        mx0.ja m47325xd23b40d7;
        mx0.l m47302x7ff74ce5;
        mx0.l m47302x7ff74ce52;
        mx0.o1 m47307x8c723d892;
        mx0.g3 m47316xc93d195a;
        mx0.ja m47325xd23b40d72;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f414005d;
        m47307x8c723d89 = c10977x8e40eced.m47307x8c723d89();
        m47307x8c723d89.f413721m = null;
        m47307x8c723d89.f413722n = null;
        this.f414006e.mo152xb9724478();
        m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
        m47319x71e92c1d.setEnabled(true);
        m47325xd23b40d7 = c10977x8e40eced.m47325xd23b40d7();
        m47325xd23b40d7.f413621t = true;
        yx0.b8 b8Var = c10977x8e40eced.f151090v;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f414007f, b8Var.M())) {
            m47325xd23b40d72 = c10977x8e40eced.m47325xd23b40d7();
            m47325xd23b40d72.b(b8Var.M(), false);
        }
        c10977x8e40eced.S0();
        m47302x7ff74ce5 = c10977x8e40eced.m47302x7ff74ce5();
        android.view.View view = m47302x7ff74ce5.f413347d;
        view.setElevation(0.0f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((android.view.ViewGroup.MarginLayoutParams) layoutParams).topMargin = (int) (j65.q.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).getDisplayMetrics().density * 5);
        m47302x7ff74ce52 = c10977x8e40eced.m47302x7ff74ce5();
        m47302x7ff74ce52.d(1.0f);
        if (this.f414008g.f391645d) {
            m47316xc93d195a = c10977x8e40eced.m47316xc93d195a();
            m47316xc93d195a.getClass();
            android.view.MotionEvent obtain = android.view.MotionEvent.obtain(0L, 0L, 0, 0.0f, 0.0f, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obtain);
            com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10973x5ab09303 c10973x5ab09303 = m47316xc93d195a.f413526g;
            c10973x5ab09303.onTouchEvent(obtain);
            obtain.recycle();
            android.view.MotionEvent obtain2 = android.view.MotionEvent.obtain(0L, 0L, 1, 0.0f, 0.0f, 0);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obtain2);
            c10973x5ab09303.onTouchEvent(obtain2);
            obtain2.recycle();
        }
        if (this.f414009h.f391645d) {
            m47307x8c723d892 = c10977x8e40eced.m47307x8c723d89();
            m47307x8c723d892.onClick(c10977x8e40eced);
        }
        return jz5.f0.f384359a;
    }
}
