package ap1;

/* loaded from: classes5.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12700d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.w f12701e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f12702f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ap1.w wVar, com.tencent.mm.ui.widget.dialog.u3 u3Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f12701e = wVar;
        this.f12702f = u3Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        ap1.m mVar = new ap1.m(this.f12701e, this.f12702f, continuation);
        mVar.f12700d = obj;
        return mVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((ap1.m) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        boolean a17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        kotlinx.coroutines.y0 y0Var = (kotlinx.coroutines.y0) this.f12700d;
        com.tencent.mm.ui.widget.dialog.u3 dialog = this.f12702f;
        kotlin.jvm.internal.o.f(dialog, "$dialog");
        po1.c cVar = po1.d.f357294i;
        ap1.w wVar = this.f12701e;
        com.tencent.wechat.aff.affroam.g gVar = wVar.f12752i;
        if (gVar == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        com.tencent.wechat.aff.affroam.u uVar = gVar.f215832g;
        kotlin.jvm.internal.o.f(uVar, "getTargetDevice(...)");
        po1.d a18 = cVar.a(uVar);
        androidx.appcompat.app.AppCompatActivity context = wVar.getActivity();
        kotlin.jvm.internal.o.g(context, "context");
        boolean z17 = true;
        if (a18.f357296b != po1.g.f357310h) {
            a17 = true;
        } else {
            po1.d e17 = ro1.v.f398014a.e(a18.f357295a);
            a17 = ((e17 == null || so1.b.f410226a.h(e17)) ? so1.g.f410238a : to1.g.f420911a).a(context, a18);
        }
        if (!a17) {
            com.tencent.mars.xlog.Log.i(pf5.o.TAG, "Check permission failed.");
            pf5.e.launchUI$default(wVar, null, null, new ap1.i(dialog, wVar, a18, null), 3, null);
            z17 = false;
        }
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (!z17) {
            return f0Var;
        }
        kotlinx.coroutines.z0.g(y0Var);
        com.tencent.mm.plugin.backup.roambackup.r0 r0Var = com.tencent.mm.plugin.backup.roambackup.r0.f92684a;
        com.tencent.wechat.aff.affroam.g gVar2 = wVar.f12752i;
        if (gVar2 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        java.lang.String str = gVar2.f215832g.f215989e;
        kotlin.jvm.internal.o.f(str, "getDeviceId(...)");
        boolean m17 = r0Var.m(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Connectivity of Device=");
        com.tencent.wechat.aff.affroam.g gVar3 = wVar.f12752i;
        if (gVar3 == null) {
            kotlin.jvm.internal.o.o("pkgInfo");
            throw null;
        }
        sb6.append(gVar3.f215832g.f215989e);
        sb6.append(" is ");
        sb6.append(m17);
        com.tencent.mars.xlog.Log.i(pf5.o.TAG, sb6.toString());
        if (m17) {
            kotlinx.coroutines.l.d(y0Var, null, null, new ap1.l(wVar, dialog, null), 3, null);
        } else {
            pf5.e.launchUI$default(wVar, null, null, new ap1.k(wVar, dialog, null), 3, null);
        }
        return f0Var;
    }
}
