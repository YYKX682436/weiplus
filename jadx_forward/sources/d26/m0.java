package d26;

/* loaded from: classes16.dex */
public class m0 extends d26.l0 {

    /* renamed from: g, reason: collision with root package name */
    public final o06.d1 f307559g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f307560h;

    /* renamed from: i, reason: collision with root package name */
    public final n16.c f307561i;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m0(o06.d1 r17, i16.o0 r18, k16.g r19, k16.a r20, d26.z r21, b26.q r22, java.lang.String r23, yz5.a r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r0 = r18
            r15 = r23
            java.lang.String r1 = "packageDescriptor"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r1)
            java.lang.String r1 = "proto"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            java.lang.String r1 = "nameResolver"
            r2 = r19
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r1)
            java.lang.String r1 = "metadataVersion"
            r3 = r20
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r3, r1)
            java.lang.String r1 = "components"
            r4 = r22
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r1)
            java.lang.String r1 = "debugName"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r15, r1)
            java.lang.String r1 = "classNames"
            r5 = r24
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r1)
            k16.k r10 = new k16.k
            i16.v1 r1 = r0.f369199m
            java.lang.String r7 = "getTypeTable(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r1, r7)
            r10.<init>(r1)
            k16.l r1 = k16.m.f384995a
            i16.g2 r7 = r0.f369200n
            java.lang.String r8 = "getVersionRequirementTable(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r8)
            k16.m r11 = r1.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            b26.t r1 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r2 = r0.f369196g
            java.lang.String r3 = "getFunctionList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r2, r3)
            java.util.List r3 = r0.f369197h
            java.lang.String r4 = "getPropertyList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r4)
            java.util.List r4 = r0.f369198i
            java.lang.String r0 = "getTypeAliasList(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r0)
            r0 = r16
            r5 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f307559g = r14
            r6.f307560h = r15
            r0 = r14
            r06.z0 r0 = (r06.z0) r0
            n16.c r0 = r0.f450099h
            r6.f307561i = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d26.m0.<init>(o06.d1, i16.o0, k16.g, k16.a, d26.z, b26.q, java.lang.String, yz5.a):void");
    }

    @Override // d26.l0, y16.t, y16.w
    public o06.j e(n16.g name, w06.a location) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(location, "location");
        v06.a.a(this.f307554b.f99048a.f99024i, location, this.f307559g, name);
        return super.e(name, location);
    }

    @Override // y16.t, y16.w
    public java.util.Collection f(y16.i kindFilter, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(kindFilter, "kindFilter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
        java.util.Collection i17 = i(kindFilter, nameFilter, w06.d.f523482g);
        java.lang.Iterable iterable = this.f307554b.f99048a.f99026k;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            kz5.h0.u(arrayList, ((q06.c) it.next()).b(this.f307561i));
        }
        return kz5.n0.t0(i17, arrayList);
    }

    @Override // d26.l0
    public void h(java.util.Collection result, yz5.l nameFilter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameFilter, "nameFilter");
    }

    @Override // d26.l0
    public n16.b l(n16.g name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        return new n16.b(this.f307561i, name);
    }

    @Override // d26.l0
    public java.util.Set n() {
        return kz5.r0.f395535d;
    }

    @Override // d26.l0
    public java.util.Set o() {
        return kz5.r0.f395535d;
    }

    @Override // d26.l0
    public java.util.Set p() {
        return kz5.r0.f395535d;
    }

    @Override // d26.l0
    public boolean q(n16.g name) {
        boolean z17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        if (super.q(name)) {
            return true;
        }
        java.lang.Iterable iterable = this.f307554b.f99048a.f99026k;
        if (!(iterable instanceof java.util.Collection) || !((java.util.Collection) iterable).isEmpty()) {
            java.util.Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (((q06.c) it.next()).a(this.f307561i, name)) {
                    z17 = true;
                    break;
                }
            }
        }
        z17 = false;
        return z17;
    }

    /* renamed from: toString */
    public java.lang.String m123394x9616526c() {
        return this.f307560h;
    }
}
