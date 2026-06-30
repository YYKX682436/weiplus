package la5;

/* loaded from: classes.dex */
public final class q extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ la5.u f399169d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(la5.u uVar) {
        super(1);
        this.f399169d = uVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String obj2 = ((android.widget.TextView) it.findViewById(com.p314xaae8f345.mm.R.id.obn)).getText().toString();
        android.view.View findViewById = it.findViewById(com.p314xaae8f345.mm.R.id.f567593k10);
        la5.u uVar = this.f399169d;
        java.lang.String m158362x2fec8307 = uVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f571348cj);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = obj2;
        objArr[1] = findViewById.getVisibility() == 0 ? uVar.m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.blb) : "";
        java.lang.String format = java.lang.String.format(m158362x2fec8307, java.util.Arrays.copyOf(objArr, 2));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
