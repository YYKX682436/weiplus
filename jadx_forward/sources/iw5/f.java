package iw5;

/* loaded from: classes11.dex */
public final class f implements com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h {

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f376802c = new java.util.LinkedHashMap();

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g f376803a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h f376804b;

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public void a(com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.g gVar) {
        this.f376803a = gVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public boolean b(java.lang.String req) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(req, "req");
        java.lang.String msg = "listen: ".concat(req);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        jz5.l a17 = iw5.h.f376805a.a(req);
        if (a17 == null) {
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelServerFactory", "listen: parse req error");
            }
            return false;
        }
        java.lang.String msg2 = "listen: " + a17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg2, "msg");
        java.util.Map map = f376802c;
        java.lang.Object obj = a17.f384366d;
        if (!map.containsKey(obj)) {
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelServerFactory", "listen: type not found");
            }
            return false;
        }
        try {
            java.lang.Object obj2 = ((java.util.LinkedHashMap) map).get(obj);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj2);
            jw5.i iVar = new jw5.i();
            this.f376804b = iVar;
            iVar.a(this.f376803a);
            com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h hVar = this.f376804b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            return hVar.b((java.lang.String) a17.f384367e);
        } catch (java.lang.Exception e17) {
            java.lang.String msg3 = "listen: create impl error " + e17;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg3, "msg");
            if (iw5.o.f376808a != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ExtChannelServerFactory", msg3);
            }
            return false;
        }
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h
    public void j() {
        if (iw5.o.f376808a != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ExtChannelServerFactory", "unInit");
        }
        com.p314xaae8f345.p3133xd0ce8b26.p3175x392f2b.h hVar = this.f376804b;
        if (hVar != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(hVar);
            ((jw5.i) hVar).j();
        }
    }
}
