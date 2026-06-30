package dn0;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f323361a = jz5.h.b(dn0.c.f323360d);

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Long f323362b;

    public final boolean a(dn0.a type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        java.lang.Long l17 = this.f323362b;
        if (l17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MMSingReverb", "setReverb type: " + type);
            return false;
        }
        int m46462xd989569c = ((com.p314xaae8f345.mm.p820x32b0ec.ap.p821xc83515e4.C10826x5852a51b) ((jz5.n) this.f323361a).mo141623x754a37bb()).m46462xd989569c(l17.longValue(), type.ordinal(), new float[0], 0);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMSingReverb", "setReverb res: " + m46462xd989569c + " type: " + type);
        return m46462xd989569c == 0;
    }
}
