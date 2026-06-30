package jn1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljn1/a;", "Lg75/f0;", "Lhn1/a;", "Lhn1/b;", "Lg75/r;", "pipeline", "<init>", "(Lg75/r;)V", "plugin-comm_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class a extends g75.f0<hn1.a, hn1.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(g75.r pipeline) {
        super(pipeline);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pipeline, "pipeline");
    }

    @Override // g75.f0
    public java.lang.Object i(g75.z zVar, j75.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        hn1.b bVar2;
        hn1.a aVar = (hn1.a) bVar;
        int g17 = zVar.g("Avatar_HdFlag");
        com.p314xaae8f345.mm.p943x351df9c2.r0 r0Var = (com.p314xaae8f345.mm.p943x351df9c2.r0) zVar.d("Avatar_ImgFlag");
        if (r0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not exist " + aVar.f363977b);
            return new hn1.b(hn1.u.f364026g, "");
        }
        boolean z17 = true;
        java.lang.String c17 = g17 == 1 ? r0Var.c() : r0Var.d();
        if (c17 == null || r26.n0.N(c17)) {
            if (r0Var.f152063b == 4) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag url is empty username:" + aVar.f363977b + " hdFlag:" + g17);
                return new hn1.b(hn1.u.f364025f, "");
            }
            java.lang.String d17 = com.p314xaae8f345.mm.p943x351df9c2.g.d(r0Var, g17);
            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(aVar.f363978c, d17).o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            if (com.p314xaae8f345.mm.vfs.w6.j(o17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but exist head img and expired " + r0Var.f152063b + ' ' + aVar.f363977b + ' ' + d17);
                return new hn1.b(hn1.u.f364023d, d17);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag empty url but not exist head img " + r0Var.f152063b + ' ' + aVar.f363977b + ' ' + d17);
            return new hn1.b(hn1.u.f364024e, d17);
        }
        java.lang.String d18 = com.p314xaae8f345.mm.p943x351df9c2.g.d(r0Var, g17);
        java.lang.String o18 = new com.p314xaae8f345.mm.vfs.r6(aVar.f363978c, d18).o();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
        if (com.p314xaae8f345.mm.vfs.w6.j(o18)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag not expired " + aVar.f363977b + ' ' + d18);
            bVar2 = new hn1.b(hn1.u.f364023d, d18);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarCheckExpiredPPC", "avatar imgFlag expired " + aVar.f363977b + ' ' + d18 + ", remove cache by username");
            kv.b0 b0Var = (kv.b0) i95.n0.c(kv.b0.class);
            java.lang.String str = aVar.f363977b;
            ((hn1.s) b0Var).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarImageLoaderFeatureService", "removeFromCacheByUsername: " + str);
            if (str != null && !r26.n0.N(str)) {
                z17 = false;
            }
            if (!z17) {
                java.lang.String prefix = "key_" + str;
                com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().getClass();
                com.p314xaae8f345.mm.p943x351df9c2.a aVar2 = com.p314xaae8f345.mm.p943x351df9c2.z.f152110d;
                aVar2.getClass();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefix, "prefix");
                jt0.a aVar3 = aVar2.f151955a;
                aVar3.getClass();
                kk.j imp = aVar3.f402700b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imp, "imp");
                synchronized (imp) {
                    java.util.Iterator it = new java.util.ArrayList(aVar3.f402700b.mo143585xbc5e1583()).iterator();
                    while (it.hasNext()) {
                        java.lang.String str2 = (java.lang.String) it.next();
                        if (str2 != null && r26.i0.y(str2, prefix, false)) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AvatarResource", "remove prefix: " + prefix + ", key: " + str2);
                            aVar3.f402700b.mo141381xc84af884(str2);
                        }
                    }
                }
            }
            bVar2 = new hn1.b(hn1.u.f364024e, d18);
        }
        return bVar2;
    }
}
