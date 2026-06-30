package cn2;

/* loaded from: classes3.dex */
public final class m0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cn2.p0 f125108d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f125109e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f125110f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(cn2.p0 p0Var, java.util.List list, boolean z17) {
        super(0);
        this.f125108d = p0Var;
        this.f125109e = list;
        this.f125110f = z17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        cn2.p0 p0Var = this.f125108d;
        p0Var.getClass();
        java.util.List list = this.f125109e;
        if (list.size() > 0) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("before merge local size:");
            sb6.append(p0Var.f125131i.size());
            sb6.append(",remote size:");
            sb6.append(list.size());
            sb6.append(",max length:");
            int i17 = p0Var.f125125c;
            sb6.append(i17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew", sb6.toString());
            p0Var.f125131i.addAll(list);
            p0Var.d("ken-after merge", p0Var.f125131i);
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.n0.F0(p0Var.f125131i, new cn2.i0(p0Var)));
            p0Var.f125131i = arrayList;
            p0Var.d("ken-after sorted", arrayList);
            if (i17 > 0) {
                while (p0Var.f125131i.size() > i17) {
                    dk2.zf zfVar = (dk2.zf) kz5.h0.E(p0Var.f125131i);
                    if (zfVar != null) {
                        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("drop msg:");
                        sb7.append(zfVar.k() + ':' + zfVar.j());
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew", sb7.toString());
                    }
                }
            }
        }
        pm0.v.G(list, cn2.l0.f125104d);
        boolean z17 = this.f125110f;
        if (!z17 || p0Var.f125130h) {
            if (p0Var.f125132j) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew", "updateBulletComment ignore");
            } else {
                long currentTimeMillis = p0Var.b().f125016f != 0 ? java.lang.System.currentTimeMillis() - p0Var.b().f125016f : 0L;
                android.view.ViewGroup viewGroup = p0Var.f125123a;
                if (currentTimeMillis > 30000 && p0Var.f125131i.size() > 0) {
                    p0Var.b().f125016f = 0L;
                    p0Var.c(5);
                    pm0.z.b(xy2.b.f539688b, "bulletAnimSliceTooMuchTime", false, null, null, false, false, null, 124, null);
                    zl2.r4 r4Var = zl2.r4.f555483a;
                    android.content.Context context = viewGroup.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                    r4Var.f3(context, "DEBUG 进场消息状态错误!");
                }
                java.lang.StringBuilder sb8 = new java.lang.StringBuilder("updateBulletComment setVisible:");
                sb8.append(z17);
                sb8.append(",bullet:");
                sb8.append(viewGroup.hashCode());
                sb8.append(",bulletInvisible:");
                sb8.append(viewGroup.getVisibility() != 0);
                sb8.append(",animationHelper:");
                sb8.append(p0Var.b().hashCode());
                sb8.append(",lastAnimPassTime:");
                sb8.append(currentTimeMillis);
                sb8.append('!');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveCommentPlugin_BulletNew", sb8.toString());
            }
        } else if (!p0Var.f125132j) {
            pm0.v.X(new cn2.k0(p0Var, 1, true));
        }
        return jz5.f0.f384359a;
    }
}
