package tw0;

/* loaded from: classes4.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f503967d;

    /* renamed from: e, reason: collision with root package name */
    public int f503968e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zu0.l f503969f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zu0.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f503969f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tw0.h(this.f503969f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tw0.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f503968e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zu0.l lVar = this.f503969f;
            this.f503967d = lVar;
            this.f503968e = 1;
            oz5.n nVar = new oz5.n(pz5.f.b(this));
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.q7.c("MaasCache") + "/MovieComposing/", "snapshotImageData");
            if (!r6Var.m()) {
                r6Var.J();
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lVar.f557216a);
            sb6.append('_');
            sb6.append(java.lang.System.currentTimeMillis());
            byte[] bytes = sb6.toString().getBytes(r26.c.f450398a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
            com.p314xaae8f345.mm.vfs.r6 r6Var2 = new com.p314xaae8f345.mm.vfs.r6(r6Var, kk.k.g(bytes) + com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3376xf6c83dac.JPG);
            java.lang.String o17 = r6Var2.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
            android.graphics.Bitmap bitmap = lVar.f557217b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmap, "<this>");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x.D0(bitmap, 100, android.graphics.Bitmap.CompressFormat.JPEG, o17, true);
            jz5.g gVar = by0.p.f117879a;
            java.lang.String o18 = r6Var2.o();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o18, "getAbsolutePath(...)");
            tw0.g gVar2 = new tw0.g(nVar);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(o18);
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a() ? m17.f294799a.F(m17.f294800b) : false) {
                dn.m mVar = new dn.m();
                mVar.f323318d = "task_FinderUploadTask_2";
                mVar.f323320f = gVar2;
                char[] cArr = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.f274579a;
                java.lang.String b17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w2.b(o18.getBytes());
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(b17, "getMD5String(...)");
                mVar.f69601xaca5bdda = "upload_".concat(b17);
                mVar.f69595x6d25b0d9 = o18;
                mVar.f69619xe9ed65f6 = o18;
                mVar.f69618x114ef53e = "";
                mVar.f69606xccdbf540 = true;
                mVar.f69592xf1ebe47b = 20304;
                mVar.f69580x454032b6 = 251;
                mVar.f69584x89a4c0cf = 2;
                mVar.A = 120;
                mVar.B = 300;
                mVar.f69609xd84b8349 = 2;
                ((rx.l) ((sx.e0) ((jz5.n) by0.p.f117879a).mo141623x754a37bb())).Bi(mVar);
            }
            obj = nVar.a();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
