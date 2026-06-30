package zi4;

/* loaded from: classes11.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.u0 f554790d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.ob f554791e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(zi4.u0 u0Var, bw5.ob obVar) {
        super(0);
        this.f554790d = u0Var;
        this.f554791e = obVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.content.Context context;
        zi4.u0 u0Var = this.f554790d;
        u0Var.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("jumpToCardListPage >> ");
        bw5.ob obVar = this.f554791e;
        sb6.append(obVar.c());
        sb6.append(' ');
        sb6.append(obVar.m12655xca73e223());
        sb6.append(' ');
        sb6.append(obVar.f112565f);
        sb6.append(' ');
        sb6.append(obVar.b());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb6.toString());
        obVar.f112566g = obVar.f112565f == 2 ? obVar.b() : null;
        obVar.f112567h[4] = true;
        java.lang.String c17 = obVar.c();
        if (c17 == null ? false : p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c17, en1.a.a())) {
            si4.a G = ai4.m0.f86706a.G();
            java.lang.String m12655xca73e223 = obVar.m12655xca73e223();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12655xca73e223, "getStatusId(...)");
            mj4.h t17 = G.t(m12655xca73e223);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("item onClick self, ");
            sb7.append(obVar.m12655xca73e223());
            sb7.append(", exist=");
            sb7.append(t17 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb7.toString());
            if (t17 != null) {
                java.lang.String c18 = obVar.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getStatusUserName(...)");
                u0Var.b(c18, t17, obVar.b());
            } else {
                java.lang.ref.WeakReference weakReference = u0Var.f554714e;
                if (weakReference != null && (context = (android.content.Context) weakReference.get()) != null) {
                    java.lang.String m12655xca73e2232 = obVar.m12655xca73e223();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12655xca73e2232, "getStatusId(...)");
                    java.lang.String b17 = obVar.b();
                    ej4.f fVar = new ej4.f(null, 4L, 0L, 1L, null, 16, null);
                    fVar.f334889i = b17;
                    pj4.f1 f1Var = fVar.f334888h;
                    if (f1Var != null) {
                        java.util.LinkedList linkedList = new java.util.LinkedList();
                        linkedList.add(m12655xca73e2232);
                        f1Var.f436576h = linkedList;
                    }
                    gm0.j1.d().a(4245, u0Var);
                    gm0.j1.d().g(fVar);
                    if (u0Var.f554799g == null || (!r2.isShowing())) {
                        u0Var.f554799g = db5.e1.P(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), 3, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), false, true, new zi4.t0(fVar, u0Var));
                    }
                }
            }
        } else {
            si4.a G2 = ai4.m0.f86706a.G();
            java.lang.String m12655xca73e2233 = obVar.m12655xca73e223();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m12655xca73e2233, "getStatusId(...)");
            mj4.h t18 = G2.t(m12655xca73e2233);
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("item onClick owner=");
            sb8.append(obVar.c());
            sb8.append(", ");
            sb8.append(obVar);
            sb8.append(".statusId, exist=");
            sb8.append(t18 != null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FLTStatusMessagePageOpenCardListPageHandler", sb8.toString());
            if (t18 == null) {
                u0Var.c();
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("textstatus_expire_cannot_view_toast", "view_exp", new java.util.HashMap(), 28809);
            } else {
                java.lang.String c19 = obVar.c();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getStatusUserName(...)");
                u0Var.b(c19, t18, obVar.b());
            }
        }
        return jz5.f0.f384359a;
    }
}
