package f31;

/* loaded from: classes9.dex */
public final class f extends o31.e implements o31.b {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f340805a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f340806b;

    /* renamed from: c, reason: collision with root package name */
    public final int f340807c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f340808d;

    /* renamed from: e, reason: collision with root package name */
    public o31.d f340809e;

    /* renamed from: f, reason: collision with root package name */
    public f31.e f340810f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f340811g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f340812h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e f340813i;

    /* renamed from: j, reason: collision with root package name */
    public int f340814j;

    /* renamed from: k, reason: collision with root package name */
    public java.lang.String f340815k;

    /* renamed from: l, reason: collision with root package name */
    public java.lang.String f340816l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f340817m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f340818n;

    public f(java.lang.String username, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f340805a = username;
        this.f340806b = appId;
        this.f340807c = i17;
        this.f340808d = new java.util.ArrayList();
        this.f340812h = "";
        this.f340815k = "";
        this.f340816l = "";
        this.f340817m = new byte[0];
        this.f340818n = new java.util.ArrayList();
    }

    public final int a(o31.a dispatcher) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dispatcher, "dispatcher");
        int i17 = o31.d.f424204a;
        o31.c cVar = new o31.c(new r45.vh6(), new r45.wh6(), 2920, "/cgi-bin/mmbiz-bin/bizattr/subscribemsg");
        this.f340809e = cVar;
        r45.mr5 mr5Var = cVar.f424200b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mr5Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgReq");
        r45.vh6 vh6Var = (r45.vh6) mr5Var;
        vh6Var.f469799q = this.f340814j;
        vh6Var.f469800r = this.f340815k;
        vh6Var.f469801s = this.f340816l;
        java.util.List list = this.f340808d;
        boolean z17 = this.f340811g;
        int i18 = this.f340807c;
        java.util.LinkedList linkedList = vh6Var.f469791f;
        switch (i18) {
            case 1:
            case 6:
                vh6Var.f469789d = this.f340805a;
                vh6Var.f469792g = this.f340806b;
                vh6Var.f469790e = i18;
                vh6Var.f469793h = 1;
                vh6Var.f469794i = z17 ? 1 : 0;
                linkedList.addAll(list);
                if (i18 == 6) {
                    vh6Var.f469796n = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f340817m);
                    r45.ta5 ta5Var = new r45.ta5();
                    vh6Var.f469797o = ta5Var;
                    com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e c11157x9b46987e = this.f340813i;
                    if (c11157x9b46987e != null) {
                        ta5Var.f467770e = c11157x9b46987e.f153308e;
                        ta5Var.f467769d = c11157x9b46987e.f153307d;
                        java.util.Iterator it = c11157x9b46987e.f153309f.iterator();
                        while (it.hasNext()) {
                            com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData itemUiData = (com.p314xaae8f345.mm.p965xc41bc71e.C11157x9b46987e.ItemUiData) it.next();
                            java.util.LinkedList linkedList2 = vh6Var.f469797o.f467771f;
                            r45.yh6 yh6Var = new r45.yh6();
                            yh6Var.f472641d = itemUiData.f153310d;
                            yh6Var.f472642e = itemUiData.f153311e;
                            yh6Var.f472643f = itemUiData.f153312f ? 1 : 0;
                            yh6Var.f472644g = itemUiData.f153313g ? 1 : 0;
                            linkedList2.add(yh6Var);
                        }
                        break;
                    }
                }
                break;
            case 2:
            case 3:
            case 5:
                vh6Var.f469789d = this.f340805a;
                vh6Var.f469792g = this.f340806b;
                vh6Var.f469790e = i18;
                linkedList.addAll(list);
                if (this.f340812h.length() > 0) {
                    vh6Var.f469795m = this.f340812h;
                    break;
                }
                break;
            case 7:
                vh6Var.f469790e = i18;
                vh6Var.f469802t.addAll(this.f340818n);
                break;
            case 8:
                vh6Var.f469790e = i18;
                vh6Var.f469803u = z17 ? 1 : 0;
                break;
        }
        o31.d dVar = this.f340809e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
        return dispatcher.a(dVar, this, this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void b(int i17, int i18, java.lang.String str, o31.e eVar) {
        java.lang.String str2;
        kz5.p0 p0Var;
        java.lang.String str3;
        com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b c11156xefa3516b;
        java.util.LinkedList<r45.dx4> linkedList;
        int i19;
        int i27;
        boolean z17;
        f31.f fVar = this;
        java.lang.String str4 = "";
        if (i17 != 0) {
            str2 = "";
            fVar = this;
        } else {
            if (i18 == 0) {
                o31.d dVar = fVar.f340809e;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(dVar);
                r45.js5 js5Var = ((o31.c) dVar).f424201c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(js5Var, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SubscribeMsgResp");
                r45.wh6 wh6Var = (r45.wh6) js5Var;
                f31.e eVar2 = fVar.f340810f;
                if (eVar2 != null) {
                    java.lang.String str5 = str == null ? "" : str;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.LinkedList InfoList = wh6Var.f470702d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(InfoList, "InfoList");
                    java.util.Iterator it = InfoList.iterator();
                    while (it.hasNext()) {
                        r45.th6 th6Var = (r45.th6) it.next();
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        java.util.LinkedList<r45.s44> KeyWordList = th6Var.f467979h;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KeyWordList, "KeyWordList");
                        for (r45.s44 s44Var : KeyWordList) {
                            arrayList2.add(new jz5.l(s44Var.f467033d, s44Var.f467034e));
                        }
                        java.lang.String str6 = th6Var.f467978g;
                        java.lang.String str7 = str6 == null ? str4 : str6;
                        java.lang.String str8 = th6Var.f467975d;
                        java.lang.String str9 = str8 == null ? str4 : str8;
                        int i28 = th6Var.f467976e;
                        int i29 = th6Var.f467977f;
                        java.lang.String str10 = str4;
                        int i37 = th6Var.f467980i;
                        java.util.Iterator it6 = it;
                        boolean z18 = th6Var.f467982n == 1;
                        java.lang.String str11 = th6Var.f467984p;
                        java.lang.String str12 = str11 == null ? str10 : str11;
                        java.lang.String str13 = th6Var.f467985q;
                        java.lang.String str14 = str13 == null ? str10 : str13;
                        boolean z19 = th6Var.f467983o == 1;
                        int i38 = th6Var.f467986r;
                        boolean z27 = th6Var.f467988t == 1;
                        boolean z28 = th6Var.f467987s == 1;
                        java.lang.String str15 = th6Var.f467989u;
                        java.lang.String str16 = str15 == null ? str10 : str15;
                        boolean z29 = th6Var.f467990v == 1;
                        boolean z37 = th6Var.f467991w == 1;
                        int i39 = th6Var.f467993y;
                        int i47 = th6Var.f467994z;
                        boolean z38 = th6Var.C == 1;
                        boolean z39 = th6Var.A == 1;
                        if (th6Var.B == 1) {
                            z17 = true;
                            i19 = i29;
                            i27 = i39;
                        } else {
                            i19 = i29;
                            i27 = i39;
                            z17 = false;
                        }
                        arrayList.add(new com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3(str7, str9, i28, i19, arrayList2, i37, z18, str12, str14, z19, i38, z28, z27, str16, z29, z37, i27, i47, z38, z39, z17));
                        str4 = str10;
                        it = it6;
                    }
                    java.lang.String str17 = str4;
                    r45.uh6 uh6Var = wh6Var.A;
                    boolean z47 = uh6Var != null && uh6Var.f468922d == 1;
                    if (uh6Var == null || (linkedList = uh6Var.f468923e) == null) {
                        p0Var = kz5.p0.f395529d;
                    } else {
                        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
                        for (r45.dx4 dx4Var : linkedList) {
                            java.lang.String str18 = dx4Var.f454359d;
                            if (str18 == null) {
                                str18 = str17;
                            }
                            arrayList3.add(new com.p314xaae8f345.mm.p965xc41bc71e.C11155xafcbdcb0(str18, dx4Var.f454360e == 1, dx4Var.f454363h));
                        }
                        p0Var = arrayList3;
                    }
                    boolean z48 = wh6Var.f470707i == 1;
                    java.lang.String str19 = wh6Var.f470705g;
                    java.lang.String str20 = str19 == null ? str17 : str19;
                    java.lang.String str21 = wh6Var.f470704f;
                    if (str21 == null) {
                        str21 = str17;
                    }
                    int i48 = wh6Var.f470708m;
                    boolean z49 = wh6Var.f470706h == 1;
                    boolean z57 = wh6Var.f470719x == 1;
                    r45.zh6 zh6Var = wh6Var.f470703e;
                    java.lang.String str22 = zh6Var != null ? zh6Var.f473598d : null;
                    java.lang.String str23 = str22 == null ? str17 : str22;
                    java.lang.String str24 = zh6Var != null ? zh6Var.f473599e : null;
                    java.lang.String str25 = str24 == null ? str17 : str24;
                    java.lang.String str26 = zh6Var != null ? zh6Var.f473600f : null;
                    java.lang.String str27 = str26 == null ? str17 : str26;
                    java.lang.String str28 = zh6Var != null ? zh6Var.f473601g : null;
                    java.lang.String str29 = str28 == null ? str17 : str28;
                    java.lang.String str30 = zh6Var != null ? zh6Var.f473602h : null;
                    java.lang.String str31 = str30 == null ? str17 : str30;
                    java.lang.String str32 = zh6Var != null ? zh6Var.f473603i : null;
                    java.lang.String str33 = str32 == null ? str17 : str32;
                    java.lang.String str34 = zh6Var != null ? zh6Var.f473604m : null;
                    java.lang.String str35 = str34 == null ? str17 : str34;
                    java.lang.String str36 = zh6Var != null ? zh6Var.f473605n : null;
                    java.lang.String str37 = str36 == null ? str17 : str36;
                    java.lang.String str38 = zh6Var != null ? zh6Var.f473606o : null;
                    java.lang.String str39 = str38 == null ? str17 : str38;
                    java.lang.String str40 = zh6Var != null ? zh6Var.f473607p : null;
                    java.lang.String str41 = str40 == null ? str17 : str40;
                    java.lang.String str42 = zh6Var != null ? zh6Var.f473608q : null;
                    com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146 c11160x93f17146 = new com.p314xaae8f345.mm.p965xc41bc71e.C11160x93f17146(str23, str25, str27, str29, str31, str33, str35, str37, str39, str41, str42 == null ? str17 : str42);
                    boolean z58 = wh6Var.f470709n == 1;
                    boolean z59 = wh6Var.f470710o == 1;
                    boolean z66 = wh6Var.f470721z == 1;
                    com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = wh6Var.f470711p;
                    byte[] g17 = gVar != null ? gVar.g() : null;
                    if (g17 == null) {
                        g17 = new byte[0];
                    }
                    byte[] bArr = g17;
                    int i49 = wh6Var.f470717v;
                    r45.xh6 xh6Var = wh6Var.f470718w;
                    int i57 = xh6Var != null ? xh6Var.f471644d : -1;
                    java.lang.String str43 = xh6Var != null ? xh6Var.f471645e : null;
                    if (str43 == null) {
                        str43 = str17;
                    }
                    java.lang.String str44 = xh6Var != null ? xh6Var.f471646f : null;
                    if (str44 == null) {
                        str44 = str17;
                    }
                    com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b c11156xefa3516b2 = new com.p314xaae8f345.mm.p965xc41bc71e.C11156xefa3516b(i57, str43, str44);
                    java.lang.String str45 = wh6Var.f470715t;
                    java.lang.String str46 = str45 == null ? str17 : str45;
                    java.lang.String str47 = wh6Var.f470716u;
                    java.lang.String str48 = str47 == null ? str17 : str47;
                    int i58 = wh6Var.f470712q;
                    java.lang.String str49 = wh6Var.f470713r;
                    java.lang.String str50 = str49 == null ? str17 : str49;
                    boolean z67 = wh6Var.f470714s;
                    java.lang.String str51 = wh6Var.f470720y;
                    if (str51 == null) {
                        c11156xefa3516b = c11156xefa3516b2;
                        str3 = str17;
                    } else {
                        str3 = str51;
                        c11156xefa3516b = c11156xefa3516b2;
                    }
                    eVar2.a(i17, i18, str5, new com.p314xaae8f345.mm.p965xc41bc71e.C11158xe7d16ed5(z48, str20, str21, i48, arrayList, z49, z57, c11160x93f17146, z58, z59, z66, bArr, i49, c11156xefa3516b, str46, str48, i58, str50, z67, str3, z47, p0Var));
                    return;
                }
                return;
            }
            str2 = "";
        }
        f31.e eVar3 = fVar.f340810f;
        if (eVar3 != null) {
            eVar3.a(i17, i18, str == null ? str2 : str, null);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username, int i17) {
        this(username, "", i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f(java.lang.String username, int i17, boolean z17) {
        this(username, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        this.f340811g = z17;
    }
}
