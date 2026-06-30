package l20;

/* loaded from: classes9.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 f396680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.qf f396681e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 c10548x1e09fcd9, bw5.qf qfVar) {
        super(0);
        this.f396680d = c10548x1e09fcd9;
        this.f396681e = qfVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9.f147411x;
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p734xed8dccef.p735x75644e17.C10548x1e09fcd9 c10548x1e09fcd9 = this.f396680d;
        c10548x1e09fcd9.d("feeds_add_shopping_cart", "element_click", null);
        bw5.qf qfVar = this.f396681e;
        int i18 = qfVar.g().f112616d;
        if (i18 == 1) {
            bw5.ie0 ie0Var = new bw5.ie0();
            ie0Var.f110096e = 1;
            boolean[] zArr = ie0Var.f110098g;
            zArr[3] = true;
            ie0Var.f110095d = qfVar.f113600d;
            zArr[2] = true;
            ie0Var.f110097f = qfVar.C[11] ? qfVar.f113610q : "";
            zArr[4] = true;
            l20.e0 e0Var = new l20.e0(c10548x1e09fcd9);
            byte[] mo14344x5f01b1f6 = ie0Var.mo14344x5f01b1f6();
            x02.d dVar = new x02.d();
            dVar.f532513g = e0Var;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3384xf5161200.C30570x21b91788.m169996x21b0e74b(mo14344x5f01b1f6, dVar);
        } else if (i18 == 2) {
            i95.m c17 = i95.n0.c(pq.q.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            pq.q qVar = (pq.q) c17;
            android.content.Context context = c10548x1e09fcd9.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            pq.a aVar = new pq.a(context);
            bw5.of g17 = qfVar.g();
            bw5.x7 x7Var = g17.f112618f[2] ? g17.f112617e : new bw5.x7();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x7Var, "getSelectSkuJumpInfo(...)");
            pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
