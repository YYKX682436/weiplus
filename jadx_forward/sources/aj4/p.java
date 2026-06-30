package aj4;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f86881d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86882e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f86883f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f86884g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86885h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f86886i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f86887m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, yz5.l lVar, java.lang.String str, java.lang.String str2, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f86882e = atomicBoolean;
        this.f86883f = atomicBoolean2;
        this.f86884g = lVar;
        this.f86885h = str;
        this.f86886i = str2;
        this.f86887m = u3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        aj4.p pVar = new aj4.p(this.f86882e, this.f86883f, this.f86884g, this.f86885h, this.f86886i, this.f86887m, interfaceC29045xdcb5ca57);
        pVar.f86881d = obj;
        return pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.graphics.BitmapFactory.Options n07;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        boolean z17 = this.f86882e.get();
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: already cancelled, drop remux result");
            return f0Var2;
        }
        if (!this.f86883f.compareAndSet(false, true)) {
            return f0Var2;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.f86887m;
            if (u3Var != null) {
                u3Var.dismiss();
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        bw5.sb sbVar = new bw5.sb();
        sbVar.f114407d = bw5.ub.LivePhoto;
        boolean[] zArr = sbVar.f114412i;
        zArr[1] = true;
        java.lang.String str = this.f86885h;
        sbVar.f114408e = str == null ? "" : str;
        zArr[2] = true;
        bw5.tb tbVar = new bw5.tb();
        tbVar.c(com.p314xaae8f345.mm.vfs.w6.k(str));
        if (!(str == null || str.length() == 0)) {
            try {
                qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
                if (wi6 != null) {
                    tbVar.f114877d = wi6.f442896a;
                    boolean[] zArr2 = tbVar.f114880g;
                    zArr2[1] = true;
                    tbVar.f114878e = wi6.f442897b;
                    zArr2[2] = true;
                }
            } catch (java.lang.Throwable th7) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TextStatusFlutterMediaProvider", th7, "buildLivePhotoMediaItem: getVideoInfo failed", new java.lang.Object[0]);
            }
        }
        sbVar.f114409f = tbVar;
        zArr[3] = true;
        java.lang.String str2 = this.f86886i;
        sbVar.f114410g = str2 != null ? str2 : "";
        zArr[4] = true;
        bw5.tb tbVar2 = new bw5.tb();
        tbVar2.c(com.p314xaae8f345.mm.vfs.w6.k(str2));
        if (!(str2 == null || str2.length() == 0) && (n07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.n0(str2)) != null) {
            tbVar2.f114877d = n07.outWidth;
            boolean[] zArr3 = tbVar2.f114880g;
            zArr3[1] = true;
            tbVar2.f114878e = n07.outHeight;
            zArr3[2] = true;
        }
        sbVar.f114411h = tbVar2;
        zArr[5] = true;
        this.f86884g.mo146xb9724478(new aj4.n(kz5.b0.c(sbVar), 0L, null, 6, null));
        return f0Var2;
    }
}
