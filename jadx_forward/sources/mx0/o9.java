package mx0;

/* loaded from: classes5.dex */
public final class o9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced f413732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413733e;

    public o9(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced, int i17) {
        this.f413732d = c10977x8e40eced;
        this.f413733e = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787 m47319x71e92c1d;
        android.view.ViewGroup m47297x32bc7ee;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p905xabf495af.C10977x8e40eced c10977x8e40eced = this.f413732d;
        m47319x71e92c1d = c10977x8e40eced.m47319x71e92c1d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m47319x71e92c1d, "<this>");
        java.util.WeakHashMap weakHashMap = n3.l1.f415895a;
        n3.g3 a17 = n3.b1.a(m47319x71e92c1d);
        e3.d a18 = a17 != null ? a17.a(2) : null;
        int c17 = a18 != null ? a18.f328580d - a18.f328578b : com.p314xaae8f345.mm.ui.bl.c(m47319x71e92c1d.getContext());
        m47297x32bc7ee = c10977x8e40eced.m47297x32bc7ee();
        m47297x32bc7ee.getLayoutParams().height = this.f413733e + c17;
    }
}
