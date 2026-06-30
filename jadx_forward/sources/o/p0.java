package o;

/* loaded from: classes16.dex */
public final class p0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6 {

    /* renamed from: d, reason: collision with root package name */
    public o.q0 f423312d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.Companion.m92072x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6
    /* renamed from: onChangeVisibilityCallback */
    public void mo92070x14133e46(byte[] bArr, boolean z17) {
        o.q0 q0Var;
        if (bArr == null || (q0Var = this.f423312d) == null) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(q0Var);
        bw5.nk0 mo11468x92b714fd = new bw5.nk0().mo11468x92b714fd(bArr);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo11468x92b714fd, "parseFrom(...)");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CombineFooterBarUIC", "onChangeVisibilityCallback: isConfirm=" + z17 + ", includeFriendNum=" + mo11468x92b714fd.f112248h + ", includeLabelNum=" + mo11468x92b714fd.f112246f + ", excludeFriendNum=" + mo11468x92b714fd.f112254q);
        com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376 c13151x881fe376 = ((u.d) q0Var).f504924a;
        int i17 = c13151x881fe376.J6;
        java.util.List list = kz5.p0.f395529d;
        if (i17 == 1) {
            java.util.List list2 = mo11468x92b714fd.f112247g;
            if (list2 == null) {
                list2 = list;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list2, 10));
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((bw5.ok0) it.next()).b());
            }
            c13151x881fe376.H6 = new java.util.ArrayList(arrayList);
            java.util.List list3 = mo11468x92b714fd.f112245e;
            if (list3 == null) {
                list3 = list;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list3, 10));
            java.util.Iterator it6 = list3.iterator();
            while (it6.hasNext()) {
                arrayList2.add(java.lang.String.valueOf(((bw5.pk0) it6.next()).f113241d));
            }
            c13151x881fe376.G6 = new java.util.ArrayList(arrayList2);
            java.util.List list4 = mo11468x92b714fd.f112253p;
            if (list4 != null) {
                list = list4;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it7 = list.iterator();
            while (it7.hasNext()) {
                arrayList3.add(((bw5.ok0) it7.next()).b());
            }
            c13151x881fe376.I6 = new java.util.ArrayList(arrayList3);
        } else {
            java.util.List list5 = mo11468x92b714fd.f112253p;
            if (list5 == null) {
                list5 = list;
            }
            java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list5, 10));
            java.util.Iterator it8 = list5.iterator();
            while (it8.hasNext()) {
                arrayList4.add(((bw5.ok0) it8.next()).b());
            }
            c13151x881fe376.H6 = new java.util.ArrayList(arrayList4);
            java.util.List list6 = mo11468x92b714fd.f112251n;
            if (list6 == null) {
                list6 = list;
            }
            java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(list6, 10));
            java.util.Iterator it9 = list6.iterator();
            while (it9.hasNext()) {
                arrayList5.add(java.lang.String.valueOf(((bw5.pk0) it9.next()).f113241d));
            }
            c13151x881fe376.G6 = new java.util.ArrayList(arrayList5);
            java.util.List list7 = mo11468x92b714fd.f112247g;
            if (list7 != null) {
                list = list7;
            }
            java.util.ArrayList arrayList6 = new java.util.ArrayList(kz5.d0.q(list, 10));
            java.util.Iterator it10 = list.iterator();
            while (it10.hasNext()) {
                arrayList6.add(((bw5.ok0) it10.next()).b());
            }
            c13151x881fe376.I6 = new java.util.ArrayList(arrayList6);
        }
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1335x38a0fd3f.uic.C13151x881fe376.a(c13151x881fe376);
            return;
        }
        c13151x881fe376.c();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5983x81f5fabe c5983x81f5fabe = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5983x81f5fabe();
        java.util.ArrayList arrayList7 = c13151x881fe376.H6;
        h.i iVar = c5983x81f5fabe.f136278m;
        iVar.f359301a = arrayList7;
        iVar.f359302b = c13151x881fe376.I6;
        c5983x81f5fabe.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5985xa5bfc852 c5985xa5bfc852 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5985xa5bfc852();
        c5985xa5bfc852.f136280m.f359304a = c13151x881fe376.G6;
        c5985xa5bfc852.e();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24867xb989d5c6.Companion.m92072x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        this.f423312d = null;
    }
}
