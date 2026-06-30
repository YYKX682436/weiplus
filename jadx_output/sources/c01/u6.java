package c01;

/* loaded from: classes6.dex */
public class u6 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f37507d = 0;

    public u6(c01.v6 v6Var, c01.t6 t6Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f37507d < 45;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f37507d;
        this.f37507d = i17 + 1;
        switch (i17) {
            case 0:
                return dj3.v.INSTANCE;
            case 1:
                return d34.j0.INSTANCE;
            case 2:
                return d34.z.INSTANCE;
            case 3:
                return com.tencent.mm.feature.app.extension.m0.INSTANCE;
            case 4:
                return lw3.a0.INSTANCE;
            case 5:
                return ff3.r.INSTANCE;
            case 6:
                return gt.y5.INSTANCE;
            case 7:
                return wa3.m.INSTANCE;
            case 8:
                return nv.d3.INSTANCE;
            case 9:
                return n83.z.INSTANCE;
            case 10:
                return a35.r.INSTANCE;
            case 11:
                return d83.q.INSTANCE;
            case 12:
                return sv.k0.INSTANCE;
            case 13:
                return ff3.o.INSTANCE;
            case 14:
                return n83.x.INSTANCE;
            case 15:
                return com.tencent.mm.plugin.exdevice.model.c.INSTANCE;
            case 16:
                return nv.g2.INSTANCE;
            case 17:
                return ls.j.INSTANCE;
            case 18:
                return yt1.l.INSTANCE;
            case 19:
                return rg0.g0.INSTANCE;
            case 20:
                return ah0.i2.INSTANCE;
            case 21:
                return uw1.f.INSTANCE;
            case 22:
                return a22.j.INSTANCE;
            case 23:
                return com.tencent.mm.plugin.appbrand.appcache.ca.INSTANCE;
            case 24:
                return n83.b0.INSTANCE;
            case 25:
                return com.tencent.mm.plugin.appbrand.appusage.d7.INSTANCE;
            case 26:
                return h14.l0.INSTANCE;
            case 27:
                return ln.c.INSTANCE;
            case 28:
                return d34.w.INSTANCE;
            case 29:
                return h14.b.INSTANCE;
            case 30:
                return y73.s0.INSTANCE;
            case 31:
                return ib3.j0.INSTANCE;
            case 32:
                return uo3.x.INSTANCE;
            case 33:
                return com.tencent.mm.plugin.subapp.jdbiz.m.INSTANCE;
            case 34:
                return a22.b.INSTANCE;
            case 35:
                return pg0.o1.INSTANCE;
            case 36:
                return r43.m0.INSTANCE;
            case 37:
                return a22.g.INSTANCE;
            case 38:
                return ha4.j.INSTANCE;
            case 39:
                return nv.j2.INSTANCE;
            case 40:
                return ao5.r.INSTANCE;
            case 41:
                return az.b.INSTANCE;
            case 42:
                return vh4.l1.INSTANCE;
            case com.tencent.mm.opensdk.constants.ConstantsAPI.COMMAND_GETA8KEY /* 43 */:
                return yt1.a0.INSTANCE;
            case 44:
                return jy4.e0.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 45");
        }
    }
}
