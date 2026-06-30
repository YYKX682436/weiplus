package u01;

/* loaded from: classes9.dex */
public final class b implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 f504982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f504983e;

    public b(com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3, int i17) {
        this.f504982d = c11117x314d89f3;
        this.f504983e = i17;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        if (i17 == 1 && i18 == -1) {
            com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d3 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) intent.getParcelableExtra("key_data");
            boolean booleanExtra = intent.getBooleanExtra("key_status_subscribed", false);
            if (c11159x8f55e6d3 == null) {
                return;
            }
            com.p314xaae8f345.mm.p945xdb1a454a.p946x138a4df7.C11117x314d89f3 c11117x314d89f3 = this.f504982d;
            c11117x314d89f3.getClass();
            com.p314xaae8f345.mm.p965xc41bc71e.p966xc90c42a8.C11162xe78737a3 c11162xe78737a3 = c11117x314d89f3.f152391d;
            if (c11162xe78737a3 != null) {
                java.util.Iterator it = c11162xe78737a3.f153369f.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3 c11159x8f55e6d32 = (com.p314xaae8f345.mm.p965xc41bc71e.C11159x8f55e6d3) it.next();
                    if (android.text.TextUtils.equals(c11159x8f55e6d3.f153336f, c11159x8f55e6d32.f153336f)) {
                        c11159x8f55e6d32.f153340m = booleanExtra ? 1 : 0;
                        c11159x8f55e6d32.C = c11159x8f55e6d3.C;
                        c11159x8f55e6d3.f153340m = booleanExtra ? 1 : 0;
                        break;
                    }
                }
            }
            i31.d dVar = c11117x314d89f3.f369633a;
            if (dVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("view");
                throw null;
            }
            m31.f fVar = ((com.p314xaae8f345.mm.p965xc41bc71e.ui.ActivityC11164x65f4bfb7) dVar).f153385f;
            if (fVar != null) {
                fVar.m8147xed6e4d18(this.f504983e);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizSubscribeMsgSettingPagePresenter", "goDetailUI  mmSetOnActivityResultCallback");
        }
    }
}
