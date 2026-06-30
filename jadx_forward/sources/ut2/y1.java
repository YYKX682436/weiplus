package ut2;

/* loaded from: classes3.dex */
public final class y1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f512689d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut2.s3 f512690e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cm2.m0 f512691f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f512692g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(ut2.s3 s3Var, cm2.m0 m0Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f512690e = s3Var;
        this.f512691f = m0Var;
        this.f512692g = f0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ut2.y1(this.f512690e, this.f512691f, this.f512692g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ut2.y1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f512689d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ut2.s3 s3Var = this.f512690e;
            xt2.k1 k1Var = s3Var.D;
            if (k1Var != null) {
                cm2.m0 m0Var = this.f512691f;
                r45.y23 y23Var = m0Var.f124901v;
                android.widget.LinearLayout G = s3Var.G();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(G, "<get-promoteGroup>(...)");
                int i18 = this.f512692g.f391649d;
                ut2.x1 x1Var = new ut2.x1(s3Var, m0Var);
                this.f512689d = 1;
                java.lang.String str = "MicroMsg.FinderLiveShoppingViewHolder_" + y23Var.m75945x2fec8307(1) + '_' + y23Var.m75942xfb822ef2(0);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("showBox ");
                mm2.x5 x5Var = mm2.f6.G1;
                java.util.LinkedList m75941xfb821914 = y23Var.m75941xfb821914(28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getShow_box_items(...)");
                sb6.append(x5Var.a(m75941xfb821914));
                sb6.append(", showDiscountSelling:true, leftSpace:");
                sb6.append(i18);
                sb6.append(",promoteGroupWidth:");
                sb6.append(G.getMeasuredWidth());
                sb6.append(",countdownFinish:");
                sb6.append(x1Var.hashCode());
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                java.util.LinkedList m75941xfb8219142 = y23Var.m75941xfb821914(28);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getShow_box_items(...)");
                java.lang.Object c17 = k1Var.c("MicroMsg.FinderLiveShoppingViewHolder", m75941xfb8219142, true, G, i18, x1Var, this);
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
