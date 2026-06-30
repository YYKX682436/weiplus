package aa4;

/* loaded from: classes4.dex */
public final class z extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de f84222d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de c17862xb235d6de) {
        super(2);
        this.f84222d = c17862xb235d6de;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        java.lang.String str = (java.lang.String) obj;
        int intValue = ((java.lang.Number) obj2).intValue();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("media id:");
        sb6.append(str);
        sb6.append(" localid:");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de c17862xb235d6de = this.f84222d;
        sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69749x4ee72fb6(c17862xb235d6de));
        sb6.append(" objid:");
        v94.g m69747x6284de9b = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69747x6284de9b(c17862xb235d6de);
        sb6.append(m69747x6284de9b != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) m69747x6284de9b).u0() : null);
        sb6.append(" download finish ret:");
        sb6.append(intValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsVideoBackPreview", sb6.toString());
        if (intValue == 0 && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69749x4ee72fb6(c17862xb235d6de), str) && com.p314xaae8f345.mm.vfs.w6.j(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69750x90089bd7(c17862xb235d6de))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SnsVideoBackPreview", "file local path:" + com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69750x90089bd7(c17862xb235d6de) + " length:" + com.p314xaae8f345.mm.vfs.w6.k(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69750x90089bd7(c17862xb235d6de)));
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.a2 Bj = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Bj();
            v94.g m69747x6284de9b2 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69747x6284de9b(c17862xb235d6de);
            java.lang.String m70536x6bf53a6c = m69747x6284de9b2 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) m69747x6284de9b2).m70536x6bf53a6c() : null;
            v94.g m69747x6284de9b3 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69747x6284de9b(c17862xb235d6de);
            java.lang.Long u07 = m69747x6284de9b3 != null ? ((com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1) m69747x6284de9b3).u0() : null;
            java.lang.String m69750x90089bd7 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2158x5a753b7.p2160xed08e3c8.C17862xb235d6de.m69750x90089bd7(c17862xb235d6de);
            Bj.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsCoverStorage", "downloadVideo user:" + m70536x6bf53a6c + " id:" + u07 + " path:" + m69750x90089bd7 + " size:" + com.p314xaae8f345.mm.vfs.w6.k(m69750x90089bd7));
            if (m70536x6bf53a6c == null || u07 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.x1 L0 = Bj.L0(m70536x6bf53a6c);
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(L0.u0(), u07) && L0.f67728x547edbe) {
                    L0.f67724x6586435 = m69750x90089bd7;
                    L0.f67725x22618426 = com.p314xaae8f345.mm.vfs.w6.k(m69750x90089bd7);
                    Bj.W0(L0, false);
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("downloadVideo", "com.tencent.mm.plugin.sns.storage.SnsCoverStorage");
                }
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        jz5.f0 f0Var = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("invoke", "com.tencent.mm.plugin.sns.cover.preview.SnsVideoBackPreview$play$1");
        return f0Var;
    }
}
