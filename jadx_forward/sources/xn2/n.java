package xn2;

/* loaded from: classes2.dex */
public final class n extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xn2.p0 f537065d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 f537066e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(xn2.p0 p0Var, com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11) {
        super(0);
        this.f537065d = p0Var;
        this.f537066e = c5437xe8b43b11;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17;
        xn2.b bVar;
        java.lang.Object obj;
        if (!this.f537065d.i()) {
            java.util.ArrayList m56388xcaeb60d0 = this.f537065d.j().m56388xcaeb60d0();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b11 = this.f537066e;
            java.util.Iterator it = m56388xcaeb60d0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                so2.j5 j5Var = (so2.j5) obj;
                if ((j5Var instanceof zn2.a) && j5Var.mo2128x1ed62e84() == c5437xe8b43b11.f135780g.f87970a) {
                    break;
                }
            }
            so2.j5 j5Var2 = (so2.j5) obj;
            if (j5Var2 != null) {
                xn2.p0.b(this.f537065d, j5Var2, true);
            }
        } else if (this.f537066e.f135780g.f87970a != 0) {
            java.util.ArrayList m56388xcaeb60d02 = this.f537065d.j().m56388xcaeb60d0();
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5437xe8b43b11 c5437xe8b43b112 = this.f537066e;
            synchronized (m56388xcaeb60d02) {
                java.util.Iterator it6 = m56388xcaeb60d02.iterator();
                i17 = 0;
                while (true) {
                    if (!it6.hasNext()) {
                        i17 = -1;
                        break;
                    }
                    if (((so2.j5) it6.next()).mo2128x1ed62e84() == c5437xe8b43b112.f135780g.f87970a) {
                        break;
                    }
                    i17++;
                }
            }
            vn2.u0.f519920a.m(this.f537065d.f537078c, "feedDeleteListener delete = " + pm0.v.u(this.f537066e.f135780g.f87970a) + ",index=" + i17);
            pm0.v.I(this.f537065d.j().m56388xcaeb60d0(), new xn2.m(this.f537066e));
            if (i17 >= 0 && (bVar = this.f537065d.f537080e) != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.mj) ((xn2.f1) bVar).a()).mo56053xb9568715(i17, 1);
            }
        }
        return jz5.f0.f384359a;
    }
}
