package qk3;

/* loaded from: classes.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk3.c f445969d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(qk3.c cVar) {
        super(1);
        this.f445969d = cVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String obj2 = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.jvj)).getText().toString();
        java.lang.String obj3 = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.jvl)).getText().toString();
        java.lang.Object tag = it.getTag(com.p314xaae8f345.mm.R.id.jxl);
        java.lang.Integer num = tag instanceof java.lang.Integer ? (java.lang.Integer) tag : null;
        int intValue = num != null ? num.intValue() : 0;
        qk3.c cVar = this.f445969d;
        java.lang.String format = java.lang.String.format(cVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.h3g), java.util.Arrays.copyOf(new java.lang.Object[]{cVar.O6(intValue), obj3, obj2}, 3));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
