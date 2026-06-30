package fe2;

/* loaded from: classes3.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fe2.h f343039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(fe2.h hVar) {
        super(0);
        this.f343039d = hVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pk2.o9 o9Var;
        pk2.d9 d9Var;
        df2.ox oxVar = (df2.ox) this.f343039d.U0(df2.ox.class);
        if (oxVar != null && (o9Var = oxVar.f312549q) != null && (d9Var = o9Var.f437615f) != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("requestCode", 16);
            pk2.o9 o9Var2 = d9Var.f437213w;
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = o9Var2.f437611d;
            int i17 = bundle.getInt("requestCode");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = ((mm2.c1) o9Var2.c(mm2.c1.class)).f410379n;
            if (c19792x256d2725 != null) {
                o9Var2.k(c19792x256d2725, ((mm2.e1) o9Var2.c(mm2.e1.class)).f410521r);
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.a(c19792x256d2725, 16384);
                a17.m59367x7b6790db(((mm2.c1) o9Var2.c(mm2.c1.class)).f410319c3);
                android.os.Bundle bundle2 = new android.os.Bundle();
                o25.y1 y1Var = d9Var.f437199i;
                bundle2.putInt("quick_share_item_count", y1Var != null ? ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) y1Var).f270255e : 0);
                bundle2.putInt("Select_Conv_Type", 16);
                bundle2.putIntArray("search_range", new int[]{131075});
                i95.m c17 = i95.n0.c(c61.ub.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                c61.ub.ah((c61.ub) c17, abstractActivityC21394xb3d2c0cf, a17, bundle2, 0, new pk2.x8(o9Var2, i17), 8, null);
                ((mm2.c1) o9Var2.c(mm2.c1.class)).O1 = false;
            }
        }
        return jz5.f0.f384359a;
    }
}
