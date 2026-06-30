package tv0;

/* loaded from: classes5.dex */
public final class s implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d f503772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv0.j0 f503773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ex0.a0 f503774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f503775g;

    public s(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d, tv0.j0 j0Var, ex0.a0 a0Var, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3) {
        this.f503772d = c10942x373bdc1d;
        this.f503773e = j0Var;
        this.f503774f = a0Var;
        this.f503775g = c4181x2248e1a3;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d c10942x373bdc1d = this.f503772d;
        c10942x373bdc1d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f503773e.x7(c10942x373bdc1d, this.f503774f, this.f503775g);
    }
}
