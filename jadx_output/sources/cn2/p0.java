package cn2;

/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.ViewGroup f43590a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.plugin.mg f43591b;

    /* renamed from: c, reason: collision with root package name */
    public final int f43592c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f43593d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f43594e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f43595f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f43596g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f43597h;

    /* renamed from: i, reason: collision with root package name */
    public java.util.ArrayList f43598i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f43599j;

    public p0(android.view.ViewGroup bullet, com.tencent.mm.plugin.finder.live.plugin.mg plugin) {
        kotlin.jvm.internal.o.g(bullet, "bullet");
        kotlin.jvm.internal.o.g(plugin, "plugin");
        this.f43590a = bullet;
        this.f43591b = plugin;
        this.f43592c = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.f3752g3).getValue()).r()).intValue();
        jz5.g b17 = jz5.h.b(cn2.g0.f43520d);
        this.f43593d = b17;
        this.f43594e = jz5.h.b(cn2.n0.f43578d);
        this.f43595f = jz5.h.b(new cn2.o0(this));
        this.f43596g = jz5.h.b(new cn2.f0(this));
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (zl2.q4.f473933a.E() && ((java.lang.Boolean) ((nb2.a) ((jz5.n) ae2.in.f3844p5).getValue()).r()).booleanValue()) {
            cn2.l lVar = cn2.l.f43568a;
            r45.t12 t12Var = new r45.t12();
            t12Var.set(3, 10005);
            r45.xn1 xn1Var = new r45.xn1();
            java.util.LinkedList linkedList = new java.util.LinkedList();
            r45.yl1 yl1Var = new r45.yl1();
            yl1Var.set(0, 2);
            yl1Var.set(4, "45级来了");
            yl1Var.set(2, 45);
            linkedList.add(yl1Var);
            xn1Var.set(11, linkedList);
            t12Var.set(8, xn1Var);
            arrayList.add(new dk2.mf(t12Var));
            r45.ch1 ch1Var = new r45.ch1();
            ch1Var.set(1, 20078);
            r45.xn1 xn1Var2 = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact.setNickname("***");
            xn1Var2.set(0, finderContact);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            r45.yl1 yl1Var2 = new r45.yl1();
            yl1Var2.set(0, 10);
            yl1Var2.set(4, "神秘观众666");
            linkedList2.add(yl1Var2);
            xn1Var2.set(11, linkedList2);
            ch1Var.set(13, xn1Var2);
            arrayList.add(new dk2.ea(ch1Var));
            r45.ch1 ch1Var2 = new r45.ch1();
            ch1Var2.set(1, 20076);
            r45.xi1 xi1Var = new r45.xi1();
            r45.w64 w64Var = new r45.w64();
            w64Var.set(0, -1);
            w64Var.set(2, 1);
            java.util.LinkedList linkedList3 = new java.util.LinkedList();
            r45.x64 x64Var = new r45.x64();
            kotlin.jvm.internal.o.b(x64Var.getString(0), "测试");
            x64Var.set(1, "");
            x64Var.set(2, 1);
            linkedList3.add(x64Var);
            w64Var.set(1, linkedList3);
            xi1Var.set(0, w64Var);
            ch1Var2.set(4, new com.tencent.mm.protobuf.g(xi1Var.toByteArray()));
            arrayList.add(new dk2.ea(ch1Var2));
            r45.ch1 ch1Var3 = new r45.ch1();
            ch1Var3.set(1, 20118);
            r45.yj1 yj1Var = new r45.yj1();
            yj1Var.set(1, "预约了xxx游戏");
            yj1Var.set(0, "test");
            ch1Var3.set(4, new com.tencent.mm.protobuf.g(yj1Var.toByteArray()));
            arrayList.add(new dk2.y6(ch1Var3));
            r45.t12 t12Var2 = new r45.t12();
            t12Var2.set(3, 10005);
            r45.xn1 xn1Var3 = new r45.xn1();
            java.util.LinkedList linkedList4 = new java.util.LinkedList();
            r45.yl1 yl1Var3 = new r45.yl1();
            yl1Var3.set(0, 4);
            yl1Var3.set(4, "粉丝团12级来了");
            yl1Var3.set(2, 12);
            linkedList4.add(yl1Var3);
            xn1Var3.set(11, linkedList4);
            t12Var2.set(8, xn1Var3);
            arrayList.add(new dk2.mf(t12Var2));
            r45.t12 t12Var3 = new r45.t12();
            t12Var3.set(3, 10005);
            r45.xn1 xn1Var4 = new r45.xn1();
            java.util.LinkedList linkedList5 = new java.util.LinkedList();
            r45.yl1 yl1Var4 = new r45.yl1();
            yl1Var4.set(0, 2);
            yl1Var4.set(4, "2级来了");
            yl1Var4.set(2, 2);
            linkedList5.add(yl1Var4);
            xn1Var4.set(11, linkedList5);
            t12Var3.set(8, xn1Var4);
            arrayList.add(new dk2.mf(t12Var3));
            r45.t12 t12Var4 = new r45.t12();
            t12Var4.set(3, 10005);
            r45.xn1 xn1Var5 = new r45.xn1();
            java.util.LinkedList linkedList6 = new java.util.LinkedList();
            r45.yl1 yl1Var5 = new r45.yl1();
            yl1Var5.set(0, 2);
            yl1Var5.set(4, "55级来了");
            yl1Var5.set(2, 55);
            linkedList6.add(yl1Var5);
            xn1Var5.set(11, linkedList6);
            t12Var4.set(8, xn1Var5);
            arrayList.add(new dk2.mf(t12Var4));
            r45.t12 t12Var5 = new r45.t12();
            t12Var5.set(3, 10005);
            r45.xn1 xn1Var6 = new r45.xn1();
            java.util.LinkedList linkedList7 = new java.util.LinkedList();
            r45.yl1 yl1Var6 = new r45.yl1();
            yl1Var6.set(0, 2);
            yl1Var6.set(4, "65级来了");
            yl1Var6.set(2, 65);
            linkedList7.add(yl1Var6);
            xn1Var6.set(11, linkedList7);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact2 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact2.setNickname("I am 65");
            xn1Var6.set(0, finderContact2);
            t12Var5.set(8, xn1Var6);
            arrayList.add(new dk2.mf(t12Var5));
            r45.t12 t12Var6 = new r45.t12();
            t12Var6.set(3, 10012);
            r45.xn1 xn1Var7 = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact3 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact3.setNickname("购物用户A ");
            xn1Var7.set(0, finderContact3);
            t12Var6.set(8, xn1Var7);
            arrayList.add(new dk2.mf(t12Var6));
            r45.t12 t12Var7 = new r45.t12();
            t12Var7.set(3, 10005);
            r45.xn1 xn1Var8 = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact4 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact4.setNickname("付费用户A ");
            xn1Var8.set(0, finderContact4);
            t12Var7.set(8, xn1Var8);
            r45.vw1 vw1Var = new r45.vw1();
            vw1Var.set(0, 2);
            t12Var7.set(10, new com.tencent.mm.protobuf.g(vw1Var.toByteArray()));
            arrayList.add(new dk2.mf(t12Var7));
            r45.t12 t12Var8 = new r45.t12();
            t12Var8.set(3, 10005);
            r45.xn1 xn1Var9 = new r45.xn1();
            java.util.LinkedList linkedList8 = new java.util.LinkedList();
            r45.yl1 yl1Var7 = new r45.yl1();
            yl1Var7.set(0, 8);
            yl1Var7.set(4, "隐身53级来了");
            linkedList8.add(yl1Var7);
            r45.yl1 yl1Var8 = new r45.yl1();
            yl1Var8.set(0, 2);
            yl1Var8.set(4, "隐身53级来了");
            yl1Var8.set(2, 53);
            linkedList8.add(yl1Var8);
            xn1Var9.set(11, linkedList8);
            t12Var8.set(8, xn1Var9);
            arrayList.add(new dk2.mf(t12Var8));
            r45.t12 t12Var9 = new r45.t12();
            t12Var9.set(3, 10005);
            r45.xn1 xn1Var10 = new r45.xn1();
            java.util.LinkedList linkedList9 = new java.util.LinkedList();
            r45.yl1 yl1Var9 = new r45.yl1();
            yl1Var9.set(0, 2);
            yl1Var9.set(4, "测试数据最后一个end级来了");
            yl1Var9.set(2, 100);
            linkedList9.add(yl1Var9);
            xn1Var10.set(11, linkedList9);
            com.tencent.mm.protocal.protobuf.FinderContact finderContact5 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact5.setNickname("100级大佬");
            xn1Var10.set(0, finderContact5);
            t12Var9.set(8, xn1Var10);
            arrayList.add(new dk2.mf(t12Var9));
            r45.qq1 qq1Var = new r45.qq1();
            qq1Var.set(0, new java.util.LinkedList());
            java.util.LinkedList list = qq1Var.getList(0);
            r45.xj5 xj5Var = new r45.xj5();
            xj5Var.set(0, "http://wxapp.tc.qq.com/251/20350/stodownload?m=3160625468244fa280ab0f75cc3d983d&filekey=30340201010420301e020200fb0402535a04103160625468244fa280ab0f75cc3d983d02022809040d00000004627466730000000132&hy=SZ&storeid=5659501fa000782b5be6887ae000000fb00004f7e535a20efa151566414040&dotrans=0&bizid=1023");
            list.add(xj5Var);
            java.util.LinkedList list2 = qq1Var.getList(0);
            r45.xj5 xj5Var2 = new r45.xj5();
            xj5Var2.set(0, "http://wxapp.tc.qq.com/251/20350/stodownload?m=3160625468244fa280ab0f75cc3d983d&filekey=30340201010420301e020200fb0402535a04103160625468244fa280ab0f75cc3d983d02022809040d00000004627466730000000132&hy=SZ&storeid=5659501fa000782b5be6887ae000000fb00004f7e535a20efa151566414040&dotrans=0&bizid=1023");
            list2.add(xj5Var2);
            qq1Var.set(1, "testtesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttesttest");
            r45.ch1 ch1Var4 = new r45.ch1();
            ch1Var4.set(1, 1000067);
            ch1Var4.set(4, new com.tencent.mm.protobuf.g(qq1Var.toByteArray()));
            arrayList.add(new dk2.j(ch1Var4));
            r45.ch1 ch1Var5 = new r45.ch1();
            ch1Var5.set(1, 1000068);
            r45.vw1 vw1Var2 = new r45.vw1();
            vw1Var2.set(1, "你以「王凯瑞」的身份进入直播间");
            ch1Var5.set(4, new com.tencent.mm.protobuf.g(vw1Var2.toByteArray()));
            arrayList.add(new dk2.sc(ch1Var5));
            r45.ch1 ch1Var6 = new r45.ch1();
            ch1Var6.set(1, 20101);
            r45.dj1 dj1Var = new r45.dj1();
            dj1Var.getInteger(0);
            kotlin.jvm.internal.o.b(dj1Var.getString(1), "[测试]直播间评论区顶部通用消息直播间评论区顶部通用消息");
            ch1Var6.set(4, new com.tencent.mm.protobuf.g(dj1Var.toByteArray()));
            arrayList.add(new dk2.ea(ch1Var6));
            r45.ch1 ch1Var7 = new r45.ch1();
            ch1Var7.set(1, 20120);
            r45.jh1 jh1Var = new r45.jh1();
            jh1Var.set(0, 2);
            r45.f62 f62Var = new r45.f62();
            f62Var.set(10, "新人成长任务");
            jh1Var.set(1, f62Var);
            ch1Var7.set(4, hc2.b.a(jh1Var));
            arrayList.add(new dk2.kf(ch1Var7));
            r45.xn1 xn1Var11 = new r45.xn1();
            com.tencent.mm.protocal.protobuf.FinderContact finderContact6 = new com.tencent.mm.protocal.protobuf.FinderContact();
            finderContact6.setNickname("测试");
            xn1Var11.set(0, finderContact6);
            r45.ch1 ch1Var8 = new r45.ch1();
            ch1Var8.set(13, xn1Var11);
            ch1Var8.set(1, 20078);
            r45.bj1 bj1Var = new r45.bj1();
            bj1Var.set(1, "关注了主播");
            bj1Var.set(2, 0);
            ch1Var8.set(4, hc2.b.a(bj1Var));
            arrayList.add(new dk2.a8(ch1Var8));
            r45.ch1 ch1Var9 = new r45.ch1();
            ch1Var9.set(13, xn1Var11);
            ch1Var9.set(1, 20122);
            r45.bj1 bj1Var2 = new r45.bj1();
            bj1Var2.set(1, "赞了直播");
            bj1Var2.set(2, 0);
            ch1Var9.set(4, hc2.b.a(bj1Var2));
            arrayList.add(new dk2.a8(ch1Var9));
            r45.ch1 ch1Var10 = new r45.ch1();
            ch1Var10.set(13, xn1Var11);
            ch1Var10.set(1, 20125);
            r45.ej1 ej1Var = new r45.ej1();
            ej1Var.set(0, 1);
            ej1Var.set(1, "分享了直播");
            ej1Var.set(2, 0);
            ch1Var10.set(4, hc2.b.a(ej1Var));
            arrayList.add(new dk2.a8(ch1Var10));
            r45.ch1 ch1Var11 = new r45.ch1();
            ch1Var11.set(13, xn1Var11);
            ch1Var11.set(1, 20125);
            r45.ej1 ej1Var2 = new r45.ej1();
            ej1Var2.set(0, 3);
            ej1Var2.set(1, "预约了下一场直播");
            ej1Var2.set(2, 0);
            ch1Var11.set(4, hc2.b.a(ej1Var2));
            arrayList.add(new dk2.a8(ch1Var11));
            r45.t12 t12Var10 = new r45.t12();
            t12Var10.set(3, 10005);
            r45.xn1 xn1Var12 = new r45.xn1();
            java.util.LinkedList linkedList10 = new java.util.LinkedList();
            r45.yl1 yl1Var10 = new r45.yl1();
            yl1Var10.set(0, 17);
            yl1Var10.set(4, "资深买家");
            linkedList10.add(yl1Var10);
            r45.yl1 yl1Var11 = new r45.yl1();
            yl1Var11.set(0, 2);
            yl1Var11.set(4, "10级");
            yl1Var11.set(2, 10);
            linkedList10.add(yl1Var11);
            xn1Var12.set(11, linkedList10);
            t12Var10.set(8, xn1Var12);
            r45.vw1 vw1Var3 = new r45.vw1();
            vw1Var3.set(0, 4);
            vw1Var3.set(1, "资深买家A 来了，他在你的直播间买过7单");
            t12Var10.set(10, hc2.b.a(vw1Var3));
            arrayList.add(new dk2.mf(t12Var10));
            r45.t12 t12Var11 = new r45.t12();
            t12Var11.set(3, 10005);
            r45.xn1 xn1Var13 = new r45.xn1();
            java.util.LinkedList linkedList11 = new java.util.LinkedList();
            r45.yl1 yl1Var12 = new r45.yl1();
            yl1Var12.set(0, 14);
            yl1Var12.set(4, "普通买家");
            linkedList11.add(yl1Var12);
            r45.yl1 yl1Var13 = new r45.yl1();
            yl1Var13.set(0, 2);
            yl1Var13.set(4, "10级");
            yl1Var13.set(2, 100);
            linkedList11.add(yl1Var13);
            xn1Var13.set(11, linkedList11);
            t12Var11.set(8, xn1Var13);
            r45.vw1 vw1Var4 = new r45.vw1();
            vw1Var4.set(0, 3);
            vw1Var4.set(1, "普通买家A 来了，他在你的直播间买过3单");
            t12Var11.set(10, hc2.b.a(vw1Var4));
            arrayList.add(new dk2.mf(t12Var11));
            r45.t12 t12Var12 = new r45.t12();
            t12Var12.set(3, 10005);
            r45.xn1 xn1Var14 = new r45.xn1();
            java.util.LinkedList linkedList12 = new java.util.LinkedList();
            r45.yl1 yl1Var14 = new r45.yl1();
            yl1Var14.set(0, 15);
            yl1Var14.set(4, "粉丝");
            linkedList12.add(yl1Var14);
            r45.yl1 yl1Var15 = new r45.yl1();
            yl1Var15.set(0, 2);
            yl1Var15.set(4, "100级");
            yl1Var15.set(2, 100);
            linkedList12.add(yl1Var15);
            xn1Var14.set(11, linkedList12);
            t12Var12.set(8, xn1Var14);
            r45.vw1 vw1Var5 = new r45.vw1();
            vw1Var5.set(1, "100级粉丝A 来了");
            t12Var12.set(10, hc2.b.a(vw1Var5));
            arrayList.add(new dk2.mf(t12Var12));
            r45.t12 t12Var13 = new r45.t12();
            t12Var13.set(3, 10005);
            r45.xn1 xn1Var15 = new r45.xn1();
            java.util.LinkedList linkedList13 = new java.util.LinkedList();
            r45.yl1 yl1Var16 = new r45.yl1();
            yl1Var16.set(0, 15);
            yl1Var16.set(4, "粉丝");
            linkedList13.add(yl1Var16);
            r45.yl1 yl1Var17 = new r45.yl1();
            yl1Var17.set(0, 2);
            yl1Var17.set(4, "10级");
            yl1Var17.set(2, 10);
            linkedList13.add(yl1Var17);
            xn1Var15.set(11, linkedList13);
            t12Var13.set(8, xn1Var15);
            r45.vw1 vw1Var6 = new r45.vw1();
            vw1Var6.set(1, "10级粉丝B 来了");
            t12Var13.set(10, hc2.b.a(vw1Var6));
            arrayList.add(new dk2.mf(t12Var13));
            r45.t12 t12Var14 = new r45.t12();
            t12Var14.set(3, 10005);
            r45.xn1 xn1Var16 = new r45.xn1();
            java.util.LinkedList linkedList14 = new java.util.LinkedList();
            r45.yl1 yl1Var18 = new r45.yl1();
            yl1Var18.set(0, 16);
            yl1Var18.set(4, "常看");
            linkedList14.add(yl1Var18);
            r45.yl1 yl1Var19 = new r45.yl1();
            yl1Var19.set(0, 2);
            yl1Var19.set(4, "60级");
            yl1Var19.set(2, 60);
            linkedList14.add(yl1Var19);
            xn1Var16.set(11, linkedList14);
            t12Var14.set(8, xn1Var16);
            r45.vw1 vw1Var7 = new r45.vw1();
            vw1Var7.set(1, "A 来了，他常看你的直播");
            t12Var14.set(10, hc2.b.a(vw1Var7));
            arrayList.add(new dk2.mf(t12Var14));
            r45.t12 t12Var15 = new r45.t12();
            t12Var15.set(3, 10005);
            r45.xn1 xn1Var17 = new r45.xn1();
            java.util.LinkedList linkedList15 = new java.util.LinkedList();
            r45.yl1 yl1Var20 = new r45.yl1();
            yl1Var20.set(0, 16);
            yl1Var20.set(4, "常看");
            linkedList15.add(yl1Var20);
            r45.yl1 yl1Var21 = new r45.yl1();
            yl1Var21.set(0, 2);
            yl1Var21.set(4, "10级");
            yl1Var21.set(2, 10);
            linkedList15.add(yl1Var21);
            xn1Var17.set(11, linkedList15);
            t12Var15.set(8, xn1Var17);
            r45.vw1 vw1Var8 = new r45.vw1();
            vw1Var8.set(1, "10级A 来了，他常看你的直播");
            t12Var15.set(10, hc2.b.a(vw1Var8));
            arrayList.add(new dk2.mf(t12Var15));
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new cn2.h0(this));
            }
        }
        this.f43598i = arrayList;
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew", "init " + hashCode() + ",liveId:" + ((mm2.e1) plugin.P0(mm2.e1.class)).f328988r.getLong(0) + " bullet:" + bullet.hashCode() + " isPagEnable:" + ((java.lang.Boolean) ((jz5.n) b17).getValue()).booleanValue() + '!');
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0143, code lost:
    
        if (r1 != true) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x016f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int a(cn2.p0 r17, dk2.zf r18) {
        /*
            Method dump skipped, instructions count: 478
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: cn2.p0.a(cn2.p0, dk2.zf):int");
    }

    public final cn2.c0 b() {
        return (cn2.c0) ((jz5.n) this.f43596g).getValue();
    }

    public final void c(int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("hideBulletComment source:");
        sb6.append(i17);
        sb6.append(",liveId:");
        sb6.append(((mm2.e1) this.f43591b.P0(mm2.e1.class)).f328988r.getLong(0));
        sb6.append(", container:");
        sb6.append(hashCode());
        sb6.append(" bullet:");
        android.view.ViewGroup viewGroup = this.f43590a;
        sb6.append(viewGroup.hashCode());
        sb6.append('!');
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew", sb6.toString());
        e(false);
        viewGroup.setVisibility(4);
        b().j(i17);
    }

    public final void d(java.lang.String str, java.util.List list) {
        if (!zl2.q4.f473933a.E() || list.isEmpty()) {
            return;
        }
        int size = list.size();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (int i17 = 0; i17 < size; i17++) {
            dk2.zf zfVar = (dk2.zf) list.get(i17);
            sb6.append("content:" + zfVar.j() + ",seq:" + zfVar.m() + ",id:" + zfVar.f() + ",{msgHashCode:" + zfVar.hashCode() + ", msgType:" + zfVar.getType() + "} | ");
        }
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew", str + ' ' + ((java.lang.Object) sb6));
    }

    public final void e(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.LiveCommentPlugin_BulletNew", hashCode() + " running:" + z17);
        this.f43597h = z17;
    }

    public final void f(java.util.List bulletCommentList, boolean z17) {
        kotlin.jvm.internal.o.g(bulletCommentList, "bulletCommentList");
        pm0.v.X(new cn2.m0(this, bulletCommentList, z17));
    }
}
