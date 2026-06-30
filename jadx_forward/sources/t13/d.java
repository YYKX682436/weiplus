package t13;

/* loaded from: classes.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f496095d = 0;

    public d(t13.e eVar, t13.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f496095d < 28;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f496095d;
        this.f496095d = i17 + 1;
        switch (i17) {
            case 0:
                return f23.l2.INSTANCE;
            case 1:
                return f23.k3.INSTANCE;
            case 2:
                return i14.r.INSTANCE;
            case 3:
                return i14.n.INSTANCE;
            case 4:
                return sr1.t0.INSTANCE;
            case 5:
                return sr1.h0.INSTANCE;
            case 6:
                return sr1.p0.INSTANCE;
            case 7:
                return f23.f2.INSTANCE;
            case 8:
                return f23.o3.INSTANCE;
            case 9:
                return f23.s2.INSTANCE;
            case 10:
                return sr1.l0.INSTANCE;
            case 11:
                return f23.a3.INSTANCE;
            case 12:
                return f23.o2.INSTANCE;
            case 13:
                return f23.g3.INSTANCE;
            case 14:
                return f23.u2.INSTANCE;
            case 15:
                return f23.i3.INSTANCE;
            case 16:
                return sr1.x0.INSTANCE;
            case 17:
                return f23.q3.INSTANCE;
            case 18:
                return f23.d2.INSTANCE;
            case 19:
                return f23.j2.INSTANCE;
            case 20:
                return f23.y2.INSTANCE;
            case 21:
                return sr1.d0.INSTANCE;
            case 22:
                return f23.c3.INSTANCE;
            case 23:
                return f23.e3.INSTANCE;
            case 24:
                return f23.q2.INSTANCE;
            case 25:
                return f23.h2.INSTANCE;
            case 26:
                return f23.m3.INSTANCE;
            case 27:
                return f23.w2.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 28");
        }
    }
}
