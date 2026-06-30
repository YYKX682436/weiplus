package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts;

/* loaded from: classes15.dex */
public class m implements p11.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 f179555a;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5) {
        this.f179555a = activityC13331xc936a5b5;
    }

    @Override // p11.k
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, java.lang.Object... objArr) {
        java.lang.Object obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.FTSEmojiDetailPageUI", "imageLoaderListener onImageLoadComplete %s", str);
        if (bitmap == null || objArr == null || objArr.length <= 0 || (obj = objArr[0]) == null || !(obj instanceof java.lang.String)) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.ActivityC13331xc936a5b5 activityC13331xc936a5b5 = this.f179555a;
        if (str.equals(activityC13331xc936a5b5.f179532q.f68659x5efe714f)) {
            com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(objArr[0].toString());
            if (r6Var.m()) {
                activityC13331xc936a5b5.f179532q.f68671x4b6e68b9 = com.p314xaae8f345.mm.vfs.w6.p(r6Var.u());
                activityC13331xc936a5b5.f179534s = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(n22.m.g(), "", activityC13331xc936a5b5.f179532q.f68671x4b6e68b9);
                com.p314xaae8f345.mm.vfs.w6.c(r6Var.o(), activityC13331xc936a5b5.f179534s);
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.fts.l(this));
            }
        }
    }
}
