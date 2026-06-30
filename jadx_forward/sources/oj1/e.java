package oj1;

/* loaded from: classes7.dex */
public abstract class e {
    public static final void a(java.lang.String uuid, oj1.d type, cl0.g args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uuid, "uuid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        if (oj1.a.f427282a[type.ordinal()] == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StandaloneFunctionalDirectApiHandler", "openFeedback: uuid(" + uuid + ") started feedback");
            ((th0.d0) ((uh0.u) i95.n0.c(uh0.u.class))).Ai();
            java.lang.String mo15082x48bce8a4 = args.mo15082x48bce8a4("appId");
            if (mo15082x48bce8a4 == null) {
                return;
            }
            java.lang.String mo15082x48bce8a42 = args.mo15082x48bce8a4("pageId");
            int mo15080xc3ca103c = args.mo15080xc3ca103c("appVersion", 0);
            int mo15080xc3ca103c2 = args.mo15080xc3ca103c("versionType", 0);
            k91.z5 z5Var = new k91.z5();
            z5Var.f387396a = mo15082x48bce8a4;
            z5Var.f387406k = mo15082x48bce8a42;
            z5Var.f387402g = mo15080xc3ca103c;
            z5Var.f387403h = mo15080xc3ca103c2;
            z5Var.f387405j = 16;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1145x1ea3c036.p1147xb32913b4.p1148xd59b9312.p1149x60b7c31.d.a(null, new oj1.c(uuid, z5Var.a()));
        }
    }
}
