package bm5;

/* loaded from: classes8.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104272d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f104273e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f104274f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String str, java.lang.Long l17, java.lang.String str2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f104272d = str;
        this.f104273e = l17;
        this.f104274f = str2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bm5.u0(this.f104272d, this.f104273e, this.f104274f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm5.u0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBitmap >> ");
        java.lang.String str = this.f104272d;
        sb6.append(str);
        sb6.append("， msgId >> ");
        java.lang.Long l17 = this.f104273e;
        sb6.append(l17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryUtil", sb6.toString());
        if (l17 != null) {
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l18, a17.f294813g, a17.f294814h);
                }
            }
            java.lang.String str3 = a17.f294812f;
            int lastIndexOf = str3.lastIndexOf("/");
            boolean z18 = true;
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str3, "getName(...)");
            if (r26.i0.y(str3, "th_", false)) {
                long longValue = l17.longValue();
                java.lang.String concat = r26.i0.n(str, "hd", false) ? str : str.concat("hd");
                if (!com.p314xaae8f345.mm.vfs.w6.j(concat)) {
                    com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = pt0.f0.f439742b1.n(this.f104274f, longValue);
                    i95.m c17 = i95.n0.c(xs.w0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    if (!((a80.b) ((xs.w0) c17)).mj(n17, null)) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        if (m11.b1.Di().b2(n17.Q0(), n17.I0()).f404184s != 1) {
                            z18 = false;
                        }
                    }
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryUtil", "genHdThumbIfNeeded, hadHdThumb = " + z18);
                    if (z18) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        z17 = m11.b1.Di().z0(n17, com.p314xaae8f345.mm.R.C30861xcebc809e.bzt, 0, -1);
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryUtil", "genHdThumbIfNeeded, genHdThumbRet = " + z17);
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        if (r26.i0.n(str, "hd", false)) {
                            java.lang.String substring = str.substring(0, str.length() - 2);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
                            if (com.p314xaae8f345.mm.vfs.w6.j(substring)) {
                                str = substring;
                            }
                        }
                    }
                }
                str = concat;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryUtil", "getBitmap finalPath >> " + str);
        return com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null);
    }
}
