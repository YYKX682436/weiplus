package zh5;

/* loaded from: classes12.dex */
public final class e extends lf3.n implements qf3.b, zh5.k0 {

    /* renamed from: d, reason: collision with root package name */
    public e60.t0 f554552d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f554552d = new e60.t0(null, 0, 0, 0, false, false, null, 127, null);
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        java.lang.String str;
        java.lang.String str2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        java.util.ArrayList parcelableArrayListExtra = intent.getParcelableArrayListExtra("key_media_gallery_data");
        java.io.Serializable serializableExtra = intent.getSerializableExtra("key_media_gallery_config");
        e60.t0 t0Var = serializableExtra instanceof e60.t0 ? (e60.t0) serializableExtra : null;
        if (parcelableArrayListExtra == null || t0Var == null) {
            return false;
        }
        this.f554552d = t0Var;
        mf3.f fVar = new mf3.f();
        java.util.Iterator it = parcelableArrayListExtra.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758 c10615x40454758 = (com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758) it.next();
            com.p314xaae8f345.mm.p689xc5a27af6.p750xf44c7752.api.C10615x40454758 c10615x404547582 = c10615x40454758 == null ? null : c10615x40454758;
            if (c10615x404547582 == null || (str2 = c10615x404547582.f148640f) == null) {
                return false;
            }
            int i17 = c10615x404547582.f148638d;
            mf3.k xVar = i17 != 0 ? i17 != 1 ? null : new zh5.x(c10615x40454758.f148639e, str2, this.f554552d) : new zh5.w(c10615x40454758.f148639e, str2, this.f554552d);
            if (xVar != null && xVar.mo2109xfb85f7b0() != mf3.u.f407655d) {
                fVar.add(xVar);
            }
        }
        int i18 = t0Var.f331269g;
        mf3.k kVar = (mf3.k) kz5.n0.a0(fVar, i18);
        if (kVar == null || (str = kVar.mo2110x5db1b11()) == null) {
            str = "";
        }
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(i18);
        return true;
    }
}
