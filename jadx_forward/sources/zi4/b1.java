package zi4;

/* loaded from: classes4.dex */
public final class b1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zi4.c1 f554725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lb f554726e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(zi4.c1 c1Var, bw5.lb lbVar) {
        super(0);
        this.f554725d = c1Var;
        this.f554726e = lbVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zi4.c1 c1Var = this.f554725d;
        java.lang.ref.WeakReference weakReference = c1Var.f554714e;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        bw5.lb lbVar = this.f554726e;
        java.lang.String str = lbVar.f111245i[1] ? lbVar.f111240d : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getPoiId(...)");
        double d17 = lbVar.f111241e;
        double d18 = lbVar.f111242f;
        java.lang.String str2 = lbVar.f111245i[4] ? lbVar.f111243g : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "getPoiName(...)");
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(c1Var.f554730g, "jumpPoiPage: failed");
        } else {
            ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
            android.content.Intent intent = new android.content.Intent();
            r45.f96 f96Var = new r45.f96();
            f96Var.set(5, str);
            f96Var.set(0, java.lang.Float.valueOf((float) d17));
            f96Var.set(1, java.lang.Float.valueOf((float) d18));
            f96Var.set(3, str2);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.p3.f207707a.b(context, f96Var, zy2.o9.f559049d, 14, "", new we0.i1(f96Var, intent, context));
        }
        return jz5.f0.f384359a;
    }
}
