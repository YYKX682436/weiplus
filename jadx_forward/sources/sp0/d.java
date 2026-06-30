package sp0;

/* loaded from: classes7.dex */
public final class d implements jc3.m {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f492477a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.ref.WeakReference f492478b;

    public d(java.lang.Object message, java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        this.f492477a = message;
        this.f492478b = weakReference;
    }

    @Override // jc3.m
    public java.lang.Object a(org.json.JSONObject data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString("apiName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString, "optString(...)");
        return new sp0.a(optString);
    }

    @Override // jc3.m
    public void b(java.lang.Object obj, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.m
    public void c(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        sp0.d view = (sp0.d) obj;
        sp0.a viewAttribute = (sp0.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // jc3.m
    public jc3.l d(java.lang.Object obj) {
        sp0.d view = (sp0.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        return new sp0.c();
    }

    @Override // jc3.m
    public void e(java.lang.Object obj, java.lang.Object obj2, jc3.k callback) {
        boolean z17;
        sp0.d view = (sp0.d) obj;
        sp0.a viewAttribute = (sp0.a) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewAttribute, "viewAttribute");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.ref.WeakReference weakReference = this.f492478b;
        if (weakReference == null || ((dq0.a0) weakReference.get()) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBFlutterFakeCoverView", "checkFlutterChannel error， flutter plugin null");
            z17 = false;
        } else {
            z17 = true;
        }
        if (z17) {
            return;
        }
        java.lang.Object obj3 = view.f492477a;
        if (!(obj3 instanceof com.p176xb6135e39.p283xc50a8b8b.l6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MBFlutterFakeCoverView", "view message is not GeneratedMessageV3");
            return;
        }
        java.lang.ref.WeakReference weakReference2 = this.f492478b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(weakReference2);
        dq0.a0 a0Var = (dq0.a0) weakReference2.get();
        if (a0Var != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.google.protobuf.GeneratedMessageV3");
            a0Var.n(viewAttribute.f492474a, ((com.p176xb6135e39.p283xc50a8b8b.l6) obj3).mo20648x5f01b1f6(), new sp0.b(callback, this));
        }
    }
}
