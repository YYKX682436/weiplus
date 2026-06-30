package v92;

/* loaded from: classes15.dex */
public final class a implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ v92.g f515685d;

    public a(v92.g gVar) {
        this.f515685d = gVar;
    }

    @Override // db5.o4
    /* renamed from: onCreateMMMenu */
    public final void mo887xc459429a(db5.g4 g4Var) {
        boolean z17;
        if (g4Var.z()) {
            v92.g gVar = this.f515685d;
            if (gVar.a()) {
                java.lang.String string = gVar.f515691a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572092yh);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.lang.String string2 = gVar.f515691a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573608f54);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                java.lang.String string3 = gVar.f515691a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c__);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                if (gVar.p()) {
                    string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3u);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                    string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f3v);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                    string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.o1g);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    z17 = true;
                } else {
                    z17 = false;
                }
                boolean z18 = z17;
                java.lang.String str = string3;
                g4Var.j(20002, string, com.p314xaae8f345.mm.R.raw.f79181x28396080, gVar.f515691a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560035m), z18);
                g4Var.j(20003, string2, com.p314xaae8f345.mm.R.raw.f78691x7ae93edb, 0, z18);
                if (gVar.x()) {
                    g4Var.j(20010, str, com.p314xaae8f345.mm.R.raw.f78683x36757420, 0, z18);
                }
            }
        }
    }
}
