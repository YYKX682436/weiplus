package hk5;

/* loaded from: classes5.dex */
public final class k extends o50.j {

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22651x9410f9f9 f363542i;

    /* renamed from: m, reason: collision with root package name */
    public hk5.c f363543m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f363544n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // o50.j
    public co.a T6() {
        return new nb5.b();
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002b, code lost:
    
        if (r0.m163514xfb85f7b0() == 1) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // o50.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View U6(co.a r3) {
        /*
            r2 = this;
            nb5.b r3 = (nb5.b) r3
            java.lang.String r0 = "model"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r0)
            java.lang.Class<zn5.k> r0 = zn5.k.class
            i95.m r0 = i95.n0.c(r0)
            zn5.k r0 = (zn5.k) r0
            zn5.l r0 = (zn5.l) r0
            r0.Zi()
            v05.b r0 = r3.j()
            if (r0 == 0) goto L2e
            int r1 = r0.f513848e
            int r1 = r1 + 39
            com.tencent.mm.protobuf.f r0 = r0.m75936x14adae67(r1)
            s05.d r0 = (s05.d) r0
            if (r0 == 0) goto L2e
            int r0 = r0.m163514xfb85f7b0()
            r1 = 1
            if (r0 != r1) goto L2e
            goto L2f
        L2e:
            r1 = 0
        L2f:
            if (r1 == 0) goto L3e
            io.d r0 = new io.d
            r0.<init>()
            nb5.b r1 = r0.f374707c
            r0.f374707c = r3
            r0.c(r1, r3)
            goto L4a
        L3e:
            io.f r0 = new io.f
            r0.<init>()
            nb5.b r1 = r0.f374713c
            r0.f374713c = r3
            r0.c(r1, r3)
        L4a:
            androidx.appcompat.app.AppCompatActivity r3 = r2.m158354x19263085()
            android.view.View r3 = r0.a(r3)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: hk5.k.U6(co.a):android.view.View");
    }

    @Override // o50.j, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        super.mo450x3e5a77bb(bundle);
        j75.f Q6 = Q6();
        if (Q6 != null) {
            Q6.L2(m158354x19263085(), new hk5.e(this));
        }
    }
}
