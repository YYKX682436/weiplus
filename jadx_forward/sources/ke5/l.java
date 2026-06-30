package ke5;

/* loaded from: classes9.dex */
public class l extends ke5.a {

    /* renamed from: i, reason: collision with root package name */
    public int f388636i;

    /* renamed from: j, reason: collision with root package name */
    public volatile long f388637j;

    /* renamed from: k, reason: collision with root package name */
    public volatile long f388638k;

    /* renamed from: l, reason: collision with root package name */
    public volatile long f388639l;

    /* renamed from: m, reason: collision with root package name */
    public volatile long f388640m;

    public l(yb5.d dVar, hd5.v vVar) {
        super(dVar, vVar);
        this.f388636i = 0;
        this.f388637j = 0L;
        this.f388638k = 0L;
        this.f388639l = -1L;
        this.f388640m = 0L;
        this.f388639l = dVar.f542250l.m78388x5a3fc3e("msg_local_id", -1L);
        this.f388640m = dVar.f542250l.m78388x5a3fc3e("msg_local_id", -1L);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0157  */
    @Override // ke5.a, hd5.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2678x373aa5.C21897x17252689 r22, hd5.q r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ke5.l.c(com.tencent.mm.ui.chatting.view.MMChattingListView, hd5.q):void");
    }

    @Override // ke5.a
    public he5.t e(hd5.n nVar, android.os.Bundle bundle, hd5.q qVar) {
        he5.i iVar;
        int Bi = ((zv.o0) ((bw.j) i95.n0.c(bw.j.class))).Bi();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBrandEcsTmplMsgDataPresenter", "ChattingBrandEcsTmplMsgDataPresenter action %s, totalCount:%d", nVar, java.lang.Integer.valueOf(Bi));
        int ordinal = nVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBrandEcsTmplMsgDataPresenter", "[makeSource] action update");
                int i17 = Bi - this.f388636i;
                iVar = new he5.i(this.f388576d + (i17 > 0 ? i17 : 0), Bi);
            } else if (ordinal != 3) {
                iVar = null;
                if (ordinal == 4) {
                    if (bundle == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ChattingLoader.ChattingBrandEcsTmplMsgDataPresenter", "null == sourceArgs!");
                        return null;
                    }
                    if (bundle.getInt("SCENE", 0) == 2) {
                        int i18 = bundle.getInt("MSG_POSITION");
                        int i19 = Bi - i18;
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBrandEcsTmplMsgDataPresenter", "[handlePositionForTongue] totalCount:%s position:%s count:%s", java.lang.Integer.valueOf(Bi), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
                        iVar = new he5.i(i19, Bi);
                    }
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingLoader.ChattingBrandEcsTmplMsgDataPresenter", "[makeSource] action enter");
                iVar = new he5.i(java.lang.Math.max((int) this.f388640m, 16), Bi);
            }
        } else {
            iVar = new he5.i(this.f388576d + 48, Bi);
        }
        this.f388636i = Bi;
        return iVar;
    }
}
