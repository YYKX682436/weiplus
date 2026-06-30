package kv2;

/* loaded from: classes.dex */
public final class e implements com.p314xaae8f345.mm.p944x882e457a.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f394192d;

    public e(yz5.q qVar) {
        this.f394192d = qVar;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.e3
    /* renamed from: callback */
    public final int mo1034xf5bc2045(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.o oVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (i17 == 0 && i18 == 0) {
            this.f394192d.mo147xb9724478(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
            return 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingFinderMentionRouter", "onTingFinderMentionReply error!, errType = " + i17 + ", errCode = " + i18);
        return 0;
    }
}
