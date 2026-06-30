package rv0;

/* loaded from: classes5.dex */
public final class n5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 f481680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f481681e;

    public n5(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 c10941x9ba2abc0, double d17) {
        this.f481680d = c10941x9ba2abc0;
        this.f481681e = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0.f150814z;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.C10941x9ba2abc0 c10941x9ba2abc0 = this.f481680d;
        fy0.r scrollHelper = c10941x9ba2abc0.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.c(this.f481681e);
        }
        c10941x9ba2abc0.j();
    }
}
