package lo0;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f401493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401494b;

    /* renamed from: c, reason: collision with root package name */
    public final int f401495c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f401496d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Integer f401497e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f401498f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f401499g;

    public b(org.json.JSONObject badgeJson) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(badgeJson, "badgeJson");
        this.f401498f = "";
        this.f401499g = new java.util.ArrayList();
        java.lang.String optString = badgeJson.optString(dm.i4.f66865x76d1ec5a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (!(optString.length() == 0)) {
            int optInt = badgeJson.optInt("baselineVersion");
            int optInt2 = badgeJson.optInt("currentVersion");
            java.lang.String optString2 = badgeJson.optString("group");
            this.f401493a = optString;
            this.f401494b = optInt;
            this.f401495c = optInt2;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            this.f401496d = optString2;
            return;
        }
        throw new lo0.u("Badge item ID is empty.");
    }

    public final void a(lo0.h handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f401499g.add(new java.lang.ref.WeakReference(handler));
    }

    public final boolean b() {
        java.lang.Integer num = this.f401497e;
        if (num == null) {
            return false;
        }
        int intValue = num.intValue();
        int i17 = this.f401495c;
        int i18 = this.f401494b;
        if (i17 < i18) {
            return false;
        }
        java.lang.String str = this.f401496d;
        if (i17 > i18) {
            return (i17 == intValue && r26.i0.p(str, this.f401498f, false)) ? false : true;
        }
        if (intValue > i18) {
            return false;
        }
        if (intValue < i18) {
            return true;
        }
        return !r26.i0.p(str, this.f401498f, false);
    }

    public final void c(lo0.h handler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        kz5.h0.B(this.f401499g, new lo0.a(handler));
    }

    public final void d() {
        this.f401497e = java.lang.Integer.valueOf(this.f401495c);
        this.f401498f = this.f401496d;
        java.util.List list = this.f401499g;
        java.util.Iterator it = kz5.n0.S0(list).iterator();
        while (it.hasNext()) {
            lo0.h hVar = (lo0.h) ((java.lang.ref.WeakReference) it.next()).get();
            if (hVar != null) {
                hVar.c(this);
            }
        }
        ((java.util.ArrayList) list).clear();
    }

    public b(lo0.b bVar) {
        this.f401498f = "";
        this.f401499g = new java.util.ArrayList();
        this.f401493a = bVar.f401493a;
        this.f401494b = bVar.f401494b;
        this.f401495c = bVar.f401495c;
        this.f401496d = bVar.f401496d;
    }
}
