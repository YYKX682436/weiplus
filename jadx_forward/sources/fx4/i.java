package fx4;

/* loaded from: classes11.dex */
public final class i implements com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fx4.a f348688a;

    public i(fx4.a aVar) {
        this.f348688a = aVar;
    }

    @Override // com.p314xaae8f345.p3133xd0ce8b26.iam.biz.l
    /* renamed from: complete */
    public final void mo118240xdc453139(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AudioPlayLaterHelper", "addItemToPlayLaterAsync result " + z17);
        fx4.a aVar = this.f348688a;
        if (z17) {
            com.p314xaae8f345.p3133xd0ce8b26.iam.biz.o.f299294b.b(com.p314xaae8f345.p3133xd0ce8b26.mm.biz.l4.IAM_BIZ_AUDIO_PLAY_LIST_TYPE_LISTEN_LATER, new fx4.h(aVar));
        } else if (aVar != null) {
            aVar.a(false);
        }
    }
}
