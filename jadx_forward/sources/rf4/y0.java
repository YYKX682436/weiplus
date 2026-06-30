package rf4;

/* loaded from: classes4.dex */
public final class y0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f f476660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f) {
        super(0);
        this.f476660d = c18482x82fd8d8f;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int[] iArr = com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f.N;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("itemContainer.onLoop callback currState:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18482x82fd8d8f c18482x82fd8d8f = this.f476660d;
        sb6.append(c18482x82fd8d8f.f253502u);
        sb6.append(", itemContainer.isPause:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd = c18482x82fd8d8f.f253488d;
        sb6.append(c18475x542840cd.isPause);
        sb6.append(' ');
        sb6.append(c18475x542840cd);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StoryCommentView", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd.d(c18475x542840cd, c18482x82fd8d8f.f253500s.f372772g, false, 2, null);
        if (c18482x82fd8d8f.f253502u == 2 && !c18475x542840cd.isPause) {
            c18475x542840cd.m71404x1be89825(null);
            c18475x542840cd.a();
            c18475x542840cd.b();
        }
        return jz5.f0.f384359a;
    }
}
