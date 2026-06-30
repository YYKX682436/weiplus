package cw0;

/* loaded from: classes5.dex */
public final class o0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cw0.d f304198d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(cw0.d dVar) {
        super(1);
        this.f304198d = dVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        fv0.a it = (fv0.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.a onEditOperationClickListener = this.f304198d.getOnEditOperationClickListener();
        if (onEditOperationClickListener != null) {
            onEditOperationClickListener.s1(it);
        }
        return jz5.f0.f384359a;
    }
}
