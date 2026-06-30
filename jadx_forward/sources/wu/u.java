package wu;

/* loaded from: classes9.dex */
public final class u extends wu.p {

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 f531164h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(hu.f uiParams, com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe<hu.b> mvvmList) {
        super(uiParams, mvvmList);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiParams, "uiParams");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mvvmList, "mvvmList");
    }

    @Override // wu.p
    public void n(android.widget.FrameLayout containerView, hu.b item, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        if (this.f531164h == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("RecordDetailFinderProductItemConvert", "product card view is null");
            return;
        }
        s15.j x17 = item.f366530e.x();
        if (x17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("RecordDetailFinderProductItemConvert", "record item product item == null");
            return;
        }
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String avatarUsername = item.f366531f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUsername, "avatarUsername");
        ((b00.r) ((c00.z2) c17)).f98290d.getClass();
        bw5.u8 u8Var = new bw5.u8();
        u8Var.f115305d = x17.n();
        boolean[] zArr = u8Var.f115317p1;
        zArr[1] = true;
        u8Var.f115306e = x17.m163595x93d5ac12();
        zArr[2] = true;
        u8Var.f115307f = x17.p();
        zArr[3] = true;
        u8Var.f115308g = x17.o();
        zArr[4] = true;
        u8Var.f115309h = x17.u();
        zArr[5] = true;
        u8Var.f115310i = x17.m163593x74292566();
        zArr[6] = true;
        u8Var.o(x17.y());
        u8Var.r(com.p314xaae8f345.mm.sdk.p2603x2137b148.b8.c(x17.F()));
        u8Var.f115314o = x17.m163594x66e287ae();
        zArr[9] = true;
        u8Var.f115315p = x17.G();
        zArr[10] = true;
        u8Var.f115318q = x17.w();
        zArr[11] = true;
        u8Var.f115319r = x17.Q();
        zArr[12] = true;
        u8Var.p(x17.z());
        u8Var.q(x17.B());
        u8Var.f115322u = x17.S();
        zArr[15] = true;
        u8Var.f115325x = x17.l();
        zArr[18] = true;
        u8Var.f115327y = x17.R();
        zArr[19] = true;
        u8Var.f115329z = x17.A();
        zArr[20] = true;
        u8Var.A = x17.s();
        zArr[21] = true;
        u8Var.B = x17.r();
        zArr[22] = true;
        u8Var.C = x17.P();
        zArr[23] = true;
        u8Var.D = x17.O();
        zArr[24] = true;
        u8Var.E = x17.q();
        zArr[25] = true;
        u8Var.F = x17.N();
        zArr[26] = true;
        u8Var.G = x17.Z();
        zArr[27] = true;
        u8Var.H = x17.f0();
        zArr[28] = true;
        u8Var.I = x17.t();
        zArr[29] = true;
        u8Var.f115304J = x17.k();
        zArr[30] = true;
        u8Var.K = x17.H();
        zArr[31] = true;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList T = x17.T();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(T, 10));
        java.util.Iterator it = T.iterator();
        while (it.hasNext()) {
            arrayList.add(e00.l.a((java.lang.String) it.next()));
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList.iterator();
        while (true) {
            if (!it6.hasNext()) {
                break;
            }
            java.lang.Object next = it6.next();
            if (((byte[]) next) != null) {
                arrayList2.add(next);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it7 = arrayList2.iterator();
        while (it7.hasNext()) {
            byte[] bArr = (byte[]) it7.next();
            bw5.o5 o5Var = new bw5.o5();
            o5Var.mo11468x92b714fd(bArr);
            arrayList3.add(o5Var);
        }
        linkedList.addAll(arrayList3);
        u8Var.L = linkedList;
        zArr[32] = true;
        u8Var.M = x17.C();
        zArr[33] = true;
        u8Var.N = x17.E();
        zArr[34] = true;
        u8Var.P = x17.e0();
        zArr[35] = true;
        u8Var.Q = x17.j();
        zArr[36] = true;
        u8Var.R = x17.I();
        zArr[37] = true;
        u8Var.S = x17.J();
        zArr[38] = true;
        u8Var.T = x17.b0();
        zArr[39] = true;
        u8Var.U = x17.c0();
        zArr[40] = true;
        u8Var.V = x17.V();
        zArr[41] = true;
        u8Var.W = x17.W();
        zArr[42] = true;
        u8Var.X = x17.d0();
        zArr[43] = true;
        u8Var.Y = x17.a0();
        zArr[44] = true;
        u8Var.Z = x17.Y();
        zArr[45] = true;
        u8Var.f115316p0 = x17.U();
        zArr[46] = true;
        u8Var.f115326x0 = x17.x();
        zArr[47] = true;
        bw5.a9 a9Var = null;
        if (x17.K().length() > 0) {
            bw5.a9 a9Var2 = new bw5.a9();
            try {
                a9Var2.mo11468x92b714fd(n51.d.a(x17.K(), 2));
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e17);
                a9Var2 = null;
            }
            u8Var.f115328y0 = a9Var2;
            zArr[48] = true;
        }
        if (x17.L().length() > 0) {
            bw5.a9 a9Var3 = new bw5.a9();
            try {
                a9Var3.mo11468x92b714fd(n51.d.a(x17.L(), 2));
                a9Var = a9Var3;
            } catch (java.lang.Exception e18) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a("safeParser", "", e18);
            }
            u8Var.f115311l1 = a9Var;
            zArr[49] = true;
        }
        g00.c cVar = new g00.c(u8Var, bw5.x8.ECS_REQ_SCENE_RECORD);
        cVar.f348921f = avatarUsername;
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e5905 = this.f531164h;
        if (abstractC11172x705e5905 != null) {
            abstractC11172x705e5905.m48330xfcfee142(cVar);
        }
        com.p314xaae8f345.mm.p970x335620.AbstractC11172x705e5905 abstractC11172x705e59052 = this.f531164h;
        if (abstractC11172x705e59052 != null) {
            abstractC11172x705e59052.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d87);
        }
    }

    @Override // wu.p
    public void o(android.view.View view, hu.b item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        p3325xe03a0797.p3326xc267989b.l.d(v65.m.a(view), null, null, new wu.t(view, item, null), 3, null);
    }

    @Override // wu.p
    public void p(android.widget.FrameLayout containerView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(containerView, "containerView");
        i95.m c17 = i95.n0.c(c00.z2.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        android.content.Context context = containerView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        ((b00.r) ((c00.z2) c17)).f98290d.getClass();
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0 c10520x8a9df0c0 = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p722x2e7b10.p723x373aa5.C10520x8a9df0c0(context, null, 0, 6, null);
        this.f531164h = c10520x8a9df0c0;
        containerView.addView(c10520x8a9df0c0, -2, -2);
    }
}
