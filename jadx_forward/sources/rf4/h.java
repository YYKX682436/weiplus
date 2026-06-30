package rf4;

/* loaded from: classes4.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd f476588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 f476589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd, com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7) {
        super(0);
        this.f476588d = c18475x542840cd;
        this.f476589e = c18474x76daa3b7;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18475x542840cd c18475x542840cd = this.f476588d;
        java.lang.String str = c18475x542840cd.f253426d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LogStory: remove ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.C18474x76daa3b7 c18474x76daa3b7 = this.f476589e;
        sb6.append(c18474x76daa3b7);
        sb6.append(' ');
        sb6.append(c18474x76daa3b7.getParent());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        c18475x542840cd.removeView(c18474x76daa3b7);
        return jz5.f0.f384359a;
    }
}
