package ht3;

/* loaded from: classes.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ht3.l f366486d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(ht3.l lVar) {
        super(1);
        this.f366486d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.View it = (android.view.View) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        java.lang.String r17 = i65.a.r(this.f366486d.m158354x19263085(), com.p314xaae8f345.mm.R.C30867xcad56011.g_);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        java.lang.String format = java.lang.String.format(r17, java.util.Arrays.copyOf(new java.lang.Object[]{it.getTag(com.p314xaae8f345.mm.R.id.f564306nl)}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
