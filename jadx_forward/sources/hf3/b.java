package hf3;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf3.c f362751d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(hf3.c cVar) {
        super(1);
        this.f362751d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.CharSequence text = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.j9v)).getText();
        java.lang.CharSequence text2 = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.j9p)).getText();
        if (((android.widget.ImageView) it.findViewById(com.p314xaae8f345.mm.R.id.k9w)).getVisibility() != 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append((java.lang.Object) text);
            sb6.append(',');
            sb6.append((java.lang.Object) text2);
            sb6.append('}');
            return sb6.toString();
        }
        return ((java.lang.Object) text) + ',' + ((java.lang.Object) text2) + ',' + this.f362751d.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.kr6);
    }
}
