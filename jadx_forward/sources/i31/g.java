package i31;

/* loaded from: classes9.dex */
public final class g implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ i31.i f369636d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f369637e;

    public g(i31.i iVar, int i17) {
        this.f369636d = iVar;
        this.f369637e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        i31.i iVar = this.f369636d;
        if (i17 == iVar.f369641b && i18 == -1) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) intent.getParcelableExtra("key_data");
            boolean booleanExtra = intent.getBooleanExtra("key_status_subscribed", false);
            if (c11159x8f55e6d3 == null) {
                return;
            }
            j31.a aVar = iVar.f369645f;
            aVar.getClass();
            java.lang.String str = c11159x8f55e6d3.f153336f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
            aVar.f378893g = str;
            java.lang.String str2 = c11159x8f55e6d3.f153335e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
            aVar.f378894h = str2;
            aVar.f378892f = c11159x8f55e6d3.f153353z;
            iVar.i(!booleanExtra ? 5 : c11159x8f55e6d3.f153351x ? 4 : 3);
            iVar.f369644e = true;
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = iVar.f369643d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c11162xe78737a3);
            java.util.Iterator it = c11162xe78737a3.f153369f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                if (android.text.TextUtils.equals(str, c11159x8f55e6d32.f153336f)) {
                    c11159x8f55e6d32.f153340m = booleanExtra ? 1 : 0;
                    c11159x8f55e6d32.f153348u = c11159x8f55e6d3.f153348u;
                    c11159x8f55e6d32.f153351x = c11159x8f55e6d3.f153351x;
                    break;
                }
            }
            i31.d dVar = iVar.f369633a;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
                throw null;
            }
            m31.f fVar = ((com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7) dVar).f153385f;
            if (fVar != null) {
                fVar.m8147xed6e4d18(this.f369637e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaSubscribeMsgSettingPagePresenter", "goDetailUI  mmSetOnActivityResultCallback");
        }
    }
}
