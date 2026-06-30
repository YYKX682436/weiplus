package pi2;

/* loaded from: classes3.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pi2.n f436309d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f436310e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(pi2.n nVar, long j17) {
        super(0);
        this.f436309d = nVar;
        this.f436310e = j17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pi2.n nVar = this.f436309d;
        fg2.u0 u0Var = nVar.R;
        if (u0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u0Var.f343881f.setVisibility(0);
        fg2.u0 u0Var2 = nVar.R;
        if (u0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        long j17 = this.f436310e;
        u0Var2.f343878c.setText(java.lang.String.valueOf(j17));
        fg2.u0 u0Var3 = nVar.R;
        if (u0Var3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        u0Var3.f343885j.setVisibility(8);
        ((mm2.c1) nVar.H.a(mm2.c1.class)).w8(j17);
        nVar.f0();
        oi2.a aVar = nVar.K;
        long j18 = aVar != null ? aVar.f427146d : 0;
        android.content.Context context = nVar.f199716e;
        if (j17 >= j18) {
            fg2.u0 u0Var4 = nVar.R;
            if (u0Var4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var4.f343883h.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmx));
            fg2.u0 u0Var5 = nVar.R;
            if (u0Var5 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var5.f343882g.setVisibility(0);
            fg2.u0 u0Var6 = nVar.R;
            if (u0Var6 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var6.f343886k.setVisibility(8);
        } else {
            fg2.u0 u0Var7 = nVar.R;
            if (u0Var7 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var7.f343883h.setText(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mmo));
            fg2.u0 u0Var8 = nVar.R;
            if (u0Var8 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var8.f343882g.setVisibility(8);
            fg2.u0 u0Var9 = nVar.R;
            if (u0Var9 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
                throw null;
            }
            u0Var9.f343886k.setVisibility(0);
        }
        return jz5.f0.f384359a;
    }
}
