package qk3;

/* loaded from: classes.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk3.c f445970d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(qk3.c cVar) {
        super(1);
        this.f445970d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.Object parent = it.getParent().getParent();
        android.view.View view = parent instanceof android.view.View ? (android.view.View) parent : null;
        java.lang.String valueOf = java.lang.String.valueOf((view == null || (textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.jvj)) == null) ? null : textView2.getText());
        java.lang.Object parent2 = it.getParent().getParent();
        android.view.View view2 = parent2 instanceof android.view.View ? (android.view.View) parent2 : null;
        java.lang.String valueOf2 = java.lang.String.valueOf((view2 == null || (textView = (android.widget.TextView) view2.findViewById(com.p314xaae8f345.mm.R.id.jvl)) == null) ? null : textView.getText());
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.jxk);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        qk3.c cVar = this.f445970d;
        java.lang.String format = java.lang.String.format(cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h3f), java.util.Arrays.copyOf(new java.lang.Object[]{cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.b9a), cVar.O6(intValue), valueOf2, valueOf}, 4));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
