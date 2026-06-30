package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

/* loaded from: classes15.dex */
public class s3 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 f179719a;

    public s3(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.q3 q3Var) {
        this.f179719a = c13320x2d86e362;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s3 s3Var;
        if (this.f179719a.f179386p || message.what == 0) {
            java.util.LinkedList linkedList = this.f179719a.f179380g;
            if (linkedList == null || linkedList.size() <= 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreVpHeader", "list is null");
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.C13320x2d86e362 c13320x2d86e362 = this.f179719a;
            if (c13320x2d86e362.f179382i == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.emoji.EmojiStoreVpHeader", "adapter is null");
                return;
            }
            int m8300xfda78ef6 = c13320x2d86e362.f179378e.m8300xfda78ef6() + 1;
            if (m8300xfda78ef6 >= this.f179719a.f179382i.mo8338x7444f759()) {
                m8300xfda78ef6 = (this.f179719a.f179380g.size() * 60) / 2;
            }
            this.f179719a.f179378e.m8316x940d026a(m8300xfda78ef6);
            if (!this.f179719a.f179386p || (s3Var = this.f179719a.f179385o) == null) {
                return;
            }
            mo50311x7ab51103(s3Var.mo50289x733c63a2(0), 5000L);
        }
    }
}
