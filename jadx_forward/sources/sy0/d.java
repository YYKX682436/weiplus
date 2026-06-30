package sy0;

/* loaded from: classes4.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9 f495363d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9 activityC11007x7cb63ad9) {
        super(0);
        this.f495363d = activityC11007x7cb63ad9;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p916x4268f0dc.p917xecbc4c4a.p919x7e63ca91.ActivityC11007x7cb63ad9 activityC11007x7cb63ad9 = this.f495363d;
        try {
            return sy0.b.m165498xcee59d22()[activityC11007x7cb63ad9.getIntent().getIntExtra("maas_album_template.scene", -1)];
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MJAlbumTemplatePreviewUI", "Failed to get scene from intent");
            activityC11007x7cb63ad9.mo55332x76847179().finish();
            return sy0.b.f495359d;
        }
    }
}
