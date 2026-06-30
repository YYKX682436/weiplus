package or4;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.c f429229d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(or4.c cVar) {
        super(1);
        this.f429229d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        android.text.Editable text = ((com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359) it.findViewById(com.p314xaae8f345.mm.R.id.pbn)).getText();
        boolean J0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.J0(text);
        or4.c cVar = this.f429229d;
        if (J0) {
            return java.lang.String.valueOf(cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kfl));
        }
        return cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kfl) + ",¥" + ((java.lang.Object) text);
    }
}
