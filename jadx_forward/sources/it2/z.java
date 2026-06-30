package it2;

/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 f376078a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 f376079b;

    /* JADX WARN: Code restructure failed: missing block: B:41:0x0133, code lost:
    
        if (((r1 == null || (r1 = r1.getLayoutParams()) == null || r1.height != r22.height) ? false : true) == false) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x023b, code lost:
    
        if (((r1 == null || (r1 = r1.getLayoutParams()) == null || r1.height != r22.height) ? false : true) == false) goto L93;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 a(java.lang.String r18, kt2.c r19, android.view.ViewGroup r20, int r21, android.view.ViewGroup.LayoutParams r22) {
        /*
            Method dump skipped, instructions count: 590
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: it2.z.a(java.lang.String, kt2.c, android.view.ViewGroup, int, android.view.ViewGroup$LayoutParams):com.tencent.mm.plugin.finder.reward.view.MagicRewardView");
    }

    public final void b(java.lang.String source, kt2.c type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int ordinal = type.ordinal();
        if (ordinal == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardViewManager", source + " dettachView PLAYER,playMagicRewardView:" + this.f376078a);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e1 = this.f376078a;
            if (c14940x2aae97e1 != null) {
                zl2.r4.f555483a.Q2(c14940x2aae97e1);
                return;
            }
            return;
        }
        if (ordinal != 1) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicRewardViewManager", source + " dettachView EDITOR,editMagicRewardView:" + this.f376079b);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1623xc84f4f2f.p1624x373aa5.C14940x2aae97e1 c14940x2aae97e12 = this.f376079b;
        if (c14940x2aae97e12 != null) {
            zl2.r4.f555483a.Q2(c14940x2aae97e12);
        }
    }
}
