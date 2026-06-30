package aj4;

/* loaded from: classes10.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f5348d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5349e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f5350f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f5351g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5352h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f5353i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f5354m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(java.util.concurrent.atomic.AtomicBoolean atomicBoolean, java.util.concurrent.atomic.AtomicBoolean atomicBoolean2, yz5.l lVar, java.lang.String str, java.lang.String str2, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f5349e = atomicBoolean;
        this.f5350f = atomicBoolean2;
        this.f5351g = lVar;
        this.f5352h = str;
        this.f5353i = str2;
        this.f5354m = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        aj4.p pVar = new aj4.p(this.f5349e, this.f5350f, this.f5351g, this.f5352h, this.f5353i, this.f5354m, continuation);
        pVar.f5348d = obj;
        return pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aj4.p) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        android.graphics.BitmapFactory.Options n07;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        boolean z17 = this.f5349e.get();
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TextStatusFlutterMediaProvider", "handleLivePhotoFromGallery: already cancelled, drop remux result");
            return f0Var2;
        }
        if (!this.f5350f.compareAndSet(false, true)) {
            return f0Var2;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f5354m;
            if (u3Var != null) {
                u3Var.dismiss();
                f0Var = f0Var2;
            } else {
                f0Var = null;
            }
            kotlin.Result.m521constructorimpl(f0Var);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        bw5.sb sbVar = new bw5.sb();
        sbVar.f32874d = bw5.ub.LivePhoto;
        boolean[] zArr = sbVar.f32879i;
        zArr[1] = true;
        java.lang.String str = this.f5352h;
        sbVar.f32875e = str == null ? "" : str;
        zArr[2] = true;
        bw5.tb tbVar = new bw5.tb();
        tbVar.c(com.tencent.mm.vfs.w6.k(str));
        if (!(str == null || str.length() == 0)) {
            try {
                qc0.d1 wi6 = ((pc0.g2) ((qc0.e1) i95.n0.c(qc0.e1.class))).wi(str);
                if (wi6 != null) {
                    tbVar.f33344d = wi6.f361363a;
                    boolean[] zArr2 = tbVar.f33347g;
                    zArr2[1] = true;
                    tbVar.f33345e = wi6.f361364b;
                    zArr2[2] = true;
                }
            } catch (java.lang.Throwable th7) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatusFlutterMediaProvider", th7, "buildLivePhotoMediaItem: getVideoInfo failed", new java.lang.Object[0]);
            }
        }
        sbVar.f32876f = tbVar;
        zArr[3] = true;
        java.lang.String str2 = this.f5353i;
        sbVar.f32877g = str2 != null ? str2 : "";
        zArr[4] = true;
        bw5.tb tbVar2 = new bw5.tb();
        tbVar2.c(com.tencent.mm.vfs.w6.k(str2));
        if (!(str2 == null || str2.length() == 0) && (n07 = com.tencent.mm.sdk.platformtools.x.n0(str2)) != null) {
            tbVar2.f33344d = n07.outWidth;
            boolean[] zArr3 = tbVar2.f33347g;
            zArr3[1] = true;
            tbVar2.f33345e = n07.outHeight;
            zArr3[2] = true;
        }
        sbVar.f32878h = tbVar2;
        zArr[5] = true;
        this.f5351g.invoke(new aj4.n(kz5.b0.c(sbVar), 0L, null, 6, null));
        return f0Var2;
    }
}
