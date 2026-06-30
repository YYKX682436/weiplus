package uw0;

/* loaded from: classes5.dex */
public final class u0 extends ov0.a {

    /* renamed from: y1, reason: collision with root package name */
    public final int f513146y1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f513146y1 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.akc);
    }

    @Override // ov0.t
    public void L() {
        m157201xabe4ee33().setVisibility(8);
    }

    @Override // ov0.t
    public boolean N() {
        java.lang.Boolean bool = (java.lang.Boolean) j("key_enable_dual_language_edit", java.lang.Boolean.FALSE);
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    /* renamed from: getEditTextMaxLineOnExpand */
    public int mo47102x5193cd64() {
        return 1;
    }

    @Override // ov0.t
    /* renamed from: getInputBoxHeight */
    public int mo157200xbb31ef1e() {
        return this.f513146y1;
    }
}
