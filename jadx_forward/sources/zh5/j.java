package zh5;

/* loaded from: classes12.dex */
public final class j extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f554567d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f554568e;

    /* renamed from: f, reason: collision with root package name */
    public int f554569f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zh5.l f554570g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zh5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f554570g = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zh5.j(this.f554570g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((zh5.j) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        dn.m mVar;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f554569f;
        zh5.l lVar = this.f554570g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mVar = lVar.f554573c;
            java.lang.String str2 = lVar.f554572b + "_temp}";
            mVar.f69595x6d25b0d9 = str2;
            i95.m c17 = i95.n0.c(sx.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            java.lang.ref.WeakReference weakReference = lVar.f554574d;
            this.f554567d = mVar;
            this.f554568e = str2;
            this.f554569f = 1;
            java.lang.Object Be = sx.b0.Be((sx.b0) c17, mVar, 0L, weakReference, this, 2, null);
            if (Be == aVar) {
                return aVar;
            }
            str = str2;
            obj = Be;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f554568e;
            mVar = (dn.m) this.f554567d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) obj;
        if ((n1Var != null ? n1Var.f152636a : null) != com.p314xaae8f345.mm.p947xba6de98f.m1.f152609e) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("downloadData file error ");
            sb6.append(mVar.f69601xaca5bdda);
            sb6.append(" ret:");
            sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f152638c) : null);
            sb6.append(" action:");
            sb6.append(n1Var != null ? n1Var.f152636a : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", sb6.toString());
            return zh5.f.f554555e;
        }
        if (com.p314xaae8f345.mm.vfs.w6.x(str, lVar.f554572b, true)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", "downloadData file success " + mVar.f69601xaca5bdda);
            return zh5.f.f554554d;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppMsg.AppMsgAttachSyncDownloadFSC", "downloadData file error " + mVar.f69601xaca5bdda);
        return zh5.f.f554555e;
    }
}
