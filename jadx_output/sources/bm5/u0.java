package bm5;

/* loaded from: classes8.dex */
public final class u0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22739d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Long f22740e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f22741f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(java.lang.String str, java.lang.Long l17, java.lang.String str2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f22739d = str;
        this.f22740e = l17;
        this.f22741f = str2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new bm5.u0(this.f22739d, this.f22740e, this.f22741f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bm5.u0) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean z17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getBitmap >> ");
        java.lang.String str = this.f22739d;
        sb6.append(str);
        sb6.append("， msgId >> ");
        java.lang.Long l17 = this.f22740e;
        sb6.append(l17);
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryUtil", sb6.toString());
        if (l17 != null) {
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f213279f;
            if (str2 != null) {
                java.lang.String l18 = com.tencent.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l18)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l18, a17.f213280g, a17.f213281h);
                }
            }
            java.lang.String str3 = a17.f213279f;
            int lastIndexOf = str3.lastIndexOf("/");
            boolean z18 = true;
            if (lastIndexOf >= 0) {
                str3 = str3.substring(lastIndexOf + 1);
            }
            kotlin.jvm.internal.o.f(str3, "getName(...)");
            if (r26.i0.y(str3, "th_", false)) {
                long longValue = l17.longValue();
                java.lang.String concat = r26.i0.n(str, "hd", false) ? str : str.concat("hd");
                if (!com.tencent.mm.vfs.w6.j(concat)) {
                    com.tencent.mm.storage.f9 n17 = pt0.f0.f358209b1.n(this.f22741f, longValue);
                    i95.m c17 = i95.n0.c(xs.w0.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    if (!((a80.b) ((xs.w0) c17)).mj(n17, null)) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        if (m11.b1.Di().b2(n17.Q0(), n17.I0()).f322651s != 1) {
                            z18 = false;
                        }
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryUtil", "genHdThumbIfNeeded, hadHdThumb = " + z18);
                    if (z18) {
                        ((j70.e) ((k70.y) i95.n0.c(k70.y.class))).getClass();
                        z17 = m11.b1.Di().z0(n17, com.tencent.mm.R.drawable.bzt, 0, -1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryUtil", "genHdThumbIfNeeded, genHdThumbRet = " + z17);
                    } else {
                        z17 = false;
                    }
                    if (!z17) {
                        if (r26.i0.n(str, "hd", false)) {
                            java.lang.String substring = str.substring(0, str.length() - 2);
                            kotlin.jvm.internal.o.f(substring, "substring(...)");
                            if (com.tencent.mm.vfs.w6.j(substring)) {
                                str = substring;
                            }
                        }
                    }
                }
                str = concat;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ImageQueryUtil", "getBitmap finalPath >> " + str);
        return com.tencent.mm.sdk.platformtools.x.J(str, null);
    }
}
