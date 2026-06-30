package tp0;

/* loaded from: classes7.dex */
public abstract class g extends tp0.e {
    @Override // tp0.e
    public void x(org.json.JSONObject data, java.lang.Object view, jc3.m parent) {
        lc3.r rVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        super.x(data, view, parent);
        lc3.s sVar = (lc3.s) this.f399423a;
        if (sVar != null && (rVar = sVar.f399452d) != null) {
            rVar.b(v(data));
        }
        z(view, data);
        parent.b(view, new tp0.f(this));
    }

    public void z(java.lang.Object view, org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }
}
