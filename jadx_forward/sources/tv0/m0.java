package tv0;

/* loaded from: classes5.dex */
public final class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d f503751d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f503752e;

    public m0(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d, double d17) {
        this.f503751d = c10942x373bdc1d;
        this.f503752e = d17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d.A;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d = this.f503751d;
        fy0.r scrollHelper = c10942x373bdc1d.getScrollHelper();
        if (scrollHelper != null) {
            scrollHelper.c(this.f503752e);
        }
        c10942x373bdc1d.j();
    }
}
