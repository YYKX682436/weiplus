package im2;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f373785e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.view.View root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f373785e = "FinderLiveEndSquareHolderPlugin";
    }

    public final so2.v2 Y() {
        android.content.Context context = this.f195201d.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) {
            return ((im2.i6) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(im2.i6.class)).f373926e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    public void a() {
        java.lang.String u17 = pm0.v.u(Y().f492192n.m75942xfb822ef2(0));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f373785e, "report enter square");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("liveid", u17);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.t1 t1Var = ml2.t1.V2;
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        java.lang.String str = b17;
        ml2.q1 q1Var = ml2.q1.f409345e;
        zy2.zb.T8(zbVar, t1Var, hashMap, str, "temp_30", null, null, false, 112, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5490xca85566c c5490xca85566c = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5490xca85566c();
        am.ub ubVar = c5490xca85566c.f135823g;
        ubVar.f89603a = 6L;
        ubVar.f89604b = true;
        ubVar.f89605c = u17;
        c5490xca85566c.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39 c5494xbcbdbc39 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5494xbcbdbc39();
        am.yb ybVar = c5494xbcbdbc39.f135827g;
        ybVar.f89982a = 4L;
        ybVar.f89983b = 0;
        r45.la2 la2Var = Y().f492200v;
        ybVar.f89984c = la2Var != null ? la2Var.m75934xbce7f2f(2) : null;
        ybVar.f89985d = Y().f492201w;
        c5494xbcbdbc39.e();
        this.f195201d.post(new im2.a(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.no0
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.c4 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        android.view.View view = this.f195201d;
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.s76);
        view.findViewById(com.p314xaae8f345.mm.R.id.s7b);
        android.graphics.Bitmap bitmap = data.f198504c;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        }
    }
}
