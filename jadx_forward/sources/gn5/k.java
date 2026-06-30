package gn5;

/* loaded from: classes12.dex */
public class k implements sr.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 f355212a;

    public k(com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190) {
        this.f355212a = c22838xaf7a8190;
    }

    @Override // sr.b
    public void a(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EmojiPopView", "onStatus: %s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p2776x373aa5.p2784xe8855c76.C22838xaf7a8190 c22838xaf7a8190 = this.f355212a;
        if (i17 == 1) {
            c22838xaf7a8190.f295207g.setVisibility(8);
            c22838xaf7a8190.f295206f.setVisibility(0);
        } else {
            c22838xaf7a8190.f295206f.setVisibility(4);
            c22838xaf7a8190.f295207g.setVisibility(0);
        }
    }
}
