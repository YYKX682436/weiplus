package ut2;

/* loaded from: classes3.dex */
public final class w1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512670f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f512671g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(ut2.s3 s3Var, cm2.m0 m0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512669e = s3Var;
        this.f512670f = m0Var;
        this.f512671g = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.w1(this.f512669e, this.f512670f, this.f512671g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.w1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512668d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ut2.s3 s3Var = this.f512669e;
            xt2.k1 k1Var = s3Var.E;
            if (k1Var != null) {
                cm2.m0 m0Var = this.f512670f;
                r45.y23 y23Var = m0Var.f124901v;
                android.widget.LinearLayout I = s3Var.I();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(I, "<get-saleInfoGroup>(...)");
                int i18 = this.f512671g.f391649d;
                ut2.v1 v1Var = new ut2.v1(s3Var, m0Var);
                this.f512668d = 1;
                java.lang.String str = "MicroMsg.FinderLiveShoppingViewHolder_" + y23Var.m75945x2fec8307(1) + '_' + y23Var.m75942xfb822ef2(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saleInfo ");
                mm2.x5 x5Var = mm2.f6.G1;
                java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(49);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getEvalution_label_list(...)");
                sb6.append(x5Var.a(m75941xfb821914));
                sb6.append(", showDiscountSelling:true, leftSpace:");
                sb6.append(i18);
                sb6.append(",promoteGroupWidth:");
                sb6.append(I.getMeasuredWidth());
                sb6.append(",countdownFinish:");
                sb6.append(v1Var.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                java.util.LinkedList m75941xfb8219142 = y23Var.m75941xfb821914(49);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getEvalution_label_list(...)");
                java.lang.Object c17 = k1Var.c("MicroMsg.FinderLiveShoppingViewHolder", m75941xfb8219142, true, I, i18, v1Var, this);
                if (c17 != aVar) {
                    c17 = f0Var;
                }
                if (c17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
