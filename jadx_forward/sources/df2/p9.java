package df2;

/* loaded from: classes10.dex */
public final class p9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f312588d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312588d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.p9(this.f312588d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.p9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        wh2.f fVar = wh2.f.f527482a;
        java.lang.String path = this.f312588d;
        java.lang.String v17 = r26.i0.v(path, ".zip", "", false, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        try {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderInteractiveGiftLoader", "unzipFile path:" + path + ", targetPath:" + v17);
            if (com.p314xaae8f345.mm.vfs.w6.j(v17)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderInteractiveGiftLoader", "fileExist");
            } else {
                int Q = com.p314xaae8f345.mm.vfs.w6.Q(path, v17);
                if (Q < 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.FinderInteractiveGiftLoader", "unzip failed. unzipRet=" + Q);
                    return new wh2.a(10002);
                }
            }
            java.util.List k17 = com.p314xaae8f345.mm.vfs.e8.k(com.p314xaae8f345.mm.vfs.w6.s(v17, false));
            com.p314xaae8f345.mm.vfs.x1 x1Var = null;
            if (k17 != null) {
                java.util.Iterator it = k17.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    java.lang.Object next = it.next();
                    java.lang.String name = ((com.p314xaae8f345.mm.vfs.x1) next).f294765b;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                    if (!r26.i0.y(name, "_", false)) {
                        x1Var = next;
                        break;
                    }
                }
                x1Var = x1Var;
            }
            if (x1Var == null) {
                return new wh2.a(10002);
            }
            return new wh2.b(v17 + '/' + x1Var.f294765b);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.FinderInteractiveGiftLoader", "unzipFile failed.", e17);
            return new wh2.a(10002);
        }
    }
}
