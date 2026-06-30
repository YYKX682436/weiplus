package ol4;

/* loaded from: classes11.dex */
public final class c implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ol4.q f427684d;

    public c(ol4.q qVar) {
        this.f427684d = qVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnInfoListener
    /* renamed from: onInfo */
    public final void mo53278xc39adf2d(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, int i17, long j17, long j18, java.lang.Object obj) {
        ll4.a aVar;
        ol4.q qVar = this.f427684d;
        if (i17 < 1000) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isPreload: ");
            bw5.lp0 lp0Var = qVar.f427716e;
            if (lp0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var.c().f108990i);
            sb6.append(", isPrepared: ");
            bw5.lp0 lp0Var2 = qVar.f427716e;
            if (lp0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var2.c().A);
            sb6.append(", title: ");
            bw5.lp0 lp0Var3 = qVar.f427716e;
            if (lp0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mPlayingItem");
                throw null;
            }
            sb6.append(lp0Var3.d().m13171x7531c8a2());
            java.lang.String sb7 = sb6.toString();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(qVar.f427730s, "OnInfoListener, what:" + i17 + ", arg1:" + j17 + ", arg2:" + j18 + ", extraObject:" + obj + ' ' + sb7);
        }
        if (i17 != 200) {
            if (i17 == 201 && (aVar = qVar.f427715d) != null) {
                ll4.a.a(aVar, 8, null, 2, null);
                return;
            }
            return;
        }
        ll4.a aVar2 = qVar.f427715d;
        if (aVar2 != null) {
            ll4.a.a(aVar2, 7, null, 2, null);
        }
    }
}
