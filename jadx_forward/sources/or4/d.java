package or4;

/* loaded from: classes.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ or4.e f429231d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(or4.e eVar) {
        super(1);
        this.f429231d = eVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.CharSequence text = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.ivz)).getText();
        if (((android.widget.ImageView) it.findViewById(com.p314xaae8f345.mm.R.id.ivy)).getVisibility() != 0) {
            return java.lang.String.valueOf(text);
        }
        return ((java.lang.Object) text) + ',' + this.f429231d.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kr6);
    }
}
