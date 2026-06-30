package sg2;

/* loaded from: classes.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f489457d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f489457d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sg2.p(this.f489457d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sg2.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = false;
        java.lang.String str = this.f489457d;
        if (str == null || str.length() == 0) {
            return java.lang.Boolean.FALSE;
        }
        java.lang.Object obj2 = ((java.util.LinkedHashMap) sg2.x.f489492e).get(str);
        java.lang.Boolean bool = java.lang.Boolean.TRUE;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj2, bool)) {
            return bool;
        }
        java.lang.Iterable s17 = com.p314xaae8f345.mm.vfs.w6.s(str, false);
        if (s17 != null) {
            java.util.Iterator it = s17.iterator();
            boolean z18 = false;
            while (it.hasNext()) {
                java.lang.String name = ((com.p314xaae8f345.mm.vfs.x1) it.next()).f294765b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "name");
                if (r26.n0.B(name, "manifest.json", false)) {
                    z18 = true;
                }
            }
            z17 = z18;
        }
        if (z17) {
            sg2.x.f489492e.put(str, java.lang.Boolean.TRUE);
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
